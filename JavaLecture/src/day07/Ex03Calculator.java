package day07;

import java.util.Scanner;

public class Ex03Calculator {
	public static void main(String[] args) {
		// 계산기
		
		//초기화
		int num1, num2;
		String operator;
		int result = 0;
		String strNum1, strNum2;

//		-------------------------------------

		// TODO : 입력
		strNum1 = numberInput("첫번째 수 = ");
		// strNum1은 numberInput의 리턴 값인 strNum의 값을 가진다.

		// 연산자
		operator = checkOperator();
		// operator는 checkOperator의 리턴값인 operator의 값을 가진다.

		// 두번째 수
		strNum2 = numberInput("두번째 수 = ");
		// strNum2는 numberInput의 리턴 값인 strNum의 값을 가진다.

		// 문자열 -> 숫자
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);

//		----------------------------------

		// TODO : 계산
		result = calcProcess(operator, num1, num2);
		// result는 calcProcess의 리턴 값인 r의 값을 가진다.

//		----------------------------------

		// TODO : 결과
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

//	---------------function-------------------

	// function : 연산자(+, -, *, /)를 제대로 입력했는지 확인하는 함수
	// return : +, -, *, /
	static String checkOperator() {
		Scanner sc = new Scanner(System.in);
		String operator;
		
		while (true) {
			// 유저한테 연산자 입력받기
			System.out.print("+, -, *, / = ");
			operator = sc.next();

			// 연산자를 제대로 입력하지 않았을 경우
			if (!(operator.equals("+") 
					|| operator.equals("-") 
					|| operator.equals("*") 
					|| operator.equals("/"))) {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			break;
		}
		return operator;
	}

	// function : 숫자를 입력받고 문자열에 숫자가 아닌 것을 입력했을 경우 메세지를 출력하는 함수
	// return : strNum = 숫자
	static String numberInput(String msg) {
		Scanner sc = new Scanner(System.in);
		String strNum;
		// 순환문 실행
		while (true) {
			// 메소드의 매개변수자리에 문구를 넣어주면 출력문에 msg값을 대입 받아 메세지를 출력해준다.
			System.out.print(msg);
			// numberInput이 실행되면서 사용자에게 숫자를 입력받아 strNum에 저장한다.
			strNum = sc.next();
			// checkTrueNumber 메소드를 실행한다.
			// 실행한 checkTrueNumber의 매개변수에 strNum값을 대입한다.
			// strNum을 대입해 checkTrueNumber메소드의 trueNum값을 확인한다.
			// 확인한 trueNum의 값이 false라면 아래 조건문이 실행된다.
			if (checkTrueNumber(strNum) == false) {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			break;
		}
		// 저장한 strNum값을 리턴해준다.
		return strNum;
	}

	// function : 계산
	// 매개변수 operator, num1, num2 위치에 맞게 인자 값을 가져온다.
	// 인자값을 대입해 계산식을 처리하고 나온 결과값인 r을 리턴해준다.
	// return : num1과 num2를 연산한 결과값 ex) 1 * 1 = 1에서 '1'
	static int calcProcess(String operator, int num1, int num2) {
		int r = 0;
		switch (operator) {
		case "+":
			r = num1 + num2;
			break;

		case "-":
			r = num1 - num2;
			break;

		case "*":
			r = num1 * num2;
			break;

		case "/":
			r = num1 / num2;
			break;
		}
		return r;
	}

	// function : 문자열 중에서 숫자를 판별하는 함수
	// strNum값을 확인한다. strNum의 참/거짓값을 확인해서 trueNum의 값을 리턴(출력)해준다.
	// return: true(숫자가 아님), false(모두 숫자)
	static boolean checkTrueNumber(String strNum) {
		boolean trueNum = true;
		for (int i = 0; i < strNum.length(); i++) {
			char c = strNum.charAt(i);
			if (!('0' <= c && c <= '9')) {
				trueNum = false;
				break;
			}
		}

		return trueNum;
	}
}
