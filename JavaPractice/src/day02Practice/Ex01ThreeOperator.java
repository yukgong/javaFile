package day02Practice;

import java.util.Scanner;

public class Ex01ThreeOperator {
	public static void main(String[] args) {
		//사용자에게 값을 입력받아 홀수 짝수 구하기 
		
		//스캐너 소환
		Scanner scanner = new Scanner(System.in);
		
		//사용자에게 숫자 입력받기
		System.out.println("숫자 하나를 입력해주세요 :");
		int userNumber = scanner.nextInt(); // 입력받은 값 userNumber에 저장
		
		// 홀수인지 짝수인지 구하기 위해 사용자에게 입력받은 값의 나머지를 구해 나머지가 0인지 1인지 값을 구한다.
		userNumber = userNumber%2;
		
		// 결과값이 0이면 짝수 1이면 홀수이니 사용자가 입력한 값이 0이면 true이니 "짝수입니다."를 출력하고, 
		//1이면 false이니 "홀수입니다."를 출력한다.
		String result = (userNumber == 0)? "짝수입니다." : "홀수입니다.";
		// dataType name = (조건)? 'true' : 'false'; 
		
		//result에 담긴 값이 출력되도록 한다.
		System.out.println(result);
	}
}
