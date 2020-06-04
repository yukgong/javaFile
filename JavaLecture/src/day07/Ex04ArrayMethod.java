package day07;

public class Ex04ArrayMethod {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		func2(arr);
		
	}

	// 배열을 매개변수로 받는 메소드
	static void func2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	// 배열을 매개변수로 받고 리턴값도 배열로 나타내는 메소드
	static int[] func3(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 3;
		}
		return arr;
	}
}
