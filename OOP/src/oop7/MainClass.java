package oop7;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Object obj = new Parent(); // 우리 눈에는 안보이지만 기본적으로 모든 클래스는 Object를 상속 받는다.

		/*
		 * instanceOf 상속 받은 object를 부모 클래스의 instance로 생성
		 * 생성된 인스턴스에 어떤 자식 클래스가 생성됐는지 판별하는 제어자.
		 * 
		 */

		Parent arrPar[] = new Parent[3];
		// 부모 클래스의 인스턴스를 따름
		arrPar[0] = new ChildOne();
		arrPar[1] = new ChildTwo();
		arrPar[2] = new ChildOne();

		for (int i = 0; i < arrPar.length; i++) {
			//arrPar[i].method(); // override된 method
			
			if (arrPar[i] instanceof ChildOne) {
				ChildOne one = (ChildOne) arrPar[i]; // 캐스팅 형변환
				one.oneMethod(); //override 되지 않은 method
			}
		}
	}
}
