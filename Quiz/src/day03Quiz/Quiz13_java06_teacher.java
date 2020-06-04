package day03Quiz;

import java.util.Scanner;

public class Quiz13_java06_teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 선언
		int sum;		//합계
		double avg;		//평균
		int count;		//유저가 입력한 숫자
		int numArr[]; 	// c에서 비슷한 역할를 하는게 포인터이다.
						// 포인터에서는 동적할당을 한다.
						// 참조 = null nul(빈문자)
						// 0xfffff -> 이것과 관려핸서 내용 찾아보기

		// 초기화
		sum = 0;

		// 숫자 입력 받기
		System.out.println("연산하고 싶은 숫자의 개수를 입력해주세요 : ");
		count = scanner.nextInt();

		// 그 갯수에 맞게 배열확보(동적 할당)
		numArr = new int[count];
		
		
		// 합계를 산출할 숫자들을 입력
		System.out.println(count + "개의 숫자 입력");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "번째 숫자 :");
			numArr[i] = scanner.nextInt();
		}


		// 합계를 산출
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}

		// 평균을 산출
		avg = (double)sum/count;

		// 결과 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("숫자들:" + numArr[i] + " ");
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}
}
