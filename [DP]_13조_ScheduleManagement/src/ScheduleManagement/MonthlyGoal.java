package ScheduleManagement;

public class MonthlyGoal {

	private WeeklyGoal WGList;
	private boolean CheckBK;
	private String MGName;
	
	public WeeklyGoal getWGList()
	{
		return WGList;
	}
	public boolean getCheckBK()
	{
		return CheckBK;
	}
	public String getMGName()
	{
		return MGName;
	}
	
	public void setWGList(WeeklyGoal w)
	{
		WGList=w;
	}
	public void setCheckBK(boolean b)
	{
		CheckBK=b;
	}
	public void setMGName(String name)
	{
		MGName=name;
	}
	
}
