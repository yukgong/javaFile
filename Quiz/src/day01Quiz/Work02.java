package day01Quiz;

import java.util.Scanner;

public class Work02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 지불해야할 금액 스캔 받기
		System.out.println("지불해야하는 금액을 입력하세요. >");
		int price = scanner.nextInt(); 
		
		// 내가 가진 금액 스캔 받기
		System.out.println("내가 가진 금액을 입력하세요. >");
		int myMoney = scanner.nextInt();

		// 거스름 돈
		int output = myMoney - price;

		// 5000원 : ? 장
		int c5000 = output / 5000;

		// 1000원 : ? 장
		int c1000 = (output % 5000) / 1000;

		// 500원 : ? 개
		int c500 = (output % 1000) / 500;

		// 100원 : ? 개
		int c100 = (output % 500) / 100;

		// 50원 : ? 개
		int c50 = (output % 100) / 50;

		// 10원 : ? 개
		int c10 = (output % 50) / 10;

		System.out.println("거스름 돈 : " + output + "원");
		System.out.println("5000원 짜리 : " + c5000 + "개");
		System.out.println("1000원 짜리 : " + c1000 + "개");
		System.out.println("500원 짜리 : " + c500 + "개");
		System.out.println("100원 짜리 : " + c100 + "개");
		System.out.println("50원 짜리 : " + c50 + "개");
		System.out.println("10원 짜리 : " + c10 + "개");
		
		
		scanner.close();
	}
}
