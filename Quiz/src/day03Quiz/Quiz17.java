package day03Quiz;

public class Quiz17 {
	public static void main(String[] args) {
		// 홀수 짝수 담을 공간 만들기
		int oddSum, evenSum;
		oddSum = evenSum =0;
		
		// 홀수 짝수 더하기
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				evenSum += i;	// 짝수 더하기
			} else {
				oddSum += i;	// 홀수 더하기
			}
		}
		
		System.out.println("1부터 100사이 홀수의 합은 : " + oddSum);
		System.out.println("1부터 100사이 짝수의 합은 : " + evenSum);
	}
}
