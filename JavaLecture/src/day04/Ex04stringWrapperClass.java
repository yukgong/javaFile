package day04;

public class Ex04stringWrapperClass {
	public static void main(String[] args) {
//		string Ŭ������ �����ٸ�...?
		char strChar[] = { '��', '��', '��', '��', '��' };
		strChar[0] = '��';
		strChar[1] = '��';

		// �ʹ� ����������...

//		--------

		// string ����
		String str1;
		// class�� : string
		// str : Object(��ü), instance(��ü) == class�� ������ ���� ��

		str1 = "�ȳ��ϼ���";
		System.out.println("str = " + str1);

		// string ���� :
		String str2 = new String("����");

		// string ���� : ���ڿ� ����
		String str3;
		str3 = str1 + str2;
		System.out.println("str3 = " + str3);

		String str4;
		str4 = str1.concat(str2); // concat�� ���ڿ� ����
		System.out.println("str4 = " + str4);

//		-----------------

		// ���Լ� equals
		String str5 = "hello";
		String str6 = "hell";

		str6 = str6 + "o";

		// ���ڳ��� ���� �� �񱳿����ڷ� ���ϸ�
		// �ּҰ��� ���ϱ� ������ ���ϴ� ����� ���� �� ����.
		if (str5 == str6) {
			System.out.println("str5�� str6�� ���� ���ڿ��Դϴ�.");
		} else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ��Դϴ�.");
		}

		// ���ڿ��� ���ڿ��� ���Ҷ�! ��Ʈ���� equals�� ��
		boolean b = str5.equals(str6);
		if (b == true) {
			System.out.println("str5�� str6�� ���� ���ڿ��Դϴ�.");
		} else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ��Դϴ�.");
		}

//		-------------------

		// indexOf : ���������� ��ġ Ž�� (Ž�� ���� ->)
		// lastIndexOf : ���������� ��ġ�� ���������� Ž�� (Ž�� ���� <-)

		char cArr[] = { 'a', 'b', 'c', 'd' };

		String str7 = "abcdefghabcd";
		int n;
		n = str7.indexOf("d"); // ()�ȿ� �� ������ ��ġ�� ��Ÿ���ش�. n = 3
		System.out.println("n = " + n);

		n = str7.lastIndexOf("d");
		System.out.println("n = " + n);// ()�ȿ� �� ������ ��ġ�� ��Ÿ���ش�. n = 11

//		-------------------

		// ���� length -> len
		int Array[] = { 1, 2, 3, 4, 5 };
		System.out.println("�迭�� ����: " + Array.length);

		str7 = "I can do it";
		int len = str7.length();
		System.out.println("���ڿ��� ����: " + len); // ������� �����ؼ� ���̸� ǥ���Ѵ�.

//		----------------------

		// replace(����)
		String str8 = "A*B**C";
		String repStr = str8.replace("*", "+"); // *�� +�� �ٲ��
		System.out.println(repStr);

		// replace�� ���ڿ��� Ž���Ҷ� ���ȴ�.
		// ũ�Ѹ��� ���̾� Ű���带 Ž���ϱ� ���ؼ��� ���� ���ڳ� Ư�� ���ڸ� �����ؾ��Ѵ�.
		// �׷����� ���Ÿ� ���� ����ϴ� ���� replace��.
		// ����
		String s = "������ �ڹٸ� ���̴ϴ�. �ڹٴ� ������ �ϴ���. �ڹٶ�. �ڹ��� ����. ȣ��";
		String rs = s.replace(" ", "");
		System.out.println(rs);

//		----------------------

		// split
		// split�� token�� Ȱ���ؼ� ���ڿ��� �ڸ���.
		// ex) ȫ�浿-24-2001/10/12-180

		String str9 = "ȫ�浿-24-2001/10/12-180";
		String splitArr[] = str9.split("-");

		// splitArr �迭 ���� ������ ����ϱ�
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
//		 output ->	ȫ�浿
//					24
//					2001/10/12
//					180

//		----------------------------

		// substring ������ ���ؼ� ���ڿ��� ���()
		// ���ڿ����� ���ϴ� �κб����� �߶� ������ �� �ִ�.
		System.out.println("------substring------");
		String str10 = "abcdefghij";
		String subStr = str10.substring(0, 4); // beginIndex, endIndex
		System.out.println(subStr);

		subStr = str10.substring(4);
		System.out.println(subStr); // beginIndex -> �������� ���������.

//		----------------------------------

		// toUpperCase : ��� ���ڸ� �빮�ڷ� ����
		// toLowerCase : ��� ���ڸ� �ҹ��ڷ� ����
		// �������� ȸ�����Խ� abcd == ABCD�� �ñ� ������ ���ó�� ��������, ������ �� ������.
		String str11 = "abcDEF";
		String upper = str11.toUpperCase();
		String lower = str11.toLowerCase();

		System.out.println(upper);
		System.out.println(lower);

//		----------------------------

		// trim -> ����صѰ�!
		// �յ��� ������ �����ִ� �Լ�
		String str12 = "            java c��� Python       ";
		String trimStr = str12.trim();
		System.out.println("trimStr:" + trimStr + "-");
		// ȸ������, �˻��� �Ǽ��� �� ������ ���־� ���ڿ��� ����� ���� �� �����Ƿ� trim�� ����Ѵ�.

//		---------------------------------

		// valueOf
		// ���ڿ� -> ���� "123" -> 123
		// ���� -> ���ڿ� 123 -> "123"
		// ���󿡼� �޴� �����͸� ���ڿ��� ��ȯ �����ִ� �۾��� �ʿ��ϴ�.
		// ���ڵ� ���� ������ ���ڷ� �ٲ��ִ� ������ �ϴ°� valueOf�̴�.

		int num = 123;
		long lo = 1234L;
		double d = 123.4567;

		String is = String.valueOf(num);
		String ls = String.valueOf(lo);
		String ds = String.valueOf(d);

		System.out.println(num + lo + d); // ���� �״�� �̹Ƿ� ����ó���ȴ�.
		System.out.println(is + ls + ds); // ���ڿ��� �ٲ�� ������ ���� ���� ����

		// valueOf���� �� �����ϰ� ����ϴ� ���
		int number = 234;
		String numStr = number + ""; // ""�� ���ڿ��̱� ������ ���� ���ڸ� ����� ���ڿ��� �����.

//		-----------------------------------

		// contains Ž��
		// contains�� ���ڿ� �ȿ��� ���� ã�� ���ڿ��� �����ϴ� true/false�� Ȯ���� �� �ִ�.
		String str13 = "�� ��� ������ ���ʵ�";
		boolean b1 = str13.contains("�����");
		System.out.println(b1);

//		-----------------------

		// charAt		array[2] ->
		// String str = "hello"; == charArray[5] = "�����ٶ�";
		// �� ���ھ� ���� �� �ִ� �Լ��̴�. ���ڿ��� Ž���� �� �ִ�.
		String str14 = "�����ٶ�";
		char ch = str14.charAt(3);
		System.out.println(ch);

	}
}
