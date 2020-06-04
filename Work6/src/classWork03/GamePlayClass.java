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
	
	//������
	public GamePlayClass() {
		playGame();
	}
	
	//�ʱ� ����
	public void init() {
		// ���� ����
		coin = 20;
	}
	
	public void diceSetting() {
		// �λ縻
		System.out.println("�ΰ��� �ֻ����� ���� ���纸����.");
		System.out.println("���� ���� : " + this.coin);
		
		DiceSumSetting = dice1.getDice() + dice2.getDice();
		System.out.println("�ֻ��� �� : " + DiceSumSetting);
	}
	
	// ������ ���� �� �Է¹ޱ�
	public void bettingCoin() {
		while (true) {
			System.out.print("������ ���� �� : ");
			bettingCoin = scanner.nextInt();

			if (bettingCoin > coin) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}
		coin -= bettingCoin;
	}
	
	// �� �ֻ����� �� �Է¹ޱ�
	public void predictSum() {
		predictSum = 0;

		while (true) {
			System.out.print("���� �ֻ��� �� : ");
			predictSum = scanner.nextInt();

			if (predictSum <= 2 || predictSum >= 12) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}
	}
	
	// �ֻ��� ��ȣ ���ϱ�
	public void processing() {
		int result = 0;
		if(DiceSumSetting == predictSum) {
			if (predictSum == 3 || predictSum == 11) 		result = bettingCoin * 18;
			else if (predictSum == 4 || predictSum == 10) 	result = bettingCoin * 12;
			else if (predictSum == 5 || predictSum == 9) 	result = bettingCoin * 9;
			else if (predictSum == 6 || predictSum == 8) 	result = bettingCoin * 7;
			else if (predictSum == 7) 						result = bettingCoin * 6;
			System.out.println("������ϴ�! ������ "+result+"coin �Դϴ�.");
			coin += result;
			
		} else {
			System.out.println("�ƽ����ϴ�. ������ ���߱���.");
			coin += result;
		}
	}
	
	public void playGame() {
		init();
		while (coin > 0) {
			// �ֻ��� �����ϱ�
			diceSetting();
			
			// ������ ���� �� �Է¹ޱ�
			bettingCoin();
			
			// �� �ֻ����� �� �Է¹ޱ�
			predictSum();
			
			// �ֻ��� ��ȣ �˷��ֱ�
			System.out.println("�ֻ��� �� : " + DiceSumSetting);
			
			// �ֻ��� ��ȣ ���ϱ�
			processing();
		}
		
		System.out.println("Game Over!");
	}
}
