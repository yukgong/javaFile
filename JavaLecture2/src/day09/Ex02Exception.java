package day09;

public class Ex02Exception {
	public static void main(String[] args) {
//		int array[] = { 1, 2, 3 };
//		System.out.println("프로그램 시작");
//
//		try {
//		for (int i = 0; i < 4; i++) {
//			System.out.println(array[i]);
//		}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			//방법1
//			System.out.println("배열 범위 초과");
//			
//			//방법2
//			e.printStackTrace();
//			
//			//방법3
//			System.out.println(e.getMessage()); // 예외 값을 구할 수 있다.
//			return; // 리턴 처리를 한다고 명시할 경우 finally를 작성하지 않으면 리턴 처리한 부분까지만 실행된다.
//					
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//			
//		} finally {
//			System.out.println("무조건 실행");
//		}
//		
//		System.out.println("프로그램 끝");

		func1();
		func2();
	}

	// 메소드에서 예외처리 하는 방법1
	static void func1() throws ArrayIndexOutOfBoundsException { // 이 함수 내에서 예외가 발생할 수 있다고 알려주는 역할.
		int array[] = { 1, 2, 3 };

			// 문제가 예상되는 부분
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}

	}
	
	// 메소드에서 예외처리 하는 방법2
	static void func2(){ // try, catch 사용
		int array[] = { 1, 2, 3 };

		try {
			// 문제가 예상되는 부분
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
