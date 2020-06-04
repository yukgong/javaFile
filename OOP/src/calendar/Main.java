package calendar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar 클래스를 참조하는 static 메소드

//		// 날짜 getter
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11로 숫자가 잡혀있기 때문에 +1해줘서 1월부터 12월까지로 잡히도록 만들어준다.
//		int day = cal.get(Calendar.DATE);
//
//		System.out.println(year + "년 " + month + "월 " + day + "일");
//
//		// 날짜 setter
//		cal.set(Calendar.YEAR, 2021);
//		cal.set(Calendar.MONTH, Calendar.MAY);
//		cal.set(Calendar.DATE, 1);
//		
//		// setter로 설정된 내용을 화면에 출력
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11로 숫자가 잡혀있기 때문에 +1해줘서 1월부터 12월까지로 잡히도록 만들어준다.
//		day = cal.get(Calendar.DATE);
//
//		System.out.println(year + "년 " + month + "월 " + day + "일");
//
//		System.out.println(Calendar.JANUARY + 1);// -> 1월이지만 실제 데이터는 0으로 표기된다.
//
//		// --------------------------
//
//		// 요일
//		int weekday = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(weekday); // -> 1 ~7 까지의 숫자로 표기된다. 일 ~ 토
//
//		switch (weekday) {
//		case 1:
//			System.out.println("일요일 입니다.");
//			break;
//		case 2:
//			System.out.println("월요일 입니다.");
//			break;
//		case 3:
//			System.out.println("화요일 입니다.");
//			break;
//		case 4:
//			System.out.println("수요일 입니다.");
//			break;
//		case 5:
//			System.out.println("목요일 입니다.");
//			break;
//		case 6:
//			System.out.println("금요일 입니다.");
//			break;
//		case 7:
//			System.out.println("토요일 입니다.");
//			break;
//		}

		// -----------------------------

		// 달력 만들기

//		// 지정한 달의 마지막 날짜 28, 29, 30, 31
//		cal.set(Calendar.YEAR, 2021);
//		cal.set(Calendar.MONTH, 5 - 1);
//
//		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println("LastDay = " + lastday);
//
//		// 달력을 만들때 위의 빈칸을 어떻게 계산할지?
//		cal.set(Calendar.DATE, 1);
//		int weekday = cal.get(Calendar.DAY_OF_WEEK);
//		int blank = (weekday - 1) % 7;
//		System.out.println("윗쪽 빈칸의 갯수 = " + blank);
//
//		// 밑에 빈칸은 어떻게 계산할까?
//		cal.set(Calendar.DATE, lastday);
//		weekday = cal.get(Calendar.DAY_OF_WEEK);
//
//		int down = 7 - weekday;
//		System.out.println("밑쪽의 빈칸의 수 : " + down);

		// 달력 출력하기
		int year = 2020;
		int month = 6;

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.YEAR, 1);

		int _startday = cal.get(Calendar.DAY_OF_WEEK);
		int _lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;

		System.out.println("----------------------" + year + "년 " + month + "월" + "---------------------");

		// 날짜
		String week_day = "일월화수목금토";
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();

		// 윗쪽 빈칸
		for (int i = 1; i < _startday; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜
		for (int i = 0; i < _lastday; i++) {
			System.out.print(_date + "\t");
			
			if((_date + _startday -1) % 7 == 0) {
				System.out.println();
			}
			_date++;
		}
		
		// 밑쪽 빈칸
		for (int i = 0; i < (7-(_startday + _lastday -1) % 7); i++) {
			System.out.print("*" + "\t");
		}
	}

}
