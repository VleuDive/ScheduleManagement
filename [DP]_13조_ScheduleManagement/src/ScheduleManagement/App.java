package ScheduleManagement;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;

public class App {
	private User p_User; // p_User의 자료형을 int 에서 User로 변경. 현재 로그인한 유저
	
	private ArrayList<Schedule_ItemType> TotalSchedules;//데이터베이스에 등록된 전체 Schedule
	private ArrayList<Goal> TotalGoals;// 데이터베이스에 등록된 전체 Goal 목록
	private ArrayList<BucketList> TotalBKs;// 데이터베이스에 등록된 전체 BK 목록
	private ArrayList<ScoreBoard_ItemType> scoreBoardList;// 데이터베이스에 등록된 전체 ScoreBoard목록
	
	private ScheduleHandler S_Handler;// 일정관리 Handler
	private DBHandler D_Handler; //DB 연결 및 쿼리 핸들러
	
	/*
	 * p_User를 User형으로 정의할 경우, p_User의 타입은 두 가지로 분류 ->Student, School
	 * 실제로 구현 시에는 먼저 User 타입으로 할당한 후 로그인한 회원의 타입에 따라 p_User에 Student 또는 School 클래스 할당
	 * 이렇게 할 시, p_User 객체를 통해 각 객체가 가진 전체 목표 / 일정 목록에 접근 가능하며, App이 가지고 있을 필요 X
	 * App이 모든 List들을 다 가지고 있게 하려면: School 회원만 가지고 있는 전공 또는 종합시간표 등도 이 클래스에 포함되어야 함 ->관리가 복잡해지고 비효율적?
	 */
	public App()
	{
		p_User=new User();//여기서는 새로운 User 클래스를 정의하고, 이후 유저의 타입에 따라 p_User=new Student() 또는 p_User=new School(); 할당
		S_Handler=new ScheduleHandler();
		D_Handler=new DBHandler();
		scoreBoardList=new ArrayList<ScoreBoard_ItemType>();
		TotalSchedules=new ArrayList<Schedule_ItemType>();
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
		//학교 회원 로그인
	}
	public void StudentLogin(String id, String pw)
	{
		//학생 회원 로그인
	}
	public void Logout()
	{
		
	}
	public void withDraw()
	{
		//회원 탈퇴
	}
	public void StudentRegister(int type, String id, String pw, String schoolName,String Major,String nickname)
	{
		//학생 회원 가입
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
	public void registerSchedule(String name, int month, int week, int date, int timeline, int type, int sort)
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
		//별도의 thread로 관리?
	}
	public void registerFeedBack(int month, int week, int date, String feed)
	{
		
	}

}
