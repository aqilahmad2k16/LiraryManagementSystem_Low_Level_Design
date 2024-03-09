package model;

import java.util.List;

public class Library extends BaseModel{
	private String name;
	private String address;
	private LibraryStatus libraryStatus;
	private List<Floor> floors;
	
	public Library(String name, String address, LibraryStatus libraryStatus, List<Floor> floors) {
		super();
		this.name = name;
		this.address = address;
		this.libraryStatus = libraryStatus;
		this.floors = floors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LibraryStatus getLibraryStatus() {
		return libraryStatus;
	}

	public void setLibraryStatus(LibraryStatus libraryStatus) {
		this.libraryStatus = libraryStatus;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	public void storeBook(List<Book> books) {
		// TODO Auto-generated method stub
		
	}
	
	
}
