package CalendarTest.src.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * Calendar year month day Date time
		 */

		// 일정관리
		// Calendar cal = new GregorianCalendar();

		Calendar cal = Calendar.getInstance();

		// 날짜
		// getter
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11
		int day = cal.get(Calendar.DATE);

		System.out.println(year + "년 " + month + "월 " + day + "일");

		// setter
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 15);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11
		day = cal.get(Calendar.DATE);

		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(Calendar.JANUARY);

		// 요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1 ~ 7 일 ~ 토
		System.out.println(weekday);

		switch (weekday) {
		case 6:
			System.out.println("금요일입니다");
			break;
		}

		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 7 - 1);

		// 지정한 달의 마지막 날짜 28 29 30 31
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday = " + lastday);

		// 위의 빈칸
		cal.set(Calendar.DATE, 1); // 1일

		weekday = cal.get(Calendar.DAY_OF_WEEK); // 1 ~ 7
		int up = (weekday - 1) % 7;

		System.out.println("윗쪽 빈칸의 수 :" + up);

		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday :" + lastday);

		// 밑의 빈칸
		cal.set(Calendar.DATE, lastday);
		weekday = cal.get(Calendar.DAY_OF_WEEK);

		int down = 7 - weekday;
		System.out.println("밑쪽의 빈칸의 수 : " + down);
		
		
		//----------------------------------------------
		
		// 달력을 출력
		year = 2021;
		month = 5;

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);

		int _startday = cal.get(Calendar.DAY_OF_WEEK);
		int _lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;

		System.out.println(year + "년 " + month + "월");
		System.out.println("=================================================================");

		String week_day = "일월화수목금토";

		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();

		System.out.println("=================================================================");

		// 윗쪽 빈칸
		for (int i = 1; i < _startday; i++) {
			System.out.print("*" + "\t");
		}

		// 날짜
		for (int i = 0; i < _lastday; i++) {
			System.out.print(_date + "\t");

			if ((_date + _startday - 1) % 7 == 0) {
				System.out.println();
			}

			_date++;
		}

		// 밑쪽 빈칸
		for (int i = 0; i < (7 - (_startday + _lastday - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();

		System.out.println("=================================================================");

	}

}
