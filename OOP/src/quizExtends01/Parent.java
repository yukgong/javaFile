package quizExtends01;

public class Parent {
	int x = 100;
	int y = 10000;
	
	public Parent(){
		this(200,200); 
		// this�� �ν��Ͻ� �ڱ� �ڽ��� ������ ���� �����̰�, 
		// this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
	}
	public Parent(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
