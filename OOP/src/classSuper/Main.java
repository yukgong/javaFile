package classSuper;

public class Main {

	public static void main(String[] args) {
		Parant p = new Child();
		p.method();
		//p.func(); 
		// �ڽ� Ŭ������ func()�� ������ �� ����.�θ� Ŭ������ �������� �ʱ� �����̴�.
		// �����ϰ� �ʹٸ�, �������̵��Ѵ�.

		// �ν��Ͻ��� Parant�� ��������, ȣ���� Child �ڽ� Ŭ������ ��ü�� ���� ���̱� ������
		// method()�� ȣ���ϸ�,�������̵��� method()�� ȣ��ȴ�. 
		// ��������δ� method()�� �������̵� �Ǹ�, 
		// �ش� �޼ҵ带 �θ� Ŭ������ �ڽ� Ŭ������ �����ϴ� ������ �ִ�.
	}
}
