package day10Quiz;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1. �� ���̸� ���� �� �ִ� class
		 * ���� ������ �Է� -> ���
		 * 
		 * 2. ���簢���� ���̸� ���� �� �ִ� class
		 * ���� ���� �Է� -> ���
		 * 
		 * 3. Game �����
		 * 
		 * - ���� ���� �ޱ� -> 30 ~ 100;
		 * 
		 * - userInput -> 1~15;
		 * 
		 * - random number - user number;
		 * 
		 * - result < 0 = game over �ƽ��ϴ�.
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
