package day08;

public class callByReference_주소에의한_호출 {

	public static void main(String[] args) {
		
		                         //0  1   2   3   4
		int[] kors = new int[] {90, 70, 99, 78, 100};
		
		
		//국어점수 출력하기
		
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
		
		
		//국어점수 출력하기
		
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
		
		
		//국어점수 출력하기
		/*
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}*/
		printKorScore(kors); // 메서드 호출시 주소값이 전달됨 ( call by reference)
		
	}
	
	
	//메서드(함수)
	//기능 : 국어점수배열을 출력하기
	//입력 : 점수배열
	//반환 : X
	public static void printKorScore(int[] kors) {
		
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
		
	}

}
