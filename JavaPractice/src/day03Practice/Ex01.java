package day03Practice;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scanner = new Scanner(System.in);
		
		//���� �Է� �ޱ�
		System.out.println("���ڸ� �Է����ּ��� : ");
		int userNumber = scanner.nextInt();
		
		//�ﰢ��
		System.out.println("----�ﰢ��----");
		for(int i = 1; i <= userNumber; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//���ﰢ��
		System.out.println("----���ﰢ��----");
		for(int i = 0; i <= userNumber; i++) {
			
			for (int j = 1; j <= userNumber - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//���� ���� �ﰢ��
		System.out.println("----���� ���� �ﰢ��----");
		for(int i = 1; i <= userNumber; i++) {
			
			for (int j = 1; j <= userNumber - i; j++) {
				System.out.print("^");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
