package day07Quiz;

public class Quiz04Max_teacher {
	public static void main(String[] args) {
		// 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
		// 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
		// 반환타입 : int
		// 매개변수 : int[] arr = 최대값을 구할 배열

		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));

	}

	// 최대값을 구하는 함수
	static int max(int arr[]) {
		int maxNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
}
