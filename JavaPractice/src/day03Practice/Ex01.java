package day03Practice;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//스캐너 선언
		Scanner scanner = new Scanner(System.in);
		
		//숫자 입력 받기
		System.out.println("숫자를 입력해주세요 : ");
		int userNumber = scanner.nextInt();
		
		//삼각형
		System.out.println("----삼각형----");
		for(int i = 1; i <= userNumber; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//역삼각형
		System.out.println("----역삼각형----");
		for(int i = 0; i <= userNumber; i++) {
			
			for (int j = 1; j <= userNumber - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//우측 정렬 삼각형
		System.out.println("----우측 정렬 삼각형----");
		for(int i = 1; i <= userNumber; i++) {
			
			for (int j = 1; j <= userNumber - i; j++) {
				System.out.print("^");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
