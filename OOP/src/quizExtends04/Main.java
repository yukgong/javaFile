package quizExtends04;

class MyClass {
	private int memNum; // member variable
	
	static int staticNum; // static variable : 메모리 영역이 하나이다. 

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	
	public void method() { // instance method : 인스턴스를 통해서만 호출할 수 있다.
		memNum += 1;
		staticNum += 1;
		System.out.println("memNum = " + memNum + " staticNum = " + staticNum);
	}
	
	public static void staticMethod() { // Class method 혹은 static method : 클래스를 통해서 호출할 수 있다.
		System.out.println("MyClass staticMethod() 호출");
		
		// 접근 못하는 요소
		// super, this는 접근하지 못한다.
		staticNum = 0;
	}
}

public class Main{
	public static void main(String[] args) {
		
		MyClass cls 			= new MyClass();
		//		stack영역에 올라감	  heap영역에 올라감
		
		
		// 로컬 변수는 무조건 초기화를 해줘야한다.
//		int i;
//		System.out.println(i); // -> error
		
		// 클래스의 멤버 변수는 초기화 되어 있지 않으면 객체가 호출되는 순간 0으로 초기화되고 사라진다.
		int m = cls.getMemNum();
		System.out.println("m = " + m);
		
		cls.method();
		cls.method();
		cls.method();
		
		System.out.println();
		
		// 인스턴스를 새로 생성해도, static 변수의 메모리 영역을 공유하기 때문에 staticNum의 값이 바뀐다.
		MyClass cls2 = new MyClass();
		
		cls2.method();
		cls2.method();
		cls2.method();
		
		MyClass.staticMethod();
		
		
	}
}
