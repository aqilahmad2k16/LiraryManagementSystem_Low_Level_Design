package model;

import java.util.List;

public class Rack extends BaseModel{
	private int rackNumber;
	private List<Book> books;
	private RackStatus rackStatus;
	
	public Rack(int rackNumber, List<Book> books, RackStatus rackStatus) {
		super();
		this.rackNumber = rackNumber;
		this.books = books;
		this.rackStatus = rackStatus;
	}

	public int getRackNumber() {
		return rackNumber;
	}

	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public RackStatus getRackStatus() {
		return rackStatus;
	}

	public void setRackStatus(RackStatus rackStatus) {
		this.rackStatus = rackStatus;
	}
	
	
}
