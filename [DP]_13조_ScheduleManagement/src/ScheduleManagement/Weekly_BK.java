package ScheduleManagement;

import java.util.ArrayList;

public class Weekly_BK {

	private ArrayList<Daily_BK> DBList;
	private int week;
	
	public Weekly_BK()
	{
 	Daily_BK empty=new Daily_BK();
		week=empty.getTodayBK().get(0).getWeek();
		DBList=new ArrayList<Daily_BK>();
		for(int i=0;i<7;i++)
		{
			DBList.add(empty);
		}
	}
	
	public ArrayList<Daily_BK> getDBList()
	{
		return DBList;
	}
	public int getWeek()
	{
		return week;
	}
	
	public void setWBList(ArrayList<Daily_BK> wg)
	{
		DBList=wg;
	}
	public void setWeek(int w)
	{
		week=w;
	}
	public void addGoalToWBList(Daily_BK db)
	{
		week=db.getTodayBK().get(0).getWeek();
		DBList.add(db);
	}
	public void deleteDailyBKFromList(BucketList db)
	{
		int date=db.getDate();
		DBList.get(date).deleteBKFromList(db);
	}
	public void deleteDate(Daily_BK db)
	{
		int date=db.getDate();
		DBList.remove(date);
	}
	

}
