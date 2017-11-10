package ScheduleManagement;

public class MonthlyGoal {
	//지금이 무슨 month인지 나타내는 변수 추가?
	private WeeklyGoal[] WGList;

	public MonthlyGoal()
	{
		WeeklyGoal empty=new WeeklyGoal();
		WGList=new WeeklyGoal[5];//5주까지 있는 달도 있으므로 최대 5개로 설정
		for(int i=0;i<5;i++)
		{
			WGList[i]=empty;
		}
	}
	public WeeklyGoal[] getWGList()
	{
		return WGList;
	}

	public void setWGList(WeeklyGoal[] w)
	{
		WGList=w;
	}

	public void addGoalToWGList(WeeklyGoal wg)
	{
		for(int i=0;i<5;i++)
		{
			if(WGList[i].getWeek()==-1)
			{
				if(wg.getWeek()==i)
				{
					WGList[i]=wg;
					break;
				}
			}
		}
	}
	
}
