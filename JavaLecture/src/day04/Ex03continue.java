package day04;

import java.util.Scanner;

public class Ex03continue {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//			System.out.println("for start");
//			if (i < 5) {
//				continue;
//			}
//			System.out.println("for end"); // i�� 5���� ���������� �����ȴ�.
//		}

//		----------------------------

		// ��ĵ���
		Scanner sc = new Scanner(System.in);

		// ����
		int numArr[] = new int[3];
		int n;

		// ó��
		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i + 1) + "��° �� : ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("�����Դϴ�.");
				continue; // ������ �迭�� �������� �ʰ� ��ŵ�Ѵ�.
			}
			numArr[i] = n;
		}

		// ���
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}

//		-----

		int w = 0;
		int arrNum[] = new int [3];
		while (w < 3) {
			System.out.println((w+1)+"��° �� =");
			n = sc.nextInt();
			
			if(n < 0) {
				System.out.println("�����Դϴ�.");
				continue;
			}
			
			//�Է� ���� ���� �迭�� �����ϱ�
			arrNum[w] = n;
			w++;
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}
	}
}
