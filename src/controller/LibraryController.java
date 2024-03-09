package controller;

import java.util.List;

import model.Book;
import model.Library;

public class LibraryController {
	private Library library;
	
	public LibraryController(Library library) {
		this.library = library;
	}
	
	public LibraryController() {};

	public void saveBook(List<Book> books) {
		library.storeBook(books);
	}
	
}
