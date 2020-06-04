package quizExtends01;

public class Parent {
	int x = 100;
	int y = 10000;
	
	public Parent(){
		this(200,200); 
		// this는 인스턴스 자기 자신을 가리는 참조 변수이고, 
		// this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
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
