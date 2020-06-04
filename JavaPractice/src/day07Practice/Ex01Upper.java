package day07Practice;

import java.util.Scanner;

public class Ex01Upper {
	public static void main(String[] args) {
		// 문자열을 넘겨주면 대문자로 변경해서 리턴하기
		
		// 초기화
		String str, result;
		
		// 문자열 입력하기
		str = inputNum();
		
		// 입력한 문자를 대문자로 바꿔주기
		result = upper(str);
		
		// 결과 출력하기
		System.out.println(result);
		
	}
	//--------------function----------------
	
	// 문자 입력 받는 함수
	static String inputNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 소문자를 입력하세요 :");
		String str = sc.next();
		
		return str;
	}
	
	// 소문자를 대문자로 바꿔주기
	static String upper(String str) {
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if('a' <= c && c <= 'z') {
				int stringToUpper = (int) c -32;
				result += (char)stringToUpper; 
			} else {
				result = result + c;
			}
		}
		return result;
	}
}
