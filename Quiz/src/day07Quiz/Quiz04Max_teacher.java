package day07Quiz;

public class Quiz04Max_teacher {
	public static void main(String[] args) {
		// �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�.
		// ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�.
		// ��ȯŸ�� : int
		// �Ű����� : int[] arr = �ִ밪�� ���� �迭

		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));

	}

	// �ִ밪�� ���ϴ� �Լ�
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
