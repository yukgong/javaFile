package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06_teacher_og {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		// �����κ��� �Է� ���� ������ �հ�� ����� ���ϴ� ���α׷��� �ۼ��϶�.
		
		// ����
		// int num1 = 0, num2, num3;
		int numArr[] = null;	// int *numArr	-> ����   = null (0) 	nul(����)
								// 0xffffffff
								//   1111 -> f -> 4 bit
		int sum;	// �հ� ����
		double avg;	// ��� ����
		int count;
		
		// �ʱ�ȭ
		sum = 0;
		
		// �����ϰ� ���� ������ ������ �Է�
		System.out.print("�����ϰ� ���� ������ ���� = ");
		count = sc.nextInt();
		
		// �� ������ �°� �迭Ȯ��(�����Ҵ�)
		numArr = new int[count];
		
		// �հ踦 ������ ���ڵ��� �Է�
		for(int i = 0;i < numArr.length; i++) {
			System.out.print((i + 1) + "��° �� = ");
			numArr[i] = sc.nextInt();			
		}
		
		// �հ踦 ����
		for(int i = 0;i < numArr.length; i++) {
			sum = sum + numArr[i];
		}		
		
		// ����� ����
		avg = (double)sum / count;
		
		// ��� ���
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("���ڵ�:" + numArr[i] + " ");
		}
		System.out.println();

		System.out.println("�հ�:" + sum);
		System.out.println("���:" + avg);
		
	}

}





