package ScheduleManagement;


public class WeeklyGoal {

	//DailyGoal에는 몇 개의 Goal이 누적되고,그 DailyGoal 7개가 다시 모여 WeeklyGoal구성.
	private DailyGoal[] DGList; //1주일은 7일이므로 7개의 칸을 가진 배열 선언
	private int week;
	
	public WeeklyGoal()
	{
		DailyGoal empty=new DailyGoal();
		week=empty.getTodayGoalList()[0].getWeek();
		DGList=new DailyGoal[7];
		for(int i=0;i<7;i++)
		{
			DGList[i]=empty;
		}
	}
	public DailyGoal[] getDGList() 
	{
		return DGList;
	}
	public int getWeek()
	{
		return week;
	}
	public void setWeek(int w)
	{
		week=w;
	}
	public void setDGList(DailyGoal[] d)
	{
		DGList=d;
	}
	
	public void addGoalToDGList(DailyGoal dg)
	{
		week=dg.getTodayGoalList()[0].getWeek();
		//DGList에 daily goal 객체 하나를 추가하는 함수.
		for(int i=0;i<7;i++)
		{
			if(DGList[i].getDate()==-1)
			{
				if(dg.getDate()==i)
				{
					DGList[i]=dg;
					break;
				}
			}
		}
	}
}
