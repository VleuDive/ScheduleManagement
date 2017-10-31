package ScheduleManagement;

public class BucketList {

	private String B_Name;
	private boolean Checking;
	
	public String getName()
	{
		return B_Name;
	}
	public boolean getCheck()
	{
		return Checking;
	}
	
	public void setName(String n)
	{
		B_Name=n;
	}
	public void setCheck(boolean c)
	{
		Checking=c;
	}
}
