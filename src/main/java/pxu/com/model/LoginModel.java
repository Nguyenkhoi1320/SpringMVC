package pxu.com.model;

public class LoginModel {

	private String username, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginModel() {
		super();
	}

	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	
}