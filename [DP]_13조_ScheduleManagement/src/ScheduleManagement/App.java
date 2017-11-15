package ScheduleManagement;

import java.util.ArrayList;

public class App {
	private User p_User; // p_User의 자료형을 int 에서 User로 변경
	//private ArrayList<Daily_Schedule> DailyPointer;
	//private ArrayList<Weekly_Schedule> WeeklyPointer;
	//private ArrayList<Monthly_Schedule> MonthlyPointer;
	//private ArrayList<Goal> S_Goal; 
	//private ArrayList<BucketList> S_BucketList; //위의 멤버들은 전부 ArrayList로 정의. 각각 로그인한 회원의 전체 목표/일정 정보'를 뜻한다.
	//private ArrayList<String> MajorList;
	
	/*
	 * p_User를 User형으로 정의할 경우, p_User의 타입은 두 가지로 분류 ->Student, School
	 * 실제로 구현 시에는 먼저 User 타입으로 할당한 후 로그인한 회원의 타입에 따라 p_User에 Student 또는 School 클래스 할당
	 * 이렇게 할 시, p_User 객체를 통해 각 객체가 가진 전체 목표 / 일정 목록에 접근 가능하며, App이 가지고 있을 필요 X
	 * App이 모든 List들을 다 가지고 있게 하려면: School 회원만 가지고 있는 전공 또는 종합시간표 등도 이 클래스에 포함되어야 함 ->관리가 복잡해지고 비효율적?
	 */
	public App()
	{
		p_User=new User();//여기서는 새로운 User 클래스를 정의하고, 이후 유저의 타입에 따라 p_User=new Student() 또는 p_User=new School(); 할당
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
	public void buildSchoolMajorList()
	{
		
	}
	/*public Daily_Schedule getDPointer()
	{
		return DailyPointer;
	}
	public Weekly_Schedule getWPointer()
	{
		return WeeklyPointer;
	}
	public Monthly_Schedule getMPointer()
	{
		return MonthlyPointer;
	}
	public Goal getGoal()
	{
		return S_Goal;
	}
	public BucketList getBucketList()
	{
		return S_BucketList;
	}
	
	public void setPUser(int p)
	{
		p_User = p;
	}
	public void setDailyPointer(Daily_Schedule dailyPointer) 
	{
		DailyPointer = dailyPointer;
	}
	public void setWeeklyPointer(Weekly_Schedule weeklyPointer)
	{
		WeeklyPointer = weeklyPointer;
	}
	public void setMonthlyPointer(Monthly_Schedule monthlyPointer) 
	{
		MonthlyPointer = monthlyPointer;
	}
	public void setSGoal(Goal s_Goal)
	{
		S_Goal = s_Goal;
	}
	public void setSBucketList(BucketList s_BucketList)
	{
		S_BucketList = s_BucketList;
	}*/
}
