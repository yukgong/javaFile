package day07Quiz;

public class Quiz03Shuffle_teacher {
	public static void main(String[] args) {
		// �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
		// ó���� �迭�� ��ȯ�Ѵ�.
		// ��ȯŸ�� : int[]
		// �Ű����� : int[] arr - ���� ���� ��� �迭

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
