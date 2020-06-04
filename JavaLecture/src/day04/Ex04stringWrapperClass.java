package day04;

public class Ex04stringWrapperClass {
	public static void main(String[] args) {
//		string 클래스가 없었다면...?
		char strChar[] = { '안', '녕', '하', '세', '요' };
		strChar[0] = '건';
		strChar[1] = '강';

		// 너무 불편했을것...

//		--------

		// string 사용법
		String str1;
		// class명 : string
		// str : Object(객체), instance(주체) == class를 변수로 만든 것

		str1 = "안녕하세요";
		System.out.println("str = " + str1);

		// string 사용법 :
		String str2 = new String("하이");

		// string 사용법 : 문자열 결합
		String str3;
		str3 = str1 + str2;
		System.out.println("str3 = " + str3);

		String str4;
		str4 = str1.concat(str2); // concat은 문자열 결합
		System.out.println("str4 = " + str4);

//		-----------------

		// 비교함수 equals
		String str5 = "hello";
		String str6 = "hell";

		str6 = str6 + "o";

		// 문자끼리 비교할 때 비교연산자로 비교하면
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없다.
		if (str5 == str6) {
			System.out.println("str5와 str6는 같은 문자열입니다.");
		} else {
			System.out.println("str5와 str6는 다른 문자열입니다.");
		}

		// 문자열과 문자열을 비교할때! 스트링은 equals로 비교
		boolean b = str5.equals(str6);
		if (b == true) {
			System.out.println("str5와 str6는 같은 문자열입니다.");
		} else {
			System.out.println("str5와 str6는 다른 문자열입니다.");
		}

//		-------------------

		// indexOf : 지정문자의 위치 탐색 (탐색 방향 ->)
		// lastIndexOf : 지정문자의 위치를 끝에서부터 탐색 (탐색 방향 <-)

		char cArr[] = { 'a', 'b', 'c', 'd' };

		String str7 = "abcdefghabcd";
		int n;
		n = str7.indexOf("d"); // ()안에 들어간 문자의 위치를 나타내준다. n = 3
		System.out.println("n = " + n);

		n = str7.lastIndexOf("d");
		System.out.println("n = " + n);// ()안에 들어간 문자의 위치를 나타내준다. n = 11

//		-------------------

		// 길이 length -> len
		int Array[] = { 1, 2, 3, 4, 5 };
		System.out.println("배열의 길이: " + Array.length);

		str7 = "I can do it";
		int len = str7.length();
		System.out.println("문자열의 길이: " + len); // 공백까지 포함해서 길이를 표시한다.

//		----------------------

		// replace(수정)
		String str8 = "A*B**C";
		String repStr = str8.replace("*", "+"); // *을 +로 바꿔라
		System.out.println(repStr);

		// replace는 문자열을 탐색할때 사용된다.
		// 크롤링시 많이쓴 키워드를 탐색하기 위해서는 공백 문자나 특정 문자를 제거해야한다.
		// 그런것을 제거를 위해 사용하는 것이 replace다.
		// 예제
		String s = "오늘은 자바를 배울겁니다. 자바는 무엇을 하느냐. 자바란. 자바의 정석. 호잇";
		String rs = s.replace(" ", "");
		System.out.println(rs);

//		----------------------

		// split
		// split은 token을 활용해서 문자열을 자른다.
		// ex) 홍길동-24-2001/10/12-180

		String str9 = "홍길동-24-2001/10/12-180";
		String splitArr[] = str9.split("-");

		// splitArr 배열 안의 데이터 출력하기
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
//		 output ->	홍길동
//					24
//					2001/10/12
//					180

//		----------------------------

		// substring 범위를 통해서 문자열을 취득()
		// 문자열에서 원하는 부분까지만 잘라서 가져올 수 있다.
		System.out.println("------substring------");
		String str10 = "abcdefghij";
		String subStr = str10.substring(0, 4); // beginIndex, endIndex
		System.out.println(subStr);

		subStr = str10.substring(4);
		System.out.println(subStr); // beginIndex -> 시작점만 지정해줬다.

//		----------------------------------

		// toUpperCase : 모든 문자를 대문자로 변경
		// toLowerCase : 모든 문자를 소문자로 변경
		// 예전에는 회원가입시 abcd == ABCD로 봤기 때문에 사용처가 많았으나, 지금은 잘 사용안함.
		String str11 = "abcDEF";
		String upper = str11.toUpperCase();
		String lower = str11.toLowerCase();

		System.out.println(upper);
		System.out.println(lower);

//		----------------------------

		// trim -> 기억해둘것!
		// 앞뒤의 공백을 없애주는 함수
		String str12 = "            java c언어 Python       ";
		String trimStr = str12.trim();
		System.out.println("trimStr:" + trimStr + "-");
		// 회원가입, 검색시 실수로 들어간 공백을 없애야 문자열을 제대로 비교할 수 있으므로 trim을 사용한다.

//		---------------------------------

		// valueOf
		// 문자열 -> 숫자 "123" -> 123
		// 숫자 -> 문자열 123 -> "123"
		// 웹상에서 받는 데이터를 문자열로 변환 시켜주는 작업이 필요하다.
		// 숫자든 뭐든 무조건 문자로 바꿔주는 역할을 하는게 valueOf이다.

		int num = 123;
		long lo = 1234L;
		double d = 123.4567;

		String is = String.valueOf(num);
		String ls = String.valueOf(lo);
		String ds = String.valueOf(d);

		System.out.println(num + lo + d); // 숫자 그대로 이므로 연산처리된다.
		System.out.println(is + ls + ds); // 문자열로 바꿨기 때문에 옆에 붙은 형태

		// valueOf보다 더 간단하게 사용하는 방법
		int number = 234;
		String numStr = number + ""; // ""는 문자열이기 때문의 앞의 숫자를 흡수해 문자열로 만든다.

//		-----------------------------------

		// contains 탐색
		// contains는 문자열 안에서 내가 찾는 문자열을 포함하는 true/false로 확인할 수 있다.
		String str13 = "서 울시 강남구 서초동";
		boolean b1 = str13.contains("서울시");
		System.out.println(b1);

//		-----------------------

		// charAt		array[2] ->
		// String str = "hello"; == charArray[5] = "가나다라마";
		// 한 문자씩 꺼낼 수 있는 함수이다. 문자열을 탐색할 수 있다.
		String str14 = "가나다라마";
		char ch = str14.charAt(3);
		System.out.println(ch);

	}
}
