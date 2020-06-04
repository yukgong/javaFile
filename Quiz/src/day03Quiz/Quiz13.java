package day03Quiz;

public class Quiz13 {
	public static void main(String[] args) {
		//1~1000 사이에 수를 전부 합친 값을 출력하라.
		
		//initialize(초기화)
		int sum = 0;
		
		//processing(처리)
		for(int i = 1; i <= 1000; i++) {
			sum += i; 
		}
		
		//printing(출력)
		System.out.println("1부터 1000사이 수의 합 : " + sum);
		
		// 답이 맞는지 확인하려면 계산 가능한 작은 수를 대입해 확인해본다.
	}

}
