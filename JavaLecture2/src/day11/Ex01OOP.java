package day11;

public class Ex01OOP {
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		
		// getter
		int num = cls.getNumber(); 
		System.out.println(num); // -> output = 0
		
		//setter
		cls.setNumber(6); // -> 셋터에서 필드값 설정을 통해 멤버 변수 값 설정
		
		// getter
		num = cls.getNumber(); 
		System.out.println(num); // -> output = 0
	}
}
