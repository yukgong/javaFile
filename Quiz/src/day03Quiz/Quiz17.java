package day03Quiz;

public class Quiz17 {
	public static void main(String[] args) {
		// Ȧ�� ¦�� ���� ���� �����
		int oddSum, evenSum;
		oddSum = evenSum =0;
		
		// Ȧ�� ¦�� ���ϱ�
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				evenSum += i;	// ¦�� ���ϱ�
			} else {
				oddSum += i;	// Ȧ�� ���ϱ�
			}
		}
		
		System.out.println("1���� 100���� Ȧ���� ���� : " + oddSum);
		System.out.println("1���� 100���� ¦���� ���� : " + evenSum);
	}
}
