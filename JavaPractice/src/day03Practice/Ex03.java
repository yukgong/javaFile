package day03Practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//입력 받은 대소문자, 숫자를 구분하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.println("아무 소문자, 대문자, 숫자를 입력해보세요 :");
		char c = scanner.next().charAt(0);
		
		if('a' <= c && c <= 'z') {
			System.out.println(c + "는 소문자 입니다.");
		} else if ('1' <= c && c <= '9' ) {
			System.out.println(c + "는  숫자 입니다.");
		} else if ('A' <= c && c <= 'Z') {
			System.out.println(c + "는  대문자 입니다.");
		}
	}
}
