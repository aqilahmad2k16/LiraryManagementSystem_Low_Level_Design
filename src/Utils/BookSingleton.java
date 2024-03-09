package Utils;

import model.Book;
import model.Subject;

public class BookSingleton {
	private static Book book = null;
	
	private BookSingleton() {}
	
	public static Book getBookInstance() {
		if(book == null) {
			synchronized (book) {
				if(book == null) {
					book = new Book();
					return book;					
				}
			}
		}
		
		return book;
	}

	public static Book modifiedBook(Book bookInstance) {
		bookInstance.setName("Advanced Engineering Mathematics");
		bookInstance.setAutherName("Erwin Kreyszig");
		bookInstance.setRack(null);
		bookInstance.setSubject(new Subject("Mathematics", null));
		bookInstance.setWeight(0);
		return null;
	}
	
}
