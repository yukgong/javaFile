package quizExtends02;

public class Unit {
	int x, y; // ���� ��ġ

	// ������
	public Unit() {
	}

	// ������ ��ġ�� �̵�
	public void move(int x, int y) {
		System.out.println("x = " + x + ", y = " + y); 
	}
	
	// ���� ��ġ�� ����
	public void stop() {
		System.out.println("���� ��ġ�� ����"); 
	}

}
