package day02Practice;

import java.util.Random;
import java.util.Scanner;

public class Ex04Random {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 임의의 정수를 입력받아 그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담기
		 */
		Scanner scanner = new Scanner(System.in);

		// 안내 메세지 출력, 사용자에게 숫자 입력받기, 입력한 값 확인하기
		System.out.println("숫자 하나를 입력해주세요 : ");
		int userNumber = scanner.nextInt();
		System.out.println("입력한 값 : " + userNumber);

		// 배열에 입력하기
		int arr[] = new int[userNumber];

		// 3개의 난수 동시에 발생시키기
		for (int i = 0; i < arr.length; i++) {
			int random = (int) ((Math.random() * 100) + 1); // 1~100개 사이의 난수 발생
			arr[i] = random;  
			System.out.print(random + " ");
		}
		//줄바꿈
		System.out.println("\n");
		
		//배열에 있는 내용 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
