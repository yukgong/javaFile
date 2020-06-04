package day10Quiz;

import java.util.Scanner;

public class Circle {
	int r;
	double result;
	
	public void getCircleArea() {
		userInput();
		processing();
		printResult();
	}

	// 넓이를 구하려는 원의 반지름 입력 받기
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 넓이 구하기 --------");
		System.out.print("넓이를 구하려는 원의 반지름을 입력하세요 : ");
		r = sc.nextInt();
	}

	// 계산하기
	public void processing() {
		result = (r * r) * 3.14;
	}

	// 결과 출력
	public void printResult() {
		System.out.println("원의 넓이는 : " + result + "입니다.");
	}
}
