package day04Practice;

import java.util.Scanner;

public class Ex01while {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("���ڸ� �Է��ϼ���(��:12345) >");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		while(num != 0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%d\n", sum, num);
			System.out.println();
			num /= 10;
		}
		System.out.println("�� �ڸ����� �� : " + sum);
	}
}
