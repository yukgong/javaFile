package day04Quiz;

import java.util.Scanner;

public class Quiz02Baseball {
	// 야구 점수 맞추기
	// 랜덤 숫자 3가지 받기
	// 랜덤 숫자 세가지는 서로 달라야한다. = 중복 제거
	// 유저에게 숫자 3개를 받는다.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 선언
		int strike = 0;
		int ball = 0;
		int arrSize = 3;
		boolean exit = true;

		while (exit == true) {
			// 숫자 맞추라고하기
			System.out.println("안녕하세요! 베이스볼 게임입니다.");
			System.out.println("3회전 게임의 점수를 맞춰 3스트라이크 아웃을 받으면 이기는 게임입니다.");

			// 배열 생성
			int arrGame[] = new int[arrSize];
			int arrAnswer[] = new int[arrSize];

			// 랜덤 숫자 생성 및 배열에 넣기
			for (int i = 0; i < arrGame.length; i++) {
				int random = (int) ((Math.random() * 10)+1);
				arrGame[i] = random;
				// 중복 없애기
				for (int j = 0; j < i; j++) {
					if (arrGame[i] == arrGame[j]) {
//						System.out.println("중복입니다.");
						i--;
					}
				}
			}
			// 배열 내용 확인하기
			for (int i = 0; i < arrGame.length; i++) {
				System.out.println("arr[" + i + "] = " + arrGame[i]);
			}

			int count = 1;
			// 입력 받은 숫자가 맞는지 확인하기
			while (count < 10) {
				// 숫자 입력받기
				for (int i = 0; i < arrGame.length; i++) {
					System.out.println((i + 1) + "회전 점수는? (1~10까지 범위) >");
					int userNum = scanner.nextInt();
					if (userNum <= 10 && userNum > 0) {
						arrAnswer[i] = userNum;
					} else {
						while (userNum > 10 || userNum < 0) {
							System.out.println("잘못입력했습니다.");
							System.out.println((i + 1) + "회전 점수는? (1~10까지 범위) >");
							userNum = scanner.nextInt();
						}
					}

				}

				// 같은 자리 게임 점수와 내점수 비교하기
				for (int i = 0; i < arrAnswer.length; i++) {
					if (arrAnswer[i] == arrGame[i]) {
						strike += 1;
					}
					for (int j = 0; j < arrAnswer.length; j++) {

						if (arrAnswer[i] == arrGame[j]) {
							if (arrAnswer[i] != arrGame[i]) {
								ball += 1;
							}
						}
					}
				}

				// 점수 출력하기
				System.out.println(strike + "스트라이크, " + ball + "볼 입니다.");

				if (strike == 3) {
					System.out.println("게임을 모두 맞췄습니다. 승리!!!!!!!!");
					break;
				}
				System.out.println((10 - count) + "번 남았습니다.");
				
				//초기화
				strike = 0;
				ball = 0;
				count++;
			}

			if (count == 10) {
				System.out.println("저런.. 맞추지 못했네요.");
			}

//		-------------------

			// 다시할건지 물어보기
			System.out.println("다시 해보시겠어요?(Y/N)");
			String again = scanner.next();
			again = again.toUpperCase();

			// 잘못입력했으면 다시입력하라하기
			while (!(again.equals("Y") || again.equals("N"))) {
				System.out.println("잘못입력했습니다.");
				System.out.println("다시 해보시겠어요?(Y/N)");
				again = scanner.next();
				again = again.toUpperCase();
			}
			// Y를 누르면 다시 시작, N를 누르면 종료
			if (again.equals("Y")) {
				exit = true;
			} else if (again.equals("N")) {
				exit = false;
				System.out.println("종료되었습니다. 이용해주셔서 감사합니다.");
			}
		}
	}
}