package ScheduleManagement;

public class Monthly_BK {
	
	private Weekly_BK WB;
	private boolean CheckBK;
	private String MBKName;
	
	public Weekly_BK getWb()
	{
		return WB;
	}
	public boolean getCheckBK()
	{
		return CheckBK;
	}
	public String getMBKName()
	{
		return MBKName;
	}
	
	public void setWb(Weekly_BK W)
	{
		WB=W;
	}
	public void setCheckBK(boolean b)
	{
		CheckBK=b;
	}
	public void setMBKName(String name)
	{
		MBKName=name;
	}

}
