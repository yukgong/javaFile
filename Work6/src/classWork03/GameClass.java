package classWork03;

import java.util.Scanner;

public class GameClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coin = 20;

		Dice d1 = new Dice();
		Dice d2 = new Dice();

		while (coin > 0) { // ������ 0�̵Ǹ� ���� ����
			// �λ縻
			System.out.println("�ΰ��� �ֻ����� ���� �˾Ƹ��纸����.");
			System.out.println("���� ���� : " + coin);

			// �ֻ��� �����ϱ�
			int dice1 = d1.getDice();
			int dice2 = d2.getDice();
			int DiceSumSetting = dice1 + dice2;
			System.out.println("�ֻ��� �� : " + DiceSumSetting);

			// ������ ���� �� �Է¹ޱ�
			int bettingCoin = bettingCoin(coin);
			coin -= bettingCoin; // ������ ���� �谨.

			// �� �ֻ����� �� �Է¹ޱ�
			int predictSum = predictSum();

			// �ֻ��� ��ȣ �˷��ֱ�
			System.out.println("�ֻ��� �� : " + DiceSumSetting);

			// �ֻ��� ��ȣ ���ϱ�
			coin += processing(DiceSumSetting, predictSum, bettingCoin);
			System.out.println();
		}
	}

	// ������ ���� �� �Է¹ޱ�
	static int bettingCoin(int coin) {
		Scanner scanner = new Scanner(System.in);
		int bettingCoin = 0;

		out: while (true) {
			System.out.print("������ ���� �� : ");
			bettingCoin = scanner.nextInt();

			if (bettingCoin > coin) {
				System.out.println("�ٽ� �Է����ּ���.");
			} else {
				break out;
			}
		}
		return bettingCoin;
	}

	// �� �ֻ����� �� �Է¹ޱ�
	static int predictSum() {
		Scanner scanner = new Scanner(System.in);
		int predictSum = 0;

		out: while (true) {
			System.out.print("���� �ֻ��� �� : ");
			predictSum = scanner.nextInt();

			if (predictSum <= 2 || predictSum >= 12) {
				System.out.println("�ٽ� �Է����ּ���.");
			} else {
				break out;
			}
		}

		return predictSum;
	}

	static int processing(int DiceSumSetting, int ps, int bettingCoin) {
		int result = 0;
		if(DiceSumSetting == ps) {
			if (ps == 3 || ps == 11) 		result = bettingCoin * 18;
			else if (ps == 4 || ps == 10) 	result = bettingCoin * 12;
			else if (ps == 5 || ps == 9) 	result = bettingCoin * 9;
			else if (ps == 6 || ps == 8) 	result = bettingCoin * 7;
			else if (ps == 7) 				result = bettingCoin * 6;
			System.out.println("������ϴ�! ������ "+result+"coin �Դϴ�.");
			return result;
			
		} else {
			System.out.println("�ƽ����ϴ�. ������ ���߱���.");
			return result;
		}
	}
}
