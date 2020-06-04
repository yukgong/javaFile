package day12;

public class Ex03Chiled extends Ex01Super{

		public Ex03Chiled() {
			// Super : 부모 클래스의 reference(주소)
			// this : 자기 자신의 참조
			super(2);
			System.out.println("Ex03Chiled");
		}
		
		public void func() {
			name = "강경현";
		}

}
