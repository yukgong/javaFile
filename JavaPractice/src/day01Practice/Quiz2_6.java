package day01Practice;

import java.util.Scanner;

public class Quiz2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �� Ű���尡 �ƴ� ����? (��� ���ÿ�)");
		System.out.println("1. if");
		System.out.println("2. True");
		System.out.println("3. NULL");
		System.out.println("4. Class");
		System.out.println("5. System");
		
		int choice = scanner.nextInt();
		
		if(choice == 2) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		scanner.close();
		
	}

}
