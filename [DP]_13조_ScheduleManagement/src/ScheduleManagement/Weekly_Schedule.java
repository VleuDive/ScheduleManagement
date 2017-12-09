package ScheduleManagement;



public class Weekly_Schedule {

	/* 7개의 일간 일정을 가지고 있다.*/
	private Daily_Schedule[] DailyList = new Daily_Schedule[7];
	
	
	private ScoreBoard_ItemType WSB;
	
	public Weekly_Schedule()
	{
		WSB=new ScoreBoard_ItemType();
		Daily_Schedule empty=new Daily_Schedule();
		for(int i=0;i<7;i++)
		{
			DailyList[i]=empty;
		}
	}
	/*Get 함수*/
	public Daily_Schedule[] Get_Weekly_Schedule()
	{
		return DailyList;
	}
	public ScoreBoard_ItemType Get_WSB()
	{
		return WSB;
	}
	
	
	/*Set 함수*/
	public void Set_Weekly_Schedule(Daily_Schedule input, int N)
	{
		DailyList[N].Set_AllRecord(input);
	}
	public void Set_WSB(ScoreBoard_ItemType input)
	{
		WSB = input;
	}
	
	public void Set_AllRecord(Weekly_Schedule input)
	{
		for(int i=0; i<7;i++)
		{
			DailyList[i].Set_AllRecord(input.Get_Weekly_Schedule()[i]);
		}
		
		/*WSB Set 함수 부분 구현 필요*/
		WSB = input.Get_WSB();
	}
	
}

