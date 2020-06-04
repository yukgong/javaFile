package classWork03;

import java.util.Scanner;

public class GameClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coin = 20;

		Dice d1 = new Dice();
		Dice d2 = new Dice();

		while (coin > 0) { // 코인이 0이되면 게임 종료
			// 인사말
			System.out.println("두개의 주사위의 합을 알아맞춰보세요.");
			System.out.println("남은 코인 : " + coin);

			// 주사위 셋팅하기
			int dice1 = d1.getDice();
			int dice2 = d2.getDice();
			int DiceSumSetting = dice1 + dice2;
			System.out.println("주사위 합 : " + DiceSumSetting);

			// 배팅할 코인 수 입력받기
			int bettingCoin = bettingCoin(coin);
			coin -= bettingCoin; // 배팅한 코인 삭감.

			// 두 주사위의 합 입력받기
			int predictSum = predictSum();

			// 주사위 번호 알려주기
			System.out.println("주사위 합 : " + DiceSumSetting);

			// 주사위 번호 비교하기
			coin += processing(DiceSumSetting, predictSum, bettingCoin);
			System.out.println();
		}
	}

	// 배팅할 코인 수 입력받기
	static int bettingCoin(int coin) {
		Scanner scanner = new Scanner(System.in);
		int bettingCoin = 0;

		out: while (true) {
			System.out.print("배팅할 코인 수 : ");
			bettingCoin = scanner.nextInt();

			if (bettingCoin > coin) {
				System.out.println("다시 입력해주세요.");
			} else {
				break out;
			}
		}
		return bettingCoin;
	}

	// 두 주사위의 합 입력받기
	static int predictSum() {
		Scanner scanner = new Scanner(System.in);
		int predictSum = 0;

		out: while (true) {
			System.out.print("예상 주사위 합 : ");
			predictSum = scanner.nextInt();

			if (predictSum <= 2 || predictSum >= 12) {
				System.out.println("다시 입력해주세요.");
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
			System.out.println("맞췄습니다! 배당금은 "+result+"coin 입니다.");
			return result;
			
		} else {
			System.out.println("아쉽습니다. 맞추지 못했군요.");
			return result;
		}
	}
}
