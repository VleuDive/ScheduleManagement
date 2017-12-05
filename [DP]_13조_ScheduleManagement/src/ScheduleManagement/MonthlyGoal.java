package ScheduleManagement;

import java.util.ArrayList;

public class MonthlyGoal {
	//지금이 무슨 month인지 나타내는 변수 추가?
	private ArrayList<WeeklyGoal> WGList;
	private int month;//새로  추가!
	public MonthlyGoal()
	{
		WeeklyGoal empty=new WeeklyGoal();
		WGList=new ArrayList<WeeklyGoal>();//5주까지 있는 달도 있으므로 최대 5개로 설정
		for(int i=0;i<5;i++)
		{
			WGList.add(empty);
		}
	}
	public int getMonth()
	{
		return month;
	}
	public ArrayList<WeeklyGoal> getWGList()
	{
		return WGList;
	}

	public void setWGList(ArrayList<WeeklyGoal> w)
	{
		WGList=w;
	}

	public void addGoalToWGList(WeeklyGoal wg)
	{
		WGList.add(wg);
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public void deleteWeeklyGoalFromList(DailyGoal dg)
	{
		//특정 주에 접근해 그 주의 한 날짜에 있는 goal 모두를 통째로 지우는 함수
		int week=dg.getTodayGoalList().get(0).getWeek();
		WGList.get(week).deleteDate(dg);
	}
	public void deleteWeek(WeeklyGoal wg)
	{
		//한 주의 목표 전체를 지우는 함수
		int week=wg.getWeek();
		WGList.remove(week);
	}
}
