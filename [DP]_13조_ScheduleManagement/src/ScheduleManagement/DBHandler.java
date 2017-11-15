package ScheduleManagement;

import java.sql.SQLException;

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
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}

}
