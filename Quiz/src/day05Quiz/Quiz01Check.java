package day05Quiz;

import java.util.Scanner;

public class Quiz01Check {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 1�� ���� �Է� : ��� ���ڷ� �Ǿ� �ִ��� Ȯ�� -> String "12345" "123e5" ��� ���ڷ� �Ǿ� ������,
		 * "���ڷ� �Ǿ� �ֽ��ϴ�." -> ���ڷ� ��ȯ "���ڷ� �Ǿ� ���� �ʽ��ϴ�."
		 * 
		 * -> ASCII ���
		 */

		// �ʱ�ȭ
		System.out.println("�ƹ� ���ĺ��̳� ���ڸ� �Ẹ���� >");
		String str1 = scanner.next();

		// ���ڿ��� ��� ���ڷ� �Ǿ� �ִ��� Ȯ���ϱ�
		boolean trueText = false;

		for (int j = 0; j < str1.length(); j++) {
			char ch = str1.charAt(j);
			if (!('0' <= ch && ch <= '9')) {
				trueText = true;
				break; // ���ڰ� �ƴ� ���� ã���� �ݺ��� ����
			}
		}

		// �޼��� ����ϱ�
		if (trueText == false) { // ch[j]�� ���ڷ� �Ǿ� ������
			// ���ڿ��� ���ڷ� ��ȯ�ϱ�
			int stringToNum = Integer.parseInt(str1);
			System.out.println(stringToNum + "�� ���ڷ� �Ǿ� �ֽ��ϴ�.");

		} else if (trueText == true) { // ch[j]�� ���ڰ� ������
			System.out.println(str1 + "�� ���ڷ� �Ǿ� ���� �ʽ��ϴ�.");
		}

		// --------------------------

		/*
		 * 2�� ���� �Է� : ����, �Ǽ��� �Ǻ��� �ڵ带 �ۼ� -> String "123.456" "123456" �Ǽ��� �Ǽ��Դϴ�. ������
		 * �����Դϴ�.
		 * 
		 * -> '.'�� ���ԵǴ��� Ȯ���ϱ�
		 */

		// init
		System.out.println("������ �Ǽ��� �Է��ϼ��� >");
		String str2 = scanner.next();
		char ch2[] = new char[str2.length()];

		// ���ڿ��� �� �ܾ�� char �迭�� ���
		for (int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}

		// ���ڿ��� ��� ���ڷ� �Ǿ� �ִ��� Ȯ���ϱ�
		boolean trueNum = true;
		for (int j = 0; j < ch2.length; j++) {
			if (ch2[j] == '.') {
				trueNum = false;
				break;
			}
		}

		// �޼��� ����ϱ�
		if (trueNum == false) {
			// ���ڿ��� �Ǽ��� �ٲٱ�
			double stringToDouble = Double.parseDouble(str2);
			System.out.println(stringToDouble + "�� �Ǽ��Դϴ�.");

		} else if (trueNum == true) {
			int stringToNum = Integer.parseInt(str2);
			System.out.println(stringToNum + "�� �����Դϴ�.");
		}

		// ----------------

		// �빮�ڷ� �Է� -> �ҹ��ڷ� ��ȯ�ؼ� ��� �ǵ���...
		// toLowerCase ������� ���� ����!
		// ABC -> abc

		System.out.println("���ĺ� �빮�ڸ� �Է��ϼ��� >");
		String upper = scanner.next();
		String result = "";

		// ��Ʈ�� ���ڸ� �ϳ��� char �迭�� ���
		for (int i = 0; i < ch2.length; i++) {
			char c = upper.charAt(i);
			if ((int) c >= 65 && (int) c <= 90) {
				int n = (int) c + 32;
				result = result + (char) n;
			} else {
				result = result + c;
			}
		}
		
		System.out.println("���� ���� = " + upper);
		System.out.println("�ٲ� ���� = " + result);

	}
}
