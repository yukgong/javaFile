package day03Practice;

import java.util.Scanner;

public class Ex04ArrayStars {
	public static void main(String[] args) {
		// **�Է� ���� ����ŭ 1~10������ ������ ����� ���� �迭�� ����� �غ���

		// �� �Է� �ޱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� >");
		int userNum = scanner.nextInt();

		// �迭 �����
		int arr[] = new int[userNum];

		// �Է� ���� ����ŭ ���� ����� �迭�� �־��ֱ�
		for (int i = 0; i < arr.length; i++) {
			int random = (int) ((Math.random() * 10)) + 1;
			arr[i] = random;
			System.out.print(random + " ");
		}
		System.out.println();

		// �迭�� �ִ� �� ��ŭ �����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				// ����ϱ�
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
