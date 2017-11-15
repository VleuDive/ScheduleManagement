package ScheduleManagement;

public class Student extends User {

	private String school;
	private String major;
	private String Nickname;
	//private ArrayList<School_Schedule> MyClassTable;
	
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
	/*public ArrayList<School_Schedule> getClassTable()
	{
		return MyClassTable;
	}
	*/
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
	/*public void setTable(ArrayList<School_Schedule> st)
	{
		MyClassTable=st;
	}
	*/
}
