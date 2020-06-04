package quizExtends02;

public class Unit {
	int x, y; // 현재 위치

	// 생성자
	public Unit() {
	}

	// 지정된 위치로 이동
	public void move(int x, int y) {
		System.out.println("x = " + x + ", y = " + y); 
	}
	
	// 현재 위치에 정지
	public void stop() {
		System.out.println("현재 위치에 정지"); 
	}

}
