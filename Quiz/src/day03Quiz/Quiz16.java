package day03Quiz;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		// 스캔 사용
		Scanner scanner = new Scanner(System.in);

		// 숫자 입력 받기
		System.out.println("출력하고 싶은 구구단은 몇 단 인가요? : ");
		int userNumber = scanner.nextInt();

		// 구구단 출력
		for (int i = 1; i <= 9; i++) { // 1부터 9까지 범위로 반복

			// 아래 코드로 돌려도 틀리진 않았지만 비효율적이다.
			// 출력문 안으로 바로 대입해서 연산이 가능하다.
//			int first = userNumber; 
//			int second = i;
//			int third = userNumber * i;
//			System.out.println(first + "X" + second + "=" + third);

			// printing
			System.out.println(userNumber + "X" + i + "=" + (userNumber * i));
		}

		scanner.close();
	}
}
