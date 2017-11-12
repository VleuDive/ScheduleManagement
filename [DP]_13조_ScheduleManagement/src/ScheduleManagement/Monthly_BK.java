package ScheduleManagement;

import java.util.ArrayList;

public class Monthly_BK {

	private ArrayList<Weekly_BK> WBList;
	
	public Monthly_BK()
	{
		Weekly_BK empty=new Weekly_BK();
		WBList=new ArrayList<Weekly_BK>();
		for(int i=0;i<5;i++)
		{
			WBList.add(empty);
		}
		
	}
	
	public ArrayList<Weekly_BK> getWBList()
	{
		return WBList;
	}
	public void setWBList(ArrayList<Weekly_BK> w)
	{
		WBList=w;
	}
	
	public void addBKToWBList(Weekly_BK wb)
	{
		WBList.add(wb);
	}
	public void deleteWeeklyBKGromList(Daily_BK db)
	{
		int week=db.getTodayBK().get(0).getWeek();
		WBList.get(week).deleteDate(db);
	}
	public void deleteWeek(Weekly_BK wb)
	{
		int week=wb.getWeek();
		WBList.remove(week);
	}
}
