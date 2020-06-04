package day07Quiz;

import java.util.Scanner;

public class Quiz07Encryption_teacher {
	public static void main(String[] args) {
		// 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램

		// a b c d e f g h i j k l m n o p q r s t u v w x y z
		// ` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /

		// 0 1 2 3 4 5 6 7 8 9
		// q w e r t y u i o p

		// -----------------------------------------------------

		// 초기화
		String str;
		String encryption, decryption;

		// 1. 사용자에게 문자열 입력 받기
		str = input();

		// 2. 입력 받은 문자열을 암호화 하기
		encryption = encryption(str);

		// 3. 암호화한 문자열 출력하기
		System.out.println("암호화:\t" + encryption);

		// 4. 암호화한 문자열 복호화하기
		decryption = decryption(encryption);
		// 5. 복호화한 문자열 출력하기
		System.out.println("복호화:\t" + decryption);


	}
	
	//----------------------------------------------------

	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화할 문자를 입력하세요 :");
		String input = sc.next();

		return input;
	}

	// 입력 받은 문자열을 암호화 하는 함수
	static String encryption(String str) {
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		
		String resultCode = "";


		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int n = (int) ch;

			// 알파벳의 경우
			if (n >= 97 && n <= 122) {
				n = n - 97; // 97 == 0;
				resultCode = resultCode + abcCode[n];
			}

			// 숫자의 경우
			if (n >= 48 && n <= 57) {
				n = n - 48; // 48 == 0;
				resultCode = resultCode + numCode[n];
			}
		}
		return resultCode;
	}

	// 암호화한 문자열 복호화 하기
	static String decryption(String str) {
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		
		String baseCode = "";
		
		for (int i = 0; i < str.length(); i++) {
			//입력 받은 문자중 i번째의 문자가 ch의 값이 된다.
			char ch = str.charAt(i);
			
			//ch의 유니코드 숫자가 n의 값이 된다.
			int n = (int)ch;
			
			int index = 0;
			
			//만약 입력 받은 암호화된 문자가 알파벳이면
			if(n >= 97 && n <= 122) {
				for (int j = 0; j < numCode.length; j++) { // numCode배열의 길이만큼 반복문이 실행된다.
					if(ch == numCode[j]) { 				   // ch의 값인 문자와 numCode[j]번째 값인 문자와 같다면
						index = j; 						   // index는 j값이 된다.
						break;							   // 찾았으면 반복문은 종료된다.
					}
				}
				index = index + 48; 					   // index
				baseCode = baseCode + (char)index;
			} 
		
			else {				  // 암화화된 알파벳
				for (int j = 0; j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				baseCode = baseCode + (char)index;
			}
		}
		
		return baseCode;
	}

}
