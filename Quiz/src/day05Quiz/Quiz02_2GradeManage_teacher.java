package day05Quiz;

import java.util.Scanner;

public class Quiz02_2GradeManage_teacher {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// �л� ���� ������ 2���� �迭
		// String -> �̸�, ���� ��θ� ����� �� �ִ�. -> ���ڴ� parseInt�� ��ȯ�� �� �ִ�.
		// int�� ���ڸ� ����� �� �����Ƿ� �������� �ʴ�.

		// ����� Start---------------------------

		// �л���, �̸� + ����(����, ����, ����)
		String student[][] = null;
		int count; // �л���

		// input Strat---------------------------

		// 1. �л� �� �Է�
		System.out.println("�л� ���� �Է� = ");
		count = scanner.nextInt();

		// 2. ���� �Ҵ�
		student = new String[count][4];

		// 3. �Է� : �̸�, ����, ����, ����
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "��° �л� ---------");

			// �̸�-----------------------------
			System.out.print("�̸� :");
			String name = scanner.next();

			// ����-----------------------------
			String lang = "";

			while (true) {
				System.out.print("����:");
				lang = scanner.next();

				// �������� �ƴ���

				boolean check = false;
				for (int j = 0; j < lang.length(); j++) {
					char c = lang.charAt(j);
					if ((int) c < 48 || (int) c > 57) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.println("�߸� �Է��߽��ϴ�.�ٽ� �Է��� �ֽʽÿ�");
					continue;
				}

				// > 1 ~ 100 ������ ���� �ΰ�?
				int numLang = Integer.parseInt(lang);
				if (numLang < 0 || numLang > 100) {
					System.out.println("������ �ʰ��߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				break;
			}

			// ����-----------------------------
			System.out.print("����:");
			String english = scanner.next();

			// ����-----------------------------
			System.out.print("����:");
			String math = scanner.next();

			// �����͸� �迭�� ����
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = english;
			student[i][3] = math;
		}

//		//input ���� test ��� 
//		for (int i = 0; i < student.length; i++) {
//			for (int j = 0; j < student[0].length; j++) {
//				System.out.print(student[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// ------------------------------------------------------

		// 4. ����, ����, ���� �ְ� ���� = max
		int studentCount[][] = new int[student.length][3];
		for (int k = 0; k < student.length; k++) {
			studentCount[k][0] = Integer.parseInt(student[k][1]); // ����
			studentCount[k][1] = Integer.parseInt(student[k][2]); // ����
			studentCount[k][2] = Integer.parseInt(student[k][3]); // ����

		}

		int max = 0;
		for (int i = 0; i < student.length; i++) {
			if (max < studentCount[i][0]) {
				max = studentCount[i][0];
			}
		}

		// 5. ����, ����, ���� ���� ���� = min
		int min = studentCount[0][1];
		for (int i = 0; i < student.length; i++) {
			if (min > studentCount[i][0]) {
				min = studentCount[i][0];
			}
		}

		// 6. ��� ������ ����
		int sum = 0;
		for (int i = 0; i < studentCount.length; i++) {
			for (int j = 0; j < studentCount[0].length; j++) {
				sum += studentCount[i][j];
			}
		}

		// 7. �л� ���� ���� ���
		double avg = (double) sum / student.length;

		// print---------------------------------------------------
		System.out.println("���� �ְ����� :" + max);
		System.out.println("���� �������� :" + min);
		System.out.println("���� ���� :" + sum);
		System.out.println("��� ����:" + avg);

	}
}
