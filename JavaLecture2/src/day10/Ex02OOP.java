package day10;

public class Ex02OOP {
	public static void main(String[] args) {
		//객체 지향에서 TV -> 2대 만들기
//		String name[] = new String[2]; // 삼성, LG
//		int channel[] = new int[2]; // 채널
//		boolean power[] = new boolean[2]; // on/off
//		
//		name[0] = "삼성";
//		name[1] = "LG";
//		
//		channel[0] = 11;
//		channel[1] = 23;
//		
//		power[0] = true;
//		power[1] = false;
		
//		TV tv1 = new TV();
//		tv1.getInput("LG",11,true);
//		tv1.method();
//		
//		TV tv2 = new TV();
//		tv2.getInput("LG",11,true);
//		tv2.method();
//		
//		//배열만을 동적할당
//		TV arrTv[] = new TV[3]; // arrTv1, arrTv2, arrTv3;
//		
//		//객체를 동적할당
//		for (int i = 0; i < arrTv.length; i++) {
//			arrTv[i] = new TV();
//		}
//		
//		arrTv[0].getInput("aaa", 1, true);
//		arrTv[1].getInput("bbb", 1, true);
//		arrTv[2].getInput("ccc", 1, true);
//		
//		
//		
//		for (int i = 0; i < arrTv.length; i++) {
//			arrTv[i].method();
//		}
//		
		String student1[][] = {
				{"홍길동", "24", "98", "100"},
				{"홍길동", "24", "98", "100"},
				{"홍길동", "24", "98", "100"},
		};
		
		//객체를 여러개 생성할 때
		Student student2 = new Student();
		student2.setName("홍길동");
		student2.setAge(24);
		student2.setEng(98);
		student2.setMath(100);
		
		Student student3 = new Student();
		student3.setName("홍길동");
		student3.setAge(24);
		student3.setEng(98);
		student3.setMath(100);
	}

	/*
	 * class MyClass{ //class 설계 변수(멤버변수) - 접근 지정(외부, 내부) 함수(메소드) - 처리 }
	 * 
	 * //형식 클래스명 변수 (instance) = new 클래스명 stacl heap
	 */
}
