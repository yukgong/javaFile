package day03Practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//�Է� ���� ��ҹ���, ���ڸ� �����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ƹ� �ҹ���, �빮��, ���ڸ� �Է��غ����� :");
		char c = scanner.next().charAt(0);
		
		if('a' <= c && c <= 'z') {
			System.out.println(c + "�� �ҹ��� �Դϴ�.");
		} else if ('1' <= c && c <= '9' ) {
			System.out.println(c + "��  ���� �Դϴ�.");
		} else if ('A' <= c && c <= 'Z') {
			System.out.println(c + "��  �빮�� �Դϴ�.");
		}
	}
}
