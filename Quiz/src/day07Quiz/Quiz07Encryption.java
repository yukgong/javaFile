package day07Quiz;

import java.util.Scanner;

public class Quiz07Encryption {
	public static void main(String[] args) {
		// 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램

		// a b c d e f g h i j k l m n o p q r s t u v w x y z
		// ` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /

		// 0 1 2 3 4 5 6 7 8 9
		// q w e r t y u i o p

		//-----------------------------------------------------
		
		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode =
				{ 	'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
					'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
					'}', ';', ':', ',', '.', '/' };
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		//초기화
		String str;
		String encryption, decryption;
		
		
		//1. 사용자에게 문자열 입력 받기
		str = input();
		
		//2. 입력 받은 문자열을 암호화 하기
		encryption = encryption(str);
		
		//3. 암호화한 문자열 출력하기
		System.out.println("암호화:\t" + encryption);
		System.out.println("원본 :\t" + str);
		
		//4. 암호화한 문자열 복호화하기
		decryption = decryption(encryption);
		
		//5. 복호화한 문자열 출력하기
		System.out.println("복호화:\t" + decryption);
		System.out.println("원본 :\t" + str);
		
		
	}
	
	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화할 문자를 입력하세요 :");
		String input = sc.next();
		
		return input;
	}
	
	//입력 받은 문자열을 암호화 하는 함수
	static String encryption(String str) {
		String arrStr[] = new String[str.length()];
		String strToLock = "";
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		char[] abcCode =
			{ 	'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
				'}', ';', ':', ',', '.', '/' };
		
		String num = "0123456789";
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < str.length(); i++) {
			//문자열에서 i번째 순서에 있는 문자를 c에 대입해준다.
			char c = str.charAt(i);
			
			//c가 숫자면
			if('0' <= c && c <= '9') {
				//num 문자열에서 c에 해당하는 문자가 몇번째 위치인지 n에 대입해준다.
				int n = num.indexOf(c);
				//stringToLock의 문자열에서 
				//c값에 해당하는 문자와 numCode배열의[n]번지에 해당하는 문자와 바꿔준다.
				arrStr[i] = String.valueOf(numCode[n]);
			}
			
			//c가 문자면
			if('a'<= c && c <= 'z') {
				//abc 문자열에서 c에 해당하는 문자가 몇번째 위치인지 n에 대입해준다.
				int n = abc.indexOf(c);
				//stringToLock의 문자열에서 
				//c값에 해당하는 문자와 abcCode배열의[n]번지에 해당하는 문자와 바꿔준다.
				arrStr[i] = String.valueOf(abcCode[n]);
			}
		}
		//배열의 요소를 문자열에 넣어주기
		for (int i = 0; i < arrStr.length; i++) {
			strToLock += arrStr[i];
		}
		
		return strToLock;
	}
	
	//암호화한 문자열 복호화 하기
	static String decryption(String str) {
		String arrStr[] = new String[str.length()];
		String unlock = "";
		char[] numCode = {'0','1','2','3','4','5','6','7','8','9'};
		char[] abcCode =
			{ 	'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z' };
		
		String num = "qwertyuiop";
		String abc = "`~!@#$%^&*()-_+=|[]{};:./";
		
		//문자열을 확인해서 숫자면 numCode 배열의 순서에 맞게 대입해주기
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if('a' <= c && c <= 'z') {
				int n = num.indexOf(c);
				arrStr[i] = String.valueOf(numCode[n]);
			}
			
			if(!('a'<= c && c <= 'z' || '0' <= c && c <= '9')) {
				int n = abc.indexOf(c);
				arrStr[i] = String.valueOf(abcCode[n]);
			}
		}
		
		for (int i = 0; i < arrStr.length; i++) {
			unlock += arrStr[i];
		}

		return unlock;
	}
}
