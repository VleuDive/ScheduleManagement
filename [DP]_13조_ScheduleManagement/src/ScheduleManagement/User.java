package ScheduleManagement;

public class User {
	
	protected boolean registration;
	protected boolean login;
	protected String Id; // Char* 대신 String을 사용했습니다. 앞으로도 char* 부분은 String으로 대체하겠습니다.
	protected String pw;

	public boolean getReg()
	{
		return registration;
	}
	public boolean getLog()
	{
		return login;
	}
	public String getId()
	{
		return Id;
	}
	public String getPw()
	{
		return pw;
	}
	
	public void setReg(boolean r)
	{
		registration=r;
	}
	public void setLogin(boolean l)
	{
		login=l;
	}
	public void setId(String id)
	{
		Id=id;
	}
	public void setPw(String p)
	{
		pw=p;
		
	}
}
