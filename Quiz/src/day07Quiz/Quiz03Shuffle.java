package day07Quiz;

public class Quiz03Shuffle {
	public static void main(String[] args) {
		// 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
		// 처리한 배열을 반환한다.
		// 반환타입 : int[]
		// 매개변수 : int[] arr - 정수 값이 담긴 배열

		int[] original = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

	static int[] shuffle(int arr[]) {
		boolean arrSwitch[] = new boolean[arr.length];

		for (int i = 0; i < arrSwitch.length; i++) {
			arrSwitch[i] = false;
		}
		// 랜덤의 arr[i]번지를 arr[random]번지와 swap한다.
		// 한번  swap하고난 arr[random]는 swap할 수 없도록 한다.
		int temp = 0;
		int w = 0;
		while (w < arr.length) {
			int random = (int) (Math.random() * arr.length);
			if (arrSwitch[random] == false) {
				arrSwitch[random] = true;
				temp = arr[w];
				arr[w] = arr[random];
				arr[random] = temp;
				w++;
			}
		}

		return arr;
	}

}
