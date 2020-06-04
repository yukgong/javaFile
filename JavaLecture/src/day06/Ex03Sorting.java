package day06;

import java.util.Scanner;

public class Ex03Sorting {
	public static void main(String[] args) {
		//입력한 숫자 오름차순 내림차순 만들기
		while (true) {
			Scanner scanner = new Scanner(System.in);

			// 메뉴 선택 오름(1)/내림(2)
			System.out.println("메뉴를 선택해주세요 -----------");
			System.out.println("1. 오름차순 정렬");
			System.out.println("2. 내림차순 정렬");
			System.out.println("3. 종료");
			System.out.println("----------------------");
			int choice = scanner.nextInt();

//			---------------------

			int tempNum;

			// 오름차순 정렬
			if (choice == 1) {
				
				// 정렬할 갯수?
				System.out.print("정렬할 갯수를 입력하세요 :\n");
				int userNumber = scanner.nextInt();

				// 정렬할 숫자를 동적 할당
				int arr[] = new int[userNumber];

				// 정렬할 숫자를 입력
				for (int i = 0; i < arr.length; i++) {
					System.out.print((i + 1) + "번째 숫자를 입력하세요 :");
					int nonSortNum = scanner.nextInt();
					arr[i] = nonSortNum;
				}
				
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] < arr[j]) {
							tempNum = arr[i];
							arr[i] = arr[j];
							arr[j] = tempNum;
						}
					}
				}
				// 결과 출력
				System.out.println();
				System.out.println("<오름차순 결과 >");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
				continue;
			}

			// 내림차순 정렬
			if (choice == 2) {
				
				// 정렬할 갯수?
				System.out.print("정렬할 갯수를 입력하세요 :\n");
				int userNumber = scanner.nextInt();

				// 정렬할 숫자를 동적 할당
				int arr[] = new int[userNumber];

				// 정렬할 숫자를 입력
				for (int i = 0; i < arr.length; i++) {
					System.out.print((i + 1) + "번째 숫자를 입력하세요 :");
					int nonSortNum = scanner.nextInt();
					arr[i] = nonSortNum;
				}
				
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] > arr[j]) {
							tempNum = arr[i];
							arr[i] = arr[j];
							arr[j] = tempNum;
						}
					}
				}
				// 결과 출력
				System.out.println();
				System.out.println("<내림차순 결과 >");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
				continue;
			}
			
			if (choice == 3) {
				break;
			}


		}
	}
}
