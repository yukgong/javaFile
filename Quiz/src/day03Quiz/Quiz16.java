package day03Quiz;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		// ��ĵ ���
		Scanner scanner = new Scanner(System.in);

		// ���� �Է� �ޱ�
		System.out.println("����ϰ� ���� �������� �� �� �ΰ���? : ");
		int userNumber = scanner.nextInt();

		// ������ ���
		for (int i = 1; i <= 9; i++) { // 1���� 9���� ������ �ݺ�

			// �Ʒ� �ڵ�� ������ Ʋ���� �ʾ����� ��ȿ�����̴�.
			// ��¹� ������ �ٷ� �����ؼ� ������ �����ϴ�.
//			int first = userNumber; 
//			int second = i;
//			int third = userNumber * i;
//			System.out.println(first + "X" + second + "=" + third);

			// printing
			System.out.println(userNumber + "X" + i + "=" + (userNumber * i));
		}

		scanner.close();
	}
}
