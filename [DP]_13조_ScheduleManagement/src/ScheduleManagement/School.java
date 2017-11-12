package ScheduleManagement;

import java.util.ArrayList;

public class School extends User {
	private String name;
	private ArrayList<String> DepartmentList; //학과명의 목록이므로 Char* ->List로 변경. 이 부분은 후에 더 알맞은 자료구조를 찾으면 바뀔 수도 있습니다!
	//private School_Schedule ClassTimeTable;
	
	public School()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<String> getDept()
	{
		return DepartmentList;
	}
	/*public School_Schedule getClassTable()
	{
		return ClassTimeTable;
	}
	*/
	public void setName(String n)
	{
		name=n;
	}
	public void setDept(ArrayList<String> l)
	{
		DepartmentList=l;
	}
	
	/*public void setClassTable(School_Schedule s)
	{
		ClassTimeTable=s;
	}
	*/

}
