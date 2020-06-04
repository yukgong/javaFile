package day08;

public class Ex01function2 {
	public static void main(String[] args) {

		allocParam(1, 2, 3, 4, 5);
		allocParam(23, 45, 39);
		func("hello",1,2,3,4);
	}

	static void allocParam(int... num) { // 가변인수 표기시 int num[]와 거의 동일한 작동을 한다.
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 = " + sum);
	}

	static void func(String str, int... num) { // 가변인수 사용시 가장 끝에 위치하던가, 하나만 사용해야한다. (int... num, String str) 순서를 바꿔서 쓸 수 없음.
		System.out.println("str = " + str);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "");
		}
	}
}
