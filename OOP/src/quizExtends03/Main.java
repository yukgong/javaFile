package quizExtends03;

//�޼���� : action
//�� �� : �־��� ��ü�� �޼��带 ȣ���Ѵ�.
//DanceRobot�� ���, dance()�� ȣ���ϰ�,
//SingRobot�� ���, sing()�� ȣ���ϰ�,
//DrawRobot�� ���, draw()�� ȣ���Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : Robot r - Robot�ν��Ͻ� �Ǵ� Robot�� �ڼ� �ν��Ͻ�

public class Main {
	static void action(Robot r) { // ��ü Robot�� ���ڷ� �޴´�.
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
