package day04;

public class 반복문02 {

	public static void main(String[] args) {
		
		
		//2단
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		
		//3단
		for(int i=1; i<=9; i++) {
			System.out.println(3*i);
		}
		
		//4단
		for(int i=1; i<=9; i++) {
			System.out.println(4*i);
		}
		
		
		//2~4단 출력
		
		System.out.println("2~4단 출력 하기 : 중첩반복문 ");
		for(int j=1; j<=3; j++) {
			//
			for(int i=1; i<=9; i++) {
				System.out.println( (j+1) *i);
			}
			
		}
		
		//
		System.out.println("2~4단 출력 하기 : 중첩반복문 ");
		for(int j=2; j<=4; j++) {
			//
			for(int i=1; i<=9; i++) {
				System.out.println( (j+1) *i);
			}
			
		}
		

	}

}
