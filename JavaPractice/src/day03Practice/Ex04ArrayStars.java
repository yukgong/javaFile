package day03Practice;

import java.util.Scanner;

public class Ex04ArrayStars {
	public static void main(String[] args) {
		// **입력 받은 수만큼 1~10까지의 난수를 만들어 랜덤 배열로 별찍기 해보기

		// 수 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 >");
		int userNum = scanner.nextInt();

		// 배열 만들기
		int arr[] = new int[userNum];

		// 입력 받은 수만큼 난수 만들고 배열에 넣어주기
		for (int i = 0; i < arr.length; i++) {
			int random = (int) ((Math.random() * 10)) + 1;
			arr[i] = random;
			System.out.print(random + " ");
		}
		System.out.println();

		// 배열에 있는 수 만큼 별찍기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				// 출력하기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
