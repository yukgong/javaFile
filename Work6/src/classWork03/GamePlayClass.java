package classWork03;

import java.util.Scanner;

public class GamePlayClass {
	Scanner scanner = new Scanner(System.in);
	private int coin;
	private int DiceSumSetting;
	private int bettingCoin;
	private int predictSum;
	
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	
	//생성자
	public GamePlayClass() {
		playGame();
	}
	
	//초기 셋팅
	public void init() {
		// 코인 셋팅
		coin = 20;
	}
	
	public void diceSetting() {
		// 인사말
		System.out.println("두개의 주사위의 합을 맞춰보세요.");
		System.out.println("남은 코인 : " + this.coin);
		
		DiceSumSetting = dice1.getDice() + dice2.getDice();
		System.out.println("주사위 합 : " + DiceSumSetting);
	}
	
	// 배팅할 코인 수 입력받기
	public void bettingCoin() {
		while (true) {
			System.out.print("배팅할 코인 수 : ");
			bettingCoin = scanner.nextInt();

			if (bettingCoin > coin) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			break;
		}
		coin -= bettingCoin;
	}
	
	// 두 주사위의 합 입력받기
	public void predictSum() {
		predictSum = 0;

		while (true) {
			System.out.print("예상 주사위 합 : ");
			predictSum = scanner.nextInt();

			if (predictSum <= 2 || predictSum >= 12) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			break;
		}
	}
	
	// 주사위 번호 비교하기
	public void processing() {
		int result = 0;
		if(DiceSumSetting == predictSum) {
			if (predictSum == 3 || predictSum == 11) 		result = bettingCoin * 18;
			else if (predictSum == 4 || predictSum == 10) 	result = bettingCoin * 12;
			else if (predictSum == 5 || predictSum == 9) 	result = bettingCoin * 9;
			else if (predictSum == 6 || predictSum == 8) 	result = bettingCoin * 7;
			else if (predictSum == 7) 						result = bettingCoin * 6;
			System.out.println("맞췄습니다! 배당금은 "+result+"coin 입니다.");
			coin += result;
			
		} else {
			System.out.println("아쉽습니다. 맞추지 못했군요.");
			coin += result;
		}
	}
	
	public void playGame() {
		init();
		while (coin > 0) {
			// 주사위 셋팅하기
			diceSetting();
			
			// 배팅할 코인 수 입력받기
			bettingCoin();
			
			// 두 주사위의 합 입력받기
			predictSum();
			
			// 주사위 번호 알려주기
			System.out.println("주사위 합 : " + DiceSumSetting);
			
			// 주사위 번호 비교하기
			processing();
		}
		
		System.out.println("Game Over!");
	}
}
