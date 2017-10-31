package ScheduleManagement;

public class Goal {

	private String G_Name;
	private boolean Checking;
	
	public String getGName()
	{
		return G_Name;
	}
	public boolean getCheck()
	{
		return Checking;
	}
	
	public void setName(String g)
	{
		G_Name=g;
	}
	public void setCheck(boolean c)
	{
		Checking=c;
	}
}
