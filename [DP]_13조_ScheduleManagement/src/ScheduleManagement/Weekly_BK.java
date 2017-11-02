package ScheduleManagement;

public class Weekly_BK {

	private Daily_BK DBK;
	private boolean CheckBK;
	private String WBKName;
	
	public Daily_BK getDBK()
	{
		return DBK;
	}
	public boolean CheckBK()
	{
		return CheckBK;
	}
	public String getWBKName()
	{
		return WBKName;
	}
	
	public void setDBK(Daily_BK bk)
	{
		DBK=bk;
	}
	public void setCheckBK(boolean b)
	{
		CheckBK=b;
	}
	public void setWBKName(String name)
	{
		WBKName=name;
	}
}
