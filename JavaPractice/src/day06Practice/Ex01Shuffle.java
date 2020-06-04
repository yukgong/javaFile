package day06Practice;

public class Ex01Shuffle {
	public static void main(String[] args) {
		// ���� �ζ� ��ȣ �����ϱ� 1~46��

		// ����
		int arr[] = new int[6];
		boolean randomSwitch[] = new boolean[46];

		// randomSwitch init
		for (int i = 0; i < randomSwitch.length; i++) {
			randomSwitch[i] = false;
		}

		// arr �迭�� �ߺ����� ���� �ֱ�
		int w, r;
		w = r = 0;

		while (w < 6) {
			// create random number
			r = (int) (Math.random() * 46);

			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				arr[w] = r + 1;
				w++;
			}
		}
		// test ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println();

		// �����ϱ�
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// test ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
