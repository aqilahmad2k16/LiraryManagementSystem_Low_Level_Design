package model;

import java.util.Date;

public class LibraryCard extends BaseModel {
	private User user;
	private Book book;
	private Date issueingDate;
	private Date dateOfReturn;
	private Librian librian;
	
	public LibraryCard(User user, Book book, Date dateOfReturn, Librian librian, Date issueingDate) {
		super();
		this.user = user;
		this.book = book;
		this.dateOfReturn = dateOfReturn;
		this.librian = librian;
		this.issueingDate = issueingDate;
	}
	
	public Date getIssueingDate() {
		return issueingDate;
	}

	public void setIssueingDate(Date issueingDate) {
		this.issueingDate = issueingDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}

	public Librian getLibrian() {
		return librian;
	}

	public void setLibrian(Librian librian) {
		this.librian = librian;
	}
	
	
}
