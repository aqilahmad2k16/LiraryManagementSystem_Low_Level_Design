package model;

public class Book extends BaseModel{
	private String name;
	private String autherName;
	private double weight;
	private Subject subject;
	private Rack rack;
	
	public Book(String name, String autherName, double weight, Subject subject, Rack rack) {
		super();
		this.name = name;
		this.autherName = autherName;
		this.weight = weight;
		this.subject = subject;
		this.rack = rack;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
		this.name = null;
		this.autherName = null;
		this.weight = 0;
		this.subject = null;
		this.rack = null;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Rack getRack() {
		return rack;
	}
	public void setRack(Rack rack) {
		this.rack = rack;
	}
	
}
