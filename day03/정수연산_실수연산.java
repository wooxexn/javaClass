package day03;

public class 정수연산_실수연산 {

	public static void main(String[] args) {
		
		double result;
		result = 10 / 3;
		
		System.out.println(result);
		
		//연산을 할 때 연산에 참여는 피연산자에 따라서 정수연산, 실수연산을 수행한다
		//피연산자의 type에 의해 결정
		//정수 / 정수   => 정수연산  => 결과값 정수
		
		
		double result2;
		result2 = 10 / (double)3 ; // 실수연산을 수행  =>결과 실수형 데이터
		System.out.println(result2);
		
		//두 수를 더해서 평균 구하기
		int su1 = 97;
		int su2 = 100;
		final int COUNT = 2;  //상수
		
		int total;
		double avg;
		
		total = su1 + su2;
		avg = (double) total / COUNT; //정수 => 정수연산 수행되므로 소수 이하 정보가 발생하지 않
		                     //실수연산이 되도록 type변환함  강제형변환을 이용
		
		System.out.println("평균=" + avg);
	}

}
