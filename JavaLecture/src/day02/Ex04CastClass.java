package day02;

public class Ex04CastClass {
	public static void main(String[] args) {
		short sh = 10;
		int num;

		num = sh; // 자동 형변환
		System.out.println("num ="+ num);
		
		num = 20;
//		sh = num; // 작은 그릇의 sh에는 num일 대입할 수 없다. 형변환이 이루어지지 않기 때문이다.
//		System.out.println("num ="+ sh);
		sh =(short)num; // 강제 형변환
		System.out.println("num ="+ num);
		
		num = 128;
		
		byte by = (byte)num;
		System.out.println("by = " + by);
		
		float f1;
		f1 = (float)3/2;
		System.out.println("f1 = " + f1);
		
		//우선순위
		long lo = 12121212313131L;
		float fl;
		
		fl = lo;
		System.out.println("fl = " + fl);
		
		double d;
		d = lo;
		System.out.println("d = " + d);
		
		//fl = 1.21212125E13
		//E가 나왔다는 것은 곱하기 10을 뜻한다. E뒷자리의 숫자만큼 *10의 n승을 뜻한다.
		//ex) E-2 -> * (1/10) * (1/10)
		
		//d = 1.2121212313131E13
		
		double value = 123.4567;
		int n;
		n = (int)value;
		System.out.println("n =" +n);
		//큰 형태에서 작은 형태에 담는 경우는 잘 없다. 
		// 정확한 실수를 구할 때 주로 사용하거나
		// 소수점 아래 값이 필요없어서 값을 반올림할때 사용될 수 있다.
		// 클래스를 배우고 나서 강제 형변환을 사용한다.
		
		double d_num = 100.123;
		float f_num = 1.123F;
		
		int i_num;
		i_num = (int)d_num;
		System.out.println(i_num);
		i_num = (int)f_num;
		System.out.println(i_num);
		
	}

}
