package day04;

public class 반복문_건너뛰기 {

	public static void main(String[] args) {
		
		//continue : 반복문 건너띄기
		
		//홀수의합 1~10의 합
		//1  2 3 4 5 6 7 8 9 10
		//
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			
			if(i %2 ==0) {
				continue;   /* 다음 반복으로 진행함 continue 아래의 코드가 수행되지 않고 
			                   다음 반복으로 진행 함 */
			
			}
			
			sum = sum+i;  // => 짝수일 때는 이 코드가 수행되지 않도록 건너띄기 
		}
		
		System.out.println("홀수의 합" + sum);

	}

}
