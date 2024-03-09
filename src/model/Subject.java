package model;

import java.util.List;

public class Subject extends BaseModel{
	private String name;
	private List<Rack> racks;
	
	public Subject(String name, List<Rack> racks) {
		super();
		this.name = name;
		this.racks = racks;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rack> getRacks() {
		return racks;
	}

	public void setRacks(List<Rack> racks) {
		this.racks = racks;
	}

}
