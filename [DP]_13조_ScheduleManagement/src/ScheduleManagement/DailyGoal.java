	/*DailyGoal은 Goal을 상속받지 않는 별개의 클래스입니다. 그렇기 때문에,
	 * Goal 클래스 객체를 모아 DailyGoal을 만들고, DG가 모여 WeeklyGoal이 되고... 식으로 진행하려 합니다.
	 * Goal 클래스를 '목표'를 나타내는 자료구조로 보는 거죠.
	 * 그래서 이미 Goal 클래스에 Name과 Checking이 있으므로, 여기서는 Name은 없애고 단지 Goal의 목록으로 하루 목표를 나타내보려 합니다.
	 * 처음에는 Daily, Weekly, Monthly Goal을 모두 Goal의 자식으로 두어야하나 고민했는데, 지금 설계를 그대로 두는 것이 좋을 것 같습니다.
	 * BucketList도 그렇게 진행할게요.
	 */
package ScheduleManagement;

import java.util.ArrayList;

public class DailyGoal {

	//Daily goal 할당도 필요함. 날짜 이월을 자연스럽게 처리할 알고리즘 필요.
	private int numOfDGoals;//하루에 할당되는 목표의 개수.
	private ArrayList<Goal> TodayGoalList;//TodayGoalList는 일반 배열에서 ArrayList로 변경
	private int date;
	public DailyGoal()
	{
		numOfDGoals=0;
		Goal empty=new Goal();
		date=empty.getDate();
		TodayGoalList=new ArrayList<Goal>();
		for(int i=0;i<numOfDGoals;i++)
		{
			TodayGoalList.add(empty);
		}
	}
	

	public int getDate()
	{
		return date;
	}
	public int getNumOfGoals()
	{
		return numOfDGoals;
	}
	public ArrayList<Goal> getTodayGoalList()
	{
		return TodayGoalList;
	}
	
	public void setNumOfGoals(int ng)
	{
		numOfDGoals=ng;
	}
	public void setTodayGoalList(ArrayList<Goal> list)
	{
		//list하나를 통째로 TodayGoalList로 설정. 일반적인 setter 함수
		TodayGoalList=list;
	}
	public void setDate(int d)
	{
		date=d;
	}
	
	public void fillTodayGoalList(Goal DG)
	{
		date=DG.getDate();
		//todayGoalList에 항목 하나 채우기 ->일별 목표 배분 시 사용
		//해당 배열 칸에 든 goal의 이름이 비어있으면 배열에 DG넣기->ArrayList에 DG 추가하기
		TodayGoalList.add(DG);
	}
	public void deleteGoalFromList(Goal DG)
	{
		TodayGoalList.remove(DG);
	}
}
