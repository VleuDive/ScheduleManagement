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
	public void updateRowOfUser(String id,ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE User SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Type="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Password='"+input.get(i)+"'";
					}
					break;
				}
			}
		}
		query=query+" WHERE UserID="+id;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchUser(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM User WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"UserID LIKE'"+input.get(i)+"'";
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:{
				if(!input.get(i).equals(""))
				{
					query=query+"Type="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Password LIKE '"+input.get(i)+"'";
				}
				
				break;
			}
			
			}
			
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("USERID"));
			temp.add(rs.getString("TYPE"));
			temp.add(rs.getString("PASSWORD"));
			toRet.add(temp);
		}
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
	public void updateRowOfStudent(int num,ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE School SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" StudentID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" SchoolID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 3:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" MajorNum="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 4:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NickName='"+input.get(i)+"'";
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchStudent(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM Student WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"Number="+input.get(i);
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:{
				if(!input.get(i).equals(""))
				{
					query=query+"StudentID LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"SchoolID LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				break;
			}
			case 3:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"MajorNum="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 4:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NickName LIKE '"+input.get(i)+"'";
				}
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("NUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("MAJORNUM"));
			temp.add(rs.getString("NICKNAME"));
			toRet.add(temp);
		}
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
	public void updateRowOfSchool(int num, ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE School SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" SchoolID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Name='"+input.get(i)+"'";
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	
	public ArrayList<ArrayList<String>> searchSchool(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM School WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"Number="+input.get(i);
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:{
				if(!input.get(i).equals(""))
				{
					query=query+"SchoolID LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Name LIKE '"+input.get(i)+"'";
	
				}
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("NUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("NAME"));
			toRet.add(temp);
		}
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
	public void updateRowOfStudentSchedule(int num, ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE StudentSchedule SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" SchoolID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Time="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 3:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Date="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 4:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Week="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 5:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Month="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 6:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Subject='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 7:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" State="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 8:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Type="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchStudentSchedule(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM StudentSchedule WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"Number="+input.get(i);
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:{
				if(!input.get(i).equals(""))
				{
					query=query+"StudentID LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Time="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				break;
			}
			case 3:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Date="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 4:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Week="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 5:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Month="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 6:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Subject LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 7:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"State="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 8:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Date="+input.get(i);
				}	
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("NUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("TIME"));
			temp.add(rs.getString("DATE"));
			temp.add(rs.getString("WEEK"));
			temp.add(rs.getString("MONTH"));
			temp.add(rs.getString("SUBJECT"));
			temp.add(rs.getString("STATE"));
			temp.add(rs.getString("TYPE"));
			toRet.add(temp);
		}
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
	public void updateRowOfTotalTimeTable(int num, ArrayList<String> input) throws SQLException
	{

		stmt=conn.createStatement();
		String query="UPDATE TotalTimeTable SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" SchoolID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Time="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 3:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Name='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 4:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Professor='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 5:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Room='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 6:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Credits="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 7:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Type="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchTotalTimeTable(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM TotalTimeTable WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"Number="+input.get(i);
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:{
				if(!input.get(i).equals(""))
				{
					query=query+"SchoolID LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Time="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				break;
			}
			case 3:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Name LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 4:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Professor LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 5:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Room LIKE '"+input.get(i)+"'";
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 6:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Credits="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 7:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Type="+input.get(i);
				}
				
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("NUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("TIME"));
			temp.add(rs.getString("NAME"));
			temp.add(rs.getString("PROFESSOR"));
			temp.add(rs.getString("ROOM"));
			temp.add(rs.getString("CREDITS"));
			temp.add(rs.getString("TYPE"));
			toRet.add(temp);
		}
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
	public void updateRowOfMajor(int num, ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE Major SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" SchoolID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Name='"+input.get(i)+"'";
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchMajor(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
	stmt=conn.createStatement();
	String query="SELECT* FROM Major WHERE ";
	for(int i=0;i<input.size();i++)
	{
		switch(i)
		{
		case 0:
		{
			if(!input.get(i).equals(""))
			{
			query=query+"Number="+input.get(i);
			int count=0;
			for(int j=i+1;j<input.size();j++)
			{
				if(!input.get(j).equals(""))
					count++;
			}
			if(count!=0)
			{
				query=query+"AND";
			}
			}
			break;
		}
		case 1:{
			if(!input.get(i).equals(""))
			{
				query=query+"SchoolID LIKE '"+input.get(i)+"'";
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
			break;
		}
		case 2:
		{
			if(!input.get(i).equals(""))
			{
				query=query+"Name LIKE '"+input.get(i)+"'";
			}
			break;
		}
		}
	}
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next())
	{
		ArrayList<String> temp=new ArrayList<String>();
		temp.add(rs.getString("NUMBER"));
		temp.add(rs.getString("SCHOOLID"));
		temp.add(rs.getString("NAME"));
		toRet.add(temp);
	}
	return toRet;
	}
	//ScoreBoard 테이블
	public void insertRowToScoreBoard(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO ScoreBoard(Code,NumOfDone,NumOfDelay,NumOfCommit,NumOfCancel,NumOfProgress,Score,NumOfDone_Goal,NumOfDone_Bucket,Feedback) VALUES('";
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
	public void updateRowOfScoreBoard(String code, ArrayList<String> input) throws SQLException
	{

		stmt=conn.createStatement();
		String query="UPDATE StudentSchedule SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfDone="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfDelay="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 3:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfCommit="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 4:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfCancel="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 5:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfProgress="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 6:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Score="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 7:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfDone_Goal="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 8:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" NumOfDone_Bucket="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 9:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Feedback='"+input.get(i)+"'";
					}
					break;
				}
			}
		}
		query=query+" WHERE Code="+code;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchScoreBoard(ArrayList<String> input) throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM ScoreBoard WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"Code LIKE '"+input.get(i)+"'";
				int count=0;
				for(int j=i+1;j<input.size();j++)
				{
					if(!input.get(j).equals(""))
						count++;
				}
				if(count!=0)
				{
					query=query+"AND";
				}
				}
				break;
			}
			case 1:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfDone="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
					}
				break;
			}
			case 2:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfDelay="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				break;
			}
			case 3:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfCommit="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 4:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfCancel="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 5:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfProgress="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 6:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"Score="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 7:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfDone_Goal="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 8:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"NumOfDone_Bucket="+input.get(i);
					int count=0;
					for(int j=i+1;j<input.size();j++)
					{
						if(!input.get(j).equals(""))
							count++;
					}
					if(count!=0)
					{
						query=query+"AND";
					}
				}
				
				break;
			}
			case 9:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"FeedBack LIKE '"+input.get(i)+"'";
				}	
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("CODE"));
			temp.add(rs.getString("NUMOFDONE"));
			temp.add(rs.getString("NUMOFDELAY"));
			temp.add(rs.getString("NUMOFCOMMIT"));
			temp.add(rs.getString("NUMOFCANCEL"));
			temp.add(rs.getString("NUMOFPROGRESS"));
			temp.add(rs.getString("SCORE"));
			temp.add(rs.getString("NUMOFDONE_GOAL"));
			temp.add(rs.getString("NUMOFDONE_BUCKET"));
			temp.add(rs.getString("FEEDBACK"));
			toRet.add(temp);
		}
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
	public void updateRowOfStudentTimeTable(int num, ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE StudentTimeTable SET";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
				case 1:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" StudentID='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 2:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Time="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 3:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Professor='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 4:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Room='"+input.get(i)+"'";
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 5:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Credits="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 6:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" Type="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 7:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" IfTest="+input.get(i);
						int count=0;
						for(int j=i+1;j<input.size();j++)
						{
							if(!input.get(j).equals(""))
							{
								count++;
							}
						}
						if(count!=0)
						{
							query=query+",";
						}
					}
					break;
				}
				case 8:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" IfAssignment="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE Number="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
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
