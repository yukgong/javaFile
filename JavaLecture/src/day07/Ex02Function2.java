package day07;

public class Ex02Function2 {
	public static void main(String[] args) {
		// value�� ���� �Ҵ�
		// address�� ���� �Ҵ� (����)

		// value�� ���� �Ҵ� ȣ�� (call by value)
		// n1�� num1�� ���� �־��� �� ó�� ó���� �ȴ�.
		// ���� ���� ȣ������ �Լ� ȣ��� ���޵Ǵ� ������ ���� �����Ͽ� �Լ��� ���ڷ� ����
		// �Լ� �ȿ��� ������ ���� ����Ǿ, �ܺ��� ������ ���� ������� �ʴ´�.
		int num1, num2, num3;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		func1(num1, num2, num3);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

		// address�� ���� �Ҵ� ȣ��
		// �Լ��� ȣ��� ��, �޸� ���� �ȿ����� �Լ��� ���� ������ �ӽ� ������ �����ȴ�
		// ���� �Լ� �ȿ��� ������ ���� ����Ǹ�, ���ڸ� ������ ��ü�� ���� �Բ� ����
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

	// value�� ���� �Ҵ� - ���� ���ԵǾ� ���� ó���ȴ�.
	static void func1(int n1, int n2, int n3) {
		n1 = n1 * 2;
		n2 = n2 * 2;
		n3 = n3 * 2;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
	}

	// address�� ���� �Ҵ�(���� ���)
	static void func2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	// ������ ���� �迭 ������ ���� �迭.
	static int[] func3(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 3;
		}

		return arr;
	}
}
