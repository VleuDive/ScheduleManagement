package ScheduleManagement;

public class EnumeratedValues {

	public enum Month{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
	public enum Week{FIRST,SECOND,THIRD,FOURTH,FIFTH}
	public enum Date{SUN,MON,TUE,WED,THU,FRI,SAT}
	public enum Sort{FINISH,DELAY,CANCEL,PROGRESS,AUTH} //0: 완료, 1: 연기, 2: 취소, 3: 진행중, 4: 위임 
	
}
