package day01Quiz;

import java.util.Scanner;

public class Work02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// �����ؾ��� �ݾ� ��ĵ �ޱ�
		System.out.println("�����ؾ��ϴ� �ݾ��� �Է��ϼ���. >");
		int price = scanner.nextInt(); 
		
		// ���� ���� �ݾ� ��ĵ �ޱ�
		System.out.println("���� ���� �ݾ��� �Է��ϼ���. >");
		int myMoney = scanner.nextInt();

		// �Ž��� ��
		int output = myMoney - price;

		// 5000�� : ? ��
		int c5000 = output / 5000;

		// 1000�� : ? ��
		int c1000 = (output % 5000) / 1000;

		// 500�� : ? ��
		int c500 = (output % 1000) / 500;

		// 100�� : ? ��
		int c100 = (output % 500) / 100;

		// 50�� : ? ��
		int c50 = (output % 100) / 50;

		// 10�� : ? ��
		int c10 = (output % 50) / 10;

		System.out.println("�Ž��� �� : " + output + "��");
		System.out.println("5000�� ¥�� : " + c5000 + "��");
		System.out.println("1000�� ¥�� : " + c1000 + "��");
		System.out.println("500�� ¥�� : " + c500 + "��");
		System.out.println("100�� ¥�� : " + c100 + "��");
		System.out.println("50�� ¥�� : " + c50 + "��");
		System.out.println("10�� ¥�� : " + c10 + "��");
		
		
		scanner.close();
	}
}
