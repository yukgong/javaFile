package day07Quiz;

public class Quiz04Max {
	public static void main(String[] args) {
		// �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�.
		// ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�.
		// ��ȯŸ�� : int
		// �Ű����� : int[] arr = �ִ밪�� ���� �迭

		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));
		System.out.println("�ּҰ�:" + min(data));
	}

	// �ִ밪�� ���ϴ� �Լ�
	static int max(int arr[]) {
		// �迭�� ���ڵ��� ���ؼ� max ���� �ȿ� ���� ū ���� �������Ѵ�.
		int max = arr[0];;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// �ּҰ��� ���ϴ� �Լ�
	static int min(int arr[]) {
		// �迭�� ���ڵ��� ���ؼ� max ���� �ȿ� ���� ū ���� �������Ѵ�.
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}