package day14.인터페이스;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		전우선  a= new 전우선();
		//a.많이먹다();
		
		많이먹는게가능한 b =a;		
		//b.많이먹다();		
		
		
		홍길동 c= new 홍길동();
		
		
		//
		ArrayList<많이먹는게가능한> list = new ArrayList<>();
		list.add(a);
		list.add(c);
		
		
		
		for( int i=0 ; i< list.size() ; i++) {
			list.get(i).많이먹다();
		}
		
		
		
		
		
	}

}
