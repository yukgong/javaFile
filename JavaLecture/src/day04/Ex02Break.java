package day04;

public class Ex02Break {
	public static void main(String[] args) {

		// break
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

		// ����
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if (i == 4) {
				break;
			}
		}
		System.out.println("Ż�� ��");
		System.out.println();

//		-----

		char charArr[] = { 'A', 'B', 'C', 'D', 'E' };

		for (int i = 0; i < charArr.length; i++) {
			System.out.println(i + ":" + charArr[i]);
			if (charArr[i] == 'C') {
				System.out.println("C�� ã�ҽ��ϴ�.");
				break;
			}
		}

//		-----

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);

			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);

				if (i == 4 && j == 3) {
					break; // break �ϳ��� ��ȯ�� �ϳ����� Ż���Ѵ�.
							// ���⼭ break�� ���� ���� ���������� Ż���ϰ� �ǰ�
							// ���� for�������� Ż���� �� ���Եȴ�.
				}
			}
		}
		System.out.println("-----------------");

		// 1. Ż���� : ��ȯ���� ������ �°� break�� ����

		for (int i = 0; i < 10; i++) {
			boolean boo = false;
			System.out.println("i = " + i);

			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);

				if (i == 4 && j == 3) {
					boo = true;
				}
				if (boo == true) {
					break;
				}
			}
			if (boo == true) {
				break;
			}
		}

		System.out.println("-----------------");

		// 2. Ż���� : Ű���带 ���(goto)
		loopout: for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);
				if (i == 4 && j == 3) {
					break loopout;
				}
			}
		}

	}
}
