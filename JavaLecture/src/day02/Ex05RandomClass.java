package day02;

public class Ex05RandomClass {
	public static void main(String[] args) {
		/*
		 * Random ���� : ������  <-> Pattern 1 ~ 5
		 */

		int rNum; // ������ �־�� ���� �����
		
		// ���� �Լ� ��� ����
		rNum = (int) (Math.random() * 5);
		// Math.random()�� �⺻������ �������̶� rNum�� ����� �ʱ� ������ ���� ����ȯ�� �����ش�.
		// 5: 0���� 4������ ���ڸ� ������� ���� ������.
		System.out.println("rNum =" + rNum);

		// 0 ~ 9
		rNum = (int) (Math.random() * 10);
		System.out.println("rNum =" + rNum);

		// 10 ~ 20
		rNum = (int) (Math.random() * 11) + 10;
		System.out.println("rNum =" + rNum);

		// 10 20 30 40 50
		rNum = ((int) (Math.random() * 5) + 1) * 10;
		System.out.println("rNum =" + rNum);

		// -1 0 1
		rNum = (int) (Math.random() * 3) - 1;
		System.out.println("rNum =" + rNum);
		
		int x = (int) (Math.random() * 3) - 1;
		int y = (int) (Math.random() * 3) - 1;
		// xy ��ǥ�� �����ϴ� ��쿡 ���� �� �ִ�. ���ӿ����� ��� ���� �̵��� �� �ֵ��� ���� ������ �̿��Ѵ�.
	}
}
