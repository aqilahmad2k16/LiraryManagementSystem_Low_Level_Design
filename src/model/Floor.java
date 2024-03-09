package model;

import java.util.List;

public class Floor extends BaseModel{
	private int floorNumber;
	private String floorName;
	private List<Subject> subjects;
	private FloorStatus floorStatus;
	public Floor(int floorNumber, String floorName, List<Subject> subjects, FloorStatus floorStatus) {
		super();
		this.floorNumber = floorNumber;
		this.floorName = floorName;
		this.subjects = subjects;
		this.floorStatus = floorStatus;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public FloorStatus getFloorStatus() {
		return floorStatus;
	}
	public void setFloorStatus(FloorStatus floorStatus) {
		this.floorStatus = floorStatus;
	}
	
	
}
