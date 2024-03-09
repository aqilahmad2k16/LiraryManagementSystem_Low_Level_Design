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
	
}
