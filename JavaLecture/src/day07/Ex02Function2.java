package day07;

public class Ex02Function2 {
	public static void main(String[] args) {
		// value에 의한 할당
		// address에 의한 할당 (참조)

		// value에 의한 할당 호출 (call by value)
		// n1에 num1의 값만 넣어준 것 처럼 처리가 된다.
		// 값에 의한 호출방식은 함수 호출시 전달되는 변수의 값을 복사하여 함수의 인자로 전달
		// 함수 안에서 인자의 값이 변경되어도, 외부의 변수의 값은 변경되지 않는다.
		int num1, num2, num3;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		func1(num1, num2, num3);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

		// address에 의한 할당 호출
		// 함수가 호출될 때, 메모리 공간 안에서는 함수를 위한 별도의 임시 공간이 생성된다
		// 따라서 함수 안에서 인자의 값이 변경되면, 인자를 전달한 객체의 값도 함께 변경
		int arrNum[] = { 1, 2, 3, 4, 5 };
		func2(arrNum);
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}

		int arr1[] = func3(arrNum);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

	}

	// value에 의한 할당 - 값만 대입되어 연산 처리된다.
	static void func1(int n1, int n2, int n3) {
		n1 = n1 * 2;
		n2 = n2 * 2;
		n3 = n3 * 2;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
	}

	// address에 의한 할당(참조 방식)
	static void func2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	// 들어오는 값도 배열 나가는 값도 배열.
	static int[] func3(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 3;
		}

		return arr;
	}
}
