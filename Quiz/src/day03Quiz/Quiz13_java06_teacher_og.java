package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06_teacher_og {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		// 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라.
		
		// 선언
		// int num1 = 0, num2, num3;
		int numArr[] = null;	// int *numArr	-> 참조   = null (0) 	nul(빈문자)
								// 0xffffffff
								//   1111 -> f -> 4 bit
		int sum;	// 합계 변수
		double avg;	// 평균 변수
		int count;
		
		// 초기화
		sum = 0;
		
		// 연산하고 싶은 숫자의 갯수를 입력
		System.out.print("연산하고 싶은 숫자의 갯수 = ");
		count = sc.nextInt();
		
		// 그 갯수에 맞게 배열확보(동적할당)
		numArr = new int[count];
		
		// 합계를 산출할 숫자들을 입력
		for(int i = 0;i < numArr.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			numArr[i] = sc.nextInt();			
		}
		
		// 합계를 산출
		for(int i = 0;i < numArr.length; i++) {
			sum = sum + numArr[i];
		}		
		
		// 평균을 산출
		avg = (double)sum / count;
		
		// 결과 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("숫자들:" + numArr[i] + " ");
		}
		System.out.println();

		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		
	}

}





