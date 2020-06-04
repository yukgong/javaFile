package day04Quiz;

import java.util.Scanner;

public class Quiz02Baseball {
	// �߱� ���� ���߱�
	// ���� ���� 3���� �ޱ�
	// ���� ���� �������� ���� �޶���Ѵ�. = �ߺ� ����
	// �������� ���� 3���� �޴´�.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ����
		int strike = 0;
		int ball = 0;
		int arrSize = 3;
		boolean exit = true;

		while (exit == true) {
			// ���� ���߶���ϱ�
			System.out.println("�ȳ��ϼ���! ���̽��� �����Դϴ�.");
			System.out.println("3ȸ�� ������ ������ ���� 3��Ʈ����ũ �ƿ��� ������ �̱�� �����Դϴ�.");

			// �迭 ����
			int arrGame[] = new int[arrSize];
			int arrAnswer[] = new int[arrSize];

			// ���� ���� ���� �� �迭�� �ֱ�
			for (int i = 0; i < arrGame.length; i++) {
				int random = (int) ((Math.random() * 10)+1);
				arrGame[i] = random;
				// �ߺ� ���ֱ�
				for (int j = 0; j < i; j++) {
					if (arrGame[i] == arrGame[j]) {
//						System.out.println("�ߺ��Դϴ�.");
						i--;
					}
				}
			}
			// �迭 ���� Ȯ���ϱ�
			for (int i = 0; i < arrGame.length; i++) {
				System.out.println("arr[" + i + "] = " + arrGame[i]);
			}

			int count = 1;
			// �Է� ���� ���ڰ� �´��� Ȯ���ϱ�
			while (count < 10) {
				// ���� �Է¹ޱ�
				for (int i = 0; i < arrGame.length; i++) {
					System.out.println((i + 1) + "ȸ�� ������? (1~10���� ����) >");
					int userNum = scanner.nextInt();
					if (userNum <= 10 && userNum > 0) {
						arrAnswer[i] = userNum;
					} else {
						while (userNum > 10 || userNum < 0) {
							System.out.println("�߸��Է��߽��ϴ�.");
							System.out.println((i + 1) + "ȸ�� ������? (1~10���� ����) >");
							userNum = scanner.nextInt();
						}
					}

				}

				// ���� �ڸ� ���� ������ ������ ���ϱ�
				for (int i = 0; i < arrAnswer.length; i++) {
					if (arrAnswer[i] == arrGame[i]) {
						strike += 1;
					}
					for (int j = 0; j < arrAnswer.length; j++) {

						if (arrAnswer[i] == arrGame[j]) {
							if (arrAnswer[i] != arrGame[i]) {
								ball += 1;
							}
						}
					}
				}

				// ���� ����ϱ�
				System.out.println(strike + "��Ʈ����ũ, " + ball + "�� �Դϴ�.");

				if (strike == 3) {
					System.out.println("������ ��� ������ϴ�. �¸�!!!!!!!!");
					break;
				}
				System.out.println((10 - count) + "�� ���ҽ��ϴ�.");
				
				//�ʱ�ȭ
				strike = 0;
				ball = 0;
				count++;
			}

			if (count == 10) {
				System.out.println("����.. ������ ���߳׿�.");
			}

//		-------------------

			// �ٽ��Ұ��� �����
			System.out.println("�ٽ� �غ��ðھ��?(Y/N)");
			String again = scanner.next();
			again = again.toUpperCase();

			// �߸��Է������� �ٽ��Է��϶��ϱ�
			while (!(again.equals("Y") || again.equals("N"))) {
				System.out.println("�߸��Է��߽��ϴ�.");
				System.out.println("�ٽ� �غ��ðھ��?(Y/N)");
				again = scanner.next();
				again = again.toUpperCase();
			}
			// Y�� ������ �ٽ� ����, N�� ������ ����
			if (again.equals("Y")) {
				exit = true;
			} else if (again.equals("N")) {
				exit = false;
				System.out.println("����Ǿ����ϴ�. �̿����ּż� �����մϴ�.");
			}
		}
	}
}