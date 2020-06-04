package day08;

import java.util.Scanner;

public class Ex02SortingFunc {
	public static void main(String[] args) {
		// 1. 입력(숫자들, 오름차순, 내림차순)

		// 메뉴 선택
		while (true) {
			int n = choiceMenu();

			if (n == 1) {
				upper(n);
				continue;
			} else if (n == 2) {
				lower(n);
				continue;
			}
			break;
		}

	}

	// 메세지 입력 받는 함수
	static int inputNum(String msg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(msg);
		int userNumber = scanner.nextInt();

		return userNumber;

	}

	// 메뉴 선택 함수
	static int choiceMenu() {
		Scanner scanner = new Scanner(System.in);

		// 메뉴 선택 오름(1)/내림(2)
		System.out.println("메뉴를 선택해주세요 -----------");
		System.out.println("1. 오름차순 정렬");
		System.out.println("2. 내림차순 정렬");
		System.out.println("3. 종료");
		System.out.println("----------------------");
		int choice = scanner.nextInt();

		return choice;
	}

	// 오름차순 함수
	static void upper(int choiceMenuNum) {
		// 정렬할 갯수 입력받기
		int n = inputNum("정렬할 갯수를 입력하세요 :");

		// 정렬할 숫자를 동적 할당
		int arr[] = new int[n];

		// 정렬할 숫자를 입력
		for (int i = 0; i < arr.length; i++) {
			int nonSortNum = inputNum((i + 1) + "번째 숫자를 입력하세요 :");
			arr[i] = nonSortNum;
		}

		swap(arr, choiceMenuNum);
		printMsg("<오름차순 결과 >", arr);
	}

	// 내림차순 함수
	static void lower(int choiceMenuNum) {
		// 정렬할 갯수 입력받기
		int n = inputNum("정렬할 갯수를 입력하세요 :");

		// 정렬할 숫자를 동적 할당
		int arr[] = new int[n];

		// 정렬할 숫자를 입력
		for (int i = 0; i < arr.length; i++) {
			int nonSortNum = inputNum((i + 1) + "번째 숫자를 입력하세요 :");
			arr[i] = nonSortNum;
		}

		swap(arr, choiceMenuNum);
		printMsg("<내림차순 결과 >", arr);

	}

	// 메세지 출력 함수
	static void printMsg(String msg, int arr[]) {
		// 결과 출력
		System.out.println();
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	// Swap 함수 <- address이용
	static int[] swap(int arr[], int choiceMenuNum) {
		int tempNum;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (choiceMenuNum == 1) {
					if (arr[i] > arr[j]) {
						tempNum = arr[i];
						arr[i] = arr[j];
						arr[j] = tempNum;
					}
				} else if (choiceMenuNum == 2) {
					if (arr[i] < arr[j]) {
						tempNum = arr[i];
						arr[i] = arr[j];
						arr[j] = tempNum;
					}
				}
			}
		}
		return arr;
	}
}
