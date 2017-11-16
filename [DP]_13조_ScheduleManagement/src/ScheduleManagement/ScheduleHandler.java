package ScheduleManagement;
//스케줄 및 장기 목표를 등록하고, 삭제하고, 배분하는 등의 일을 해 주는 클래스.
public class ScheduleHandler {

	private Monthly_Schedule month;
	private Weekly_Schedule week;
	private Daily_Schedule day;
	
	private MonthlyGoal montG;
	private WeeklyGoal weekG;
	private DailyGoal dayG;
	
	private Monthly_BK montBK;
	private Weekly_BK weekBK;
	private Daily_BK dayBK;
	
	public ScheduleHandler()
	{
		//생성자
	
	}
	public Monthly_Schedule getMonth()
	{
		return month;
	}
	public Weekly_Schedule getWeek()
	{
		return week;
	}
	public Daily_Schedule getDay() 
	{
		return day;
	}
	public MonthlyGoal getMontG() 
	{
		return montG;
	}
	public WeeklyGoal getWeekG()
	{
		return weekG;
	}
	public DailyGoal getDayG() 
	{
		return dayG;
	}
	
	public void setMonth(Monthly_Schedule month) 
	{
		this.month = month;
	}
	public void setWeek(Weekly_Schedule week)
	{
		this.week = week;
	}
	public void setDay(Daily_Schedule day)
	{
		this.day = day;
	}
	public void setMontG(MonthlyGoal montG) 
	{
		this.montG = montG;
	}
	public void setWeekG(WeeklyGoal weekG) 
	{
		this.weekG = weekG;
	}
	public void setDayG(DailyGoal dayG) 
	{
		this.dayG = dayG;
	}
	public void setMontBK(Monthly_BK montBK)
	{
		this.montBK = montBK;
	}
	public void setWeekBK(Weekly_BK weekBK) 
	{
		this.weekBK = weekBK;
	}
	public void setDayBK(Daily_BK dayBK) 
	{
		this.dayBK = dayBK;
	}
	public void registerSchedule(String name, int month, int week, int date, int timeline, int type, int sort)
	{
		//스케줄 등록
	}
	public void deleteSchedule(int month, int week, int date, String name)
	{
		//스케줄 삭제
	}
	public void showScheduleByDate(int date)
	{
		//날짜별로 스케줄을 찾아 보여줌
	}
	public void constructDailyGoal()
	{
		//일별 목표 배분
	}
	public void constructWeeklyGoal()
	{
		//주별 목표 배분
	}
	public void constructMonthlyGoal()
	{
		//월별 목표 배분
	}
	public void constructDailyBK()
	{
		//일별 버킷리스트 배분
	}
	public void constructWeeklyBK()
	{
		//주별 버킷리스트 배분
	}
	public void constructMonthlyBK()
	{
		//월별 버킷리스트 배분
	}
	public void completeGoal()
	{
		//배분된 목표 하나 수행
	}
	public void completeBK()
	{
		//버킷리스트 하나 수행
	}
	public void sortTodoList()
	{
		//To do list의 항목을 5가지 중 하나로 분류
	}
}
