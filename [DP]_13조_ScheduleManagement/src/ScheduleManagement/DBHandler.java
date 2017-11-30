package ScheduleManagement;

import java.sql.*;
import java.util.ArrayList;
//DBHandler class funcs
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
	public void insertRowToUser(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO User(UserID,Type,Password) VALUES('";
		query=query+input.get(0)+"',"+input.get(1)+",'"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromUser(String id) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM Users WHERE UserID=";
		query=query+id;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
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
	public void insertRowToStudent(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO Student(Number,StudentID,SchoolID,MajorNum,NickName)VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"',"+input.get(3)+",'"+input.get(4)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromStudent(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM Users WHERE StudentID=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
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
	public void insertRowToSchool(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO School(Number,SchoolID,Name)VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromSchool(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM School WHERE Number=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
	public void insertRowToStudentSchedule(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO StudentSchedule(Number,StudentID,Time,Date,Week,Month,Subject,State,Type) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"',"+input.get(2)+","+input.get(3)+","+input.get(4)+","+input.get(5)+",'"+input.get(6)+"',"+input.get(7)+","+input.get(8)+")";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromStudentSchedule(int num) throws SQLException
	{

		stmt=conn.createStatement();
		String query="DELETE FROM StudentSchedule WHERE Number=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
	public void insertRowToTotalTimeTable(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO TotalTimeTable(Number,SchoolID,Time,Name,Professor,Room,Credits,Type) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"',"+input.get(2)+",'"+input.get(3)+"','"+input.get(4)+"','"+input.get(5)+"',"+input.get(6)+","+input.get(7)+")";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromTotalTimeTable(int num) throws SQLException
	{

		stmt=conn.createStatement();
		String query="DELETE FROM TotalTimeTable WHERE Number=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
	public void insertRowToMajor(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO Major(Number,SchoolID,Name) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromMajor(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM Major WHERE Number=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
	public void insertRowToScoreBoard(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO ScoreBoard(Code,NumOfDone,NumOfDelay,NumOfCommit,NumOfCancel,NumOfProgress,Scoer,NumOfDone_Goal,NumOfDone_Bucket,Feedback) VALUES('";
		query=query+input.get(0)+"',"+input.get(1)+","+input.get(2)+","+input.get(3)+","+input.get(4)+","+input.get(5)+","+input.get(6)+","+input.get(7)+","+input.get(8)+",'"+input.get(9)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromScoreBoard(String code) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM ScoreBoard WHERE Code LIKE";
		query=query+"'"+code+"'";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
	public void insertRowToStudentTimeTable(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO StudentTimeTable(Number,StudentID,Time,Professor,Room,Credits,Type,IfTest,IfAssignment) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"',"+input.get(2)+",'"+input.get(3)+"','"+input.get(4)+"',"+input.get(5)+","+input.get(6)+","+input.get(7)+","+input.get(8)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromStudentTimeTable(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM StudentTimeTable WHERE Number=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
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
