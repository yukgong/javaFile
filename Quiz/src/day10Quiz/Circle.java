package day10Quiz;

import java.util.Scanner;

public class Circle {
	int r;
	double result;
	
	public void getCircleArea() {
		userInput();
		processing();
		printResult();
	}

	// ���̸� ���Ϸ��� ���� ������ �Է� �ޱ�
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���ϱ� --------");
		System.out.print("���̸� ���Ϸ��� ���� �������� �Է��ϼ��� : ");
		r = sc.nextInt();
	}

	// ����ϱ�
	public void processing() {
		result = (r * r) * 3.14;
	}

	// ��� ���
	public void printResult() {
		System.out.println("���� ���̴� : " + result + "�Դϴ�.");
	}
}
