package day12;

public class Ex01Super {
	//이건 은닉성
	private int number;
	protected String name;
	
	//이건 생성자
	public Ex01Super() {
		System.out.println("Ex01Super");
	}
	
	public Ex01Super(int num) {
		System.out.println("Ex01Super(int num)");
	}
	
	public void parantMethod() {
		System.out.println("parantMethod");
	}
	
}
