package day04Quiz;

/*
 * Baseball
 * random number -> 3��
 * user number -> 3��
 * 
 * ��
 * �޼��� ��� ? Strike ? Ball
 * 
 * Play again
 */
import java.util.Scanner;

public class Quiz02BaseballTeacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// �迭 �ʱ�ȭ
		int rNum[] = new int[3];
		int uNum[] = new int[3]; // 10�� (1~10) - 0000
		boolean clear = true;

		boolean randomSwitch[] = new boolean[10];

		// ���� ���� �Է¹ޱ�(�ߺ�����)
		// �ߺ��� ���ڸ� ���� �ʱ� ����
		for (int i = 0; i < uNum.length; i++) {
			randomSwitch[i] = false;
		}

		// �ζǹ�ȣ ������ ����
		// ���� ���ܼ��ڸ� �߰��� ��
//		randomSwitch[0] = true;
//		randomSwitch[21] = true;

		int r, w;
		w = 0;

		while (w < 3) {
			// randomSwitch�� �⺻ ���´� false�̰�, �ݺ����� ����Ǹ鼭 r�� ���� ���ڰ� ���Եȴ�.
			r = (int) (Math.random() * 10); // 0~9

			// r�� ���� ���ڰ� ���ԵǾ��� �� randomSwitch�� [r]��°�� �迭�� false�϶� true�� �ȴ�.
			// �ѹ� ���ڰ� ���ԵǸ� randomSwitch[r]�� true�� �ǹǷ� �ߺ��� ���ڰ� ���Ե��� �ʴ´�.
			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				rNum[w] = r + 1; // 1~10
				w++;
			}
		}
		
		for (int i = 0; i < rNum.length; i++) {
			System.out.println(i + "��° ���� = " + rNum[i]);
		}

		// Debug != ����
		// �������� ���ڸ� ��� ���� ����ϴ� ���� ������̴�.
		// �ǽð� ������, break point�� ����ؼ� ������ϴ� 2���� ����� �ִ�.

		////////////////////////// loop 10

		w = 0;
		int strike, ball;
		while (w < 10) {

			// user input (uNum1 != uNum2 !=
			// uNum3)-----------------------------------------------
			boolean check;
			int w1;
			while (true) {
				check = false;
				w1 = 0;
				while (w1 < 3) {
					System.out.println((w1 + 1) + "�� ° �� =");
					uNum[w1] = scanner.nextInt();
					w1++;
				}
				// ���� ���ڰ� �ִ��� üũ
				out: for (int i = 0; i < uNum.length; i++) {
					for (int j = 0; j < uNum.length; j++) {
						if (uNum[i] == uNum[j] && i != j) {
							check = true; // �Է��� ���� ���ڰ� ����
							break out;
						}
					}
				}
				if (check == false) {
					break;
				}
				System.out.println("�Է��� ���� �߿� �ߺ��Ǵ� ���ڰ� �ս��ϴ�. �ٽ� �Է��� �ֽʽÿ�");

			}

			// process(��)-----------------------------------------------
			strike = ball = 0;
			// ball
			for (int i = 0; i < uNum.length; i++) {
				for (int j = 0; j < rNum.length; j++) {
					if (uNum[i] == rNum[j] && i != j) {
						ball++;
					}
				}
			}
			// strike
			for (int i = 0; i < uNum.length; i++) {
				if (uNum[i] == rNum[i]) {
					strike++;
				}
			}
			// Ż��
			if (strike > 2) {
				clear = true;
				break;
			}

			// �޼��� ���
			System.out.println(strike + "��Ʈ����ũ, " + ball + "�� �Դϴ�.");
			
			w++;
		}
		
		if(clear) {
			System.out.println("Game Clear!");
		}else {
			System.out.println("Game Over~");
		}
	}

}
