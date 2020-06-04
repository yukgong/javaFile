package day06Practice;

import java.util.Scanner;

public class Ex02GradeManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// �л� ���� ������ 2���� �迭

		// String -> �̸�, ���� -> parseInt int -> ����
		// �л���, �̸� + ����(����, ����, ����)

		// �����
		String name, korean, english, math;

		// 1. �л� ���� �Է�
		System.out.print("�л� ���� �Է����ּ��� : ");
		int studentNum = scanner.nextInt();

		// 2. �����Ҵ�
		String arr[][] = new String[studentNum][4];

		// 3. �Է�: �̸�, ����, ����, ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "��° �л�---------");

			// �̸�
			System.out.print("�̸� : ");
			name = scanner.next();

			// ����
			while (true) {
				System.out.print("���� : ");
				korean = scanner.next();

				// �����ΰ�?
				boolean trueNum = true;
				for (int j = 0; j < korean.length(); j++) {
					char c = korean.charAt(j);
					if (!('0' <= c && c <= '9')) {
						trueNum = false;
						break;
					}
				}

				// ���ڰ� �´ٸ� ��������
				if (trueNum == false) {
					System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}

				// 1 ~ 100������ ����
				int stringToNum = Integer.parseInt(korean);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("������ �ʰ� �߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				// ������ ��� �´ٸ� ���� �ݺ��� ����
				break;
			}

			// ����
			while (true) {

				System.out.print("���� : ");
				english = scanner.next();

				// �����ΰ�?
				boolean trueNum = true;
				for (int j = 0; j < english.length(); j++) {
					// �ѱ��ھ� �������� Ȯ���ϱ� ���� string -> char�� ǥ���ϱ�
					char c = english.charAt(j);
					if (!('0' <= c && c <= '9')) { // ���ڰ� �ƴϸ�
						trueNum = false;
						break;
					}
				}

				// ���ڰ� �´ٸ� �������� �ƴ϶�� �ٽ� >>
				if (trueNum == false) {
					System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}

				// 1 ~ 100������ ����
				// ������ �´��� Ȯ���ϱ� ���� String -> int�� ǥ���ϱ�
				int stringToNum = Integer.parseInt(english);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("������ �ʰ� �߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}

				// ������ ��� �´ٸ� ���� �ݺ��� ����
				break;
			}

			// ����
			while (true) {
				System.out.print("���� : ");
				math = scanner.next();

				// �����ΰ�?
				boolean trueNum = true;
				for (int j = 0; j < math.length(); j++) {
					char c = math.charAt(j);
					if (!('0' <= c && c <= '9')) {
						trueNum = false;
						break;
					}
				}

				// ���ڰ� �´ٸ� ��������
				if (trueNum == false) {
					System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}

				// 1 ~ 100������ ����
				int stringToNum = Integer.parseInt(math);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("������ �ʰ� �߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				// ������ ��� �´ٸ� ���� �ݺ��� ����
				break;
			}

			// �����͸� �迭�� ����
			arr[i][0] = name;
			arr[i][1] = korean;
			arr[i][2] = english;
			arr[i][3] = math;
		}

		//------------------------------------
		
		// ������ Ȯ���� �迭 ����� ���ڷ� ���� ���� ���� �ֱ� (������)
		int studentGrade[][] = new int[studentNum][3];
		for (int j = 0; j < arr.length; j++) {
			studentGrade[j][0] = Integer.parseInt(arr[j][1]); // ����
			studentGrade[j][1] = Integer.parseInt(arr[j][2]); // ����
			studentGrade[j][2] = Integer.parseInt(arr[j][3]); // ����
		}
		
		// 4. ����, ����, ���� �ְ� ����
		int max = 0;
		for (int j = 0; j < studentGrade.length; j++) {
			if(max < studentGrade[j][0]) {
				max = studentGrade[j][0];
			}
		}
		
		// 5. ����, ����, ���� ���� ����
		int min = studentGrade[0][0];
		for (int j = 0; j < studentGrade.length; j++) {
			if(min > studentGrade[j][0]) {
				min = studentGrade[j][0];
			}
		}
		
		// 6. ��� ������ ����
		int sum = 0;
		for (int j = 0; j < studentGrade.length; j++) {
			for (int j2 = 0; j2 < studentGrade[0].length; j2++) {
				sum += studentGrade[j][j2];
			}
			
		}
		
		// 7. �л� ���� ���� ���
		double avg = (double)sum / studentNum;
		
		
		// print---------------------------------------------------
		System.out.println("���� �ְ����� :" + max);
		System.out.println("���� �������� :" + min);
		System.out.println("���� ���� :" + sum);
		System.out.printf("��� ����: %.1f\n", avg);
	}
}
