package day06;

import java.util.Scanner;

public class Ex03Sorting_teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// �ʱ�ȭ
		int number[] = null;
		int count;
		boolean updown = false;
		
		//input Start--------------------------------------
		
		// ������ ����?
		System.out.println("������ ������ = ");
		count = scanner.nextInt();

		// ������ ���ڸ� �����Ҵ�
		number = new int[count];

		// ������ ���ڸ� �Է�
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "��° ���� :");
			number[i] = scanner.nextInt();
		}

		// ����(1)/����(2)
		System.out.println("����(1)/����(2) = ");
		int choice = scanner.nextInt();
		updown = (choice == 1) ? true : false;
		
		//processing start --------------------------------------
		
		//����
		int temp;
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown) { // �������� //���� �� ���°� true�� ���Ѵ�. ������ �տ� '!'�� ���̸� false�� ����
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				else { // ��������
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
			}
		}
		
		//print Start--------------------------------------
		
		//��� ���
		String msg = "";
		if(updown) msg = "����";
		if(!updown) msg = "����";
		System.out.println(msg + "�������� �����߽��ϴ�.");
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
	}
}
