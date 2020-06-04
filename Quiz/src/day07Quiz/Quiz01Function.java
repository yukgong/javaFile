package day07Quiz;

import java.util.Scanner;

public class Quiz01Function {
	public static void main(String[] args) {
		// 1. 두수를 나눈 몫, 나머지를 구하는 함수
		// num1, num2
		// value(몫), tag(나머지)

		// 초기화
		int num1, num2, value, tag;
		int tagArr[] = new int[1];
		int result1 = 0;

		// 두개의 숫자 입력 받기
		num1 = inputNumber("첫번째 수 = ");
		num2 = inputNumber("두번째 수 = ");


		// 입력 받은 수의 몫과 나머지를 구하기
		// 방법1
		value = division(num1, num2);
		tag = remainder(num1, num2);
		
		// 방법2
		result1 = div(num1, num2, tagArr);

		// 결과 출력하기
		// 방법1
		System.out.println("몫 : " + value + " 나머지 : " + tag);

		// 방법2
		System.out.println("\n몫 : " + result1 + " 나머지 = " + tagArr[0] + "\n");
		
		//num1,2는 값에 의한 할당이 되어 함수 안에서 인자의 값이 변경되어도, 외부의 변수의 값은 변경되지 않는다.
		System.out.println(num1);
		System.out.println(num2);
		
		// tagArr에는 참조에 의한 할당이 되었기 때문에  함수 안에서 인자값이 변경되어 
		// 인자를 전달한 객체의 값도 변경
		System.out.println(tagArr[0]); 

		// -----------------------

		// 2. toUpperCase를 만들기
		// 문자열을 넘겨주면 대문자로 변경해서 리턴하기

		// 초기화
		String str, result;

		// 문자열 입력하기
		str = inputString("문자를 입력해주세요 :");

		// 입력한 문자를 대문자로 바꿔주기
		result = toUpperCase(str);

		// 결과 출력하기
		System.out.println("원본 : " + str);
		System.out.println("변환 : " + result);
	}

	// 1번 메서드-----------------------------------------

	// 숫자를 입력 받는 함수
	static int inputNumber(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();

		return num;
	}

	// 입력 받은 수끼리 나누는 함수
	static int division(int num1, int num2) {
		int result = num1 / num2;

		return result;
	}

	// 입력 받은 수끼리의 나머지를 구하는 함수
	static int remainder(int num1, int num2) {
		int result = num1 % num2;

		return result;
	}

	// ---------------------------------
	// call by reference(참조에 의한 호출)로 몫과 나머지를 구하는 방법
	static int div(int n1, int n2, int t[]) {
		int v = 0;
		v = n1 / n2;
		t[0] = n1 % n2;

		return v;
	}

	// 2번 메서드-----------------------------------------

	// 문자 입력 받는 함수
	static String inputString(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String str = sc.next();

		return str;
	}

	// 소문자를 대문자로 바꿔주기
	static String toUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z') {
				int change = (int) c - 32; // ASCII 코드값을 변경해 소문자에서 대문자로 바꿔준다.
				result = result + (char) change; // result 변수안에
			} else {
				result = result + c;
			}
		}

		return result;
	}
}
