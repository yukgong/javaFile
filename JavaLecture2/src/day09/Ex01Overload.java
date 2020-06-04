package day09;

public class Ex01Overload {

	public static void main(String[] args) {
//		오버로드(over load) 
		int num1 = Integer.parseInt("123");
//		int num2 = Integer.parseInt("123",2);
		
		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);
		
		//unsigned byte = 0~255 -> -값을 사용하지 않겠다.
		//signed byte = -128 ~ 127 -> +값을 사용하지 않겠다.
		funcName();
		funcName('a');
		funcName(123);
		funcName('b',234);
		funcName(234,'b');
	}
	
	//original
	static void funcName() {
		System.out.println("funcName() 호출");
	}
	
	//오버로드는 매개변수가 차이가 나는가만 확인한다.
	static void funcName(char c) {
		System.out.println("funcName(char c) 호출 " + c);
	}
	
	//매개변수의 [자료형]을 다르게하면 오버로드 할 수 있다.
	static void funcName(int n) {
		System.out.println("funcName(int n) 호출 " + n);
	}
	
	//매개변수의 [갯수] 차이가 다르면 오버로드 할 수 있다.
	static void funcName(char c, int n) { //getter
		System.out.println("funcName(char c, int n) 호출 " + c + " "+ n);
	}
	
	//매개변수의 매개변수의 갯수는 같아도 [위치]가 다르면 오버로드 할 수 있다.
	static void funcName(int n, char c) { //getter
		System.out.println("funcName(char c, int n) 호출 " + c + " "+ n);
	}
	
	//-----------------------------------
	
//	//리턴값 자료형을 바꾸면 실행 되지 않는다. -> 파이썬같은 최신 언어는 가능하다.
//	static int funcName(int n, char c) { //getter
//		System.out.println("error");
//		
//		return n;
//	}
//	
//	//매개변수명만 바꾸는 것 만으로는 오버로드 할 수 없다. 
//	static int funcName(int a, char b) { //getter
//		System.out.println("error");
//		
//		return n;
//	}
	
}
