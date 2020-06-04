package day07;

import java.util.Scanner;

public class Ex03Calculator {
	public static void main(String[] args) {
		// ����
		
		//�ʱ�ȭ
		int num1, num2;
		String operator;
		int result = 0;
		String strNum1, strNum2;

//		-------------------------------------

		// TODO : �Է�
		strNum1 = numberInput("ù��° �� = ");
		// strNum1�� numberInput�� ���� ���� strNum�� ���� ������.

		// ������
		operator = checkOperator();
		// operator�� checkOperator�� ���ϰ��� operator�� ���� ������.

		// �ι�° ��
		strNum2 = numberInput("�ι�° �� = ");
		// strNum2�� numberInput�� ���� ���� strNum�� ���� ������.

		// ���ڿ� -> ����
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);

//		----------------------------------

		// TODO : ���
		result = calcProcess(operator, num1, num2);
		// result�� calcProcess�� ���� ���� r�� ���� ������.

//		----------------------------------

		// TODO : ���
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

//	---------------function-------------------

	// function : ������(+, -, *, /)�� ����� �Է��ߴ��� Ȯ���ϴ� �Լ�
	// return : +, -, *, /
	static String checkOperator() {
		Scanner sc = new Scanner(System.in);
		String operator;
		
		while (true) {
			// �������� ������ �Է¹ޱ�
			System.out.print("+, -, *, / = ");
			operator = sc.next();

			// �����ڸ� ����� �Է����� �ʾ��� ���
			if (!(operator.equals("+") 
					|| operator.equals("-") 
					|| operator.equals("*") 
					|| operator.equals("/"))) {
				System.out.println("�߸��Է��߽��ϴ�.");
				continue;
			}
			break;
		}
		return operator;
	}

	// function : ���ڸ� �Է¹ް� ���ڿ��� ���ڰ� �ƴ� ���� �Է����� ��� �޼����� ����ϴ� �Լ�
	// return : strNum = ����
	static String numberInput(String msg) {
		Scanner sc = new Scanner(System.in);
		String strNum;
		// ��ȯ�� ����
		while (true) {
			// �޼ҵ��� �Ű������ڸ��� ������ �־��ָ� ��¹��� msg���� ���� �޾� �޼����� ������ش�.
			System.out.print(msg);
			// numberInput�� ����Ǹ鼭 ����ڿ��� ���ڸ� �Է¹޾� strNum�� �����Ѵ�.
			strNum = sc.next();
			// checkTrueNumber �޼ҵ带 �����Ѵ�.
			// ������ checkTrueNumber�� �Ű������� strNum���� �����Ѵ�.
			// strNum�� ������ checkTrueNumber�޼ҵ��� trueNum���� Ȯ���Ѵ�.
			// Ȯ���� trueNum�� ���� false��� �Ʒ� ���ǹ��� ����ȴ�.
			if (checkTrueNumber(strNum) == false) {
				System.out.println("�߸��Է��߽��ϴ�.");
				continue;
			}
			break;
		}
		// ������ strNum���� �������ش�.
		return strNum;
	}

	// function : ���
	// �Ű����� operator, num1, num2 ��ġ�� �°� ���� ���� �����´�.
	// ���ڰ��� ������ ������ ó���ϰ� ���� ������� r�� �������ش�.
	// return : num1�� num2�� ������ ����� ex) 1 * 1 = 1���� '1'
	static int calcProcess(String operator, int num1, int num2) {
		int r = 0;
		switch (operator) {
		case "+":
			r = num1 + num2;
			break;

		case "-":
			r = num1 - num2;
			break;

		case "*":
			r = num1 * num2;
			break;

		case "/":
			r = num1 / num2;
			break;
		}
		return r;
	}

	// function : ���ڿ� �߿��� ���ڸ� �Ǻ��ϴ� �Լ�
	// strNum���� Ȯ���Ѵ�. strNum�� ��/�������� Ȯ���ؼ� trueNum�� ���� ����(���)���ش�.
	// return: true(���ڰ� �ƴ�), false(��� ����)
	static boolean checkTrueNumber(String strNum) {
		boolean trueNum = true;
		for (int i = 0; i < strNum.length(); i++) {
			char c = strNum.charAt(i);
			if (!('0' <= c && c <= '9')) {
				trueNum = false;
				break;
			}
		}

		return trueNum;
	}
}
