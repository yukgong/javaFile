package day03;

public class Ex03For {
	public static void main(String[] args) {

		// �ݺ����� ������ �����ϰ� ȿ�������� �� �� �ְ����ش�.
		int j;
		int num = 1;
		for (j = 1; j <= 10; j++) {
			num = num + j;
		}

		System.out.println("num = " + num);

//		--------

		// ������ ��ȿ���� 1 - �ۿ��� �������� ��
		int p;
		for (p = 0; p < 10; p++) {
			System.out.println("p = " + p);
		}
		System.out.println("loop out p = " + p);
		// �ۿ��� ������ ������ �ݺ��� �ۿ����� ����� �� ������,
		// ��� �ٸ� ������ ���������ϴ� �������� �ִ�.

//		---------

		// ������ ��ȿ���� 2 - �ȿ��� �������� ��
		for (int e = 0; e < 10; e++) {
			System.out.println("e =" + e);
		}
//		System.out.println("e = " + e); 
		// �ݺ��� �ȿ��� ����� ������ �ݺ��� �ۿ��� Ȱ���� �� ����.
		// ������ �ݺ��� �ȿ��� ������ �����ϰ� �ۿ��� �������� �ʴ°� ����.

//		---------

//		�� ������� ������ �̷��Ե� ����� �� �ִ� �ø���

		// ���� �ݺ��ϱ�
		for (int o = 0; o > -5; o--) {
			System.out.println("o = " + o);
		}

		// 2�� �þ��
		for (int k = 0; k < 10; k += 2) {
			System.out.println("k = " + k);
		}

		// �̷��Ե� ����� �� �ִ�1
		int count = 0;
		for (; count < 10;) {
			System.out.println("count = " + count);
			count++;
		}

		// �̷��Ե� ����� �� �ִ�2
		for (int k = 0, t = 0; k < 10; k++, t++) {
			System.out.println("k = " + k);
			System.out.println("t = " + t);
		}
//		-------------

		// ������ 2���� ��� ���� ���϶�.

		System.out.println("-----������ 2���� ��� ���� ���϶�.-----");

		// �ݺ����� �ʱ�ȭ,����,������� ��� �ǵ�����Ѵ�.
		int sum = 0;
		for (int i = 2; i <= 20; i += 2) {
//			System.out.println("i = " + i);
			sum += i;
		}
		System.out.println("�� :" + sum);

//		--------------

		// ���� ������ �Ʒ� ����� �� �����ϴ�.
		sum = 0;
		int num2 = 2;
		for (int i = 0; i < 10; i++) {
			sum += num2;
			num2 += 2;
		}

		System.out.println("�� :" + sum);

//		-------------

		// for�ȿ� for

		for (int i = 0; i < 10; i++) { // loop 10

			System.out.println("i = " + i);

			for (int w = 0; w < 5; w++) {// loop 5 : i�� �ѹ� ��ȯ�� �� j�� 0���� 4���� ��ȯ�Ѵ�.

				System.out.println("\tw = " + w);
			}
		}
	}
}
