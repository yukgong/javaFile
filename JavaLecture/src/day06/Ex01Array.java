package day06;

public class Ex01Array {
	public static void main(String[] args) {
		int arrayTag[] = { 11, 22, 33, 44, 55 };
		System.out.println(arrayTag);

		// �ε��� ���� ����
		arrayTag[1] = 222;
		System.out.println(arrayTag[1]);

		// �迭������ ����
		int array1[] = arrayTag;

		// �迭 ���� Ȯ���ϱ�
		int array2[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8, 45 }, // �����ϸ� �迭�� ���� ������ ������ �����.
				{ 9, 10, 11, 12 } 
		};

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.println("array2[" + i + "][" + j + "] = " + array2[i][j]);
			}
			System.out.println();
		}

	}
}
