package ScheduleManagement;

import java.util.ArrayList;

public class WeeklyGoal {

	//DailyGoal에는 몇 개의 Goal이 누적되고,그 DailyGoal 7개가 다시 모여 WeeklyGoal구성.
	private ArrayList<DailyGoal> DGList; //1주일은 7일이므로 7개의 칸을 가진 배열 선언
	private int week;
	
	public WeeklyGoal()
	{
		DailyGoal empty=new DailyGoal();
		week=empty.getTodayGoalList().get(0).getWeek();
		DGList=new ArrayList<DailyGoal>();
		for(int i=0;i<7;i++)
		{
			DGList.add(empty);
		}
	}
	public ArrayList<DailyGoal> getDGList() 
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
	public void setDGList(ArrayList<DailyGoal> d)
	{
		DGList=d;
	}
	
	public void addGoalToDGList(DailyGoal dg)
	{
		week=dg.getTodayGoalList().get(0).getWeek();
		//DGList에 daily goal 객체 하나를 추가하는 함수.
		DGList.add(dg);
	}
	public void deleteDailyGoalFromList(Goal dg)
	{
		//특정 날짜에 접근해 그 날짜에 할당되어 있는 goal 하나를 지우는 함수
		int date=dg.getDate();
		DGList.get(date).deleteGoalFromList(dg);
	}
	public void deleteDate(DailyGoal dg)
	{
		//한 날짜의 goal 전체를 통째로 지우는 함수
		int date=dg.getDate();
		DGList.remove(date);
	}
}
