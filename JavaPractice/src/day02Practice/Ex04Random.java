package day02Practice;

import java.util.Random;
import java.util.Scanner;

public class Ex04Random {
	public static void main(String[] args) {
		/*
		 * ����ڷκ��� ������ ������ �Է¹޾� �� ������ ������ŭ ����(1~100)�� �߻����� �迭�� ���
		 */
		Scanner scanner = new Scanner(System.in);

		// �ȳ� �޼��� ���, ����ڿ��� ���� �Է¹ޱ�, �Է��� �� Ȯ���ϱ�
		System.out.println("���� �ϳ��� �Է����ּ��� : ");
		int userNumber = scanner.nextInt();
		System.out.println("�Է��� �� : " + userNumber);

		// �迭�� �Է��ϱ�
		int arr[] = new int[userNumber];

		// 3���� ���� ���ÿ� �߻���Ű��
		for (int i = 0; i < arr.length; i++) {
			int random = (int) ((Math.random() * 100) + 1); // 1~100�� ������ ���� �߻�
			arr[i] = random;  
			System.out.print(random + " ");
		}
		//�ٹٲ�
		System.out.println("\n");
		
		//�迭�� �ִ� ���� ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
