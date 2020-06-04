package day02;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = 0;
		System.out.println(number > 0);
		// output -> false

		System.out.println(number > 0 && number < 0);
		// �Ѵ� ���϶��� true�� ������ ������ output -> false

		System.out.println(number > 0 || number < 0);
		// �Ѵ� ���϶��� true�� ������ ������ output -> false

		number = 5;
		System.out.println(number == 5);
		// output -> true : number�� 0�� ���ٴ� ���̹Ƿ� true
		System.out.println(number != 5);
		// output -> false : number�� 0�� ���� �ʴٴ� �����̹Ƿ� false
		
		System.out.println(number > 5 && number < 10);
		// output -> false : number�� 5���� ũ�� 10���� �۴ٴ� �����̹Ƿ� false
		System.out.println(!(number > 5 && number < 10));
		// output -> false : number�� 5���� ũ�� 10���� �۴ٴ� ����������, not���� ������ true
		// NOT �� �����ڸ� ����Ҷ��� ��ȣ ���� ���� ���� ���ǰ� �ش� ���� �� ����� �������� ����Ѵ�.
		
//		-----
//		���� ������
		char c;
		
		c = (number > 0)? 'Y' : 'N';
		System.out.println("c = " + c);
		
		int n;
		n = (number < 5)? 10 : 20;
		System.out.println("n = " + n);
		
		String str;
		str = (number > 3)? "3���� ũ��" : "3���� �۴�";
		System.out.println("str = " + str);
		
	}
}
