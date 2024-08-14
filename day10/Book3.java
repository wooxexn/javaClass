package day10;

public class Book3 {
	
	private String title;
	private String author;
	private int price;
	
	public Book3(String title, String author, int price) { 
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString( ) { 
		return "책 이름 : " + title + "\n" + "저자 : " + author + "\n" + "가격 : " + price + "원";
	}


}

