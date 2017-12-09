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
		Monthly_Schedule empty=new Monthly_Schedule();
		for(int i=0;i<12;i++)
		{
			TotalSchedules.add(empty);
		}
		

		TotalGoals=new ArrayList<Goal>();
		
		Calendar cl=Calendar.getInstance();
		month=cl.get(Calendar.MONTH);
		System.out.println(cl.get(Calendar.DATE));
		date=cl.get(Calendar.DAY_OF_WEEK)-1;
		
		//week 함수 구현!
	}
	public int getmonth()
	{
		return month;
	}
	public int getWeek()
	{
		return week;
	}
	public int getDate()
	{
		return date;
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
		ArrayList<ArrayList<String>> temp=new ArrayList<ArrayList<String>>();
		temp=D_Handler.searchUser(input);
		input.set(0, "");
		input.set(1, id);
		input.set(2, "");
		ArrayList<ArrayList<String>> tempS=new ArrayList<ArrayList<String>>();
		tempS=D_Handler.searchSchool(input);
		if(temp.get(0).get(0)=="")
		{
			return false;
		}
		else
		{
			p_User=new School();
			School cur=new School();
			cur.setId(tempS.get(0).get(0));
			cur.setLogin(true);
			cur.setPw(pw);
			cur.setName(tempS.get(0).get(2));
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
		for(int i=0;i<2;i++)
		{
			input.add("");
		}
		input.set(0, "");
		input.set(1, id);
		ArrayList<Student> tempS=new ArrayList<Student>();
		tempS=D_Handler.searchStudent(input);
		if(temp.get(0).get(0)=="")
		{
			return false;
		}
		else
		{
			p_User=new Student();
			Student cur=new Student();
			cur=tempS.get(0);
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
	public void StudentRegister(int type, String id, String pw, String schoolName,String Major,String nickname) throws SQLException
	{
		ArrayList<ArrayList<String>> allS=new ArrayList<ArrayList<String>>();
		allS=D_Handler.getAllStudent();
		int num=allS.size();
		ArrayList<String> scFind=new ArrayList<String>();
		scFind.add("");
		scFind.add("");
		scFind.add(schoolName);
		ArrayList<ArrayList<String>> school=new ArrayList<ArrayList<String>>();
		school=D_Handler.searchSchool(scFind);
		String schoolID=school.get(0).get(1);
		ArrayList<ArrayList<String>> maj=new ArrayList<ArrayList<String>>();
		scFind.set(1, schoolID);
		scFind.set(2, Major);
		maj=D_Handler.searchMajor(scFind);
		String majNum=maj.get(0).get(0);
		ArrayList<String> input=new ArrayList<String>();
		input.add(Integer.toString(num));
		input.add(id);
		input.add(schoolID);
		input.add(majNum);
		input.add(nickname);
		ArrayList<String> uInput=new ArrayList<String>();
		uInput.add(id);
		uInput.add("1");
		uInput.add(pw);
		D_Handler.insertRowToStudent(input);
		D_Handler.insertRowToUser(uInput);
	}
	public void SchoolRegister(int type, String id, String pw, String schoolName) throws SQLException
	{
		ArrayList<ArrayList<String>> Alls=new ArrayList<ArrayList<String>>();
		Alls=D_Handler.getAllSchools();
		int num=Alls.size();
		ArrayList<String> input=new ArrayList<String>();
		input.add(Integer.toString(num));
		input.add(id);
		input.add(schoolName);
		D_Handler.insertRowToSchool(input);
		ArrayList<String> uInput=new ArrayList<String>();
		uInput.add(id);
		uInput.add("0");
		uInput.add(pw);
		D_Handler.insertRowToUser(uInput);
	}
	public void buildStudentTimeTable(int timeline, String Name, String Professor, String Room, int Cred,int type, boolean ifTest, boolean ifAssign) throws SQLException
	{
		ArrayList<ArrayList<String>> table=new ArrayList<ArrayList<String>>();
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add(p_User.getId());
		for(int i=0;i<8;i++)
		{
			input.add("");
		}
		table=D_Handler.searchStudentTimeTable(input);
		int num=table.size();
		input.set(0, Integer.toString(num));
		input.set(2,Integer.toString(timeline));
		input.set(3, Name);
		input.set(4, Professor);
		input.set(5, Room);
		input.set(6, Integer.toString(Cred));
		input.set(7, Integer.toString(type));
		input.set(8, Boolean.toString(ifTest));
		input.set(9, Boolean.toString(ifAssign));
		D_Handler.insertRowToStudentTimeTable(input);
		
	}
	public void buildTotalTimeTable(int timeline, String Name, String Professor,String Room, int Cred, int type ) throws SQLException
	{
		ArrayList<ArrayList<String>> table=new ArrayList<ArrayList<String>>();
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add(p_User.getId());
		for(int i=0;i<6;i++)
		{
			input.add("");
		}
		table=D_Handler.searchTotalTimeTable(input);
		int num=table.size();
		input.set(0, Integer.toString(num));
		input.set(2,Integer.toString(timeline));
		input.set(3, Name);
		input.set(4, Professor);
		input.set(5, Room);
		input.set(6, Integer.toString(Cred));
		input.set(7, Integer.toString(type));
		D_Handler.insertRowToTotalTimeTable(input);
		
	}
	public void buildSchoolMajorList(String major) throws SQLException
	{
		ArrayList<ArrayList<String>> majors=new ArrayList<ArrayList<String>>();
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add(p_User.getId());
		input.add("");
		majors=D_Handler.searchMajor(input);
		int num=majors.size();
		input.set(0, Integer.toString(num));
		input.set(2, major);
		D_Handler.insertRowToMajor(input);
		
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
	public void registerSchedule(String StudentID,String name, int month, int week, int date, int timeline, int type, int sort,boolean e, boolean a)
	{
		S_Handler.registerSchedule(StudentID, name, month, week, date, timeline, type, sort,e,a);
	}
	public void deleteSchedule(int month, int week, int date, String name)
	{
		S_Handler.deleteSchedule(month, week, date, name);
	}
	public void sortSchedule(int month, int week, int date, String name)
	{
		S_Handler.sortTodoList(month, week, date, name);
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
