package sample;

import java.util.ArrayList;

public class BookShelf {
	
	private ArrayList<Book> books;
	
	public void setBook(Book book) {
		books.add(book);
	}
	
	public Book getByTitle(String title) {
		Book book = null;
		for(int i = 0;i < books.size(); i++) {
			Book _book = books.get(i);
			if(_book.title == title) {
				book = _book;
			}
		}
		return book;
				
	}
	

	
}
