package quizExtends01;

public class Child extends Parent {
	int x = 3000;
	int y = 100;
	
	public Child() {
		this(1000, 1000);
	}
	public Child(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
