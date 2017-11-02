package ScheduleManagement;

public class DailyGoal {

	private String Name;
	private boolean CheckBK;
	//Daily goal 할당도 필요함. 날짜 이월을 자연스럽게 처리할 알고리즘 필요.
	public String getName()
	{
		return Name;
	}
	public boolean getCheckBK()
	{
		return CheckBK;
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public void setCheckBK(boolean b)
	{
		CheckBK=b;
	}
}
