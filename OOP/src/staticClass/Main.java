package staticClass;

public class Main {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.init();
		mem1.random();
		mem1.input();
		
		//�޼ҵ带 ��� �ν��Ͻ�ȭ�Ҷ� static�� ���� ����Ѵ�.
		Member mem2 = Member.getInstance();
		
	}
}
