package day06;

import java.util.Scanner;

public class 일정관리프로그램 {

	public static void main(String[] args) {
		
		 // 최대 5개의 스케줄을 관리하는 프로그램
        // 일차원 배열 사용
        // 메뉴: 1.등록, 2.조회, 3.변경, 4.삭제, 5.전체조회, 6.종료
        String[] arr = new String[5];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        loop:while (true) {
            System.out.println("1.스케줄 등록, 2.스케줄 조회, 3.스케줄 변경, 4.스케줄 삭제, 5.전체조회, 6.종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();  // 엔터키 제거

            switch (menu) {
                case 1:
                    if (index < arr.length) {
                        System.out.print("스케줄 입력: ");
                        String task = sc.nextLine();
                        arr[index] = task;
                        index++;
                    } else {
                        System.out.println("더 이상 스케줄을 등록할 수 없습니다.");
                    }
                    break;

                case 2:
                    System.out.print("조회할 스케줄 번호 입력: ");
                    int select = sc.nextInt() - 1;  // 입력번호를 배열 인덱스로 변환
                    if (select >= 0 && select < index) {
                        System.out.println("<<스케줄 정보>>");
                        System.out.println(arr[select]);
                    } else {
                        System.out.println("해당 번호의 스케줄이 없습니다.");
                    }
                    break;

                case 3:
                    System.out.print("변경할 스케줄 번호 선택: ");
                    int update = sc.nextInt() - 1;  // 입력번호를 배열 인덱스로 변환
                    if (update >= 0 && update < index) {
                        System.out.print("새로운 스케줄 입력: ");
                        sc.nextLine();  // 엔터키 제거
                        String updatedTask = sc.nextLine();
                        arr[update] = updatedTask;
                    } else {
                        System.out.println("해당 번호의 스케줄이 없습니다.");
                    }
                    break;

                case 4:
                    System.out.print("삭제할 스케줄 번호 선택: ");
                    int delete = sc.nextInt() - 1;  // 입력번호를 배열 인덱스로 변환
                    if (delete >= 0 && delete < index) {
                        for (int i = delete; i < index - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        arr[index - 1] = null; // 마지막 스케줄 정보 삭제
                        index--;
                    } else {
                        System.out.println("해당 번호의 스케줄이 없습니다.");
                    }
                    break;

                case 5:
                    System.out.println("<<전체 스케줄 조회>>");
                    for (int i = 0; i < index; i++) {
                        System.out.println((i + 1) + ". " + arr[i]);
                    }
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break loop;

                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}