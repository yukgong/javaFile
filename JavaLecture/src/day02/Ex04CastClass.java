package day02;

public class Ex04CastClass {
	public static void main(String[] args) {
		short sh = 10;
		int num;

		num = sh; // �ڵ� ����ȯ
		System.out.println("num ="+ num);
		
		num = 20;
//		sh = num; // ���� �׸��� sh���� num�� ������ �� ����. ����ȯ�� �̷������ �ʱ� �����̴�.
//		System.out.println("num ="+ sh);
		sh =(short)num; // ���� ����ȯ
		System.out.println("num ="+ num);
		
		num = 128;
		
		byte by = (byte)num;
		System.out.println("by = " + by);
		
		float f1;
		f1 = (float)3/2;
		System.out.println("f1 = " + f1);
		
		//�켱����
		long lo = 12121212313131L;
		float fl;
		
		fl = lo;
		System.out.println("fl = " + fl);
		
		double d;
		d = lo;
		System.out.println("d = " + d);
		
		//fl = 1.21212125E13
		//E�� ���Դٴ� ���� ���ϱ� 10�� ���Ѵ�. E���ڸ��� ���ڸ�ŭ *10�� n���� ���Ѵ�.
		//ex) E-2 -> * (1/10) * (1/10)
		
		//d = 1.2121212313131E13
		
		double value = 123.4567;
		int n;
		n = (int)value;
		System.out.println("n =" +n);
		//ū ���¿��� ���� ���¿� ��� ���� �� ����. 
		// ��Ȯ�� �Ǽ��� ���� �� �ַ� ����ϰų�
		// �Ҽ��� �Ʒ� ���� �ʿ��� ���� �ݿø��Ҷ� ���� �� �ִ�.
		// Ŭ������ ���� ���� ���� ����ȯ�� ����Ѵ�.
		
		double d_num = 100.123;
		float f_num = 1.123F;
		
		int i_num;
		i_num = (int)d_num;
		System.out.println(i_num);
		i_num = (int)f_num;
		System.out.println(i_num);
		
	}

}
