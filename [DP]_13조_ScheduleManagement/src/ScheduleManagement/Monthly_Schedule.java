package ScheduleManagement;


public class Monthly_Schedule {

	/* 4개의 주간 일간을 가지고 있다.*/
	private Weekly_Schedule[] WeeklyList = new Weekly_Schedule[4];
	
	private ScoreBoard_ItemType MSB;

	
	/*Get 함수*/
	
	/* 사용자로부터 4주 중에 원하는 N주차의 정보를 얻게 해주는 함수. 사용 시 N주차의 N을 추가정보로 사용해야 한다.*/
	public Weekly_Schedule[] Get_Monthly_Schedule()
	{
		return WeeklyList;
	}	
	public ScoreBoard_ItemType Get_MSB()
	{
		return MSB;
	}
	
	
	/*Set 함수*/
	
	/*입력을 원하는 주차정보를 파라미터 N값으로 입력받는다.*/
	public void Set_Monthly_Schedule(Weekly_Schedule WeeklyData, int N)
	{
		/*연산자 오버로딩 해주어야 한다.*/
		WeeklyList[N] = WeeklyData;
	}
	/*MSB를 어떻게 입력하는지.*/
	public void Set_MSB(ScoreBoard_ItemType input)
	{
		/*MSB 연산자 오퍼로딩 해주어야 한다. =에 대해서*/
		MSB = input;
	}

	public void Set_AllRecord(Monthly_Schedule input, int N)
	{
		for(int i=0; i<7;i++)
		{
			WeeklyList[i].Set_AllRecord(input.Get_Monthly_Schedule()[i]);
		}
		
		/*WSB Set 함수 부분 구현 필요*/
		MSB = input.Get_MSB();
	}
	
	
	
	
}
