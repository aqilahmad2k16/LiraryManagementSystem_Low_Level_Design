package model;

public class Librian extends BaseModel{
	private String name;
	private String phoneNumber;
	private Floor floor;
	
	public Librian(String name, String phoneNumber, Floor floor) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.floor = floor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	
}
