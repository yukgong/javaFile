package day10Quiz;

import java.util.Scanner;

public class Game {
	/*
	 * 3. Game 만들기
	 * 
	 * - 랜덤 숫자 받기 -> 30 ~ 100;
	 * 
	 * - userInput -> 1~15;
	 * 
	 * - random number - user number;
	 * 
	 * - result < 0 = game over 됐습니다.
	 */

	// 클래스 변수
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

	// 숫자 입력 받기
	public void userInput() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			//숫자 입력
			System.out.println("숫자를 입력해주세요. 1~15 :");
			userNum = scanner.nextInt();
			
			//숫자 범위 체크
			if (userNum < 1 || userNum > 15) {
				System.out.println("범위를 벗어났습니다.");
				continue; // 1~15 범위 이외의 숫자 입력시 다음 작업(break)를 실행하지 않도록 userNum값 다시 입력받기
			}
			break;
		}
	}

	// 처리
	public void processing() {
		while (game) {
			userInput();
			addNum += userNum;
			result = random - addNum;
			resultPrint();
		}
	}

	// 결과 출력
	public void resultPrint() {
		if (result <= 0) {
			System.out.println("Game Over!");
			game = false;
		} else {
			System.out.println("운이 좋군요...");
		}
	}
}
