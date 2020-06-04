package day02Practice;

public class Ex02CastClass {

	public static void main(String[] args) {
		// setting
		byte by = 1; 
		short sh = 12345;
		int i = 1234567890;
		long lo = 1234567890;
		char c = 'A';
		float f = 1234567.1234F;
		double d = 1234567.1234567890;
		
		System.out.println(by);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(lo);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
		
		//큰그릇에 작은것 담기 -> 자동 형변환 / 암시적 형변환

		lo = by;
		lo = sh;
		lo = c;
		lo = i;
//		lo = f; // long < float -> 형변환 안됨
// 		lo = d; // long < double -> 형변환 안됨
		f = lo;
		d = f;
		
//		작은그릇 -> 큰그릇으로는 자동 형변환 가능
//		8byte인 long 타입 변수가 float와 double에서 자동형변환이 이루어지지 않는 이유는
//		우선순위가 정수보다 실수가 우선시 되기 떄문이다.
		
//		-------------------------------
		
//		char는 2byte이지만 byte와 short를 담을 수 없다. 
//		따라서 자동 형변환이 이루어지지 않는다. 
//		c = sh;
//		c = by; 
		
//		--------------------------------
//		
//		작은 그릇에 큰것 담기 -> 강제 형변환/명시적 형변환
//		f = (double)d;
		f = (float)d; // 큰 것을 작은 그릇에 담을때는 더 '작은 그릇의 데이터 타입'을 큰것 앞의 ()안에 명시해준다.
//		lo = (float)f;
		lo = (long)f;
//		sh = (int)i; 
		sh = (short)i;
		
		
		

	}

}
