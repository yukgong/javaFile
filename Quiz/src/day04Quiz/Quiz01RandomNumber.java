package day04Quiz;

import java.util.Scanner;

public class Quiz01RandomNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1~100까지 범위의 랜덤 숫자 스무고개
		
		//초기화
		boolean exit = true;
		
		//전체 게임 반복하기
		while (exit == true) {

			// 1~100까지 범위의 숫자 발생하기
			int correctAnswer = (int) ((Math.random() * 100)+1);

			// 숫자 맞추라고하기, 숫자 입력받기
			System.out.println("꒰◍ˊ◡ˋ꒱안녕하세요!");
			System.out.println("제가 생각하고 있는 숫자 하나를 맞춰볼래요?");
			System.out.println("숫자 입력 (1~100까지 범위) >");
			int userNum = scanner.nextInt();
			
			//----------------------
			
			// 입력 받은 숫자가 맞는지 10번 이내로 확인하기
			int count = 1;
			while (count < 10) {
				//correctAnswer와 userNum가 일치할 때
				if (userNum <= 100 && userNum > 0 && correctAnswer == userNum) {
					System.out.println("정답입니다!✧*.◟(ˊᗨˋ)◞.*✧");
					break;
				} 
				//correctAnswer보다 userNum가 작을 때
				else if (userNum <= 100 && userNum > 0 && correctAnswer > userNum) {
					System.out.println("제가 생각하는 수보다 작네요.");
					System.out.println((10 - count) + "번 남았습니다.");
					System.out.println("숫자 입력 (1~100까지 범위) >");
					userNum = scanner.nextInt();
				} 
				//correctAnswer보다 userNum가 클 때
				else if (userNum <= 100 && userNum > 0 && correctAnswer < userNum) {
					System.out.println("제가 생각하는 수보다 크네요.");
					System.out.println((10 - count) + "번 남았습니다.");
					System.out.println("숫자 입력 (1~100까지 범위) >");
					userNum = scanner.nextInt();
				} 
				//입력한 숫자가 1~100의 범위를 벗어날 때
				else {
					while (userNum > 100 || userNum < 0) {
						System.out.println("잘못입력했습니다.");
						System.out.println("숫자 입력 (1~100까지 범위) >");
						userNum = scanner.nextInt();
					}
				}
				count++;
			}
			
			//----------------------
			
			// 10번 이내로 숫자를 맞추지 못했을 때
			if (count == 10) {
				System.out.println("맞추지 못했네요.");
			}
			
			//----------------------

			// 끝나면 다시할건지 물어보기
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

			if (again.equals("Y")) {
				exit = true;
			} else if (again.equals("N")) {
				exit = false;
				System.out.println("종료되었습니다. 이용해주셔서 감사합니다.");
			}

		}
	}

}
