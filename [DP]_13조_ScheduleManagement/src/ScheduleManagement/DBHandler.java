package ScheduleManagement;

import java.sql.*;

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
	public void insertRowToUser()
	{
		
	}
	public void deleteRowFromUser()
	{
		
	}
	public void updateRowOfUser()
	{
		
	}
	public void searchUser()
	{
		
	}
	
	//Student 테이블
	
	//School 테이블
	
	//StudentSchedule 테이블
	//TotalTimeTable 테이블
	//Major 테이블
	//ScoreBoard 테이블
	//StudentTimeTable 테이블
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}

}
