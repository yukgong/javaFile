package day03;

public class Ex01IfClass {
	public static void main(String[] args) {
		int number = 6;

		if (number > 5) {
			System.out.println("number�� 5���� ũ��.");
		}

		if (number >= 6) {
			System.out.println("number�� 6���� ũ�ų� ����.");
		}

		if (number == 6) {
			System.out.println("number�� 6�̴�.");
		}

		if (number != 5) {
			System.out.println("number�� 5�� �ƴϴ�.");
		}

//		---------

		// 0~9���� ����
		if (number >= 0 && number < 10) {
			System.out.println("number�� 0���� 9������ �� �Դϴ�.");
		}

		if (number < 5 || number > 10) {
			System.out.println("numb�� 5���� �۰ų� 10���� ũ��");
		}

//		---------

		if (number > 10) {
			System.out.println("number�� 10���� ũ��.");
		} else { // number <= 10
			System.out.println("number�� 10���� �۰ų� ����.");
		}

		// ���پ� ó���ϴ� ������ �ڵ���� ������ �� �ִ�.
		if (number > 10)
			System.out.println("number�� 10���� ũ��.");
		else // number <= 10
			System.out.println("number�� 10���� �۰ų� ����.");

		// �� �����ϰ� ��������
		if (number > 10)
			System.out.println("number�� 10���� ũ��.");
		else
			System.out.println("number�� 10���� �۰ų� ����.");

//		---------

		// ���� ������ String = (����)? "��" : "��";
		String str;
		str = (number > 10) ? "number�� 10���� ũ��." : "number�� 10���� �۰ų� ����.";
		System.out.println(str);

		// �Ʒ�ó�� ���� �����ڸ� ��¹��� �־ ����� �� �ִ�.
		System.out.println((number > 10) ? "number�� 10���� ũ��." : "number�� 10���� �۰ų� ����.");

//		---------

		// ���Ǻб�
		number = 85;

		if (number == 100) {
			System.out.println("100���Դϴ�.");
		} else if (number >= 90 && number > 100) {
			System.out.println("90�� �̻��Դϴ�.");
		} else if (number >= 80 && number < 90) {
			System.out.println("80�� �̻��Դϴ�.");
		} else {
			System.out.println("80�� �̸��Դϴ�.");
		}
		
		number = 60;
		if(number == 100) 		System.out.println("100���Դϴ�.");
		else if (number >= 90)	System.out.println("90�� �̻��Դϴ�.");
		else if (number >= 80)	System.out.println("80�� �̻��Դϴ�.");
		else					System.out.println("80�� �̸��Դϴ�.");
		
		// ��� �κп� ������ �ɷ����ϴ��� ������ �� �����ϰ�, ������ �׻� ���� ���� �� ���� ���� ��������.
		number = 95;
		if(number >= 80)		System.out.println("80�� �̻��Դϴ�.");
		else if (number >= 90)	System.out.println("90�� �̻��Դϴ�.");
		else if (number == 100) System.out.println("100���Դϴ�.");
		else					System.out.println("80�� �̸��Դϴ�.");
		
		
//		--------
		
		//���ǹ� �ȿ� ���ǹ�
		number = 86;
		if(number >= 80 && number < 90) {
			if(number >= 85) {
				System.out.println("�հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}
		
//		--------
		
		boolean b;
		b = false;
		
		if(b == false) {
			System.out.println("b = " + b + "�Դϴ�.");
		} 
		
		//boolean ������ ����� �� ���� ǥ�� ��� 1
		b = true;
		if (b) { //b�� true��� ���̴�.
			System.out.println("b = " + b + "�Դϴ�.");
		}
		
		//boolean ������ ����� �� ���� ǥ�� ��� 2
		b = false;
		if (!b) { //b�� false��� ���̴�.
			System.out.println("b = " + b + "�Դϴ�.");
		}
		
//		-------------
		
		if(true) {
			System.out.println("������ ����");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
	}
}
