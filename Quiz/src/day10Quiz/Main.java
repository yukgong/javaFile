package day10Quiz;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1. 원 넓이를 구할 수 있는 class
		 * 원의 반지름 입력 -> 출력
		 * 
		 * 2. 직사각형의 넓이를 구할 수 있는 class
		 * 가로 세로 입력 -> 출력
		 * 
		 * 3. Game 만들기
		 * 
		 * - 랜덤 숫자 받기 -> 30 ~ 100;
		 * 
		 * - userInput -> 1~15;
		 * 
		 * - random number - user number;
		 * 
		 * - result < 0 = game over 됐습니다.
		 */
		
//		Circle cric = new Circle();
//		cric.getCircleArea();
//		
//		System.out.println();
//		
//		Ractangle rac = new Ractangle();
//		rac.getRactangleArea();
		
		Game play = new Game();
		play.init();
		play.processing();
	}
}
