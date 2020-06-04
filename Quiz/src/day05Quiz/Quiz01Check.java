package day05Quiz;

import java.util.Scanner;

public class Quiz01Check {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 1번 문제 입력 : 모두 숫자로 되어 있는지 확인 -> String "12345" "123e5" 모두 숫자로 되어 있으면,
		 * "숫자로 되어 있습니다." -> 숫자로 변환 "숫자로 되어 있지 않습니다."
		 * 
		 * -> ASCII 사용
		 */

		// 초기화
		System.out.println("아무 알파벳이나 숫자를 써보세요 >");
		String str1 = scanner.next();

		// 문자열이 모두 숫자로 되어 있는지 확인하기
		boolean trueText = false;

		for (int j = 0; j < str1.length(); j++) {
			char ch = str1.charAt(j);
			if (!('0' <= ch && ch <= '9')) {
				trueText = true;
				break; // 숫자가 아닌 것을 찾으면 반복문 종료
			}
		}

		// 메세지 출력하기
		if (trueText == false) { // ch[j]가 숫자로 되어 있으면
			// 문자열을 숫자로 변환하기
			int stringToNum = Integer.parseInt(str1);
			System.out.println(stringToNum + "는 숫자로 되어 있습니다.");

		} else if (trueText == true) { // ch[j]에 문자가 있으면
			System.out.println(str1 + "는 숫자로 되어 있지 않습니다.");
		}

		// --------------------------

		/*
		 * 2번 문제 입력 : 정수, 실수를 판별할 코드를 작성 -> String "123.456" "123456" 실수면 실수입니다. 정수면
		 * 정수입니다.
		 * 
		 * -> '.'이 포함되는지 확인하기
		 */

		// init
		System.out.println("정수난 실수를 입력하세요 >");
		String str2 = scanner.next();
		char ch2[] = new char[str2.length()];

		// 문자열의 한 단어씩을 char 배열에 담기
		for (int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}

		// 문자열이 모두 숫자로 되어 있는지 확인하기
		boolean trueNum = true;
		for (int j = 0; j < ch2.length; j++) {
			if (ch2[j] == '.') {
				trueNum = false;
				break;
			}
		}

		// 메세지 출력하기
		if (trueNum == false) {
			// 문자열을 실수로 바꾸기
			double stringToDouble = Double.parseDouble(str2);
			System.out.println(stringToDouble + "는 실수입니다.");

		} else if (trueNum == true) {
			int stringToNum = Integer.parseInt(str2);
			System.out.println(stringToNum + "는 정수입니다.");
		}

		// ----------------

		// 대문자로 입력 -> 소문자로 변환해서 출력 되도록...
		// toLowerCase 사용하지 말고 구현!
		// ABC -> abc

		System.out.println("알파벳 대문자를 입력하세요 >");
		String upper = scanner.next();
		String result = "";

		// 스트링 글자를 하나씩 char 배열에 담기
		for (int i = 0; i < ch2.length; i++) {
			char c = upper.charAt(i);
			if ((int) c >= 65 && (int) c <= 90) {
				int n = (int) c + 32;
				result = result + (char) n;
			} else {
				result = result + c;
			}
		}
		
		System.out.println("원본 문자 = " + upper);
		System.out.println("바꾼 문자 = " + result);

	}
}
