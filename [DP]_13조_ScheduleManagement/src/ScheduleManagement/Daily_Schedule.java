package ScheduleManagement;


public class Daily_Schedule {

	/*최대 10개의 ToDoList를 가진다.*/
	private ToDoList_ItemType[] TodoList = new ToDoList_ItemType[10]; 
	
	/*TodoList 카운트 변수*/
	int TodoListcount =0;
	
	
	/*동적 할당해야하지만 일단 15분단위로 일정을 넣을 수 있게 함.*/
	private Schedule_ItemType[] TimecontentList = new Schedule_ItemType[96];
	
	
	private String Feedback;
	
	/*피드백 알람 시간*/
	private int TimeToFeedBack;


	public Daily_Schedule()
	{
		for(int i=0; i<96; i++)
		{
			TimecontentList[i]=new Schedule_ItemType();
			TimecontentList[i].Set_TimeLine(9999);
		}
		for(int i=0;i<10;i++)
		{
			TodoList[i]=new ToDoList_ItemType();
		}
	}
	
	/*Get 함수*/
	public ToDoList_ItemType[] Get_TodoList()
	{
		return TodoList;
	}
	
	public Schedule_ItemType[] Get_TimecontentList()
	{
		return TimecontentList;
	}
	
	
	public String Get_Feedback()
	{
		return Feedback;
	}
	
	public int Get_TimeToFeedBack()
	{
		return TimeToFeedBack;
	}
	
	public int Get_TodoListcount()
	{
		return TodoListcount;
	}
	
	/*Set 함수*/
	public void Set_TodoList(ToDoList_ItemType input, int N)
	{
		/*함수 오버로딩 하기.*/
		TodoList[N].Set_AllRecord(input);
		TodoListcount++;
	}
	
	public void Set_TimecontentList(Schedule_ItemType input, int N)
	{
		/*조건: 이미 일정이 있는 구간은 들어갈 수 없다.*/
		
		if(TimecontentList[N].Get_TimeLine() != 9999)
		{
			/*이미 일정이 들어간 상태*/
			
			
			return;
		}
		
		/*type = 1 이면 학교일정, 2이면 개인일정*/
		if(input.Get_Type() == 1)
		{
			TimecontentList[N] = new School_Schedule();
		}
		else
		{
			TimecontentList[N] = new Private_Schedule();
		}
		
		TimecontentList[N].Set_AllRecord(input);
	}
	
	public void Set_Feedback(String input)
	{
		Feedback = input;
	}
	
	public void Set_TimeToFeedBack(int input)
	{
		TimeToFeedBack = input;
	}
	
	public void Set_count(int input)
	{
		TodoListcount = input;
	}
	
	
	public void Set_AllRecord(Daily_Schedule input)
	{
		for(int i=0; i<input.Get_TodoListcount(); i++)
		{
			TodoList[i].Set_AllRecord(input.Get_TodoList()[i]);
		}
		
		TodoListcount = input.Get_TodoListcount();
		
		for(int i=0; i<96; i++)
		{
			TimecontentList[i].Set_AllRecord(input.Get_TimecontentList()[i]);
		}
		
		
		Feedback = input.Get_Feedback();
		
		TimeToFeedBack = input.Get_TimeToFeedBack();
		
	}
}
