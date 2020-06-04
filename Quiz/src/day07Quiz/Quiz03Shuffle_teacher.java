package day07Quiz;

public class Quiz03Shuffle_teacher {
	public static void main(String[] args) {
		// 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
		// 처리한 배열을 반환한다.
		// 반환타입 : int[]
		// 매개변수 : int[] arr - 정수 값이 담긴 배열

		int[] original = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(java.util.Arrays.toString(original));
//		int[] result = shuffle(original);
		shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
		System.out.println(java.util.Arrays.toString(original));
		
	}

	// -------------function---------------

//	static int[] shuffle(int arr[]) {
	static void shuffle(int arr[]) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			int r1 = (int) (Math.random() * arr.length); // 0~8
			int r2 = (int) (Math.random() * arr.length); // 0~8
			
			temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
		}
//		return arr;
	}

}
