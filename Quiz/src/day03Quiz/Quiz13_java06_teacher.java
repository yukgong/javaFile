package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06_teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ����
		int sum;		//�հ�
		double avg;		//���
		int count;		//������ �Է��� ����
		int numArr[]; 	// c���� ����� ���Ҹ� �ϴ°� �������̴�.
						// �����Ϳ����� �����Ҵ��� �Ѵ�.
						// ���� = null nul(����)
						// 0xfffff -> �̰Ͱ� �����ڼ� ���� ã�ƺ���

		// �ʱ�ȭ
		sum = 0;

		// ���� �Է� �ޱ�
		System.out.println("�����ϰ� ���� ������ ������ �Է����ּ��� : ");
		count = scanner.nextInt();

		// �� ������ �°� �迭Ȯ��(���� �Ҵ�)
		numArr = new int[count];
		
		
		// �հ踦 ������ ���ڵ��� �Է�
		System.out.println(count + "���� ���� �Է�");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "��° ���� :");
			numArr[i] = scanner.nextInt();
		}


		// �հ踦 ����
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}

		// ����� ����
		avg = (double)sum/count;

		// ��� ���
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("���ڵ�:" + numArr[i] + " ");
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

	}
}
