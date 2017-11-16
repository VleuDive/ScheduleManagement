package ScheduleManagement;

public class ScoreBoard_ItemType {
	
	private ScoreBoard_Calculator Score;
	
	private float TotalScore;
	private int CompleteNum;
	private int DoingNum;
	private int ToOtherNum;
	private int DelayNum;
	private int CancelNum;
	private int CompleteGoalNum;
	private int CompleteBucketNum;
	private int TimeLineInformation;
	
	
	public void SetAllDSBRecord(Daily_Schedule input1, DailyGoal input2, Daily_BK input3)
	{
		TotalScore = Score.MakeDSBpoint(input1, input2, input3);
		Set_Daily_ToDoListCheckingNum(input1);
		Set_Daily_CompleteGoalNum(input2);
		Set_Daily_CompleteBucketNum(input3);
	}
	
	public void SetAllWSBRecord(Weekly_Schedule input1, WeeklyGoal input2, Weekly_BK input3)
	{
		TotalScore = Score.MakeWSBpoint(input1, input2, input3);
		Set_Weekly_ToDoListCheckingNum(input1);
		Set_Weekly_CompleteGoalNum(input2);
		Set_Weekly_CompleteBucketNum(input3);
	}
	
	public void SetAllMSBRecord(Monthly_Schedule input1, MonthlyGoal input2, Monthly_BK input3)
	{
		TotalScore = Score.MakeMSBpoint(input1, input2, input3);
		Set_Monthly_ToDoListCheckingNum(input1);
		Set_Monthly_CompleteGoalNum(input2);
		Set_Monthly_Complete_BK(input3);
	}
	
	
	public void Set_Daily_ToDoListCheckingNum(Daily_Schedule input)
	{
		for(int i=0; i<input.Get_TodoListcount(); i++)
		{
			if(input.Get_TodoList()[i].Get_ColoringCheck() == 5)  // 완료시
			{
				CompleteNum = CompleteNum +1;
			}
			else if(input.Get_TodoList()[i].Get_ColoringCheck() == 4) // 진행중시
			{
				DoingNum = DoingNum +1;
			}
			else if(input.Get_TodoList()[i].Get_ColoringCheck() == 3) // 위임시
			{
				ToOtherNum = ToOtherNum +1;
			}
			else if(input.Get_TodoList()[i].Get_ColoringCheck() == 2) // 연기시
			{
				DelayNum = DelayNum +1;
			}
			else if(input.Get_TodoList()[i].Get_ColoringCheck() == 1) // 취소시
			{
				CancelNum = CancelNum +1;
			}
			
		}
		
	}
	
	public void Set_Daily_CompleteGoalNum(DailyGoal input)
	{
		for(int i=0; i<input.getNumOfGoals(); i++)
		{
			if(input.getTodayGoalList().get(i).getCheck() == true)
			{
				CompleteGoalNum = CompleteGoalNum +1;
			}
		}
	}
	
	public void Set_Daily_CompleteBucketNum(Daily_BK input)
	{
		for(int i=0; i<input.getNumOfDailyBK(); i++)
		{
			if(input.getTodayBK().get(i).getCheck() == true)
			{
				CompleteBucketNum = CompleteBucketNum +1;
			}
		}
	}
	
	public void Set_Weekly_ToDoListCheckingNum(Weekly_Schedule input)
	{
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<input.Get_Weekly_Schedule()[i].Get_TodoListcount(); j++)
			{
				if(input.Get_Weekly_Schedule()[i].Get_TodoList()[j].Get_ColoringCheck() == 5)
				{
					CompleteNum = CompleteNum +1;
				}
				else if(input.Get_Weekly_Schedule()[i].Get_TodoList()[j].Get_ColoringCheck() == 4)
				{
					DoingNum = DoingNum +1;
				}
				else if(input.Get_Weekly_Schedule()[i].Get_TodoList()[j].Get_ColoringCheck() == 3)
				{
					ToOtherNum = ToOtherNum +1;
				}
				else if(input.Get_Weekly_Schedule()[i].Get_TodoList()[j].Get_ColoringCheck() == 2)
				{
					DelayNum = DelayNum +1;
				}
				else if(input.Get_Weekly_Schedule()[i].Get_TodoList()[j].Get_ColoringCheck() == 1)
				{
					CancelNum = CancelNum +1;
				}
			}
		}
	}
	
	public void Set_Weekly_CompleteGoalNum(WeeklyGoal input)
	{
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<input.getDGList().get(i).getNumOfGoals(); j++)
			{
				if(input.getDGList().get(i).getTodayGoalList().get(j).getCheck() == true)
				{
					CompleteGoalNum = CompleteGoalNum +1;
				}
			}
		}
	}
	
	public void Set_Weekly_CompleteBucketNum(Weekly_BK input)
	{
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<input.getWBList().get(i).getNumOfDailyBK(); j++)
			{
				if(input.getWBList().get(i).getTodayBK().get(j).getCheck() == true)
				{
					CompleteBucketNum = CompleteBucketNum +1;
				}
			}
		}
	}
	
	public void Set_Monthly_ToDoListCheckingNum(Monthly_Schedule input)
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<7; j++)
			{
				for(int y=0; y< input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoListcount(); y++)
				{
					if(input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoList()[y].Get_ColoringCheck() == 5)
					{
						CompleteNum = CompleteNum +1;
					}
					else if(input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoList()[y].Get_ColoringCheck() == 4)
					{
						DoingNum = DoingNum +1;
					}
					else if(input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoList()[y].Get_ColoringCheck() == 3)
					{
						ToOtherNum = ToOtherNum +1;
					}
					else if(input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoList()[y].Get_ColoringCheck() == 2)
					{
						DelayNum = DelayNum +1;
					}
					else if(input.Get_Monthly_Schedule()[i].Get_Weekly_Schedule()[j].Get_TodoList()[y].Get_ColoringCheck() == 1)
					{
						CancelNum = CancelNum +1;
					}
				}
			}
				
		}
	}
	
	public void Set_Monthly_CompleteGoalNum(MonthlyGoal input)
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<7; j++)
			{
				for(int y=0; y<input.getWGList().get(i).getDGList().get(j).getNumOfGoals(); y++)
				{
					if(input.getWGList().get(i).getDGList().get(j).getTodayGoalList().get(y).getCheck() == true)
					{
						CompleteGoalNum = CompleteGoalNum +1;
					}
				}
			}
		}
	}
	
	public void Set_Monthly_Complete_BK(Monthly_BK input)
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<7; j++)
			{
				for(int y=0; y<input.getWBList().get(i).getWBList().get(j).getNumOfDailyBK(); y++)
				{
					if(input.getWBList().get(i).getWBList().get(j).getTodayBK().get(y).getCheck() == true)
					{
						CompleteBucketNum = CompleteBucketNum +1;
					}
				}
			}
		}
	}
	
	
	/*달성 정보*/
	
	// CurrentPoint(달성도) 
	
	
	// ToDoList에서
	// 완료 개수
	// 진행 중 개수
	// 위임 개수
	// 연기 개수
	// 취소 개수
	// 완료 골 개수
	// 완료 버킷리스트 개수
	
	// 타임라인 정보
	
	// 
	
	
}
