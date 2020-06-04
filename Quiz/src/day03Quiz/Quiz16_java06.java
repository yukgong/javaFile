package day03Quiz;

import java.util.Scanner;

public class Quiz16_java06 {
	public static void main(String[] args) {
		// 사칙연산을 할 수 있는 프로그램을 작성하라.
		Scanner scanner = new Scanner(System.in);

		// 첫번째 수 입력 받기
		System.out.println("첫 번째 수  >>");
		int firstNum = scanner.nextInt();

		// 연산자 입력 받기
		// 잘못 입력 받은 연산자는 다시 입력하라고 알려주기
		System.out.println("( +, -, /, * ) >>");
		String operator = scanner.next();

		while (true) {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				break;
			}
			System.out.println("잘못입력했습니다.");
			System.out.println("( +, -, /, * ) >>");
			operator = scanner.next();

		}

		// 두번째 수 입력 받기
		System.out.println("두번째 수  >>");
		int secondNum = scanner.nextInt();

		// 입력받은 수로 연산하기
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
