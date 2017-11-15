package ScheduleManagement;


public class ToDoList_ItemType {

	private String Name;
	
	/*15분 단위로 넣는다. ex -> 30분이면 2를 넣어준다. 2시간이면 4로 변환*/
	private int TimeLine;
	
	/*5가지 분류에 대해서 한정된 값을 갖는다.*/
	/*1 = 취소
	 *2 = 연기
	 *3 = 누군가에게 위임
	 *4 = 진행중
	 *5 = 완료
	 * */
	private int ColoringCheck;
	
	private boolean Important;
	
	
	
	
	/*Get 함수*/
	public String Get_Name()
	{
		return Name;
	}	
	public int Get_TimeLine()
	{
		return TimeLine;
	}	
	public int Get_ColoringCheck()
	{
		return ColoringCheck;
	}
	public boolean Get_Important()
	{
		return Important;
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
	public void Set_ColoringCheck(int input)
	{
		ColoringCheck = input;
	}	
	public void Set_Important(boolean input)
	{
		Important = input;
	}
	public void Set_AllRecord(ToDoList_ItemType input)
	{
		Name = input.Name;
		TimeLine = input.TimeLine;
		ColoringCheck = input.ColoringCheck;
		Important = input.Important;
	}
	
}
