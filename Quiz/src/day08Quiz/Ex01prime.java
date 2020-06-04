package day08Quiz;

import java.util.Scanner;

public class Ex01prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean jungsu = false;
		boolean trueNum = true;

		out: while (true) {
			System.out.println("입력받기 :");
			String input = sc.next();

			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (!('0' <= c && c <= '9')) {
					trueNum = false;

				}
			}

			if (trueNum == false) {
				System.out.println("math error");
				break out;

			} else {
				int strToNum = Integer.parseInt(input);
				for (int i = 2; i < strToNum; i++) {
					if (strToNum % i == 0) {
						jungsu = true;
						System.out.println("정수입니다.");
						break out;
					}
				}
			}

			System.out.println("소수입니다.");
			break out;
		}
	}
}
