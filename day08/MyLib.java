package day08;


//라이브러리 만들기
//메서드만들기
//메서드만 존재할 수 없다
//반드시 클래스를 만들고 메서드를 작성해야 한다
//두 수에 대한 큰값 반환하는 max메서드 만들기
//입력 : 두 수
//반환: 두 수중 큰 값
public class MyLib {
	
	
	public static int max (int su1, int su2) {
		int result = 0;
		result = (su1> su2) ? su1 : su2;
		return result;
	
	}

}
