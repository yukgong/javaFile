package day02;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = 0;
		System.out.println(number > 0);
		// output -> false

		System.out.println(number > 0 && number < 0);
		// 둘다 참일때만 true가 나오기 때문에 output -> false

		System.out.println(number > 0 || number < 0);
		// 둘다 참일때만 true가 나오기 때문에 output -> false

		number = 5;
		System.out.println(number == 5);
		// output -> true : number는 0과 같다는 참이므로 true
		System.out.println(number != 5);
		// output -> false : number는 0과 같지 않다는 거짓이므로 false
		
		System.out.println(number > 5 && number < 10);
		// output -> false : number는 5보다 크고 10보다 작다는 거짓이므로 false
		System.out.println(!(number > 5 && number < 10));
		// output -> false : number는 5보다 크고 10보다 작다는 거짓이지만, not으로 뒤집어 true
		// NOT 논리 연산자를 사용할때는 괄호 안의 값을 먼저 살피고 해당 값의 논리 결과를 뒤집을때 사용한다.
		
//		-----
//		삼항 연산자
		char c;
		
		c = (number > 0)? 'Y' : 'N';
		System.out.println("c = " + c);
		
		int n;
		n = (number < 5)? 10 : 20;
		System.out.println("n = " + n);
		
		String str;
		str = (number > 3)? "3보다 크다" : "3보다 작다";
		System.out.println("str = " + str);
		
	}
}
