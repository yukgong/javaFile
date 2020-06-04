package quizExtends03;

public class Action extends Robot  {
	
	public void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot one = (DanceRobot) r; // ĳ���� ����ȯ
			one.dance();
		} else if (r instanceof DrawRobot) {
			DrawRobot one = (DrawRobot) r; // ĳ���� ����ȯ
			one.draw();
		} else if (r instanceof SingRobot) {
			SingRobot one = (SingRobot) r; // ĳ���� ����ȯ
			one.sing();
		}
	}
}
