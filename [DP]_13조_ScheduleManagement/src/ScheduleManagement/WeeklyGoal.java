package ScheduleManagement;


public class WeeklyGoal {

	private DailyGoal DGList;
	private boolean CheckBK;
	private String WGName;
	
	public DailyGoal getDGList() 
	{
		return DGList;
	}
	public boolean getCheckBK() 
	{
		return CheckBK;
	}
	public String getWGName()
	{
		return WGName;
	}
	
	public void setDGList(DailyGoal d)
	{
		DGList=d;
	}
	public void setCheckBK(boolean b)
	{
		CheckBK=b;
	}
	public void setWGNane(String name)
	{
		WGName=name;
	}
}
