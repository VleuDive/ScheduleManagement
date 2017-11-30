package ScheduleManagement;

import java.util.ArrayList;

public class App {
	private User p_User; // p_User�쓽 �옄猷뚰삎�쓣 in �뿉�꽌 User濡� 蹂�寃�. �쁽�옱 濡쒓렇�씤�븳 �쑀��
	
	private ArrayList<Monthly_Schedule> TotalSchedules;//데이터베이스에 등록된 전체 Schedule
	private ArrayList<Goal> TotalGoals;// 데이터베이스에 등록된 전체 Goal 목록
	private ArrayList<BucketList> TotalBKs;// 데이터베이스에 등록된 전체 BK 목록
	private ArrayList<ScoreBoard_ItemType> scoreBoardList;// 데이터베이스에 등록된 전체 ScoreBoard목록
	

	
	private ScheduleHandler S_Handler;// �씪�젙愿�由� Handler
	private DBHandler D_Handler; //DB �뿰寃� 諛� 荑쇰━ �빖�뱾�윭
	//test

	public App()
	{
		p_User=new User();//�뿬湲곗꽌�뒗 �깉濡쒖슫 User �겢�옒�뒪瑜� �젙�쓽�븯怨�, �씠�썑 �쑀���쓽 ���엯�뿉 �뵲�씪 p_User=new Student() �삉�뒗 p_User=new School(); �븷�떦
		S_Handler=new ScheduleHandler();
		D_Handler=new DBHandler();
		scoreBoardList=new ArrayList<ScoreBoard_ItemType>();
		TotalSchedules=new ArrayList<Monthly_Schedule>();
		TotalGoals=new ArrayList<Goal>();
		TotalBKs=new ArrayList<BucketList>();
	
	}
	public User getUser()
	{
		return p_User;
	}
	public void setUser(User u)
	{
		p_User=u;
	}
	public void SchoolLogin(String id, String pw)
	{
		//�븰援� �쉶�썝 濡쒓렇�씤
	}
	public void StudentLogin(String id, String pw)
	{
		
	}
	public void Logout()
	{
		
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
		//蹂꾨룄�쓽 thread濡� 愿�由�?
	}
	public void registerFeedBack(int month, int week, int date, String feed)
	{
		
	}

}
