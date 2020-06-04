package day11;

public class Constructor {
	private int number;
	private String name; 
	
	public Constructor() { // 기본 생성자
		System.out.println("Constructor Constructor()");
	}
	
	public Constructor(int number) { // 기본 생성자
		this.number = number;
		System.out.println(number);
	}
	
	public Constructor(int number, String name) { // 기본 생성자
		this(); // 다른 생성자를 호출할때는 상단에 먼저 호출한다.그리고 this를 사용한다.
		this.number = number;
		this.name = name;
		System.out.println(number + " " + name);
	}
}
