package day01Quiz;

import java.util.Scanner;

/*
 * 편의점 
 * 
 * 지불해야될 금액 : 3230원 
 * 자신의 금액 : 10000원
 * 
 * 결과 = 거스름돈 출력
 * 거스름 돈 : 출력
 * 5000원 : ? 장	1
 * 1000원 : ? 장	1
 * 500원 : ? 개	1
 * 100원  : ? 개	2
 * 50원 : ? 개		1
 * 10원 : ? 개     	2
 */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("지불해야하는 금액을 입력하세요. >");
		int pay = scanner.nextInt();
		
		System.out.println("내가 가진 금액을 입력하세요. >");
		int total = scanner.nextInt();;

		// 잔돈 계산
		int output = total - pay;
		System.out.println("거스름 돈 : " + output + "원");

		// 5000원 : ? 장
		int c5000 = (output - (output % 5000)) / 5000;
		System.out.println("5000원 짜리 : " + c5000 + "개");

		// 1000원 : ? 장
		int c1000 = (output - (5000 * c5000) - (output % 1000)) / 1000;
		System.out.println("1000원 짜리 : " + c1000 + "개");

		// 500원 : ? 개
		int c500 = (output - (5000 * c5000) - (1000 * c1000) - (output % 500)) / 500;
		System.out.println("500원 짜리 : " + c500 + "개");

		// 100원 : ? 개
		int c100 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (output % 100)) / 100;
		System.out.println("100원 짜리 : " + c100 + "개");

		// 50원 : ? 개
		int c50 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (100 * c100) - (output % 50)) / 50;
		System.out.println("50원 짜리 : " + c50 + "개");

		// 10원 : ? 개
		int c10 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (100 * c100)- (50 * c50) - (output % 10)) / 10;
		System.out.println("10원 짜리 : " + c10 + "개");
		
		scanner.close();
	}
}
