package calendar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar Ŭ������ �����ϴ� static �޼ҵ�

//		// ��¥ getter
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11�� ���ڰ� �����ֱ� ������ +1���༭ 1������ 12�������� �������� ������ش�.
//		int day = cal.get(Calendar.DATE);
//
//		System.out.println(year + "�� " + month + "�� " + day + "��");
//
//		// ��¥ setter
//		cal.set(Calendar.YEAR, 2021);
//		cal.set(Calendar.MONTH, Calendar.MAY);
//		cal.set(Calendar.DATE, 1);
//		
//		// setter�� ������ ������ ȭ�鿡 ���
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11�� ���ڰ� �����ֱ� ������ +1���༭ 1������ 12�������� �������� ������ش�.
//		day = cal.get(Calendar.DATE);
//
//		System.out.println(year + "�� " + month + "�� " + day + "��");
//
//		System.out.println(Calendar.JANUARY + 1);// -> 1�������� ���� �����ʹ� 0���� ǥ��ȴ�.
//
//		// --------------------------
//
//		// ����
//		int weekday = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(weekday); // -> 1 ~7 ������ ���ڷ� ǥ��ȴ�. �� ~ ��
//
//		switch (weekday) {
//		case 1:
//			System.out.println("�Ͽ��� �Դϴ�.");
//			break;
//		case 2:
//			System.out.println("������ �Դϴ�.");
//			break;
//		case 3:
//			System.out.println("ȭ���� �Դϴ�.");
//			break;
//		case 4:
//			System.out.println("������ �Դϴ�.");
//			break;
//		case 5:
//			System.out.println("����� �Դϴ�.");
//			break;
//		case 6:
//			System.out.println("�ݿ��� �Դϴ�.");
//			break;
//		case 7:
//			System.out.println("����� �Դϴ�.");
//			break;
//		}

		// -----------------------------

		// �޷� �����

//		// ������ ���� ������ ��¥ 28, 29, 30, 31
//		cal.set(Calendar.YEAR, 2021);
//		cal.set(Calendar.MONTH, 5 - 1);
//
//		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println("LastDay = " + lastday);
//
//		// �޷��� ���鶧 ���� ��ĭ�� ��� �������?
//		cal.set(Calendar.DATE, 1);
//		int weekday = cal.get(Calendar.DAY_OF_WEEK);
//		int blank = (weekday - 1) % 7;
//		System.out.println("���� ��ĭ�� ���� = " + blank);
//
//		// �ؿ� ��ĭ�� ��� ����ұ�?
//		cal.set(Calendar.DATE, lastday);
//		weekday = cal.get(Calendar.DAY_OF_WEEK);
//
//		int down = 7 - weekday;
//		System.out.println("������ ��ĭ�� �� : " + down);

		// �޷� ����ϱ�
		int year = 2020;
		int month = 6;

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.YEAR, 1);

		int _startday = cal.get(Calendar.DAY_OF_WEEK);
		int _lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;

		System.out.println("----------------------" + year + "�� " + month + "��" + "---------------------");

		// ��¥
		String week_day = "�Ͽ�ȭ�������";
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();

		// ���� ��ĭ
		for (int i = 1; i < _startday; i++) {
			System.out.print("*" + "\t");
		}
		
		// ��¥
		for (int i = 0; i < _lastday; i++) {
			System.out.print(_date + "\t");
			
			if((_date + _startday -1) % 7 == 0) {
				System.out.println();
			}
			_date++;
		}
		
		// ���� ��ĭ
		for (int i = 0; i < (7-(_startday + _lastday -1) % 7); i++) {
			System.out.print("*" + "\t");
		}
	}

}
