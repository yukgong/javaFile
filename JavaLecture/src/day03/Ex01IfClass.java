package day03;

public class Ex01IfClass {
	public static void main(String[] args) {
		int number = 6;

		if (number > 5) {
			System.out.println("number는 5보다 크다.");
		}

		if (number >= 6) {
			System.out.println("number는 6보다 크거나 같다.");
		}

		if (number == 6) {
			System.out.println("number는 6이다.");
		}

		if (number != 5) {
			System.out.println("number는 5가 아니다.");
		}

//		---------

		// 0~9까지 범위
		if (number >= 0 && number < 10) {
			System.out.println("number는 0부터 9사이의 수 입니다.");
		}

		if (number < 5 || number > 10) {
			System.out.println("numb는 5보다 작거나 10보다 크다");
		}

//		---------

		if (number > 10) {
			System.out.println("number는 10보다 크다.");
		} else { // number <= 10
			System.out.println("number는 10보다 작거나 같다.");
		}

		// 한줄씩 처리하는 문장은 코드블럭을 삭제할 수 있다.
		if (number > 10)
			System.out.println("number는 10보다 크다.");
		else // number <= 10
			System.out.println("number는 10보다 작거나 같다.");

		// 더 간편하게 적으려면
		if (number > 10)
			System.out.println("number는 10보다 크다.");
		else
			System.out.println("number는 10보다 작거나 같다.");

//		---------

		// 삼항 연산자 String = (조건)? "값" : "값";
		String str;
		str = (number > 10) ? "number는 10보다 크다." : "number는 10보다 작거나 같다.";
		System.out.println(str);

		// 아래처럼 삼항 연산자를 출력문에 넣어서 출력할 수 있다.
		System.out.println((number > 10) ? "number는 10보다 크다." : "number는 10보다 작거나 같다.");

//		---------

		// 조건분기
		number = 85;

		if (number == 100) {
			System.out.println("100점입니다.");
		} else if (number >= 90 && number > 100) {
			System.out.println("90점 이상입니다.");
		} else if (number >= 80 && number < 90) {
			System.out.println("80점 이상입니다.");
		} else {
			System.out.println("80점 미만입니다.");
		}
		
		number = 60;
		if(number == 100) 		System.out.println("100점입니다.");
		else if (number >= 90)	System.out.println("90점 이상입니다.");
		else if (number >= 80)	System.out.println("80점 이상입니다.");
		else					System.out.println("80점 미만입니다.");
		
		// 어느 부분에 조건이 걸려야하는지 순서를 잘 설계하고, 조건은 항상 제일 높은 것 부터 적어 내려간다.
		number = 95;
		if(number >= 80)		System.out.println("80점 이상입니다.");
		else if (number >= 90)	System.out.println("90점 이상입니다.");
		else if (number == 100) System.out.println("100점입니다.");
		else					System.out.println("80점 미만입니다.");
		
		
//		--------
		
		//조건문 안에 조건문
		number = 86;
		if(number >= 80 && number < 90) {
			if(number >= 85) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
		
//		--------
		
		boolean b;
		b = false;
		
		if(b == false) {
			System.out.println("b = " + b + "입니다.");
		} 
		
		//boolean 변수를 사용할 때 조건 표현 방법 1
		b = true;
		if (b) { //b는 true라는 뜻이다.
			System.out.println("b = " + b + "입니다.");
		}
		
		//boolean 변수를 사용할 때 조건 표현 방법 2
		b = false;
		if (!b) { //b는 false라는 뜻이다.
			System.out.println("b = " + b + "입니다.");
		}
		
//		-------------
		
		if(true) {
			System.out.println("무조건 실행");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
	}
}
