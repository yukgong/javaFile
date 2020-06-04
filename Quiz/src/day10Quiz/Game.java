package day10Quiz;

import java.util.Scanner;

public class Game {
	/*
	 * 3. Game �����
	 * 
	 * - ���� ���� �ޱ� -> 30 ~ 100;
	 * 
	 * - userInput -> 1~15;
	 * 
	 * - random number - user number;
	 * 
	 * - result < 0 = game over �ƽ��ϴ�.
	 */

	// Ŭ���� ����
	int userNum;
	int random;
	int result;
	boolean game;
	int addNum;
	
	public void init() {
		game = true;
		random();
	}

	public void random() {
		random = (int) (Math.random() * 70) + 30;

		// test code
		System.out.println("random : " + random);
	}

	// ���� �Է� �ޱ�
	public void userInput() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			//���� �Է�
			System.out.println("���ڸ� �Է����ּ���. 1~15 :");
			userNum = scanner.nextInt();
			
			//���� ���� üũ
			if (userNum < 1 || userNum > 15) {
				System.out.println("������ ������ϴ�.");
				continue; // 1~15 ���� �̿��� ���� �Է½� ���� �۾�(break)�� �������� �ʵ��� userNum�� �ٽ� �Է¹ޱ�
			}
			break;
		}
	}

	// ó��
	public void processing() {
		while (game) {
			userInput();
			addNum += userNum;
			result = random - addNum;
			resultPrint();
		}
	}

	// ��� ���
	public void resultPrint() {
		if (result <= 0) {
			System.out.println("Game Over!");
			game = false;
		} else {
			System.out.println("���� ������...");
		}
	}
}
