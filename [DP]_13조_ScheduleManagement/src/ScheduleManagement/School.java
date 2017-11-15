package ScheduleManagement;

import java.util.ArrayList;

public class School extends User {
	private String name;
	private ArrayList<String> DepartmentList; 
	//private ArrayList<School_Schedule> ClassTimeTable;
	
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
	/*public ArrayList<School_Schedule> getClassTable()
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
	
	/*public void setClassTable(ArrayList<School_Schedule> s)
	{
		ClassTimeTable=s;
	}
	*/

}
