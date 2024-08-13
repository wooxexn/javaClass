package day09;

public class ArtistTest2 {

	public static void main(String[] args) {
		
	
		Artist2 a2 = new Artist2();  //변수
		
		
		
		//Artist2 변수가 생성된 이후 부터 멤버 메서드를 사용 할 수 있다.
		a2.input("김범수", 45, 1999, null);
		a2.printArtist();
		
		
		//a2.age=44;
		
		//단단한 캡슐을 만들기 위한 도구 1. 접근제어자
		//접근제어자 :
		//public : 모두 공개
		//private (클래스내부에서만 접근가능)
		//default (접근생략하면 default임) : 같은 패키지에서만 접근 가능 ( 같은 폴더 의미함)
		
		//멤버변수 => private 변경
		
		//단단한 캡슐을 만들기 위한 도구 2. 생성자
		
		a2.input("김범수", 44, 1999, "보고싶다");
		a2.printArtist();
		
		// 생성자 : 메서드입니다(특별한 메서드)
		// 객체자 new 생성될 때 단 한번 호출되어 객체의 초기화를 담당한다.
		//

		
		
	
	}
}