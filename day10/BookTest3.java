package day10;

public class BookTest3 {

	public static void main(String[] args) {
		
		Book3[] books = new Book3[3];
		
		
		books[0] = new Book3("당신이 누군가를 죽였다", "히가시노 게이고", 17820);
		books[1] = new Book3("불변의 법칙", "모건 하우절", 22500); 
		books[2] = new Book3("세이노의 가르침", "세이노", 6480);
		
		
		
		System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println(books[2].toString() + "\n");
		
		
		
		
		for(Book3 a : books) {
			System.out.println(a.toString());
		}
		
	

	}

}
