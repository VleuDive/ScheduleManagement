package ScheduleManagement;

public class BucketList {

	private String B_Name;
	private boolean Checking;
	private int date;
	private int week;
	private int month; // 이 세 가지는 Goal 이나 Schedule에서도 쓰는 요소
	
	public BucketList()
	{
		B_Name="";
		Checking=false;
		date=-1;
		week=-1;
		month=-1;
	}
	
	public String getName()
	{
		return B_Name;
	}
	public boolean getCheck()
	{
		return Checking;
	}

	public int getDate()
	{
		return date;
	}
	public int getWeek()
	{
		return week;
	}
	public int getMonth()
	{
		return month;
	}
	
	public void setName(String n)
	{
		B_Name=n;
	}
	public void setCheck(boolean c)
	{
		Checking=c;
	}
	public void setDate(int d)
	{
		date=d;
	}
	public void setWeek(int w)
	{
		week=w;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	
	public void switchCheck()
	{
		Checking=!Checking;
	}
}
