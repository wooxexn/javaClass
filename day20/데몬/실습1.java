package day20.데몬;

public class 실습1 {

	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Thread t = new Thread( new Runnable() {

			@Override
			public void run() {
				
				for( int i=1; i<1000; i++) {
					System.out.println("^_____^");
				}
				
			}});
		
		t.setDaemon(true);   //데몬스레드  메인스레드가 끝나면 자동으로 종료되는 스레드   
		t.start();
		
		
		
		
		System.out.println(" 프로그램 종료");

	}

}
