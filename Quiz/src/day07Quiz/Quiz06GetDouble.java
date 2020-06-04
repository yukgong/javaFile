package day07Quiz;

public class Quiz06GetDouble {
	public static void main(String[] args) {
		// 배열의 값에 2배의 연산된 값이 산출되도록 메소드를 작성하시오.
		
		
		int num1[] = { 1, 2, 3, 4, 5 };
		int result[] = getDouble(num1);
		
		print(result, "num1");
		System.out.println();
		print(num1, "num1");

	}

	static int[] getDouble(int arr[]) {
		int arrDouble[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrDouble[i] = arr[i] * 2;
		}

		return arrDouble;
	}

	static void print(int arr[], String msg) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(msg + "[" + i + "] =" + arr[i]);
		}
	}
}
