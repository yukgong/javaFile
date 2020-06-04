package day07;

public class Ex01Function {
	public static void main(String[] args) {

		function1();
		System.out.println();

		function2(5);
		System.out.println();

		function3("hello World", 13);
		System.out.println();

		// function4 호출 방법 --------------------
		int returnValue = function4(1123.222); // value에 의한 할당
		System.out.println("function4 = " + returnValue);
		System.out.println();

		int asc = getASCIIcode('a');
		System.out.println("asc = " + asc);
		System.out.println(getASCIIcode('a'));
		System.out.println();

		// function5 호출 방법 --------------------
		int num = function5();
		System.out.println("function5 = " + num);
		System.out.println();

		int r = (int) (Math.random() * 10);
		// 들어오는 값은 없지만, 나가는 값은 있는 형태

		String str = "hello";
		int len = str.length();
		// 들어오는 값은 없지만, 나가는 값은 있는 형태

		String a = "ABCdef";
		String result = a.toLowerCase();
		// 들어오는 값은 없지만, 나가는 값은 있는 형태

		// function4 호출 방법 --------------------
		int arrNum[] = { 1, 2, 3, 4, 5 };
		arrProcess(arrNum); // address에 의한 할당
		System.out.println();

	}

	// 1. 들어가는 값도 나가는 값도 없는 형태
	static void function1() {
		System.out.println("method1");
	}

	// 2. 들어가는 값이 있지만 나가는 것이 없는 형태
	static void function2(int n) {
		System.out.println("method2");
		System.out.println("매개변수를 통한 가인수 n=" + n);
		// 가인수는 지역변수와 동일한 뜻이다. 지역 변수는 유효 범위 안에서만 사용할 수 있는 변수이다.
	}

	// 3. 들어오는 값이 n개, 나가는 값은 없는 형태
	static void function3(String str, double d) {
		System.out.println("method3");
		System.out.println("str = " + str);
		System.out.println("d = " + d);
	}

	// 4. 들어오는 값, 나가는 값이 모두 존재하는 형태
	static int function4(double d) {
		System.out.println("method4");
		System.out.println("d = " + d);

		return (int) d;
	}

	// 5. 들어오는 값은 없지만 나가는 값은 있는 형태
	static int function5() {
		System.out.println("method5");

		return 12;
	}

//	-----------------------------------------

	// method4 예시
	static int getASCIIcode(int a) {

		return (char) a;
	}

	// method3 예시
	static void arrProcess(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
