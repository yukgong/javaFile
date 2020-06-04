package day08;

import java.util.Scanner;

public class Ex03BaseballFunc {
	public static void main(String[] args) {
		// 초기화
		int rNum[] = new int[3];
		int uNum[] = new int[3]; // 10개 (1~10) - 0000
		boolean clear = false;

		// 1. random
		random(rNum);
		// ---------------------

		int w = 0;
		while (w < 10) {
			// 2. userinput
			userInput(uNum);

			// 3. find
			clear = process(rNum, uNum);

			if (clear == true) {
				break;
			}
			w++;
		}

		// 5. result
		resultPrint(clear);
	}

	// 랜덤 숫자 만들기
	static void random(int rNum[]) {
		// 숫자 맞추라고하기
		System.out.println("안녕하세요! 베이스볼 게임입니다.");
		System.out.println("3회전 게임의 점수를 맞춰 3스트라이크 아웃을 받으면 이기는 게임입니다.");

		// 랜덤 숫자 판별기
		boolean randomSwitch[] = new boolean[10];
		for (int i = 0; i < randomSwitch.length; i++) {
			randomSwitch[i] = false;
		}

		// 랜덤 숫자 생성하기(중복없이)
		int r, w;
		w = 0;
		while (w < 3) {
			r = (int) (Math.random() * 10); // 0~9
			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				rNum[w] = r + 1; // 1~10
				w++;
			}
		}

		// 테스트용 메세지
		for (int i = 0; i < rNum.length; i++) {
			System.out.println(i + "번째 숫자 = " + rNum[i]);
		}
	}

	// 사용자에게 숫자 받기
	static void userInput(int uNum[]) {
		Scanner scanner = new Scanner(System.in);

		int w = 0;
		boolean check;
		int w1;
		while (true) {
			check = false;
			w1 = 0;
			while (w1 < 3) {
				System.out.print((w1 + 1) + "번 째 수 =");
				uNum[w1] = scanner.nextInt();
				w1++;
			}
			// 같은 숫자가 있는지 체크
			out: for (int i = 0; i < uNum.length; i++) {
				for (int j = 0; j < uNum.length; j++) {
					if (uNum[i] == uNum[j] && i != j) {
						check = true; // 입력한 같은 숫자가 있음
						break out;
					}
				}
			}
			if (check == false) {
				break;
			}
			System.out.println("입력한 숫자 중에 중복되는 숫자가 잇습니다. 다시 입력해 주십시오");
		}
	}

	static boolean process(int rNum[], int uNum[]) {
		int strike, ball;
		strike = ball = 0;
//		boolean clear = false;

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
		// 탈출
		if (strike > 2) {
			return true;
		}

		// 메세지 출력
		System.out.println(strike + "스트라이크, " + ball + "볼 입니다.");

		return false;
	}
	
	static void resultPrint(boolean clear) {
		if (clear) {
			System.out.println("Game Clear!");
		} else {
			System.out.println("Game Over~");
		}
	}

}
