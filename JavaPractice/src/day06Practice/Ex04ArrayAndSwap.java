package day06Practice;

import java.util.Scanner;

public class Ex04ArrayAndSwap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력 받은 숫자를 이차원 배열에 넣었다가 일차원 배열로 대입하기

		// 1. 이차원 배열 크기 할당하기 (?행 ?열)
		System.out.print("몇 행을 만드시겠습니까? :");
		int width = scanner.nextInt();

		System.out.print("몇 열을 만드시겠습니까? :");
		int height = scanner.nextInt();

		// 2. 받은 숫자대로 일이차 배열 동적할당
		int arrTwoDimension[][] = new int[width][height];
		int arrOneDimension[] = new int[arrTwoDimension.length * arrTwoDimension[0].length];

		// 3. 이차원 배열에 숫자 넣어주기
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				System.out.println((i+1) + "행에 " + (j+1) + "열 숫자 :");
				arrTwoDimension[i][j] = scanner.nextInt();
			}
		}

		// 4. 이차원 배열에 있는 숫자를 일차원 배열로 넣어주기
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				arrOneDimension[arrTwoDimension[0].length * i + j] = arrTwoDimension[i][j];
			}
		}

		// 5. 결과 확인하기
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				System.out.println("arrTwoDimension[" + i + "]["+ j + "] = "  + arrTwoDimension[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < arrOneDimension.length; i++) {
			System.out.println("arrOneDimension[" + i + "] = " + arrOneDimension[i]);
		}
	}
}
