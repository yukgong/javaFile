package oop7;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Object obj = new Parent(); // �츮 ������ �Ⱥ������� �⺻������ ��� Ŭ������ Object�� ��� �޴´�.

		/*
		 * instanceOf ��� ���� object�� �θ� Ŭ������ instance�� ����
		 * ������ �ν��Ͻ��� � �ڽ� Ŭ������ �����ƴ��� �Ǻ��ϴ� ������.
		 * 
		 */

		Parent arrPar[] = new Parent[3];
		// �θ� Ŭ������ �ν��Ͻ��� ����
		arrPar[0] = new ChildOne();
		arrPar[1] = new ChildTwo();
		arrPar[2] = new ChildOne();

		for (int i = 0; i < arrPar.length; i++) {
			//arrPar[i].method(); // override�� method
			
			if (arrPar[i] instanceof ChildOne) {
				ChildOne one = (ChildOne) arrPar[i]; // ĳ���� ����ȯ
				one.oneMethod(); //override ���� ���� method
			}
		}
	}
}
