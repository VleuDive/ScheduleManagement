package ScheduleManagement;

public class Student extends User {

	private String school;
	private String major;
	private String Nickname;
	private School_Schedule MyClassTable;
	
	public String getSchool()
	{
		return school;
	}
	public String getMajor()
	{
		return major;
	}
	public String getNickName()
	{
		return Nickname;
	}
	public School_Schedule getClassTable()
	{
		return MyClassTable;
	}
	public void setSchool(String s)
	{
		school=s;
	}
	public void setMajor(String m)
	{
		major=m;
	}
	public void setNickName(String n)
	{
		Nickname=n;
	}
	public void setTable(School_Schedule st)
	{
		MyClassTable=st;
	}
}
