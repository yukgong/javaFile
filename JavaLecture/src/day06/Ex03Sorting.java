package day06;

import java.util.Scanner;

public class Ex03Sorting {
	public static void main(String[] args) {
		//�Է��� ���� �������� �������� �����
		while (true) {
			Scanner scanner = new Scanner(System.in);

			// �޴� ���� ����(1)/����(2)
			System.out.println("�޴��� �������ּ��� -----------");
			System.out.println("1. �������� ����");
			System.out.println("2. �������� ����");
			System.out.println("3. ����");
			System.out.println("----------------------");
			int choice = scanner.nextInt();

//			---------------------

			int tempNum;

			// �������� ����
			if (choice == 1) {
				
				// ������ ����?
				System.out.print("������ ������ �Է��ϼ��� :\n");
				int userNumber = scanner.nextInt();

				// ������ ���ڸ� ���� �Ҵ�
				int arr[] = new int[userNumber];

				// ������ ���ڸ� �Է�
				for (int i = 0; i < arr.length; i++) {
					System.out.print((i + 1) + "��° ���ڸ� �Է��ϼ��� :");
					int nonSortNum = scanner.nextInt();
					arr[i] = nonSortNum;
				}
				
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] < arr[j]) {
							tempNum = arr[i];
							arr[i] = arr[j];
							arr[j] = tempNum;
						}
					}
				}
				// ��� ���
				System.out.println();
				System.out.println("<�������� ��� >");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
				continue;
			}

			// �������� ����
			if (choice == 2) {
				
				// ������ ����?
				System.out.print("������ ������ �Է��ϼ��� :\n");
				int userNumber = scanner.nextInt();

				// ������ ���ڸ� ���� �Ҵ�
				int arr[] = new int[userNumber];

				// ������ ���ڸ� �Է�
				for (int i = 0; i < arr.length; i++) {
					System.out.print((i + 1) + "��° ���ڸ� �Է��ϼ��� :");
					int nonSortNum = scanner.nextInt();
					arr[i] = nonSortNum;
				}
				
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] > arr[j]) {
							tempNum = arr[i];
							arr[i] = arr[j];
							arr[j] = tempNum;
						}
					}
				}
				// ��� ���
				System.out.println();
				System.out.println("<�������� ��� >");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
				continue;
			}
			
			if (choice == 3) {
				break;
			}


		}
	}
}
