package day10;

public class ExOOP2 {
	public static void main(String[] args) {
		//인스턴스
		MyClass cls = new MyClass();
		cls.number = 1;
		cls.name = "홍길동";
		cls.age = 24;
		cls.address = "서울시";
		
		cls.func();
		cls.method();
		
		//인스턴스 생성 방법 1
		MyClass cls1 = new MyClass();
		
		// 인스턴스 생성 방법 2
		MyClass cls2 = null;
		cls2 = new MyClass();
		
		System.out.println(cls);
		System.out.println(cls2);
	}
	
}
