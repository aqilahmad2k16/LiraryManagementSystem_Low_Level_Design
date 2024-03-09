package libraryManagementClient;

import java.util.ArrayList;
import java.util.List;

import Utils.BookSingleton;
import Utils.Utils;
import controller.LibraryController;
import model.Book;
import model.Subject;

public class Main {
	public static void main(String[] args) {
		// store books in the library
		//1. create get book and store it, do crud operation on book.
		//steps to issue books
		//1. user comes and contact librian said I need this book, book name, subject name, authername
		//2. librian search this book by name.
		//3. if book found, then create library card of that user and add book and issue date and return date 
		
		LibraryController libraryController = new LibraryController();
		List<Book> books = new ArrayList<>();
//		Book b1 = new Book("Advanced Engineering Mathemetics", "Erwin Kreyszig", 0, new Subject("Mathematics", null), null);
		Book b1 = BookSingleton.getBookInstance();
//		books.add(BookSingleton.modifiedBook(BookSingleton.getBookInstance(), ));
		b1.setName("Advanced Engineering Mathematics");
		b1.setAutherName("Erwin Kreyszig");
		b1.setRack(null);
		b1.setSubject(new Subject("Mathematics", null));
		b1.setWeight(0);
		Book b2 = BookSingleton.getBookInstance();
		b2.setName("Engineering Mathematics");
		b2.setAutherName("John Bird");
		b2.setRack(null);
		b2.setSubject(new Subject("Mathematics", null));
		b2.setWeight(0);
		books.add(b1);
		books.add(b2);
		
		//post this book to library
		libraryController.saveBook(books);
		
		
		
		
	}
}
