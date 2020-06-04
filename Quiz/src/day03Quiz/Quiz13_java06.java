package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06 {
	public static void main(String[] args) {
		// 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라.

		// 스캔 사용 선언
		Scanner scanner = new Scanner(System.in);

		// 숫자 입력 받기
		System.out.println("연산하고 싶은 숫자의 개수를 입력해주세요 : ");
		int count = scanner.nextInt();

		// 배열 동적 할당
		int arr[] = new int[count];

		// n개 만큼의 숫자 입력 받기
		System.out.println(count + "개의 숫자 입력");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 숫자를 입력해주세요 : ");
			arr[i] = scanner.nextInt();
		}
		
		// 입력한 숫자 모두를 화면에 출력하기
		System.out.printf("숫자들 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		System.out.println();

		// 합계를 연산
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("입력한 숫자들의 합계 : " + sum);

		// 평균을 연산
		double ava = (double)sum / count;
		System.out.println("숫자들의 평균은 : " + ava);
	}
}
