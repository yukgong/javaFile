package day04Practice;

import java.util.Scanner;

public class Quiz13SumAndAvg {
	public static void main(String[] args) {
		
		//반복하기
		while(true) {
			//변수 선언
			int sum = 0;
			int avg = 0;
			
			//연산하고 싶은 숫자의 개수 입력하기
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 > ");
			int arrNum = scanner.nextInt();
			
			//배열 동적 할당
			int arr[] = new int[arrNum];
			
			//연산하고 싶은 숫자 개수에 맞게 숫자 입력 받기
			for(int i = 0; i < arr.length; i++) {
				System.out.println((i+1) + "번째 숫자를 입력하세요 > ");
				int userNum = scanner.nextInt();
				arr[i] = userNum;
			}
			
			//합계 연산
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			//평균 연산
			avg = sum/arrNum;
			
			//출력하기
			System.out.println("합계 = " + sum);
			System.out.println("평균 = " + avg);
			
			//다시할건지 물어보기 
			System.out.println("다시해보시겠어요? (Y/N)");
			String again = scanner.next();
			String againUpper = again.toUpperCase();
			
			while(!(againUpper.equals("Y")||againUpper.equals("N"))) {
				System.out.println("잘못입력했습니다.");
				System.out.println("다시해보시겠어요? (Y/N)");
				again = scanner.next();
				againUpper = again.toUpperCase();
			}
			
			if(againUpper.equals("N")) {
				break;
			}
		}

	}
}
