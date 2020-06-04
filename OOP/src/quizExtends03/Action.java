package quizExtends03;

public class Action extends Robot  {
	
	public void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot one = (DanceRobot) r; // 캐스팅 형변환
			one.dance();
		} else if (r instanceof DrawRobot) {
			DrawRobot one = (DrawRobot) r; // 캐스팅 형변환
			one.draw();
		} else if (r instanceof SingRobot) {
			SingRobot one = (SingRobot) r; // 캐스팅 형변환
			one.sing();
		}
	}
}
