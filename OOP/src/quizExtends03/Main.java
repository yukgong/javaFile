package quizExtends03;

//메서드명 : action
//기 능 : 주어진 객체의 메서드를 호출한다.
//DanceRobot인 경우, dance()를 호출하고,
//SingRobot인 경우, sing()을 호출하고,
//DrawRobot인 경우, draw()를 호출한다.
//반환타입 : 없음
//매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스

public class Main {
	static void action(Robot r) { // 객체 Robot을 인자로 받는다.
		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
			
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
			
		} else if (r instanceof SingRobot) {
			((SingRobot) r).sing();
			
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

}
