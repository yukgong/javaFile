package main;

public class MainClass {
	public static void main(String[] args) {

		// 인스턴스를 따로 관리해야한다.
		Child01 one = new Child01();
		Child02 two = new Child02();

		one.method();
		two.method();

		// 자식의 공통분모인 부모 클래스로 묶어서 관리할 수 있다.
		Parant pOne = new Child01();
		Parant pTwo = new Child02();

		pOne.method();
		pTwo.method();

		// ------------------------------

		// 만약 다른 자식 인스턴스로 관리를 해야한다면...
		// lady
		Child01 lady[] = new Child01[10]; 
		// 인스턴스가 아닌 배열만 잡아놓은 상태이다.
		
		// man
		Child02 man[] = new Child02[10]; 
		//인스턴스마다의 배열을 생성해야한다.

		lady[0] = new Child01();		
		man[0] = new Child02();
		lady[1] = new Child01();
		man[1] = new Child02();
		
		// 만약 하나의 인스턴스로 여러개의 자식 클래스를 묶어서 관리한다면...?
		Parant human[] = new Parant[4];
		
		human[0] = new Child01();
		human[1] = new Child02();
		human[2] = new Child01();
		human[3] = new Child02();
		//배열 하나만 컨트롤하면 돼서 관리가 용이하고, 불규칙한 입력에 의한 공간낭비를 줄일 수 있다.
		
		for (int i = 0; i < human.length; i++) {
			human[i].method();
		}
		
		// 부모 인스턴스 = new 자식 클래스 에서 자식 클래스의 메소드 가져오는 방법
		Parant p1 = new Child01();
		Parant p2 = new Child02();
		
		p1.method();
		p2.method();
		
		// 캐스트 형변환 방법 1
		Child01 co = (Child01)p1; 
		co.func();
		
		// 캐스트 형변환 방법 2
		((Child01)p1).func();
	}
}
