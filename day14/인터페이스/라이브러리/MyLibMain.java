package day14.인터페이스.라이브러리;

public class MyLibMain {

	public static void main(String[] args) {
		
		
		MyLib lib = new MyLib();
		lib.yourProgramRun(new A());
		//lib.yourProgramRun(new MyRunnable() {});    //익명클래스 작성
		lib.yourProgramRun(new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("두번 동작하는거야?");
				
				
		}});
		//익명클래스 작성

	}

}
