package ScheduleManagement;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class App {
	private User p_User; // p_User�쓽 �옄猷뚰삎�쓣 in �뿉�꽌 User濡� 蹂�寃�. �쁽�옱 濡쒓렇�씤�븳 �쑀��
	
	private ArrayList<Monthly_Schedule> TotalSchedules;//데이터베이스에 등록된 전체 Schedule
	private ArrayList<Goal> TotalGoals;// 데이터베이스에 등록된 전체 Goal 목록
	private ArrayList<BucketList> TotalBKs;// 데이터베이스에 등록된 전체 BK 목록
	private ArrayList<ScoreBoard_ItemType> scoreBoardList;// 데이터베이스에 등록된 전체 ScoreBoard목록
	private Daily_Schedule today;//새로 추가!
	private int month;
	private int week;
	private int date;
	
	private ScheduleHandler S_Handler;// �씪�젙愿�由� Handler
	private DBHandler D_Handler; //DB �뿰寃� 諛� 荑쇰━ �빖�뱾�윭
	//test

	public App()
	{
		today=new Daily_Schedule();
		p_User=new User();//�뿬湲곗꽌�뒗 �깉濡쒖슫 User �겢�옒�뒪瑜� �젙�쓽�븯怨�, �씠�썑 �쑀���쓽 ���엯�뿉 �뵲�씪 p_User=new Student() �삉�뒗 p_User=new School(); �븷�떦
		S_Handler=new ScheduleHandler();
		D_Handler=new DBHandler();
		scoreBoardList=new ArrayList<ScoreBoard_ItemType>();
		TotalSchedules=new ArrayList<Monthly_Schedule>();
		TotalGoals=new ArrayList<Goal>();
		
		Calendar cl=Calendar.getInstance();
		month=cl.get(Calendar.MONTH);
		System.out.println(cl.get(Calendar.DATE));
		date=cl.get(Calendar.DAY_OF_WEEK)-1;
		
		//week 함수 구현!
	}
	public User getUser()
	{
		return p_User;
	}
	public void setUser(User u)
	{
		p_User=u;
	}
	public Daily_Schedule getToday()
	{
		return today;
	}
	public void setToday(Daily_Schedule t)
	{
		today=t;
	}
	public boolean SchoolLogin(String id, String pw) throws SQLException
	{
		//�븰援� �쉶�썝 濡쒓렇�씤
		ArrayList<String> input=new ArrayList<String>();
		input.add(id);
		input.add("0");//학교 회원은 0
		input.add(pw);
		ArrayList<ArrayList<String>> temp=D_Handler.searchUser(input);
		if(temp.get(0).get(0)=="")
		{
			return false;
		}
		else
		{
			User cur=new User();
			cur.setId(id);
			cur.setPw(pw);
			cur.setLogin(true);
			p_User=cur;
			return true;
		}
	}
	public boolean StudentLogin(String id, String pw) throws SQLException
	{
		ArrayList<String> input=new ArrayList<String>();
		input.add(id);
		input.add("1");//학생 회원은 1
		input.add(pw);
		ArrayList<ArrayList<String>> temp=D_Handler.searchUser(input);
		if(temp.get(0).get(0)=="")
		{
			return false;
		}
		else
		{
			User cur=new User();
			cur.setId(id);
			cur.setPw(pw);
			cur.setLogin(true);
		    p_User=cur;
		    ArrayList<String> input2=new ArrayList<String>();
			input2.add("");
			input2.add(p_User.getId());
			input2.add("");
			input2.add("");
			input2.add("");
			input2.add("");
			input2.add("");
			input2.add("");
			input2.add("2");
			Goal ent=new Goal();
			ArrayList<ArrayList<String>> Goals=D_Handler.searchStudentSchedule(input2);//이것을 Goal 리스트로 변환!
			for(int i=0;i<Goals.size();i++)
			{
				for(int j=0;j<Goals.get(i).size();j++)
				{
					switch(j)
					{
					case 3:
					{
						//date
						ent.setDate(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 4:
					{
						//week
						ent.setWeek(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 5:
					{
						//month
						ent.setMonth(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 6:
					{
						//subject
						ent.setName(Goals.get(i).get(j));
						break;
					}
					case 7:
					{
						//state
						ent.setCheck(false);
						break;
					}
					}
				}
				TotalGoals.add(ent);
			}
			S_Handler.setEveryGoal(TotalGoals);
			BucketList ent2=new BucketList();
			input2.set(8, "3");
			ArrayList<ArrayList<String>> Buckets=D_Handler.searchStudentSchedule(input2);//이것을 Goal 리스트로 변환!
			for(int i=0;i<Buckets.size();i++)
			{
				for(int j=0;j<Buckets.get(i).size();j++)
				{
					switch(j)
					{
					case 3:
					{
						//date
						ent2.setDate(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 4:
					{
						//week
						ent2.setWeek(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 5:
					{
						//month
						ent2.setMonth(Integer.parseInt(Goals.get(i).get(j)));
						break;
					}
					case 6:
					{
						//subject
						ent2.setName(Goals.get(i).get(j));
						break;
					}
					case 7:
					{
						//state
						ent2.setCheck(false);
						break;
					}
					}
				}
				TotalBKs.add(ent2);
			}
			S_Handler.setEveryBK(TotalBKs);
			return true;
		}
	}
	public boolean Logout()
	{
		if(p_User.getLog())
		{
			User empty=new User();
			p_User=empty;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void withDraw()
	{
		//�쉶�썝 �깉�눜
	}
	public void StudentRegister(int type, String id, String pw, String schoolName,String Major,String nickname)
	{
		//�븰�깮 �쉶�썝 媛��엯
	}
	public void SchoolRegister(int type, String id, String pw, String schoolName)
	{
		
	}
	public void buildStudentTimeTable()
	{
		
	}
	public void buildTotalTimeTable()
	{
		
	}
	public void buildSchoolMajorList(String major)
	{
		
	}
	public void showScheduleByMonth(int month)
	{
		
	}
	public void showScheduleByWeek(int week)
	{
		
	}
	public void showScheduleByDate(int date)
	{
		today=S_Handler.sortScheduleByDate(month, week, date);
		
	}
	public void registerSchedule(String StudentID,String name, int month, int week, int date, int timeline, int type, int sort)
	{
		
	}
	public void deleteSchedule(int month, int week, int date, String name)
	{
		
	}
	public void sortSchedule(int month, int week, int date, int sort)
	{
		
	}
	public void calcScoreBoard()
	{
		
	}
	public void showScoreBoardByMonth(int month)
	{
		
	}
	public void showScoreBoardByWeek(int week)
	{
		
	}
	public void showScoreBoardByDate(int date)
	{
	}
	public void feedBackAlarm()
	{
		
	}
	public void registerFeedBack(int month, int week, int date, String feed)
	{
		
	}

}
