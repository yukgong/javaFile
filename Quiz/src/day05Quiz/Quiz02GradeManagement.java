package day05Quiz;

import java.util.Scanner;

public class Quiz02GradeManagement {
	public static void main(String[] args) {
		// ���� ��� ���α׷�
		// ��踦 ������ �л��� �� >

		// �迭 ���� �Ҵ� > student[��踦 �� �л� ��][�̸�,��,��,��]
		// ex) ȫ�浿 ��, ��, �� | ������ ��, ��, ��

		// �̸�, ���� ���� �Է� >>
		// ���� ������ �Է��� ���� �� ���ڰ� �ƴϸ� �ٽ� �Է����ּ���.

		// 1~100������ ���ڸ� �Է¹ޱ� -> �Ѿ�� ������ �ʰ��߽��ϴ�. �ٽ� �Է����ּ���.

		// ����, ����, ������ �ְ� ���� �����ϱ�
		// ����, ����, ������ ���� ���� ��ö�ϱ�

		// ��� ������ ����
		// �л� ���� ���� ��� ���ϱ�

		// ----------------------

		// �ʱ�ȭ
		int n = 0;
		int sum = 0;
		int avg = 0;

		// �л� ������ �Է� �ޱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �л��� �Է��Ͻðڽ��ϱ� > ");

		// �迭 ���� �Ҵ�
		n = scanner.nextInt();
		String student[][] = new String[n][4];

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "��° �л��� �̸��� �Է����ּ���.");
			student[i][0] = scanner.next();

			// ���� ���� �Է� �ޱ�
			// �ʱ�ȭ
			char toChar = ' ';
			int toInt = 0;
			String score = "";
			System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
			student[i][1] = scanner.next();

			boolean b = true;
			while (b == true) {
				// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				} else {
					for (int j = 0; j < student.length; j++) {
						toChar = student[i][1].charAt(j);
						// �Է��� ���ڰ� ������ ���ڷ� ��ȯ���ֱ�
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][1];
							toInt = Integer.parseInt(score);
						}
						// ���ڰ� �ƴ϶��
						if (!('0' <= toChar && toChar <= '9')) {
							System.out.println("�߸��Է��߽��ϴ�.");
							System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
							student[i][1] = scanner.next();
							j--;
						}
						// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
						else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
							System.out.println("�߸��Է��߽��ϴ�.");
							System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
							student[i][1] = scanner.next();
							toChar = student[i][1].charAt(j);
							// �Է��� ���ڰ� ������ ���ڷ� ��ȯ���ֱ�
							if ('0' <= toChar && toChar <= '9') {
								score = student[i][1];
								toInt = Integer.parseInt(score);
							}
							// �Է��Ѱ� ���ڰ� �ƴ϶�� toChar�� �����ϰ� �ݺ��� �����ϱ�
							else {
								toChar = student[i][1].charAt(j);
							}
							j--;
						}
					}
				}
				
				
			}

			// -------------------------------

			// ���� ���� �Է� �ޱ�
			System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
			student[i][2] = scanner.next();

			b = true;
			while (b == true) {
				toChar = ' ';
				toInt = 0;
				score = "";
				for (int j = 0; j < student.length; j++) {
					toChar = student[i][2].charAt(j);
					if (!('0' <= toChar && toChar <= '9')) { // ���ڰ� �ƴ϶��
						System.out.println("�߸��Է��߽��ϴ�.");
						System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
						student[i][2] = scanner.next();
						j--;
					}
					// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
					else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
						System.out.println("�߸��Է��߽��ϴ�.");
						System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
						student[i][2] = scanner.next();
						toChar = student[i][2].charAt(j);
						// �Է��� ���ڰ� ������ ���ڷ� ��ȯ���ֱ�
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][2];
							toInt = Integer.parseInt(score);
						}
						// �Է��Ѱ� ���ڰ� �ƴ϶�� toChar�� �����ϰ� �ݺ��� �����ϱ�
						else {
							toChar = student[i][2].charAt(j);
						}
					}
				}
				// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				}
			}

			// -------------------------------

			// ���� ���� �Է� �ޱ�
			System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
			student[i][2] = scanner.next();

			b = true;
			while (b == true) {
				toChar = ' ';
				toInt = 0;
				score = "";
				for (int j = 0; j < student.length; j++) {
					toChar = student[i][3].charAt(j);
					if (!('0' <= toChar && toChar <= '9')) { // ���ڰ� �ƴ϶��
						System.out.println("�߸��Է��߽��ϴ�.");
						System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
						student[i][3] = scanner.next();
						j--;
					}
					// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
					else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
						System.out.println("�߸��Է��߽��ϴ�.");
						System.out.println((i + 1) + "��° �л��� ���� ������ �Է����ּ���.");
						student[i][3] = scanner.next();
						toChar = student[i][3].charAt(j);
						// �Է��� ���ڰ� ������ ���ڷ� ��ȯ���ֱ�
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][3];
							toInt = Integer.parseInt(score);
						}
						// �Է��Ѱ� ���ڰ� �ƴ϶�� toChar�� �����ϰ� �ݺ��� �����ϱ�
						else {
							toChar = student[i][3].charAt(j);
						}
					}
				}
				// ���ڷ� �����°�? // 1~100������ �ùٸ� ������ �Է��ߴ°�?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				}
			}
		}

		// ------------------------

		// ����, ����, ������ �ְ�/���� ���� �����ϱ�
		int maxKorean, maxEnglish, maxMath, minKorea, minEnglish, minMath;
		maxKorean = maxEnglish = maxMath = minKorea = minEnglish = minMath = 0;

		for (int i = 0; i < student.length; i++) {
			// ���ڿ��� ���ڷ� �ٲ��ֱ�
			String koreanScore = student[i][1];
			String englishScore = student[i][2];
			String mathScore = student[i][3];
			int koreanCompare = Integer.parseInt(koreanScore);
			int englishCompare = Integer.parseInt(englishScore);
			int mathCompare = Integer.parseInt(mathScore);

			// ���� ������ �ְ�/������
			// compare�� ���� maxKorean�� ������ ũ�� maxKorean�� compare�� ����
			if (koreanCompare > maxKorean) {
				maxKorean = koreanCompare;
			}
//			if (koreanCompare < minKorean) {
//				maxKorean = koreanCompare;
//			}

			// ���� ������ �ְ�/������
			if (englishCompare > maxEnglish) {
				maxEnglish = englishCompare;
			}

			// ���� ������ �ְ�/������
			if (mathCompare > maxMath) {
				maxMath = mathCompare;
			}
		}

		// ��� ������ ����

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 4; j++) {
				// ���ڿ��� ���ڷ� ��ȯ�ϱ�
				int stringToInt = Integer.parseInt(student[i][j]);
				// ��ȯ�� ���ڸ� ���ϱ�
				sum += stringToInt;
			}
		}

		// �л� ���� ���� ��� ���ϱ�
		avg = sum / n;

		// ����ϱ�
		System.out.println("���� �ְ��� = " + maxKorean);
		System.out.println("���� �ְ��� = " + maxEnglish);
		System.out.println("���� �ְ��� = " + maxMath);
		System.out.println("��� ������ ���� = " + sum);
		System.out.println("��� ���� = " + avg);
	}
}
