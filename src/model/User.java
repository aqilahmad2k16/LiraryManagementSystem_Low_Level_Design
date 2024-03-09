package model;

public class User extends BaseModel{
	private String name;
	private String email;
	private String phoneNumber;
	private int age;
	private UserType userType;
	
	public User(String name, String email, String phoneNumber, int age, UserType userType) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.userType = userType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	
}
