/* OOP exercise Book Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 */

package book;

public class Book {
	
	private String sku;
	private String title;
	private String author;
	private String desc;
	private double price;
	
	//No books, empty book
	final static Book noBooks = new Book("", "", "", "", 0);
	
	public Book(String s, String t, String a, String d, double p){
		if(p < 0){
			System.out.println("ERROR INCORRECT PRICE!");
			System.exit(1);
		}
		this.sku = s;
		this.title = t;
		this.author = a;
		this.desc = d;
		this.price = p;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0){
			System.out.println("ERROR INCORRECT PRICE!");
		}
		else{
			this.price = price;
		}
	
	}
	
	/*
	 *  Two books are the same if they have the same SKU number
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Book) || obj == null){
			return false;
		}
		else if((this.sku).equals(((Book)obj).sku)){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s	%s	%s	%s	%.2f",this.sku,this.title,this.author,this.desc,this.price);
	}
	
}
