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
		
		//ū�׸��� ������ ��� -> �ڵ� ����ȯ / �Ͻ��� ����ȯ

		lo = by;
		lo = sh;
		lo = c;
		lo = i;
//		lo = f; // long < float -> ����ȯ �ȵ�
// 		lo = d; // long < double -> ����ȯ �ȵ�
		f = lo;
		d = f;
		
//		�����׸� -> ū�׸����δ� �ڵ� ����ȯ ����
//		8byte�� long Ÿ�� ������ float�� double���� �ڵ�����ȯ�� �̷������ �ʴ� ������
//		�켱������ �������� �Ǽ��� �켱�� �Ǳ� �����̴�.
		
//		-------------------------------
		
//		char�� 2byte������ byte�� short�� ���� �� ����. 
//		���� �ڵ� ����ȯ�� �̷������ �ʴ´�. 
//		c = sh;
//		c = by; 
		
//		--------------------------------
//		
//		���� �׸��� ū�� ��� -> ���� ����ȯ/����� ����ȯ
//		f = (double)d;
		f = (float)d; // ū ���� ���� �׸��� �������� �� '���� �׸��� ������ Ÿ��'�� ū�� ���� ()�ȿ� ������ش�.
//		lo = (float)f;
		lo = (long)f;
//		sh = (int)i; 
		sh = (short)i;
		
		
		

	}

}
