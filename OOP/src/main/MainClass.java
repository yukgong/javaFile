package main;

public class MainClass {
	public static void main(String[] args) {

		// �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		Child01 one = new Child01();
		Child02 two = new Child02();

		one.method();
		two.method();

		// �ڽ��� ����и��� �θ� Ŭ������ ��� ������ �� �ִ�.
		Parant pOne = new Child01();
		Parant pTwo = new Child02();

		pOne.method();
		pTwo.method();

		// ------------------------------

		// ���� �ٸ� �ڽ� �ν��Ͻ��� ������ �ؾ��Ѵٸ�...
		// lady
		Child01 lady[] = new Child01[10]; 
		// �ν��Ͻ��� �ƴ� �迭�� ��Ƴ��� �����̴�.
		
		// man
		Child02 man[] = new Child02[10]; 
		//�ν��Ͻ������� �迭�� �����ؾ��Ѵ�.

		lady[0] = new Child01();		
		man[0] = new Child02();
		lady[1] = new Child01();
		man[1] = new Child02();
		
		// ���� �ϳ��� �ν��Ͻ��� �������� �ڽ� Ŭ������ ��� �����Ѵٸ�...?
		Parant human[] = new Parant[4];
		
		human[0] = new Child01();
		human[1] = new Child02();
		human[2] = new Child01();
		human[3] = new Child02();
		//�迭 �ϳ��� ��Ʈ���ϸ� �ż� ������ �����ϰ�, �ұ�Ģ�� �Է¿� ���� �������� ���� �� �ִ�.
		
		for (int i = 0; i < human.length; i++) {
			human[i].method();
		}
		
		// �θ� �ν��Ͻ� = new �ڽ� Ŭ���� ���� �ڽ� Ŭ������ �޼ҵ� �������� ���
		Parant p1 = new Child01();
		Parant p2 = new Child02();
		
		p1.method();
		p2.method();
		
		// ĳ��Ʈ ����ȯ ��� 1
		Child01 co = (Child01)p1; 
		co.func();
		
		// ĳ��Ʈ ����ȯ ��� 2
		((Child01)p1).func();
	}
}
