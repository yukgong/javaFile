package day03Quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		// �ϳ��� ���� �Է� �ް� 10�� ����� �Է� ���� ���� ��� ������ �ִ��� ��µǴ� ���α׷��� �ۼ��϶�.

		// ��ĳ�� ���
		Scanner scanner = new Scanner(System.in);

		// �� �Է� �ޱ�
		System.out.println("���� �ϳ� �Է����ּ��� : ");
		int userNumber = scanner.nextInt();

		/*
		// �Է� ���� ���� ��� ������ �ִ��� ����ϱ�(10�� ��� ����)
		if (userNumber >= 90 && userNumber <= 100) {
			System.out.println("�Է��� ���� 90���� ũ�ų� ���� 100���� �۽��ϴ�.");
		} else if (userNumber >= 80) {
			System.out.println("�Է��� ���� 80���� ũ�ų� ���� 90���� �۽��ϴ�.");
		}
		.
		.

		else if (userNumber >= 0) {
			System.out.println("�Է��� ���� 0���� ũ�ų� ���� 10���� �۽��ϴ�.");
		}
		*/
		
		// �Է� ���� ���� ��� ������ �ִ��� ����ϱ�(10�� ��� ����)
		int n = 0; 
		for (int i = 0; i < (userNumber/10 + 1); i++) {
			n = 10 * i; // 0, 10, 20, 30...90
			if (userNumber > n && userNumber <= n + 10)
				System.out.println("�Է��� ���� " + n + "���� ũ�� " + (n + 10) + "���� �۰ų� �����ϴ�.");
		}
		
		if(userNumber < 10) {
			System.out.println("�Է��� ���� " + n + "���� ũ�� " + (n + 10) + "���� �۰ų� �����ϴ�.");
		}
	}

}
