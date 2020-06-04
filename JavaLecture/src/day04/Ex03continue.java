package day04;

import java.util.Scanner;

public class Ex03continue {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//			System.out.println("for start");
//			if (i < 5) {
//				continue;
//			}
//			System.out.println("for end"); // i가 5보다 작을때까지 생략된다.
//		}

//		----------------------------

		// 스캔사용
		Scanner sc = new Scanner(System.in);

		// 선언
		int numArr[] = new int[3];
		int n;

		// 처리
		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i + 1) + "번째 수 : ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("음수입니다.");
				continue; // 음수는 배열에 저장하지 않고 스킵한다.
			}
			numArr[i] = n;
		}

		// 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}

//		-----

		int w = 0;
		int arrNum[] = new int [3];
		while (w < 3) {
			System.out.println((w+1)+"번째 수 =");
			n = sc.nextInt();
			
			if(n < 0) {
				System.out.println("음수입니다.");
				continue;
			}
			
			//입력 받은 숫자 배열에 저장하기
			arrNum[w] = n;
			w++;
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}
	}
}
