package day07Quiz;

public class Quiz03Shuffle {
	public static void main(String[] args) {
		// �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
		// ó���� �迭�� ��ȯ�Ѵ�.
		// ��ȯŸ�� : int[]
		// �Ű����� : int[] arr - ���� ���� ��� �迭

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
		// ������ arr[i]������ arr[random]������ swap�Ѵ�.
		// �ѹ�  swap�ϰ� arr[random]�� swap�� �� ������ �Ѵ�.
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
