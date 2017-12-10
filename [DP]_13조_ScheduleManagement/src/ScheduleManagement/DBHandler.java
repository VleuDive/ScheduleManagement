package ScheduleManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
//DBHandler class funcs
public class DBHandler {

	private Connection conn;
	private Statement stmt;
	String toRet=" ";
	public DBHandler() 
	{
		conn = null;
		stmt = null;
		ConnectToDB();
	}
	public void ConnectToDB()
	{
		try {
			Class.forName("com.tmax.tibero.jdbc.TbDriver"); // 사용할 DBMS 드라이버의 이름을 인수로 넘겨 설정한다.
			System.out.println("드라이버 로딩성공"); // 드라이버 로딩에 성공한 경우 성공 메시지를 띄운다.

			conn = DriverManager.getConnection(
					"jdbc:tibero:thin:@localhost:8629:tibero", "sys", "system");// DBMS 드라이버와 실질적인 연결을 한다. 
			System.out.println("DB연결 성공");// DB와의 연결에 성공한 경우 성공 메시지를 띄운다.
			stmt = conn.createStatement();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

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
		String query="INSERT INTO TUser(UserID,Type,Password) VALUES('";
		query=query+input.get(0)+"',"+input.get(1)+",'"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromUser(String id) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM TUsers WHERE UserID=";
		query=query+id;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> getAllUser() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM TUser";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("USERID"));
			temp.add(rs.getString("TYPE"));
			temp.add(rs.getString("PASSWORD"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	public void updateRowOfUser(String id,ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="UPDATE TUser SET";
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
		String query="SELECT* FROM TUser WHERE ";
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
					query=query+" AND ";
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
						query=query+" AND ";
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
		String query="INSERT INTO Student(StuNumber,StudentID,SchoolID,MajorNum,NickName)VALUES(";
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
		query=query+" WHERE StuNumber="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> getAllStudent() throws SQLException
	{//StuNumber,StudentID,SchoolID,MajorNum,NickName)
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM Student";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("STUNUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("MAJORNUM"));
			temp.add(rs.getString("NICKNAME"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	public ArrayList<Student> searchStudent(ArrayList<String> input) throws SQLException
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
				query=query+"StuNumber="+input.get(i);
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
		ArrayList<Student> result=new ArrayList<Student>();
		ResultSet rs=stmt.executeQuery(query);
		Student toAdd=new Student();
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			ArrayList<String> mjsearch=new ArrayList<String>();
			mjsearch.add("");
			temp.add(rs.getString("STUNUMBER"));
			temp.add(rs.getString("STUDENTID"));
			toAdd.setId(rs.getString("STUDENTID"));
			temp.add(rs.getString("SCHOOLID"));
			toAdd.setSchool(rs.getString("SCHOOLID"));
			temp.add(rs.getString("MAJORNUM"));
			mjsearch.add(rs.getString("MAJORNUM"));
			mjsearch.add("");
			ArrayList<ArrayList<String>> tempMj=searchMajor(mjsearch);
			String mjName=tempMj.get(0).get(2);
			toAdd.setMajor(mjName);
			temp.add(rs.getString("NICKNAME"));
			toAdd.setNickName(rs.getString("NICKNAME"));
			ArrayList<String> tableSearch=new ArrayList<String>();
			School_Schedule tmpSchSche=new School_Schedule();
			ArrayList<School_Schedule> tmpTable=new ArrayList<School_Schedule>();
			tableSearch.add("");
			tableSearch.add(toRet.get(0).get(1));
			for(int i=2;i<9;i++)
			{
				tableSearch.add("");
			}
			ArrayList<ArrayList<String>> tempTable=searchStudentTimeTable(tableSearch);
			for(int i=0;i<tempTable.size();i++)
			{
				tmpSchSche.Set_StudentId(tempTable.get(i).get(1));
				tmpSchSche.Set_TimeLine(Integer.parseInt(tempTable.get(i).get(2)));
				tmpSchSche.Set_Type(0);
				tmpSchSche.Set_Name(tempTable.get(i).get(2));
				if(Boolean.parseBoolean(tempTable.get(i).get(7)))
				{
					tmpSchSche.Set_Exam(true);
				}
				else
				{
					tmpSchSche.Set_Exam(false);
				}
				if(Boolean.parseBoolean(tempTable.get(i).get(8)))
				{
					tmpSchSche.Set_Assignment(true);
				}
				else
				{
					tmpSchSche.Set_Assignment(false);
				}
				tmpTable.add(tmpSchSche);
			}
			toRet.add(temp);
			toAdd.setTable(tmpTable);
			result.add(toAdd);
		}
		return result;
	}
	
	//School 테이블
	public ArrayList<ArrayList<String>> getAllSchools() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM School";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("SCHNUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("NAME"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	public void insertRowToSchool(ArrayList<String> input) throws SQLException
	{
		stmt=conn.createStatement();
		String query="INSERT INTO School(SchNumber,SchoolID,Name)VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRowFromSchool(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM School WHERE SchNumber=";
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
		query=query+" WHERE ScheNumber="+num;
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
				query=query+"SchNumber="+input.get(i);
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
			temp.add(rs.getString("SCHNUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("NAME"));
			toRet.add(temp);
		}
		return toRet;
	}
	
	//StudentSchedule 테이블
	public ArrayList<ArrayList<String>> getAllStudentSchedule() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM StudentSchedule";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("SCHENUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("SCHETIME"));
			temp.add(rs.getString("SCHEDATE"));
			temp.add(rs.getString("SCHEWEEK"));
			temp.add(rs.getString("SCHEMONTH"));
			temp.add(rs.getString("SUBJECT"));
			temp.add(rs.getString("STATE"));
			temp.add(rs.getString("SCHETYPE"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	public void insertRowToStudentSchedule(ArrayList<String> input) throws SQLException
	{

		int count=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i)!="")
			{
				count++;
			}
		}
		String query="";
		if(count!=0)
		{
			stmt=conn.createStatement();
		query="INSERT INTO StudentSchedule(ScheNumber,StudentID,ScheTime,ScheDate,ScheWeek,ScheMonth,Subject,State,ScheType) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"',"+input.get(2)+","+input.get(3)+","+input.get(4)+","+input.get(5)+",'"+input.get(6)+"',"+input.get(7)+","+input.get(8)+")";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		}
		
		
	}
	public void deleteRowFromStudentSchedule(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM StudentSchedule WHERE ScheNumber=";
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
						query=query+" ScheTime="+input.get(i);
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
						query=query+" ScheDate="+input.get(i);
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
						query=query+" ScheWeek="+input.get(i);
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
						query=query+" ScheMonth="+input.get(i);
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
						query=query+" ScheType="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE ScheNumber="+num;
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
				query=query+"ScheNumber="+input.get(i);
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
					query=query+"ScheTime="+input.get(i);
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
					query=query+"ScheDate="+input.get(i);
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
					query=query+"ScheWeek="+input.get(i);
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
					query=query+"ScheMonth="+input.get(i);
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
					query=query+"ScheType="+input.get(i);
				}	
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("SCHENUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("SCHETIME"));
			temp.add(rs.getString("SCHEDATE"));
			temp.add(rs.getString("SCHEWEEK"));
			temp.add(rs.getString("SCHEMONTH"));
			temp.add(rs.getString("SUBJECT"));
			temp.add(rs.getString("STATE"));
			temp.add(rs.getString("SCHETYPE"));
			toRet.add(temp);
		}
		return toRet;
		
	}
	public ArrayList<ArrayList<String>> getAllTotalTimeTable() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM TotalTimeTable";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("TNUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("TTIME"));
			temp.add(rs.getString("NAME"));
			temp.add(rs.getString("PROFESSOR"));
			temp.add(rs.getString("ROOM"));
			temp.add(rs.getString("CREDITS"));
			temp.add(rs.getString("TTYPE"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	//TotalTimeTable 테이블
	public void insertRowToTotalTimeTable(ArrayList<String> input) throws SQLException
	{
		int count=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i)!="")
			{
				count=0;
			}
		}
		if(count!=0)
		{
		stmt=conn.createStatement();
		String query="INSERT INTO TotalTimeTable(TNumber,SchoolID,TTime,Name,Professor,Room,Credits,TType) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"',"+input.get(2)+",'"+input.get(3)+"','"+input.get(4)+"','"+input.get(5)+"',"+input.get(6)+","+input.get(7)+")";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		}
	}
	public void deleteRowFromTotalTimeTable(int num) throws SQLException
	{

		stmt=conn.createStatement();
		String query="DELETE FROM TotalTimeTable WHERE TNumber=";
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
						query=query+" TTime="+input.get(i);
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
						query=query+" TType="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE TNumber="+num;
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
				query=query+"TNumber="+input.get(i);
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
					query=query+"TTime="+input.get(i);
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
					query=query+"TType="+input.get(i);
				}
				
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("TNUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("TTIME"));
			temp.add(rs.getString("NAME"));
			temp.add(rs.getString("PROFESSOR"));
			temp.add(rs.getString("ROOM"));
			temp.add(rs.getString("CREDITS"));
			temp.add(rs.getString("TTYPE"));
			toRet.add(temp);
		}
		return toRet;
	}
	//Major 테이블
	public void insertRowToMajor(ArrayList<String> input) throws SQLException
	{
		int count=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i)!="")
			{
				count++;
			}
		}
		if(count!=0)
		{
		stmt=conn.createStatement();
		String query="INSERT INTO Major(MNumber,SchoolID,Name) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		}
	}
	public ArrayList<ArrayList<String>> getAllMajor() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM Major";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("MNUMBER"));
			temp.add(rs.getString("SCHOOLID"));
			temp.add(rs.getString("NAME"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	public void deleteRowFromMajor(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM Major WHERE MNumber=";
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
		query=query+" WHERE MNumber="+num;
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
			query=query+"MNumber="+input.get(i);
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
		temp.add(rs.getString("MNUMBER"));
		temp.add(rs.getString("SCHOOLID"));
		temp.add(rs.getString("NAME"));
		toRet.add(temp);
	}
	return toRet;
	}
	//ScoreBoard 테이블
	public void insertRowToScoreBoard(ArrayList<String> input) throws SQLException
	{
		int count=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i)!="")
			{
				count++;
			}
		}
		if(count!=0)
		{
		stmt=conn.createStatement();
		String query="INSERT INTO ScoreBoard(Code,NumOfDone,NumOfDelay,NumOfCommit,NumOfCancel,NumOfProgress,Score,NumOfDone_Goal,NumOfDone_Bucket,Feedback) VALUES('";
		query=query+input.get(0)+"',"+input.get(1)+","+input.get(2)+","+input.get(3)+","+input.get(4)+","+input.get(5)+","+input.get(6)+","+input.get(7)+","+input.get(8)+",'"+input.get(9)+"')";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		}
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
	public ArrayList<ArrayList<String>> getAllStudentTimeTable() throws SQLException
	{
		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT * FROM StudentTimeTable";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> temp=new ArrayList<String>();
		while(rs.next())
		{
			temp.add(rs.getString("STANUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("STATIME"));
			temp.add(rs.getString("NAME"));
			temp.add(rs.getString("PROFESSOR"));
			temp.add(rs.getString("ROOM"));
			temp.add(rs.getString("CREDITS"));
			temp.add(rs.getString("STATYPE"));
			temp.add(rs.getString("IFTEST"));
			temp.add(rs.getString("IFASSIGNMENT"));
			toRet.add(temp);
		}
		
		return toRet;
	}
	//StudentTimeTable 테이블
	public void insertRowToStudentTimeTable(ArrayList<String> input) throws SQLException
	{
		int count=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i)!="")
			{
				count++;
			}
		}
		if(count!=0)
		{
		stmt=conn.createStatement();
		String query="INSERT INTO StudentTimeTable(StaNumber,StudentID,Name,StaTime,Professor,Room,Credits,StaType,IfTest,IfAssignment) VALUES(";
		query=query+input.get(0)+",'"+input.get(1)+"','"+input.get(2)+"',"+input.get(3)+",'"+input.get(4)+"','"+input.get(5)+"',"+input.get(6)+","+input.get(7)+","+input.get(8)+","+input.get(9)+")";
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		}
	}
	public void deleteRowFromStudentTimeTable(int num) throws SQLException
	{
		stmt=conn.createStatement();
		String query="DELETE FROM StudentTimeTable WHERE StaNumber=";
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
						query=query+" StudentID LIKE '"+input.get(i)+"'";
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
						query=query+" Name LIKE'"+input.get(i)+"'";
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
						query=query+" StaTime="+input.get(i);
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
						query=query+" StaType="+input.get(i);
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
				case 9:
				{
					if(!input.get(i).equals(""))
					{
						query=query+" IfAssignment="+input.get(i);
					}
					break;
				}
			}
		}
		query=query+" WHERE StaNumber="+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
	}
	public ArrayList<ArrayList<String>> searchStudentTimeTable(ArrayList<String> input) throws SQLException
	{

		ArrayList<ArrayList<String>> toRet=new ArrayList<ArrayList<String>>();
		stmt=conn.createStatement();
		String query="SELECT* FROM StudentTimeTable WHERE ";
		for(int i=0;i<input.size();i++)
		{
			switch(i)
			{
			case 0:
			{
				if(!input.get(i).equals(""))
				{
				query=query+"StaNumber="+input.get(i);
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
			case 3:
			{
				if(!input.get(i).equals(""))
				{
					query=query+"StaTime="+input.get(i);
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
					query=query+"StaType="+input.get(i);
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
					query=query+"IfTest="+input.get(i);
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
					query=query+"IfAssignment="+input.get(i);
				}
				
				break;
			}
			}
		}
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			ArrayList<String> temp=new ArrayList<String>();
			temp.add(rs.getString("STANUMBER"));
			temp.add(rs.getString("STUDENTID"));
			temp.add(rs.getString("STATIME"));
			temp.add(rs.getString("PROFESSOR"));
			temp.add(rs.getString("ROOM"));
			temp.add(rs.getString("CREDITS"));
			temp.add(rs.getString("STATYPE"));
			temp.add(rs.getString("IFTEST"));
			temp.add(rs.getString("IFASSIGNMENT"));
			toRet.add(temp);
		}
		return toRet;
	}
	
	//소멸자
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}

}
