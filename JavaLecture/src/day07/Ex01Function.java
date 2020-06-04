package day07;

public class Ex01Function {
	public static void main(String[] args) {

		function1();
		System.out.println();

		function2(5);
		System.out.println();

		function3("hello World", 13);
		System.out.println();

		// function4 ȣ�� ��� --------------------
		int returnValue = function4(1123.222); // value�� ���� �Ҵ�
		System.out.println("function4 = " + returnValue);
		System.out.println();

		int asc = getASCIIcode('a');
		System.out.println("asc = " + asc);
		System.out.println(getASCIIcode('a'));
		System.out.println();

		// function5 ȣ�� ��� --------------------
		int num = function5();
		System.out.println("function5 = " + num);
		System.out.println();

		int r = (int) (Math.random() * 10);
		// ������ ���� ������, ������ ���� �ִ� ����

		String str = "hello";
		int len = str.length();
		// ������ ���� ������, ������ ���� �ִ� ����

		String a = "ABCdef";
		String result = a.toLowerCase();
		// ������ ���� ������, ������ ���� �ִ� ����

		// function4 ȣ�� ��� --------------------
		int arrNum[] = { 1, 2, 3, 4, 5 };
		arrProcess(arrNum); // address�� ���� �Ҵ�
		System.out.println();

	}

	// 1. ���� ���� ������ ���� ���� ����
	static void function1() {
		System.out.println("method1");
	}

	// 2. ���� ���� ������ ������ ���� ���� ����
	static void function2(int n) {
		System.out.println("method2");
		System.out.println("�Ű������� ���� ���μ� n=" + n);
		// ���μ��� ���������� ������ ���̴�. ���� ������ ��ȿ ���� �ȿ����� ����� �� �ִ� �����̴�.
	}

	// 3. ������ ���� n��, ������ ���� ���� ����
	static void function3(String str, double d) {
		System.out.println("method3");
		System.out.println("str = " + str);
		System.out.println("d = " + d);
	}

	// 4. ������ ��, ������ ���� ��� �����ϴ� ����
	static int function4(double d) {
		System.out.println("method4");
		System.out.println("d = " + d);

		return (int) d;
	}

	// 5. ������ ���� ������ ������ ���� �ִ� ����
	static int function5() {
		System.out.println("method5");

		return 12;
	}

//	-----------------------------------------

	// method4 ����
	static int getASCIIcode(int a) {

		return (char) a;
	}

	// method3 ����
	static void arrProcess(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
