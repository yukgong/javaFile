package day07Quiz;

public class Quiz02dotDistance {
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 1, 2));
		System.out.println(getDistance2(1, 1, 1, 2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		// �� ���� ���� ������ �Ÿ��� ���ϴ� ����
		// (x,y)(x1,y1)
		// ��(y1 - y)2 + (x1 - x)2

		// �¼� ���ϱ�
		// Math.power(double, double)
		// ù��° ���ڴ� �ؼ��̰�, �ι�° ���ڴ� ���� ex) 2�� 1�� => �ؼ��� 2 ������ 1
		double powY = Math.pow(y1 - y, 2);
		double powX = Math.pow(x1 - x, 2);

		// ��Ʈ�� ���ϴ� �Լ�
		// java.lang.Math Ŭ������ sqrt()�޼ҵ带 ����Ѵ�.
		// double target = Math.sqrt(25); //25�� ������
		double sqrt = powY + powX;
		double result = Math.sqrt(sqrt);

		return result;
	}

	static double getDistance2(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(y1 - y, 2) + Math.pow(x1 - x, 2));

	}
}
