package day07Quiz;

public class Quiz05IsNumber_teacher {
	public static void main(String[] args) {
		// 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다.
		// 모두 숫자로만 이루어져 있으면 true
		// 숫자로만 이루어져 있지 않으면 false
		// 주어진 문자열이 null이거나 빈 문자열 ""이라면 false를 반환한다.
		// 반환타입 : boolean
		// 매개변수 : String str - 검사할 문자열

		// [Hint] String 클래스의 charAt(int i)메소드를 사용하면
		// 문자열의 i번째 위치한 문자를 얻을 수 있다.

		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	static boolean isNumber(String str) {
		//문자열 확인하기
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) {
				return false; //  return을 만나면 아래 문장을 무시하고  함수가 종료 된다.
			}
		}
		return true;
	}
}
