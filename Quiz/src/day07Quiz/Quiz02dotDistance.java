package day07Quiz;

public class Quiz02dotDistance {
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 1, 2));
		System.out.println(getDistance2(1, 1, 1, 2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		// 두 점과 두점 사이의 거리를 구하는 공식
		// (x,y)(x1,y1)
		// √(y1 - y)2 + (x1 - x)2

		// 승수 구하기
		// Math.power(double, double)
		// 첫번째 인자는 밑수이고, 두번째 인자는 지수 ex) 2의 1승 => 밑수는 2 지수는 1
		double powY = Math.pow(y1 - y, 2);
		double powX = Math.pow(x1 - x, 2);

		// 루트를 구하는 함수
		// java.lang.Math 클래스의 sqrt()메소드를 사용한다.
		// double target = Math.sqrt(25); //25의 제곱근
		double sqrt = powY + powX;
		double result = Math.sqrt(sqrt);

		return result;
	}

	static double getDistance2(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(y1 - y, 2) + Math.pow(x1 - x, 2));

	}
}
