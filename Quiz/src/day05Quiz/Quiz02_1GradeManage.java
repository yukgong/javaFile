package day05Quiz;

import java.util.Scanner;

public class Quiz02_1GradeManage {

	public static void main(String[] args) {
		// ���� ��� ���α׷�

		// �ʱ�ȭ
		int sum = 0;
		int avg = 0;

		// 1. ��踦 ������ �л��� �� �Է� �ޱ�>
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л� �� ��? > ");
		int studentNum = scanner.nextInt();

		// 2. �迭 ���� �Ҵ� > student[��踦 �� �л� ��][�̸�,��,��,��]
		// ex) ȫ�浿 ��, ��, �� | ������ ��, ��, ��
		String studentArr[][] = new String[studentNum][4];

		// 3. ����� �Է� �ޱ� Start-------------------------------------------

		for (int i = 0; i < studentArr.length; i++) {
			// [i][0] �� �̸� �Է� >
			System.out.println((i + 1) + "��° �л� �̸� > ");
			studentArr[i][0] = scanner.next();

			// ���� ���� �Է�-----------------------------------------------
			boolean loop = true;
			while (loop == true) {
				// [i][1]�� ���� ���� �Է�
				System.out.println((i + 1) + "��° �л��� ���� ���� > ");
				studentArr[i][1] = scanner.next();

				out: while (true) {
					// �Է� ���� ������ �����ΰ�?
					for (int j = 0; j < studentArr[i][1].length(); j++) {
						// String to char
						char c = studentArr[i][1].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("�߸��Է��߽��ϴ�.");
							break out; // �ƴ϶�� ó������ �ٽ� �����
						}
					}
					// �Է� ���� ������ ���ڰ� �´ٸ� 1~100������ �ִ°�?
					// string to int
					String score = studentArr[i][1];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("������ �ʰ��߽��ϴ�.");
						break out; // �ƴ϶�� ó������ �ٽ� �����
					} else { // ���ڰ�, 1~100������ �ִٸ� �������� �Ѿ��
						loop = false;
						break out;
					}
				}
			}

			// ���� ���� �Է�-----------------------------------------------
			loop = true;
			while (loop == true) {
				// [i][1]�� ���� ���� �Է�
				System.out.println((i + 1) + "��° �л��� ���� ���� > ");
				studentArr[i][2] = scanner.next();

				out: while (true) {
					// �Է� ���� ������ �����ΰ�?
					for (int j = 0; j < studentArr[i][2].length(); j++) {
						// String to char
						char c = studentArr[i][2].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("�߸��Է��߽��ϴ�.");
							break out; // �ƴ϶�� ó������ �ٽ� �����
						}
					}
					// �Է� ���� ������ ���ڰ� �´ٸ� 1~100������ �ִ°�?
					// string to int
					String score = studentArr[i][2];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("������ �ʰ��߽��ϴ�.");
						break out; // �ƴ϶�� ó������ �ٽ� �����
					} else { // ���ڰ�, 1~100������ �ִٸ� �������� �Ѿ��
						loop = false;
						break out;
					}
				}
			}

			// ���� ���� �Է�-----------------------------------------------
			loop = true;
			while (loop == true) {
				// [i][1]�� ���� ���� �Է�
				System.out.println((i + 1) + "��° �л��� ���� ���� > ");
				studentArr[i][3] = scanner.next();

				out: while (true) {
					// �Է� ���� ������ �����ΰ�?
					for (int j = 0; j < studentArr[i][3].length(); j++) {
						// String to char
						char c = studentArr[i][3].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("�߸��Է��߽��ϴ�.");
							break out; // �ƴ϶�� ó������ �ٽ� �����
						}
					}
					// �Է� ���� ������ ���ڰ� �´ٸ� 1~100������ �ִ°�?
					// string to int
					String score = studentArr[i][3];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("������ �ʰ��߽��ϴ�.");
						break out; // �ƴ϶�� ó������ �ٽ� �����
					} else { // ���ڰ�, 1~100������ �ִٸ� �������� �Ѿ��
						loop = false;
						break out;
					}
				}
			}
		}

		// 4. ����, ����, ������ �ְ�/���� ���� �����ϱ� Start---------------------

		int maxKorean, maxEnglish, maxMath, minKorean, minEnglish, minMath;
		maxKorean = maxEnglish = maxMath = 0;
		String koreanScore1 = studentArr[0][1];
		String englishScore1 = studentArr[0][2];
		String mathScore1 = studentArr[0][3];
		int koreanCompare1 = Integer.parseInt(koreanScore1);
		int englishCompare1 = Integer.parseInt(englishScore1);
		int mathCompare1 = Integer.parseInt(mathScore1);
		minKorean = koreanCompare1;
		minEnglish = englishCompare1;
		minMath = mathCompare1;

		for (int i = 0; i < studentArr.length; i++) {
			// ���ڿ��� ���ڷ� �ٲ��ֱ�
			String koreanScore = studentArr[i][1];
			String englishScore = studentArr[i][2];
			String mathScore = studentArr[i][3];
			int koreanCompare = Integer.parseInt(koreanScore);
			int englishCompare = Integer.parseInt(englishScore);
			int mathCompare = Integer.parseInt(mathScore);

			// ���� ������ �ְ�/������ --------------
			// compare�� ���� maxKorean�� ������ ũ�� maxKorean�� compare�� ����
			if (koreanCompare > maxKorean) {
				maxKorean = koreanCompare;
			}
			if (koreanCompare < minKorean) {
				minKorean = koreanCompare;
			}

			// ���� ������ �ְ�/������ --------------
			if (englishCompare > maxEnglish) {
				maxEnglish = englishCompare;
			}
			if (englishCompare < minKorean) {
				minEnglish = englishCompare;
			}

			// ���� ������ �ְ�/������ --------------
			if (mathCompare > maxMath) {
				maxMath = mathCompare;
			}
			if (mathCompare < minMath) {
				minMath = mathCompare;
			}
		}


		// 5. ��� ������ ���� Strat ---------------------------------------
		
		for (int i = 0; i < studentNum; i++) {
			for (int j = 1; j < 4; j++) {
				// ���ڿ��� ���ڷ� ��ȯ�ϱ�
				int stringToInt = Integer.parseInt(studentArr[i][j]);
				// ��ȯ�� ���ڸ� ���ϱ�
				sum += stringToInt;
			}
		}

		// 6. �л� ���� ���� ��� ���ϱ�---------------------------------------
		avg = sum / studentNum;

		// 7. ����ϱ�-------------------------------------------------
		System.out.println("���� �ְ��� = " + maxKorean + " ������ = " + minKorean);
		System.out.println("���� �ְ��� = " + maxEnglish + " ������ = " + minEnglish);
		System.out.println("���� �ְ��� = " + maxMath + " ������ = " + minMath);
		System.out.println("��� ������ ���� = " + sum);
		System.out.println("��� ���� = " + avg);
	}
}
