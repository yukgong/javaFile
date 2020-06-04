package day07Quiz;

import java.util.Scanner;

public class Quiz01Function {
	public static void main(String[] args) {
		// 1. �μ��� ���� ��, �������� ���ϴ� �Լ�
		// num1, num2
		// value(��), tag(������)

		// �ʱ�ȭ
		int num1, num2, value, tag;
		int tagArr[] = new int[1];
		int result1 = 0;

		// �ΰ��� ���� �Է� �ޱ�
		num1 = inputNumber("ù��° �� = ");
		num2 = inputNumber("�ι�° �� = ");


		// �Է� ���� ���� ��� �������� ���ϱ�
		// ���1
		value = division(num1, num2);
		tag = remainder(num1, num2);
		
		// ���2
		result1 = div(num1, num2, tagArr);

		// ��� ����ϱ�
		// ���1
		System.out.println("�� : " + value + " ������ : " + tag);

		// ���2
		System.out.println("\n�� : " + result1 + " ������ = " + tagArr[0] + "\n");
		
		//num1,2�� ���� ���� �Ҵ��� �Ǿ� �Լ� �ȿ��� ������ ���� ����Ǿ, �ܺ��� ������ ���� ������� �ʴ´�.
		System.out.println(num1);
		System.out.println(num2);
		
		// tagArr���� ������ ���� �Ҵ��� �Ǿ��� ������  �Լ� �ȿ��� ���ڰ��� ����Ǿ� 
		// ���ڸ� ������ ��ü�� ���� ����
		System.out.println(tagArr[0]); 

		// -----------------------

		// 2. toUpperCase�� �����
		// ���ڿ��� �Ѱ��ָ� �빮�ڷ� �����ؼ� �����ϱ�

		// �ʱ�ȭ
		String str, result;

		// ���ڿ� �Է��ϱ�
		str = inputString("���ڸ� �Է����ּ��� :");

		// �Է��� ���ڸ� �빮�ڷ� �ٲ��ֱ�
		result = toUpperCase(str);

		// ��� ����ϱ�
		System.out.println("���� : " + str);
		System.out.println("��ȯ : " + result);
	}

	// 1�� �޼���-----------------------------------------

	// ���ڸ� �Է� �޴� �Լ�
	static int inputNumber(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();

		return num;
	}

	// �Է� ���� ������ ������ �Լ�
	static int division(int num1, int num2) {
		int result = num1 / num2;

		return result;
	}

	// �Է� ���� �������� �������� ���ϴ� �Լ�
	static int remainder(int num1, int num2) {
		int result = num1 % num2;

		return result;
	}

	// ---------------------------------
	// call by reference(������ ���� ȣ��)�� ��� �������� ���ϴ� ���
	static int div(int n1, int n2, int t[]) {
		int v = 0;
		v = n1 / n2;
		t[0] = n1 % n2;

		return v;
	}

	// 2�� �޼���-----------------------------------------

	// ���� �Է� �޴� �Լ�
	static String inputString(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String str = sc.next();

		return str;
	}

	// �ҹ��ڸ� �빮�ڷ� �ٲ��ֱ�
	static String toUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z') {
				int change = (int) c - 32; // ASCII �ڵ尪�� ������ �ҹ��ڿ��� �빮�ڷ� �ٲ��ش�.
				result = result + (char) change; // result �����ȿ�
			} else {
				result = result + c;
			}
		}

		return result;
	}
}
