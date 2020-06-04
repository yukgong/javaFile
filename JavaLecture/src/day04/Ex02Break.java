package day04;

public class Ex02Break {
	public static void main(String[] args) {

		// break
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

		// 예제
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if (i == 4) {
				break;
			}
		}
		System.out.println("탈출 후");
		System.out.println();

//		-----

		char charArr[] = { 'A', 'B', 'C', 'D', 'E' };

		for (int i = 0; i < charArr.length; i++) {
			System.out.println(i + ":" + charArr[i]);
			if (charArr[i] == 'C') {
				System.out.println("C를 찾았습니다.");
				break;
			}
		}

//		-----

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);

			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);

				if (i == 4 && j == 3) {
					break; // break 하나당 순환문 하나만을 탈출한다.
							// 여기서 break를 쓰면 하위 포문에서만 탈출하게 되고
							// 상위 for문에서는 탈출할 수 없게된다.
				}
			}
		}
		System.out.println("-----------------");

		// 1. 탈출방법 : 순환문에 갯수에 맞게 break를 설정

		for (int i = 0; i < 10; i++) {
			boolean boo = false;
			System.out.println("i = " + i);

			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);

				if (i == 4 && j == 3) {
					boo = true;
				}
				if (boo == true) {
					break;
				}
			}
			if (boo == true) {
				break;
			}
		}

		System.out.println("-----------------");

		// 2. 탈출방법 : 키워드를 사용(goto)
		loopout: for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);
				if (i == 4 && j == 3) {
					break loopout;
				}
			}
		}

	}
}
