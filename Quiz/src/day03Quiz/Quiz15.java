package day03Quiz;

public class Quiz15 {
	public static void main(String[] args) {
		// 구구단을 1단부터 9단까지 출력하는 프로그램

		// 1단에서 9단까지 반복하기
		for (int i = 1; i < 10; i++) {

			System.out.println("----" + i + "단" + "----");
			System.out.println();

			// n단 안에서 구구단 반복하기
			for (int j = 1; j < 10; j++) {

				// printing
				System.out.println(i + "X" + j + "=" + (i * j));
			}

			// 개행
			System.out.println();
		}
	}
}
