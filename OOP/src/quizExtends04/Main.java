package quizExtends04;

class MyClass {
	private int memNum; // member variable
	
	static int staticNum; // static variable : �޸� ������ �ϳ��̴�. 

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	
	public void method() { // instance method : �ν��Ͻ��� ���ؼ��� ȣ���� �� �ִ�.
		memNum += 1;
		staticNum += 1;
		System.out.println("memNum = " + memNum + " staticNum = " + staticNum);
	}
	
	public static void staticMethod() { // Class method Ȥ�� static method : Ŭ������ ���ؼ� ȣ���� �� �ִ�.
		System.out.println("MyClass staticMethod() ȣ��");
		
		// ���� ���ϴ� ���
		// super, this�� �������� ���Ѵ�.
		staticNum = 0;
	}
}

public class Main{
	public static void main(String[] args) {
		
		MyClass cls 			= new MyClass();
		//		stack������ �ö�	  heap������ �ö�
		
		
		// ���� ������ ������ �ʱ�ȭ�� ������Ѵ�.
//		int i;
//		System.out.println(i); // -> error
		
		// Ŭ������ ��� ������ �ʱ�ȭ �Ǿ� ���� ������ ��ü�� ȣ��Ǵ� ���� 0���� �ʱ�ȭ�ǰ� �������.
		int m = cls.getMemNum();
		System.out.println("m = " + m);
		
		cls.method();
		cls.method();
		cls.method();
		
		System.out.println();
		
		// �ν��Ͻ��� ���� �����ص�, static ������ �޸� ������ �����ϱ� ������ staticNum�� ���� �ٲ��.
		MyClass cls2 = new MyClass();
		
		cls2.method();
		cls2.method();
		cls2.method();
		
		MyClass.staticMethod();
		
		
	}
}
