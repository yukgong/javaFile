package day10Quiz;

import java.util.Scanner;

public class Ractangle {
	int width, height;
	int result;
	
	public void getRactangleArea() {
		userInput();
		processing();
		printResult();
	}
	
	public void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("직사각형 넓이 구하기 --------");
		
		System.out.println("가로 : ");
		width = scanner.nextInt();

		System.out.println("세로 : ");
		height = scanner.nextInt();
	}
	
	// 계산하기
	public void processing() {
		result = width * height;
	}

	// 결과 출력
	public void printResult() {
		System.out.println("직사각형의 넓이는 : " + result + "입니다.");
	}
}
