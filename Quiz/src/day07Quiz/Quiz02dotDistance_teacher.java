package day07Quiz;

public class Quiz02dotDistance_teacher {
	public static void main(String[] args) {
		// �� ��(x,y)�� (x1,x1)������ �Ÿ��� ���ϴ� ����
		// ��(y1 - y)2 + (x1 - x)2
		double distance = getDistance(1,1,1,2);
		System.out.println(distance);
		
		
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		double dx, dy;
		double result;
		
		//��Ʈ:squr	�¼�:pow <- Math �Լ�
		dx = Math.pow(y1-y,2);
		dy = Math.pow(x1-x,2);
		
		result = Math.sqrt(dy+dx);
		
		return result;
		
	}
	
	static double getDistance2(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(y1-y, 2) + Math.pow(x1-x, 2));
	}
}
