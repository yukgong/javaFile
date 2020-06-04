package day11;

public class Ex02Constructor {
	public static void main(String[] args) {
		Constructor c1 = new Constructor(); // 생성자는 객체 생성시에 자동적으로 실행된다.
		Constructor c2 = new Constructor(6); // 생성자는 오버로드해서 사용할 수 있다.
		Constructor c3 = new Constructor(10,"ㅎㅎ"); //this();을 생성자 내부에 추가하면 오버로드된 내부 생성자들을 호출할 수 있다. 
	}
}
