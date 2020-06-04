package day07Quiz;

public class Quiz05IsNumber {
	public static void main(String[] args) {
		// �־��� ���ڿ��� ��� ���ڷθ� �̷���� �ִ��� Ȯ���Ѵ�.
		// ��� ���ڷθ� �̷���� ������ true
		// ���ڷθ� �̷���� ���� ������ false
		// �־��� ���ڿ��� null�̰ų� �� ���ڿ� ""�̶�� false�� ��ȯ�Ѵ�.
		// ��ȯŸ�� : boolean
		// �Ű����� : String str - �˻��� ���ڿ�

		// [Hint] String Ŭ������ charAt(int i)�޼ҵ带 ����ϸ�
		// ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�.

		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
	}

	static boolean isNumber(String str) {
		boolean trueNum = true;
		if(str.equals("") || str == null) {
			trueNum = false;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(!('0' <= c && c <= '9')) {
					trueNum = false;
				}
			}
		}
		return trueNum;
	}
}
