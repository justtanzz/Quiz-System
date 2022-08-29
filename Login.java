package exam;


public class Login {
	private String username="Admin";
	private String password = "admin";
	
	public boolean isValid(String username, String password)
	{
		
		if(username.equals(this.username) && password.equals(this.password)) {
			return true;
		}
		else return false;
		
	}

}
