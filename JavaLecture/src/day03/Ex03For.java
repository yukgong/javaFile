package day03;

public class Ex03For {
	public static void main(String[] args) {

		// 반복문은 연산을 간단하고 효율적으로 할 수 있게해준다.
		int j;
		int num = 1;
		for (j = 1; j <= 10; j++) {
			num = num + j;
		}

		System.out.println("num = " + num);

//		--------

		// 변수의 유효범위 1 - 밖에서 선언했을 때
		int p;
		for (p = 0; p < 10; p++) {
			System.out.println("p = " + p);
		}
		System.out.println("loop out p = " + p);
		// 밖에서 선언한 변수는 반복문 밖에서도 사용할 수 있지만,
		// 계속 다른 변수를 만들어줘야하는 불편함이 있다.

//		---------

		// 변수의 유효범위 2 - 안에서 선언했을 때
		for (int e = 0; e < 10; e++) {
			System.out.println("e =" + e);
		}
//		System.out.println("e = " + e); 
		// 반복문 안에서 사용한 변수는 반복문 밖에서 활용할 수 없다.
		// 가급적 반복문 안에서 변수를 생성하고 밖에서 간섭하지 않는게 좋다.

//		---------

//		잘 사용하지 않지만 이렇게도 사용할 수 있다 시리즈

		// 감소 반복하기
		for (int o = 0; o > -5; o--) {
			System.out.println("o = " + o);
		}

		// 2씩 늘어나기
		for (int k = 0; k < 10; k += 2) {
			System.out.println("k = " + k);
		}

		// 이렇게도 사용할 수 있다1
		int count = 0;
		for (; count < 10;) {
			System.out.println("count = " + count);
			count++;
		}

		// 이렇게도 사용할 수 있다2
		for (int k = 0, t = 0; k < 10; k++, t++) {
			System.out.println("k = " + k);
			System.out.println("t = " + t);
		}
//		-------------

		// 구구단 2단의 모든 합을 구하라.

		System.out.println("-----구구단 2단의 모든 합을 구하라.-----");

		// 반복문의 초기화,조건,연산식을 모두 건드려야한다.
		int sum = 0;
		for (int i = 2; i <= 20; i += 2) {
//			System.out.println("i = " + i);
			sum += i;
		}
		System.out.println("합 :" + sum);

//		--------------

		// 유지 보수는 아래 방법이 더 유리하다.
		sum = 0;
		int num2 = 2;
		for (int i = 0; i < 10; i++) {
			sum += num2;
			num2 += 2;
		}

		System.out.println("합 :" + sum);

//		-------------

		// for안에 for

		for (int i = 0; i < 10; i++) { // loop 10

			System.out.println("i = " + i);

			for (int w = 0; w < 5; w++) {// loop 5 : i가 한번 순환할 때 j는 0부터 4까지 순환한다.

				System.out.println("\tw = " + w);
			}
		}
	}
}
