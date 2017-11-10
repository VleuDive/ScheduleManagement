package ScheduleManagement;
//Goal&Bucketlist handler 필요?
public class Goal {

	//Goal은 수량형 목표를 가리키므로, 목표치가 얼마고 달성치가 얼마인지도 멤버로 포함
	private String G_Name;
	private boolean Checking=false;//'목표가 모두 달성되었는가?(목표치를 채웠는가?)'가 기준! 기본적으로는 완료가 안되어 있는 상태
	private int targetValue; //달성 목표치(ex: '책 3권 읽기'의 '3권')
	private int completedValue; //달성량(ex: 책을 1권 읽었으면 달성량은 '1')
	private int date;//0~6까지의 수. 0:월, 1:화...
	private int week;//1~5까지의 수. (5주까지 있는 달도 있으므로)
	private int month;// 이 세 가지는 Bucketlist나 schedule에서도 쓰는 요소 -> enum형을 하나의 파일에 정리한 뒤 그것을 다른 파일에서 가져다 쓰게 할 방법은 없을까?
	public Goal()
	{
		G_Name="";
		targetValue=0;
		completedValue=0;
		date=-1;
		week=-1;
		month=-1;
	}
	
	public String getGName()
	{
		return G_Name;
	}
	public boolean getCheck()
	{
		return Checking;
	}
	
	public void setName(String g)
	{
		G_Name=g;
	}
	public void setCheck(boolean c)
	{
		Checking=c;
	}
	
	public int getTargetValue()
	{
		return targetValue;
	}
	public int getCompleted()
	{
		return completedValue;
	}
	
	public int getDate()
	{
		return date;
	}
	public int getWeek()
	{
		return week;
	}
	public int getMonth()
	{
		return month;
	}
	
	public void setDate(int d)
	{
		date=d;
	}
	public void setWeek(int w)
	{
		week=w;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public void setTargetValue(int tv)
	{
		targetValue=tv;
	}
	public void setCompleteValue(int cv)
	{
		completedValue=cv;
	}
	
	public void switchCheck() //Checking의 true,false를 switch
	{
		Checking=!Checking;
	}
	
	public void completeGoal(int completed) //목표 달성을 조금씩 해 나갈때마다 completeValue값은 늘리고 TargetValue값은 줄이는 함수
	{
		//목표치를 달성해 나갈 때마다 set,get 함수 대신 이 함수를 호출
		//ex: UI에서는 세부 목표에서 달성량을 1 올리는 버튼을 누를 때마다 이 함수 호출
		int balance=targetValue-completed;
		setCompleteValue(completed);
		if(!Checking&&balance==0)
		{
			switchCheck();//targetValue==0이고 Checking==false일때 Checking을 true로 전환
		}
	}
}
