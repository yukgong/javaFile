package day06Practice;

import java.util.Scanner;

public class Ex03Sorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력한 숫자 오름차순 내림차순 만들기

		// 입력받을 숫자 갯수 정하기
		System.out.println("숫자를 입력해주세요.");
		int count = scanner.nextInt();

		// 배열 동적 할당
		int arr[] = new int [count];

		// 사용자에게 숫자 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요." + "(" + i + "/" + arr.length + ")");
			int num = scanner.nextInt();
			arr[i] = num;
		}

		// 메뉴 선택 오름(1)/내림(2)
		System.out.println("메뉴를 선택해주세요 -----------");
		System.out.println("1. 오름차순 정렬");
		System.out.println("2. 내림차순 정렬");
		System.out.println("----------------------");
		int choice = scanner.nextInt();

		// 오름차순, 내림차순 정렬
		int temp;
		switch (choice) {
		case 1://오름
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;

		case 2: //내림
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;
		}

		// 결과 출력하기
		String msg = "";
		if(choice == 1) msg = "오름";
		if(!(choice == 1)) msg = "내림";
		System.out.println(msg + "차순으로 정렬했습니다.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + ":" + arr[i]);
		}

	}
}
