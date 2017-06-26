
/* Runs and Tests the BookDB Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 */

import static org.junit.Assert.*;

import org.junit.Test;

import book.*;

public class BookApplication {
	
	
	
	@Test
	public void testDB(){
		BookDB db = new BookDB();
		Book a1 = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
		Book a2 = new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
		Book a3 = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00);
		Book a4 = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python",10.50 );
		Book a5 = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50);
		Book a6 = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!",14.75 );
		

		db.addBook(a1);
		db.addBook(a2);
		db.addBook(a3);
		db.addBook(a4);
		db.addBook(a5);
		db.addBook(a6);
		
		//System.out.println(db.getBook("Python1004"));
		
		assertEquals(db.getBook("Java1002"),a2);
	
		assertNotEquals(db.getBook("Java1002"),a4);
	}
	
	
	
	
}

