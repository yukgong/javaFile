package day06Practice;

import java.util.Scanner;

public class Ex03Sorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �Է��� ���� �������� �������� �����

		// �Է¹��� ���� ���� ���ϱ�
		System.out.println("���ڸ� �Է����ּ���.");
		int count = scanner.nextInt();

		// �迭 ���� �Ҵ�
		int arr[] = new int [count];

		// ����ڿ��� ���� �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է����ּ���." + "(" + i + "/" + arr.length + ")");
			int num = scanner.nextInt();
			arr[i] = num;
		}

		// �޴� ���� ����(1)/����(2)
		System.out.println("�޴��� �������ּ��� -----------");
		System.out.println("1. �������� ����");
		System.out.println("2. �������� ����");
		System.out.println("----------------------");
		int choice = scanner.nextInt();

		// ��������, �������� ����
		int temp;
		switch (choice) {
		case 1://����
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;

		case 2: //����
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			break;
		}

		// ��� ����ϱ�
		String msg = "";
		if(choice == 1) msg = "����";
		if(!(choice == 1)) msg = "����";
		System.out.println(msg + "�������� �����߽��ϴ�.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + ":" + arr[i]);
		}

	}
}
