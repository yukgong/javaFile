package day01Practice;

import java.util.Scanner;

public class Quiz2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("다음 중 키워드가 아닌 것은? (모두 고르시오)");
		System.out.println("1. if");
		System.out.println("2. True");
		System.out.println("3. NULL");
		System.out.println("4. Class");
		System.out.println("5. System");
		
		int choice = scanner.nextInt();
		
		if(choice == 2) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		scanner.close();
		
	}

}
