package day03Quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		// 하나의 수를 입력 받고 10의 배수로 입력 받은 수는 어느 범위에 있는지 출력되는 프로그램을 작성하라.

		// 스캐너 사용
		Scanner scanner = new Scanner(System.in);

		// 수 입력 받기
		System.out.println("수를 하나 입력해주세요 : ");
		int userNumber = scanner.nextInt();

		/*
		// 입력 받은 수는 어느 범위에 있는지 출력하기(10의 배수 범위)
		if (userNumber >= 90 && userNumber <= 100) {
			System.out.println("입력한 수는 90보다 크거나 같고 100보다 작습니다.");
		} else if (userNumber >= 80) {
			System.out.println("입력한 수는 80보다 크거나 같고 90보다 작습니다.");
		}
		.
		.

		else if (userNumber >= 0) {
			System.out.println("입력한 수는 0보다 크거나 같고 10보다 작습니다.");
		}
		*/
		
		// 입력 받은 수는 어느 범위에 있는지 출력하기(10의 배수 범위)
		int n = 0; 
		for (int i = 0; i < (userNumber/10 + 1); i++) {
			n = 10 * i; // 0, 10, 20, 30...90
			if (userNumber > n && userNumber <= n + 10)
				System.out.println("입력한 수는 " + n + "보다 크고 " + (n + 10) + "보다 작거나 같습니다.");
		}
		
		if(userNumber < 10) {
			System.out.println("입력한 수는 " + n + "보다 크고 " + (n + 10) + "보다 작거나 같습니다.");
		}
	}

}
