package classSuper;

public class Child extends Parant {
	
	public Child() {
//		super(); // 생략 가능
//		super(2); // 생략 가능
		// 부모 생성자 호출을 생략하면, 자동으로 기본 생성자를 가져온다.
	}
	
	//Override 실시한  method
	public void func() {
		System.out.println("Child func()");
//		super.method();
	}
}
