package ScheduleManagement;

import java.sql.SQLException;
import java.util.ArrayList;

//스케줄 및 장기 목표를 등록하고, 삭제하고, 배분하는 등의 일을 해 주는 클래스.
//주석 깨짐 테스트
public class ScheduleHandler {

	private ArrayList<Goal> everyGoals;//배분 전의 전체 Goal 목록
	private ArrayList<BucketList> everyBKs;// 배분 전의 전체 BK 목록
	private DBHandler dbHandler;
	private ArrayList<Monthly_Schedule> total;
//	private Monthly_Schedule month;
//	private Weekly_Schedule week;
//	private Daily_Schedule day;
	
	private ArrayList<MonthlyGoal> totalGoal;// 새로 추가된 배열
	private MonthlyGoal montG;
	private WeeklyGoal weekG;
	private DailyGoal dayG;
	
	private ArrayList<Monthly_BK> totalBK;// 새로 추가된 배열
	private Monthly_BK montBK;
	private Weekly_BK weekBK;
	private Daily_BK dayBK;
//	
	public ScheduleHandler()
	{
		//생성자
		dbHandler=new DBHandler();
		total=new ArrayList<Monthly_Schedule>();
		totalGoal=new ArrayList<MonthlyGoal>();
		totalBK=new ArrayList<Monthly_BK>();
		everyBKs=new ArrayList<BucketList>();
		everyGoals=new ArrayList<Goal>();
	}
	public ArrayList<Monthly_Schedule> getTotal()
	{
		return total;
	}
	public ArrayList<MonthlyGoal> getTotalGoal()
	{
		return totalGoal;
	}
	public ArrayList<Monthly_BK> getTotalBK()
	{
		return totalBK;
	}
	public void setTotal(ArrayList<Monthly_Schedule> t)
	{
		total=t;
	}
	public void setTotalGoal(ArrayList<MonthlyGoal> t)
	{
		totalGoal=t;
	}
	public void setTotalBK(ArrayList<Monthly_BK> t)
	{
		totalBK=t;
	}
	public void setEveryGoal(ArrayList<Goal> g)
	{
		everyGoals=g;
	}
	public void setEveryBK(ArrayList<BucketList> b)
	{
		everyBKs=b;
	}
	
//	public Monthly_Schedule getMonth()
//	{
//		return month;
//	}
//	public Weekly_Schedule getWeek()
//	{
//		return week;
//	}
//	public Daily_Schedule getDay() 
//	{
//		return day;
//	}
	public MonthlyGoal getMontG() 
	{
		return montG;
	}
	public WeeklyGoal getWeekG()
	{
		return weekG;
	}
	public DailyGoal getDayG() 
	{
		return dayG;
	}
	public Monthly_BK getMonthBK()
	{
		return montBK;
	}
	public Weekly_BK getWeeklyBK()
	{
		return weekBK;
	}
	public Daily_BK getDailyBK()
	{
		return dayBK;
	}
//	
	//public void setMonth(Monthly_Schedule month) 
//	{
//		this.month = month;
	//}
//	public void setWeek(Weekly_Schedule week)
//	{
//		this.week = week;
//	}
//	public void setDay(Daily_Schedule day)
//	{
//		this.day = day;
//	}
	public void setMontG(MonthlyGoal montG) 
	{
		this.montG = montG;
	}
	public void setWeekG(WeeklyGoal weekG) 
	{
		this.weekG = weekG;
	}
	public void setDayG(DailyGoal dayG) 
	{
		this.dayG = dayG;
	}
	public void setMontBK(Monthly_BK montBK)
	{
		this.montBK = montBK;
	}
	public void setWeekBK(Weekly_BK weekBK) 
	{
		this.weekBK = weekBK;
	}
	public void setDayBK(Daily_BK dayBK) 
	{
		this.dayBK = dayBK;
	}
	public void registerSchedule(String StudentID, String name, int month, int week, int date, int timeline, int type, int sort,boolean ex, boolean a)
	{
		Schedule_ItemType schedule=new Schedule_ItemType();
		ToDoList_ItemType todo=new ToDoList_ItemType();
		int monthIdx=month;
		int weekIdx=week;
		int dateIdx=date;
		if(timeline==-1)
		{//TodoList.
			todo.Set_ColoringCheck(4);
			todo.Set_Important(false);
			todo.Set_Name(name);
			todo.Set_TimeLine(timeline);
		}
		else
		{
		//Verifying process : 시간표와 Timeline 비교
		ArrayList<String> studentId=new ArrayList<String>();
		studentId.add(StudentID);
		ArrayList<Student> targetStudent=new ArrayList<Student>();
		try {
			targetStudent=dbHandler.searchStudent(studentId);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Student stu=targetStudent.get(0);
		int studentTimeLine=0;
		for(int i=0;i<stu.getClassTable().size();i++)
		{
			studentTimeLine=stu.getClassTable().get(i).Get_TimeLine();
			if(timeline==studentTimeLine)
			{
				if(type==0)
				{
					type=0;
					break;
				}
				else if(type==1)
				{
					return;
				}
			}
			else
			{
				if(type==0)
				{
					return;
				}
				else if(type==1)
				{
					type=1;
					break;
				}
			}
		}
		
		if(type==0)
		{
			schedule=new School_Schedule();
			schedule.Set_Type(type);
			schedule.Set_Name(name);
			schedule.Set_StudentId(StudentID);
			schedule.Set_TimeLine(timeline);
			schedule.Set_Exam(ex);
			schedule.Set_Assignment(a);
		}
		else if(type==1)
		{
			schedule=new Private_Schedule();
			schedule.Set_Type(type);
			schedule.Set_Name(name);
			schedule.Set_StudentId(StudentID);
			schedule.Set_TimeLine(timeline);
		}
		}
		ArrayList<String> input=new ArrayList<String>();
		try {
			for(int i=0;i<9;i++)
			{
				input.add("");
			}
			dbHandler.insertRowToStudentSchedule(input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Daily_Schedule day=total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date];
		for(int i=0;i<96;i++)
		{
			if(day.Get_TimecontentList()[i].StudentID=="")
			{
				day.Get_TimecontentList()[i]=schedule;
			}
		}
		for (int i=0;i<10;i++)
		{
			if(day.Get_TodoList()[i].Get_Name()=="")
			{
				day.Get_TodoList()[i]=todo;
			}
		}
		total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date]=day;
		}
	
	public void deleteSchedule(int month, int week, int date, String name)
	{
		Schedule_ItemType[] target=total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date].Get_TimecontentList();
		//여기서 복제본을 가져와 복제본을 편집한 뒤 원본에 복제본을 덮어씌우는 것이 효윻적(배열의 차원이 복잡)
		int delIdx=-1;//지울 스케줄이 위치한 인덱스 번호
		for(int i=0;i<target.length;i++)
		{
			if(target[i].Get_Name()==name)
			{
				delIdx=i;
				break;
			}
		}
		if(delIdx==-1)
		{
			ToDoList_ItemType[] newTarget=total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date].Get_TodoList();
			for(int i=0;i<newTarget.length;i++)
			{
				if(newTarget[i].Get_Name()==name)
				{
					delIdx=i;
					break;
				}
				
			}
			ToDoList_ItemType blank=new ToDoList_ItemType();
			//모든 정보가 비어있는 객체를 만들어 타겟 인덱스에 넣음->정보를 삭제하는 효과
			newTarget[delIdx].Set_AllRecord(blank);
			for(int i=0;i<target.length-1;i++)
			{
				target[i]=target[i+1];// 배열을 한 칸씩 민다.
			}
			newTarget[newTarget.length-1].Set_AllRecord(blank);//마지막 칸이 비도록
			for(int i=0;i<newTarget.length;i++)
			{
			total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date].Set_TodoList(newTarget[i], i);
			}
			ArrayList<String> input=new ArrayList<String>();
			input.add("");
			input.add("");
			input.add("");
			input.add(Integer.toString(date));
			input.add(Integer.toString(week));
			input.add(Integer.toString(month));
			for(int i=0;i<3;i++)
			{
				input.add("");
			}
			ArrayList<ArrayList<String>> sche;
			try {
				sche = dbHandler.searchStudentSchedule(input);
				int num=Integer.parseInt(sche.get(0).get(0));
				dbHandler.deleteRowFromStudentSchedule(num);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else
		{
			Schedule_ItemType blank=new Schedule_ItemType();
			//모든 정보가 비어있는 객체를 만들어 타겟 인덱스에 넣음->정보를 삭제하는 효과
			target[delIdx].Set_AllRecord(blank);
			for(int i=0;i<target.length-1;i++)
			{
				target[i]=target[i+1];// 배열을 한 칸씩 민다.
			}
			target[target.length-1].Set_AllRecord(blank);//마지막 칸이 비도록
			for(int i=0;i<target.length;i++)
			{
			total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date].Set_TimecontentList(target[i], i);
			}
			ArrayList<String> input=new ArrayList<String>();
			input.add("");
			input.add("");
			input.add("");
			input.add(Integer.toString(date));
			input.add(Integer.toString(week));
			input.add(Integer.toString(month));
			for(int i=0;i<3;i++)
			{
				input.add("");
			}
			ArrayList<ArrayList<String>> sche;
			try {
				sche = dbHandler.searchStudentSchedule(input);
				int num=Integer.parseInt(sche.get(0).get(0));
				dbHandler.deleteRowFromStudentSchedule(num);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public Daily_Schedule sortScheduleByDate(int month,int week,int date)
	{
		//하루 Schedule을 Sort해주는 함수로 변경!(Show는 여기서 리턴을 받은 App에서)
		Daily_Schedule toRet=new Daily_Schedule();
		toRet=total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date];
		int len=toRet.Get_TimecontentList().length;
		Schedule_ItemType[] tmpAry=new Schedule_ItemType[10];
		tmpAry=toRet.Get_TimecontentList();
		Schedule_ItemType temp=new Schedule_ItemType();
		//Schedule을 Timeline 순서대로 Bubble Sort
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len-1;j++)
			{
				if(tmpAry[j-1].Get_TimeLine()>tmpAry[j].Get_TimeLine())
				{
					temp=tmpAry[j-1];
					tmpAry[j-1]=tmpAry[j];
					tmpAry[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			toRet.Set_TimecontentList(tmpAry[i], i);
		}
		return toRet;
	}
	public void constructGoal()
	{
		int length=everyGoals.size();
		if(length<=12)
		{
			Goal toFill=new Goal();
			//월간만 가능
			for(int i=0;i<length;i++)
			{
				toFill=everyGoals.get(i);
				dayG.fillTodayGoalList(toFill);
				for(int j=0;j<7;j++)
				{
					weekG.addGoalToDGList(dayG);
				}
				for(int j=0;j<4;j++)
				{
					montG.addGoalToWGList(weekG);
				}
				totalGoal.add(montG);
	
			}
		}
		else if(length<=48)
		{
			int flag=0;//각 구간을 시작하는 인덱스
			//월간+주간
			for(int i=0;i<12;i++)
			{
				for(int k=flag;k<flag+4;k++)
				{
					dayG.fillTodayGoalList(everyGoals.get(k));
					for(int j=0;j<7;j++)
					{
					weekG.addGoalToDGList(dayG);
					}
					montG.addGoalToWGList(weekG);
				}
				totalGoal.add(montG);
				flag+=4;
			}
		}
		else if(length<=336)
		{
			int weekidx=0;
			int dayidx=0;
			//월간+주간+불완전한 일간
			for(int i=0;i<12;i++)
			{
			 for(int j=weekidx;j<weekidx+4;j++)
			 {
				for(int k=dayidx;k<dayidx+7;k++)
				{
					dayG.fillTodayGoalList(everyGoals.get(k));
					weekG.addGoalToDGList(dayG);
				}
				montG.addGoalToWGList(weekG);
				dayidx+=7;
			 }
			 totalGoal.add(montG);
			 weekidx+=4;
			}
		}
	}
/*	public void constructDailyGoal()
	{
		//일별 목표 배분
	}
	public void constructWeeklyGoal()
	{
		//주별 목표 배분
	}
	public void constructMonthlyGoal()
	{
		//월별 목표 배분
	}*/
	public void constructBK()
	{
		//새로 추가. BucketList 개수에 따라 배분 과정을 달리함
		int length=everyBKs.size();
		if(length<=12)
		{
			BucketList toFill=new BucketList();
			//월간만 가능
			for(int i=0;i<length;i++)
			{
				toFill=everyBKs.get(i);
				dayBK.fillTodayBKList(toFill);
				for(int j=0;j<7;j++)
				{
					weekBK.addGoalToWBList(dayBK);
				}
				for(int j=0;j<4;j++)
				{
					montBK.addBKToWBList(weekBK);
				}
				totalBK.add(montBK);
	
			}
		}
		else if(length<=48)
		{
			int flag=0;//각 구간을 시작하는 인덱스
			//월간+주간
			for(int i=0;i<12;i++)
			{
				for(int k=flag;k<flag+4;k++)
				{
					dayBK.fillTodayBKList(everyBKs.get(k));
					for(int j=0;j<7;j++)
					{
					weekBK.addGoalToWBList(dayBK);
					}
					montBK.addBKToWBList(weekBK);
				}
				totalBK.add(montBK);
				flag+=4;
			}
		}
		else if(length<=336)
		{
			int weekidx=0;
			int dayidx=0;
			//월간+주간+불완전한 일간
			for(int i=0;i<12;i++)
			{
			 for(int j=weekidx;j<weekidx+4;j++)
			 {
				for(int k=dayidx;k<dayidx+7;k++)
				{
					dayBK.fillTodayBKList(everyBKs.get(k));
					weekBK.addGoalToWBList(dayBK);
				}
				montBK.addBKToWBList(weekBK);
				dayidx+=7;
			 }
			 totalBK.add(montBK);
			 weekidx+=4;
			}
		}
	}
/*	public void constructDailyBK()
	{
		//일별 버킷리스트 배분
		
	}
	public void constructWeeklyBK()
	{
		//주별 버킷리스트 배분
	}
	public void constructMonthlyBK()
	{
		//월별 버킷리스트 배분
		int num=(int)(everyBKs.size()/12);
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<num;j++)
			{
				
			}
		}
	}*/
	public void completeGoal(int month, int week, int date, String name)
	{
		//기존 함수에 파라미터 추가!
		//배분된 목표 하나 수행. Type2번
		String ifDone="false";
		ArrayList<Goal> d_Goal=totalGoal.get(month).getWGList().get(week).getDGList().get(date).getTodayGoalList();
		for(int i=0;i<d_Goal.size();i++)
		{
			if(d_Goal.get(i).getGName()==name)
			{
				d_Goal.get(i).completeGoal(1);
				if(d_Goal.get(i).getCheck())
				{
					ifDone="true";
				}
				break;
			}
		}
		totalGoal.get(month).getWGList().get(week).getDGList().get(date).setTodayGoalList(d_Goal);
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add("");
		input.add("");
		input.add(Integer.toString(date));
		input.add(Integer.toString(week));
		input.add(Integer.toString(month));
		for(int i=0;i<3;i++)
		{
			input.add("");
		}
		ArrayList<ArrayList<String>> tempSche=new ArrayList<ArrayList<String>>();
		try {
			tempSche = dbHandler.searchStudentSchedule(input);
			int num=Integer.parseInt(tempSche.get(0).get(0));
			for(int i=0;i<7;i++)
			{
				input.set(i,"");
			}
			input.set(7, ifDone);
			input.set(8, Integer.toString(2));
			dbHandler.updateRowOfStudentTimeTable(num, input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//num을 추출해 올 것!
		//DBupdate 함수 완성하기!
		
		
		
	}
	public void completeBK(int month, int week, int date, String name)
	{
		//버킷리스트 하나 수행. Type3번

		String ifDone="false";
		ArrayList<BucketList> d_Buck=totalBK.get(month).getWBList().get(week).getDBList().get(date).getTodayBK();
		for(int i=0;i<d_Buck.size();i++)
		{
			if(d_Buck.get(i).getName()==name)
			{
				d_Buck.get(i).setCheck(true);
				ifDone="true";
				break;
			}
		}
		totalBK.get(month).getWBList().get(week).getDBList().get(date).setTodayBK(d_Buck);
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add("");
		input.add("");
		input.add(Integer.toString(date));
		input.add(Integer.toString(week));
		input.add(Integer.toString(month));
		for(int i=0;i<3;i++)
		{
			input.add("");
		}
		ArrayList<ArrayList<String>> tempSche=new ArrayList<ArrayList<String>>();
		try {
			tempSche = dbHandler.searchStudentSchedule(input);
			int num=Integer.parseInt(tempSche.get(0).get(0));
			for(int i=0;i<7;i++)
			{
				input.set(i,"");
			}
			input.set(7, ifDone);
			input.set(8, Integer.toString(3));
			dbHandler.updateRowOfStudentTimeTable(num, input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sortTodoList(int month, int week, int date, String name)
	{
		Schedule_ItemType[] target=total.get(month).Get_Monthly_Schedule()[week].Get_Weekly_Schedule()[date].Get_TimecontentList();
		int sortIdx=0;
		for(int i=0;i<target.length;i++)
		{
			if(target[i].Get_Name()==name)
			{
				sortIdx=i;
				break;
			}
		}
		int sortNum=target[sortIdx].Get_Checking();
		sortNum=(sortNum+1)%5;
		target[sortIdx].Set_Checking(sortNum);
		ArrayList<String> input=new ArrayList<String>();
		input.add("");
		input.add("");
		input.add("");
		input.add(Integer.toString(date));
		input.add(Integer.toString(week));
		input.add(Integer.toString(month));
		for(int i=0;i<3;i++)
		{
			input.add("");
		}
		ArrayList<ArrayList<String>> sche;
		try {
			sche = dbHandler.searchStudentSchedule(input);
			int num=Integer.parseInt(sche.get(0).get(0));
			ArrayList<String> update=new ArrayList<String>();
			for(int i=0;i<7;i++)
			{
				update.add("");
			}
			update.add(Integer.toString(sortNum));
			update.add("");
			dbHandler.updateRowOfStudentSchedule(num, update);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
