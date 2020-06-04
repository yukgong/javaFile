package day02Practice;

public class Ex03DecimalPointDelete {
	public static void main(String[] args) {
		double d_num = 123123.123;
		float f_num = 12.1235F;
		
		//d_num 소수점 아래 날리기
		int i_num = (int)d_num;
		System.out.println(i_num);
		
		//f_num 소수점 아래 날리기
		i_num = (int)f_num;
		System.out.println(i_num);
		
		
	}
}
