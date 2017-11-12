package ScheduleManagement;

import java.util.ArrayList;

public class Daily_BK {

	private int numOfDailyBK;
	private ArrayList<BucketList> TodayBuckList;
	private int date;
	
	public Daily_BK()
	{
		numOfDailyBK=0;
		BucketList empty=new BucketList();
		date=empty.getDate();
		TodayBuckList=new ArrayList<BucketList>();
		for(int i=0;i<numOfDailyBK;i++)
		{
			TodayBuckList.add(empty);
		}
	}
	public int getNumOfDailyBK()
	{
		return numOfDailyBK;
	}
	public ArrayList<BucketList> getTodayBK()
	{
		return TodayBuckList;
	}
	public int getDate()
	{
		return date;
	}
	
	public void setNumOfDailyBK(int num)
	{
		numOfDailyBK=num;
	}
	public void setTodayBK(ArrayList<BucketList> bk)
	{
		TodayBuckList=bk;
	}
	public void setDate(int d)
	{
		date=d;
	}
	
	public void fillTodayBKList(BucketList bk)
	{
		date=bk.getDate();
		TodayBuckList.add(bk);
	}
	public void deleteBKFromList(BucketList bk)
	{
		TodayBuckList.remove(bk);
	}
}

