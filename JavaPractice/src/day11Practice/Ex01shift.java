package day11Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01shift {
	public static void main(String[] args) throws Exception {
		int result;

		// a와 b값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		//입력 받은 글자를 공백을 기준으로 잘라서 splitNum배열에 넣어주기
		String splitNum[] = input.split(" ");
		
		//splitNum배열의 내용을 a와 b에 대입하기
		String a = splitNum[0];
		String b = splitNum[1];
		
		//문자열로 되어있는 a와 b를 숫자로 바꾸기
		int aNum = Integer.parseInt(a);
		int bNum = Integer.parseInt(b);

		// a >> b =?
		result = aNum >> bNum;
		System.out.println(result);

		// a << b =?
		result = aNum << bNum;
		System.out.println(result);

		// ------------------------------

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//
//		// 입력값을 숫자로 바꾸기
//		int x = Integer.parseInt(input);
//
//		// 입력 받은 숫자의 약수 구하기
//		for (int i = 1; i <= x; i++) {
//			int result = x % i;
//			if (result == 0) {// 입력 받은 숫자를 나눌 수 있는 수는 모두 약수 -> 나눴을 때 0이 되는 숫자를 구한다.
//				System.out.print(i+" ");
//			}
//		}
//	}
	}
}