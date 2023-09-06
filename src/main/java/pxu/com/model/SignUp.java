package pxu.com.model;

public class SignUp {
	private String fistName, lastName, userName, passwrod;

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public SignUp(String fistName, String lastName, String userName, String passwrod) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.userName = userName;
		this.passwrod = passwrod;
	}
}