package ScheduleManagement;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;

public class App {
	private User p_User; // p_User�쓽 �옄猷뚰삎�쓣 int �뿉�꽌 User濡� 蹂�寃�. �쁽�옱 濡쒓렇�씤�븳 �쑀��
	
	private ArrayList<Schedule_ItemType> TotalSchedules;//�뜲�씠�꽣踰좎씠�뒪�뿉 �벑濡앸맂 �쟾泥� Schedule
	private ArrayList<Goal> TotalGoals;// �뜲�씠�꽣踰좎씠�뒪�뿉 �벑濡앸맂 �쟾泥� Goal 紐⑸줉
	private ArrayList<BucketList> TotalBKs;// �뜲�씠�꽣踰좎씠�뒪�뿉 �벑濡앸맂 �쟾泥� BK 紐⑸줉
	private ArrayList<ScoreBoard_ItemType> scoreBoardList;// �뜲�씠�꽣踰좎씠�뒪�뿉 �벑濡앸맂 �쟾泥� ScoreBoard紐⑸줉
	
	private ScheduleHandler S_Handler;// �씪�젙愿�由� Handler
	private DBHandler D_Handler; //DB �뿰寃� 諛� 荑쇰━ �빖�뱾�윭
	//test
	
	/*
	 * p_User瑜� User�삎�쑝濡� �젙�쓽�븷 寃쎌슦, p_User�쓽 ���엯�� �몢 媛�吏�濡� 遺꾨쪟 ->Student, School
	 * �떎�젣濡� 援ы쁽 �떆�뿉�뒗 癒쇱� User ���엯�쑝濡� �븷�떦�븳 �썑 濡쒓렇�씤�븳 �쉶�썝�쓽 ���엯�뿉 �뵲�씪 p_User�뿉 Student �삉�뒗 School �겢�옒�뒪 �븷�떦
	 * �씠�젃寃� �븷 �떆, p_User 媛앹껜瑜� �넻�빐 媛� 媛앹껜媛� 媛�吏� �쟾泥� 紐⑺몴 / �씪�젙 紐⑸줉�뿉 �젒洹� 媛��뒫�븯硫�, App�씠 媛�吏�怨� �엳�쓣 �븘�슂 X
	 * App�씠 紐⑤뱺 List�뱾�쓣 �떎 媛�吏�怨� �엳寃� �븯�젮硫�: School �쉶�썝留� 媛�吏�怨� �엳�뒗 �쟾怨� �삉�뒗 醫낇빀�떆媛꾪몴 �벑�룄 �씠 �겢�옒�뒪�뿉 �룷�븿�릺�뼱�빞 �븿 ->愿�由ш� 蹂듭옟�빐吏�怨� 鍮꾪슚�쑉�쟻?
	 */
	public App()
	{
		p_User=new User();//�뿬湲곗꽌�뒗 �깉濡쒖슫 User �겢�옒�뒪瑜� �젙�쓽�븯怨�, �씠�썑 �쑀���쓽 ���엯�뿉 �뵲�씪 p_User=new Student() �삉�뒗 p_User=new School(); �븷�떦
		S_Handler=new ScheduleHandler();
		D_Handler=new DBHandler();
		scoreBoardList=new ArrayList<ScoreBoard_ItemType>();
		TotalSchedules=new ArrayList<Schedule_ItemType>();
		TotalGoals=new ArrayList<Goal>();
		TotalBKs=new ArrayList<BucketList>();
	
	}
	public User getUser()
	{
		return p_User;
	}
	public void setUser(User u)
	{
		p_User=u;
	}
	public void SchoolLogin(String id, String pw)
	{
		//�븰援� �쉶�썝 濡쒓렇�씤
	}
	public void StudentLogin(String id, String pw)
	{
		
	}
	public void Logout()
	{
		
	}
	public void withDraw()
	{
		//�쉶�썝 �깉�눜
	}
	public void StudentRegister(int type, String id, String pw, String schoolName,String Major,String nickname)
	{
		//�븰�깮 �쉶�썝 媛��엯
	}
	public void SchoolRegister(int type, String id, String pw, String schoolName)
	{
		
	}
	public void buildStudentTimeTable()
	{
		
	}
	public void buildTotalTimeTable()
	{
		
	}
	public void buildSchoolMajorList(String major)
	{
		
	}
	public void showScheduleByMonth(int month)
	{
		
	}
	public void showScheduleByWeek(int week)
	{
		
	}
	public void showScheduleByDate(int date)
	{
		
	}
	public void registerSchedule(String name, int month, int week, int date, int timeline, int type, int sort)
	{
		
	}
	public void deleteSchedule(int month, int week, int date, String name)
	{
		
	}
	public void sortSchedule(int month, int week, int date, int sort)
	{
		
	}
	public void calcScoreBoard()
	{
		
	}
	public void showScoreBoardByMonth(int month)
	{
		
	}
	public void showScoreBoardByWeek(int week)
	{
		
	}
	public void showScoreBoardByDate(int date)
	{
	}
	public void feedBackAlarm()
	{
		//蹂꾨룄�쓽 thread濡� 愿�由�?
	}
	public void registerFeedBack(int month, int week, int date, String feed)
	{
		
	}

}
