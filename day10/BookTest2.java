package day10;

public class BookTest2 {

	public static void main(String[] args) {
	
		Book2 a = new Book2("당신이 누군가를 죽였다", "히가시노 게이고", 17820);
		Book2 b = new Book2("불변의 법칙", "모건 하우절", 22500); 
		Book2 c = new Book2("세이노의 가르침", "세이노", 6480);
		
		
		System.out.println(a.toString());
	    System.out.println();
	    System.out.println(b.toString());
	    System.out.println();
	    System.out.println(c.toString());

	}

}
