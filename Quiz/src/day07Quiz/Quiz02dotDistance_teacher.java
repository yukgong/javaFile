package day07Quiz;

public class Quiz02dotDistance_teacher {
	public static void main(String[] args) {
		// 두 점(x,y)과 (x1,x1)사이의 거리를 구하는 공식
		// √(y1 - y)2 + (x1 - x)2
		double distance = getDistance(1,1,1,2);
		System.out.println(distance);
		
		
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		double dx, dy;
		double result;
		
		//루트:squr	승수:pow <- Math 함수
		dx = Math.pow(y1-y,2);
		dy = Math.pow(x1-x,2);
		
		result = Math.sqrt(dy+dx);
		
		return result;
		
	}
	
	static double getDistance2(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(y1-y, 2) + Math.pow(x1-x, 2));
	}
}
