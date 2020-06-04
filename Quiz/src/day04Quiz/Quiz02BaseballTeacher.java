package day04Quiz;

/*
 * Baseball
 * random number -> 3개
 * user number -> 3개
 * 
 * 비교
 * 메세지 출력 ? Strike ? Ball
 * 
 * Play again
 */
import java.util.Scanner;

public class Quiz02BaseballTeacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 배열 초기화
		int rNum[] = new int[3];
		int uNum[] = new int[3]; // 10개 (1~10) - 0000
		boolean clear = true;

		boolean randomSwitch[] = new boolean[10];

		// 랜덤 숫자 입력받기(중복없이)
		// 중복된 숫자를 받지 않기 위해
		for (int i = 0; i < uNum.length; i++) {
			randomSwitch[i] = false;
		}

		// 로또번호 생성기 원리
		// 만약 제외숫자를 추가할 때
//		randomSwitch[0] = true;
//		randomSwitch[21] = true;

		int r, w;
		w = 0;

		while (w < 3) {
			// randomSwitch의 기본 상태는 false이고, 반복문이 실행되면서 r에 랜덤 숫자가 대입된다.
			r = (int) (Math.random() * 10); // 0~9

			// r에 랜덤 숫자가 대입되었을 때 randomSwitch의 [r]번째의 배열이 false일때 true가 된다.
			// 한번 숫자가 대입되면 randomSwitch[r]은 true가 되므로 중복된 숫자가 대입되지 않는다.
			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				rNum[w] = r + 1; // 1~10
				w++;
			}
		}
		
		for (int i = 0; i < rNum.length; i++) {
			System.out.println(i + "번째 숫자 = " + rNum[i]);
		}

		// Debug != 에러
		// 오류적인 숫자를 잡기 위해 사용하는 것이 디버깅이다.
		// 실시간 디버깅과, break point를 사용해서 디버깅하는 2가지 방법이 있다.

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
					System.out.println((w1 + 1) + "번 째 수 =");
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

			// process(비교)-----------------------------------------------
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
			// 탈출
			if (strike > 2) {
				clear = true;
				break;
			}

			// 메세지 출력
			System.out.println(strike + "스트라이크, " + ball + "볼 입니다.");
			
			w++;
		}
		
		if(clear) {
			System.out.println("Game Clear!");
		}else {
			System.out.println("Game Over~");
		}
	}

}
