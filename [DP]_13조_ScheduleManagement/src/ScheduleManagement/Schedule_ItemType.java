package ScheduleManagement;


public class Schedule_ItemType {
		
	protected String Name;
	protected int TimeLine;
	private int type;
	

	/*Get 함수*/
	public String Get_Name()
	{
	return Name;
	}
	public int Get_TimeLine()
	{
	return TimeLine;
	}
	public int Get_Type()
	{
		return type;
	}

	/*Set 함수*/
	public void Set_Name(String input)
	{
	Name = input;
	}
	public void Set_TimeLine(int input)
	{
	TimeLine = input;
	}
	public void Set_Type(int input)
	{
		type = input;
	}
	public void Set_AllRecord(Schedule_ItemType input)
	{
	Name = input.Get_Name();
	TimeLine = input.Get_TimeLine();
	}

	public String Get_Assignment()
	{
		return "virtual";
	}
	public String Get_Exam()
	{
		return "virtual";
	}
	public boolean Get_Attendance()
	{
		return true;
	}


	/*학교일정 virtual함수*/
	public void Set_Assignment(String input)
	{
	}
	public void Set_Exam(String input)
	{
	}
	public void Set_Attendance(boolean input)
	{
	}
	public void Set_AllRecord(School_Schedule input)
	{
	}
	
	/*개인일정 virtual 함수*/
	public int Get_Checking()
	{
		return 9999;
	}
	public void Set_Checking(int input)
	{
	}
	public void Set_AllRecord(Private_Schedule input)
	{
	}
	
	
}


class School_Schedule extends Schedule_ItemType
{
	private String Assignment;
	private String Exam;
	private boolean Attendance;
	/*Get 함수*/
	public String Get_Assignment()
	{
	return Assignment;
	}
	public String Get_Exam()
	{
	return Exam;
	}
	public boolean Get_Attendance()
	{
		return Attendance;
	}


	/*Set 함수*/
	public void Set_Assignment(String input)
	{
	Assignment = input;
	}
	public void Set_Exam(String input)
	{
	Exam = input;
	}
	public void Set_Attendance(boolean input)
	{
		Attendance = input;
	}
	public void Set_AllRecord(School_Schedule input)
	{
	Name = input.Get_Name();
	TimeLine = input.Get_TimeLine();
	Assignment = input.Get_Assignment();
	Exam = input.Get_Exam();
	Attendance = input.Get_Attendance();
	}

}

class Private_Schedule extends Schedule_ItemType
{
	/*enum 을 사용하지 않고 int 를 1~5 범주로 사용*/
	/*5가지 분류에 대해서 한정된 값을 갖는다.*/
	/*1 = 취소
	 *2 = 연기
	 *3 = 누군가에게 위임
	 *4 = 진행중
	 *5 = 완료
	 * */
	private int Checking;
	
	/*Get 함수*/
	public int Get_Checking()
	{
		return Checking;
	}
	
	/*Set 함수*/
	public void Set_Checking(int input)
	{
		Checking = input;
	}
	
	public void Set_AllRecord(Private_Schedule input)
	{
		Name = input.Get_Name();
		TimeLine = input.Get_TimeLine();
		Checking = input.Get_Checking();
	}
}
