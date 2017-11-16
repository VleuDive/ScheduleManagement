package ScheduleManagement;

import java.sql.*;
import java.util.ArrayList;

public class DBHandler {

	private Connection conn;
	private Statement stmt;
	String toRet=" ";
	public DBHandler() 
	{

	}
	public void ConnectToDB()
	{
		
	}
	
	public String getString()
	{
		return toRet;
	}
	public Statement getSt()
	{
		return stmt;
	}
	public Connection getCon()
	{
		return conn;
	}
	
	//여기에 각 Table별 조회, 삽입, 삭제, 갱신 쿼리를 날리는 함수가 들어갈 예정!
	// 각 함수의 parameter는 각 테이블의 field 종류와 일치. DB 프로젝트 DepartmentManagement 참고할 것
	
	//User테이블
	public void insertRowToUser(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromUser(String id)
	{
		
	}
	public void updateRowOfUser(String id,ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<User>> searchUser(ArrayList<String> input)
	{
		ArrayList<User> users=new ArrayList<User>();
		ArrayList<ArrayList<User>> toRet=new ArrayList<ArrayList<User>>();
		toRet.add(users);
		return toRet;
	}
	
	//Student 테이블
	public void insertRowToStudent(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromStudent(int num)
	{
		
	}
	public void updateRowOfStudent(int num,ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<Student>> searchStudent(ArrayList<String> input)
	{
		ArrayList<Student> students=new ArrayList<Student>();
		ArrayList<ArrayList<Student>> toRet=new ArrayList<ArrayList<Student>>();
		toRet.add(students);
		return toRet;
		
	}
	
	//School 테이블
	public void insertRowToSchool(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromSchool(int num)
	{
		
	}
	public void updateRowOfSchool(int num, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<School>> searchSchool(ArrayList<String> input)
	{
		ArrayList<School> schools=new ArrayList<School>();
		ArrayList<ArrayList<School>> toRet=new ArrayList<ArrayList<School>>();
		toRet.add(schools);
		return toRet;
		
	}
	
	//StudentSchedule 테이블
	public void insertRowToStudentSchedule(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromStudentSchedule(int num)
	{
		
	}
	public void updateRowOfStudentSchedule(int num, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<Schedule_ItemType>> searchStudentSchedule(ArrayList<String> input)
	{
		ArrayList<Schedule_ItemType> schedules=new ArrayList<Schedule_ItemType>();
		ArrayList<ArrayList<Schedule_ItemType>> toRet=new ArrayList<ArrayList<Schedule_ItemType>>();
		toRet.add(schedules);
		return toRet;
		
	}
	//TotalTimeTable 테이블
	public void insertRowToTotalTimeTable(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromTotalTimeTable(int num)
	{
		
	}
	public void updateRowOfTotalTimeTable(int num, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<Schedule_ItemType>> searchTotalTimeTable(ArrayList<String> input)
	{
		ArrayList<Schedule_ItemType> schedules=new ArrayList<Schedule_ItemType>();
		ArrayList<ArrayList<Schedule_ItemType>> toRet=new ArrayList<ArrayList<Schedule_ItemType>>();
		toRet.add(schedules);
		return toRet;
	}
	//Major 테이블
	public void insertRowToMajor(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromMajor(int num)
	{
		
	}
	public void updateRowOfMajor(int num, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<String>> searchMajor(ArrayList<String> input)
	{
		ArrayList<String> majors=new ArrayList<String>();
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		toRet.add(majors);
		return toRet;
	}
	//ScoreBoard 테이블
	public void insertRowToScoreBoard(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromScoreBoard(String code)
	{
		
	}
	public void updateRowOfScoreBoard(String code, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<ScoreBoard_ItemType>> searchScoreBoard(ArrayList<String> input)
	{
		ArrayList<ScoreBoard_ItemType> scoreboards=new ArrayList<ScoreBoard_ItemType>();
		ArrayList<ArrayList<ScoreBoard_ItemType>> toRet=new ArrayList<ArrayList<ScoreBoard_ItemType>>();
		toRet.add(scoreboards);
		return toRet;
	}
	//StudentTimeTable 테이블
	public void insertRowToStudentTimeTable(ArrayList<String> input)
	{
		
	}
	public void deleteRowFromStudentTimeTable(int num)
	{
		
	}
	public void updateRowOfStudentTimeTable(int num, ArrayList<String> input)
	{
		
	}
	public ArrayList<ArrayList<Schedule_ItemType>> searchStudentTimeTable(ArrayList<String> input)
	{
		ArrayList<Schedule_ItemType> schedules=new ArrayList<Schedule_ItemType>();
		ArrayList<ArrayList<Schedule_ItemType>> toRet=new ArrayList<ArrayList<Schedule_ItemType>>();
		toRet.add(schedules);
		return toRet;
	}
	
	//소멸자
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}

}
