package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06 {
	public static void main(String[] args) {
		// �����κ��� �Է� ���� ������ �հ�� ����� ���ϴ� ���α׷��� �ۼ��϶�.

		// ��ĵ ��� ����
		Scanner scanner = new Scanner(System.in);

		// ���� �Է� �ޱ�
		System.out.println("�����ϰ� ���� ������ ������ �Է����ּ��� : ");
		int count = scanner.nextInt();

		// �迭 ���� �Ҵ�
		int arr[] = new int[count];

		// n�� ��ŭ�� ���� �Է� �ޱ�
		System.out.println(count + "���� ���� �Է�");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "��° ���ڸ� �Է����ּ��� : ");
			arr[i] = scanner.nextInt();
		}
		
		// �Է��� ���� ��θ� ȭ�鿡 ����ϱ�
		System.out.printf("���ڵ� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		System.out.println();

		// �հ踦 ����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�Է��� ���ڵ��� �հ� : " + sum);

		// ����� ����
		double ava = (double)sum / count;
		System.out.println("���ڵ��� ����� : " + ava);
	}
}
