package day06Practice;

import java.util.Scanner;

public class Ex04ArrayAndSwap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �Է� ���� ���ڸ� ������ �迭�� �־��ٰ� ������ �迭�� �����ϱ�

		// 1. ������ �迭 ũ�� �Ҵ��ϱ� (?�� ?��)
		System.out.print("�� ���� ����ðڽ��ϱ�? :");
		int width = scanner.nextInt();

		System.out.print("�� ���� ����ðڽ��ϱ�? :");
		int height = scanner.nextInt();

		// 2. ���� ���ڴ�� ������ �迭 �����Ҵ�
		int arrTwoDimension[][] = new int[width][height];
		int arrOneDimension[] = new int[arrTwoDimension.length * arrTwoDimension[0].length];

		// 3. ������ �迭�� ���� �־��ֱ�
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				System.out.println((i+1) + "�࿡ " + (j+1) + "�� ���� :");
				arrTwoDimension[i][j] = scanner.nextInt();
			}
		}

		// 4. ������ �迭�� �ִ� ���ڸ� ������ �迭�� �־��ֱ�
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				arrOneDimension[arrTwoDimension[0].length * i + j] = arrTwoDimension[i][j];
			}
		}

		// 5. ��� Ȯ���ϱ�
		for (int i = 0; i < arrTwoDimension.length; i++) {
			for (int j = 0; j < arrTwoDimension[0].length; j++) {
				System.out.println("arrTwoDimension[" + i + "]["+ j + "] = "  + arrTwoDimension[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < arrOneDimension.length; i++) {
			System.out.println("arrOneDimension[" + i + "] = " + arrOneDimension[i]);
		}
	}
}
