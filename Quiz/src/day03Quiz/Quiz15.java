package day03Quiz;

public class Quiz15 {
	public static void main(String[] args) {
		// �������� 1�ܺ��� 9�ܱ��� ����ϴ� ���α׷�

		// 1�ܿ��� 9�ܱ��� �ݺ��ϱ�
		for (int i = 1; i < 10; i++) {

			System.out.println("----" + i + "��" + "----");
			System.out.println();

			// n�� �ȿ��� ������ �ݺ��ϱ�
			for (int j = 1; j < 10; j++) {

				// printing
				System.out.println(i + "X" + j + "=" + (i * j));
			}

			// ����
			System.out.println();
		}
	}
}
