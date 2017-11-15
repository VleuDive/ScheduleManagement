package ScheduleManagement;


public class ScoreBoard_Calculator {

	/*스코어 보드 항목, 달성도 계산*/
	
	float CurrentPoint; // 스코어
	
	/*일간,주간,월간별로 달성도를 반환하는 make함수*/
	
	
	public float MakeDSBpoint(Daily_Schedule input1, DailyGoal input2, Daily_BK input3)
	{
		CurrentPoint = CurrentPoint + MakeToDoListPoint(input1);
		CurrentPoint = CurrentPoint + MakeDailySchedulePoint(input1);
		CurrentPoint = CurrentPoint + MakeDailyGoal(input2);
		CurrentPoint = CurrentPoint + MakeDaily_BK(input3);
		
		return CurrentPoint;
	}
	
	public float MakeWSBpoint(Weekly_Schedule input1, WeeklyGoal input2, Weekly_BK input3)
	{
		for(int i=0; i<7; i++)
		{
			CurrentPoint = CurrentPoint + MakeDSBpoint(input1.Get_Weekly_Schedule()[i],input2.getDGList().get(i),input3.getWBList().get(i));
		}
		return CurrentPoint;
	}
	
	public float MakeMSBpoint(Monthly_Schedule input1, MonthlyGoal input2, Monthly_BK input3)
	{
		for(int i=0; i<4; i++)
		{
			CurrentPoint = CurrentPoint + MakeWSBpoint(input1.Get_Monthly_Schedule()[i],input2.getWGList().get(i),input3.getWBList().get(i));
		}
		return CurrentPoint;
	}
	
	public float MakeToDoListPoint(Daily_Schedule input)
	{
		// todolist 점수 경우의 수
				for(int i=0; i<input.Get_TodoListcount(); i++)
				{
					if(input.Get_TodoList()[i].Get_ColoringCheck() == 5)
					{
						//완료시
						
						if(input.Get_TodoList()[i].Get_Important() == true)
						{
							// ToDoList에서 중요 표시가 있는 것을 완료했을 때, 가중치 +2
							CurrentPoint = CurrentPoint+2;
						}
						
						CurrentPoint = CurrentPoint+5;
						
						// 가중치가 없는 완료시 달성도 +5
					}
					
					else if(input.Get_TodoList()[i].Get_ColoringCheck() == 4)
					{

						// 진행중일 시
						if(input.Get_TodoList()[i].Get_Important() == true)
						{
							// ToDoList에서 중요 표시가 있는 것을 완료했을 때, 가중치 +1
							CurrentPoint = CurrentPoint+1;
						}
						
						CurrentPoint = CurrentPoint+4;
						
						// 가중치가 없는 완료시 달성도 +4
						
					}
					
					else if(input.Get_TodoList()[i].Get_ColoringCheck() == 3)
					{

						// 누군가에게 위임일 시
						if(input.Get_TodoList()[i].Get_Important() == true)
						{
							// ToDoList에서 중요 표시가 있는 것을 완료했을 때, 가중치 +1
							CurrentPoint = CurrentPoint+1;
						}
						
						CurrentPoint = CurrentPoint+3;
						
						// 가중치가 없는 완료시 달성도 +3
						
					}
					
					else if(input.Get_TodoList()[i].Get_ColoringCheck() == 2)
					{

						// 연기 시
						if(input.Get_TodoList()[i].Get_Important() == true)
						{
							// ToDoList에서 중요 표시가 있는 것을 완료했을 때, 가중치 -1
							CurrentPoint = CurrentPoint-1;
						}
						
						CurrentPoint = CurrentPoint-1;
						
						// 가중치가 없는 완료시 달성도 -1
						
					}
					
					else if(input.Get_TodoList()[i].Get_ColoringCheck() == 1)
					{

						// 진행중일 시
						if(input.Get_TodoList()[i].Get_Important() == true)
						{
							// ToDoList에서 중요 표시가 있는 것을 완료했을 때, 가중치 -1
							CurrentPoint = CurrentPoint-1;
						}
						
						CurrentPoint = CurrentPoint-2;
						
						// 가중치가 없는 완료시 달성도 -2
						
					}
					
				}
				
				return CurrentPoint;
	}
	
	public float MakeDailySchedulePoint(Daily_Schedule input)
	{
		for(int i=0; i<96; i++)
		{
			if(input.Get_TimecontentList()[i].Get_TimeLine() == 9999)
			{
				// 일정이 안들어가 있을 때.
				continue;
			}
			// 학교일정
			if(input.Get_TimecontentList()[i].Get_Type() == 1)
			{
				if(input.Get_TimecontentList()[i].Get_Attendance()==true)
				{
					// 학교 수업 갔다면
					CurrentPoint = CurrentPoint+5;
				}
				// 학교 수업 안갔다면
				CurrentPoint = CurrentPoint -3;
			}
			// 개인일정
			else if(input.Get_TimecontentList()[i].Get_Type() == 2)
			{
				if(input.Get_TimecontentList()[i].Get_Checking() == 5)
				{
					CurrentPoint = CurrentPoint +5;
				}
				else if(input.Get_TimecontentList()[i].Get_Checking() == 4)
				{
					CurrentPoint = CurrentPoint +4;
				}
				
				else if(input.Get_TimecontentList()[i].Get_Checking() == 3)
				{
					CurrentPoint = CurrentPoint +3;
				}
				else if(input.Get_TimecontentList()[i].Get_Checking() == 2)
				{
					CurrentPoint = CurrentPoint -1;
				}
				else if(input.Get_TimecontentList()[i].Get_Checking() == 1)
				{
					CurrentPoint = CurrentPoint -2;	
				}
			}
		}
		
		return CurrentPoint;
	}
	
	public float MakeDailyGoal(DailyGoal input)
	{
		for(int i=0; i<input.getNumOfGoals(); i++)
		{
			if(input.getTodayGoalList().get(i).getCheck()==true)
			{
				CurrentPoint = CurrentPoint +5; // 목표 이루었을 때, +5점
			}
		}
		
		return CurrentPoint;
	}
	
	public float MakeDaily_BK(Daily_BK input)
	{
		for(int i=0; i<input.getNumOfDailyBK();i++)
		{
			if(input.getTodayBK().get(i).getCheck() == true)
			{
				CurrentPoint = CurrentPoint +5; // 목표 이루었을 때, +5점
			}
		}
		return CurrentPoint;
	}

	public float MakeWeeklySchedulePoint(Weekly_Schedule input)
	{
		for(int i=0; i<4; i++)
		{
			CurrentPoint = CurrentPoint + MakeDailySchedulePoint(input.Get_Weekly_Schedule()[i]);
		}
		return CurrentPoint;
	}
	
}

