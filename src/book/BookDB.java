/*
 * Simple Object Exercise with 'basic' Database
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 */

package book;

import java.util.ArrayList;

public class BookDB {

	ArrayList<Book> library;
	
	public BookDB(){
		library = new ArrayList<Book>();
	}
	
	/**
	 * Adds a new book to the library. Includes duplicates.
	 * @param b - new book to add
	 */
	public void addBook(Book b){
		library.add(b);
	}
	
	/**
	 * Get the book out of the library with the same sku 
	 * @param sk - sku of the book to check out
	 * @return the book to check out
	 */
	public Book getBook(String sk){
		for(int i =0; i < library.size();i++){
			if(library.get(i).getSku().equals(sk)){
				return library.get(i);
			}
		}
		
		return Book.noBooks;
	}
	
	/**
	 * Remove book from library
	 * @param sk - the sku of the book to remove.
	 */
	public void removeBook(String sk){
		for(int i =0; i < library.size();i++){
			if(library.get(i).getSku().equals(sk)){
				library.remove(i);
			}
		}
		
	}
	
	
}
