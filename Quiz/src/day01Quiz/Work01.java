package day01Quiz;

import java.util.Scanner;

/*
 * ������ 
 * 
 * �����ؾߵ� �ݾ� : 3230�� 
 * �ڽ��� �ݾ� : 10000��
 * 
 * ��� = �Ž����� ���
 * �Ž��� �� : ���
 * 5000�� : ? ��	1
 * 1000�� : ? ��	1
 * 500�� : ? ��	1
 * 100��  : ? ��	2
 * 50�� : ? ��		1
 * 10�� : ? ��     	2
 */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �Է�
		System.out.println("�����ؾ��ϴ� �ݾ��� �Է��ϼ���. >");
		int pay = scanner.nextInt();
		
		System.out.println("���� ���� �ݾ��� �Է��ϼ���. >");
		int total = scanner.nextInt();;

		// �ܵ� ���
		int output = total - pay;
		System.out.println("�Ž��� �� : " + output + "��");

		// 5000�� : ? ��
		int c5000 = (output - (output % 5000)) / 5000;
		System.out.println("5000�� ¥�� : " + c5000 + "��");

		// 1000�� : ? ��
		int c1000 = (output - (5000 * c5000) - (output % 1000)) / 1000;
		System.out.println("1000�� ¥�� : " + c1000 + "��");

		// 500�� : ? ��
		int c500 = (output - (5000 * c5000) - (1000 * c1000) - (output % 500)) / 500;
		System.out.println("500�� ¥�� : " + c500 + "��");

		// 100�� : ? ��
		int c100 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (output % 100)) / 100;
		System.out.println("100�� ¥�� : " + c100 + "��");

		// 50�� : ? ��
		int c50 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (100 * c100) - (output % 50)) / 50;
		System.out.println("50�� ¥�� : " + c50 + "��");

		// 10�� : ? ��
		int c10 = (output - (5000 * c5000) - (1000 * c1000) - (500 * c500) - (100 * c100)- (50 * c50) - (output % 10)) / 10;
		System.out.println("10�� ¥�� : " + c10 + "��");
		
		scanner.close();
	}
}
