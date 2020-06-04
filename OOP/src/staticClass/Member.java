package staticClass;

public class Member {
	private int memNum;
	static int staticNum;
	
	public void init() {
		System.out.println("Member init()");
	}
	
	public void random() {
		System.out.println("Member random()");
		
	}
	
	public void input() {
		System.out.println("Member input()");
		
	}
	
	public static Member getInstance() { 
		Member m = new Member();
		m.init();
		m.random();
		m.input();
		
		return m;
	}
}
