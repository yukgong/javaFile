package day03Quiz;

import java.util.Scanner;

public class Quiz16_java06 {
	public static void main(String[] args) {
		// ��Ģ������ �� �� �ִ� ���α׷��� �ۼ��϶�.
		Scanner scanner = new Scanner(System.in);

		// ù��° �� �Է� �ޱ�
		System.out.println("ù ��° ��  >>");
		int firstNum = scanner.nextInt();

		// ������ �Է� �ޱ�
		// �߸� �Է� ���� �����ڴ� �ٽ� �Է��϶�� �˷��ֱ�
		System.out.println("( +, -, /, * ) >>");
		String operator = scanner.next();

		while (true) {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				break;
			}
			System.out.println("�߸��Է��߽��ϴ�.");
			System.out.println("( +, -, /, * ) >>");
			operator = scanner.next();

		}

		// �ι�° �� �Է� �ޱ�
		System.out.println("�ι�° ��  >>");
		int secondNum = scanner.nextInt();

		// �Է¹��� ���� �����ϱ�
		int result = 0;

		switch (operator) {
		case "+":
			result = firstNum + secondNum;
			break;

		case "-":
			result = firstNum - secondNum;
			break;

		case "*":
			result = firstNum * secondNum;
			break;

		case "/":
			result = firstNum / secondNum;
			break;
		}

		System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);

	}
}
