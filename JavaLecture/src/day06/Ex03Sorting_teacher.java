package day06;

import java.util.Scanner;

public class Ex03Sorting_teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 초기화
		int number[] = null;
		int count;
		boolean updown = false;
		
		//input Start--------------------------------------
		
		// 정렬할 갯수?
		System.out.println("정렬할 갯수는 = ");
		count = scanner.nextInt();

		// 정렬할 숫자를 동적할당
		number = new int[count];

		// 정렬할 숫자를 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수는 :");
			number[i] = scanner.nextInt();
		}

		// 오름(1)/내림(2)
		System.out.println("오름(1)/내림(2) = ");
		int choice = scanner.nextInt();
		updown = (choice == 1) ? true : false;
		
		//processing start --------------------------------------
		
		//정렬
		int temp;
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown) { // 오름차순 //변수 명만 쓰는건 true를 뜻한다. 변수명 앞에 '!'를 붙이면 false를 뜻함
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				else { // 내림차순
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
			}
		}
		
		//print Start--------------------------------------
		
		//결과 출력
		String msg = "";
		if(updown) msg = "오름";
		if(!updown) msg = "내림";
		System.out.println(msg + "차순으로 정렬했습니다.");
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
	}
}
