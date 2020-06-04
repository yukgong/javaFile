package classSuper;

public class Main {

	public static void main(String[] args) {
		Parant p = new Child();
		p.method();
		//p.func(); 
		// 자식 클래스의 func()는 접근할 수 없다.부모 클래스와 공유하지 않기 때문이다.
		// 공유하고 싶다면, 오버라이딩한다.

		// 인스턴스가 Parant의 변수더라도, 호출은 Child 자식 클래스를 객체로 만든 것이기 때문에
		// method()를 호출하면,오버라이딩된 method()가 호출된다. 
		// 개념상으로는 method()가 오버라이딩 되면, 
		// 해당 메소드를 부모 클래스와 자식 클래스가 공유하는 성질이 있다.
	}
}
