package day10Quiz;

import java.util.Scanner;

public class Ractangle {
	int width, height;
	int result;
	
	public void getRactangleArea() {
		userInput();
		processing();
		printResult();
	}
	
	public void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���簢�� ���� ���ϱ� --------");
		
		System.out.println("���� : ");
		width = scanner.nextInt();

		System.out.println("���� : ");
		height = scanner.nextInt();
	}
	
	// ����ϱ�
	public void processing() {
		result = width * height;
	}

	// ��� ���
	public void printResult() {
		System.out.println("���簢���� ���̴� : " + result + "�Դϴ�.");
	}
}
