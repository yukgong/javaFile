package classSuper;

public class Child extends Parant {
	
	public Child() {
//		super(); // ���� ����
//		super(2); // ���� ����
		// �θ� ������ ȣ���� �����ϸ�, �ڵ����� �⺻ �����ڸ� �����´�.
	}
	
	//Override �ǽ���  method
	public void func() {
		System.out.println("Child func()");
//		super.method();
	}
}
