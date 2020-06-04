package day06;

import java.util.Scanner;

/*
 * 0. 숫자입력 >> 메뉴 번호
 * 1. 10진수를 2진수로 변환해서 출력
 * 2. 2진수를 10진수로 변환해서 출력
 * 3. 10진수를 16진수로 변환해서 출력
 * 4. 16진수를 10진수로 변환해서 출력
 * 5. 2진수를 16진수로 변환해서 출력
 * 6. 16진수를 2진수로 변환해서 출력
 * 7. 종료
 */

public class Ex02MenuNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			// 1. 메뉴 번호 선택하기 //////////////////////////////
			System.out.println("메뉴 번호를 선택해주세요.---------");
			System.out.println("1. 10진수를 2진수로 변환해서 출력");
			System.out.println("2. 2진수를 10진수로 변환해서 출력");
			System.out.println("3. 10진수를 16진수로 변환해서 출력");
			System.out.println("4. 16진수를 10진수로 변환해서 출력");
			System.out.println("5. 2진수를 16진수로 변환해서 출력");
			System.out.println("6. 16진수를 2진수로 변환해서 출력");
			System.out.println("7. 종료");
			System.out.println("------------------------");
			int count = scanner.nextInt();

			// 2. 선택한 메뉴 작동하기 //////////////////////////////

			// 10진수 -> 2진수 -> (string -> int -> string)
			if (count == 1) {
				System.out.println("10진수 -> 2진수");

				// 숫자입력
				System.out.print("숫자를 입력해주세요 >");
				String num = scanner.next();
				System.out.println();
				
				//변환
				String binaryString = Integer.toBinaryString(Integer.parseInt(num));
				System.out.println("입력한 수 = \t" + num);
				System.out.println("2진수 = \t" + binaryString);
				System.out.println();
				continue;
			}

			// 2진수 -> 10진수 (string -> int)
			if (count == 2) {
				while (true) {
					// 숫자입력
					System.out.print("숫자를 입력해주세요 >");
					String num = scanner.next();
					System.out.println();
					
					//잘못입력했을때
					boolean trueBinary = true;
					for (int i = 0; i < num.length(); i++) {
						char c = num.charAt(i);
						if (!('0' <= c && c <= '1')) {
							trueBinary = false;
							break;
						}
					}

					if (trueBinary == false) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
						continue;
					}
					
					//변환
					System.out.println("2진수 -> 10진수");
					int binaryToDecimal = Integer.parseInt(num, 2);
					System.out.println("입력한 수 = \t" + num);
					System.out.println("10진수 = \t" + binaryToDecimal);
					System.out.println();
					continue;
				}
			}

			// 10진수 -> 16진수 (string -> int -> string)
			if (count == 3) {
				// 숫자입력
				System.out.print("숫자를 입력해주세요 >");
				String num = scanner.next();
				System.out.println();
				
				//변환
				System.out.println("10진수 -> 16진수");
				String hexString = Integer.toHexString(Integer.parseInt(num));
				System.out.println("입력한 수 = \t" + num);
				System.out.println("16진수 = \t" + hexString);
				System.out.println();
				continue;
			}

			// 16진수 -> 10진수 (string -> int)
			if (count == 4) {
				// 숫자입력
				System.out.print("숫자를 입력해주세요 >");
				String num = scanner.next();
				System.out.println();
				
				//변환
				System.out.println("16진수 -> 10진수");
				int binaryToHex = Integer.parseInt(num, 16);
				System.out.println("입력한 수 = \t" + num);
				System.out.println("10진수 = \t" + binaryToHex);
				System.out.println();
				continue;
			}

			// 2진수 -> 16진수 (2 -> 10 -> 16)
			if (count == 5) {
				// 숫자입력
				System.out.print("숫자를 입력해주세요 >");
				String num = scanner.next();
				System.out.println();
				
				//변환
				System.out.println("2진수 -> 16진수");
				int binaryToDecimal = Integer.parseInt(num, 2);
				String binaryToHex = Integer.toHexString(binaryToDecimal);
				System.out.println("입력한 수 = \t" + num);
				System.out.println("16진수 = \t" + binaryToHex);
				System.out.println();
				continue;
			}

			// 16진수 -> 2진수 (16 -> 10 -> 2)
			if (count == 6) {
				// 숫자입력
				System.out.print("숫자를 입력해주세요 >");
				String num = scanner.next();
				System.out.println();
				
				//변환
				System.out.println("16진수 -> 2진수");
				int binaryToHex = Integer.parseInt(num, 16);
				String hexToBinary = Integer.toBinaryString(binaryToHex);
				System.out.println("입력한 수 = \t" + num);
				System.out.println("2진수 = \t" + hexToBinary);
				System.out.println();
				continue;
			}

			if (count == 7) {
				break;
			}
		}

	}
}
