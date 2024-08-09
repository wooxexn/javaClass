package day06_실습;

import java.util.Scanner;

public class 화폐매수구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("사원명을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("출장비를 입력하세요: ");
		int money = sc.nextInt();
		
		int[] arr = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] count = new int[arr.length];
		int Amount = money;
		
		for (int i = 0; i < arr.length; i++) {
			count[i] = Amount / arr[i];
			Amount %= arr[i];
			}
		
		System.out.println(money + "원의 화폐 매수 :");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "원: " + count[i] + "개");
		}
						

	}
}
