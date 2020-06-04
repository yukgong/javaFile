package staticClass;

public class Main {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.init();
		mem1.random();
		mem1.input();
		
		//메소드를 묶어서 인스턴스화할때 static을 자주 사용한다.
		Member mem2 = Member.getInstance();
		
	}
}
