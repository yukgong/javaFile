package day06Practice;

import java.util.Scanner;

public class Ex02GradeManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 학생 성적 관리용 2차원 배열

		// String -> 이름, 숫자 -> parseInt int -> 숫자
		// 학생수, 이름 + 과목(국어, 영어, 수학)

		// 선언부
		String name, korean, english, math;

		// 1. 학생 수를 입력
		System.out.print("학생 수를 입력해주세요 : ");
		int studentNum = scanner.nextInt();

		// 2. 동적할당
		String arr[][] = new String[studentNum][4];

		// 3. 입력: 이름, 국어, 영어, 수학
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 학생---------");

			// 이름
			System.out.print("이름 : ");
			name = scanner.next();

			// 국어
			while (true) {
				System.out.print("국어 : ");
				korean = scanner.next();

				// 숫자인가?
				boolean trueNum = true;
				for (int j = 0; j < korean.length(); j++) {
					char c = korean.charAt(j);
					if (!('0' <= c && c <= '9')) {
						trueNum = false;
						break;
					}
				}

				// 숫자가 맞다면 다음으로
				if (trueNum == false) {
					System.out.println("잘못입력했습니다. 다시 입력해주세요.");
					continue;
				}

				// 1 ~ 100사이의 숫자
				int stringToNum = Integer.parseInt(korean);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("범위를 초과 했습니다. 다시 입력해주세요.");
					continue;
				}
				// 조건이 모두 맞다면 국어 반복문 종료
				break;
			}

			// 영어
			while (true) {

				System.out.print("영어 : ");
				english = scanner.next();

				// 숫자인가?
				boolean trueNum = true;
				for (int j = 0; j < english.length(); j++) {
					// 한글자씩 숫자인지 확인하기 위해 string -> char로 표현하기
					char c = english.charAt(j);
					if (!('0' <= c && c <= '9')) { // 숫자가 아니면
						trueNum = false;
						break;
					}
				}

				// 숫자가 맞다면 다음으로 아니라면 다시 >>
				if (trueNum == false) {
					System.out.println("잘못입력했습니다. 다시 입력해주세요.");
					continue;
				}

				// 1 ~ 100사이의 숫자
				// 범위에 맞는지 확인하기 위해 String -> int로 표현하기
				int stringToNum = Integer.parseInt(english);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("범위를 초과 했습니다. 다시 입력해주세요.");
					continue;
				}

				// 조건이 모두 맞다면 국어 반복문 종료
				break;
			}

			// 수학
			while (true) {
				System.out.print("수학 : ");
				math = scanner.next();

				// 숫자인가?
				boolean trueNum = true;
				for (int j = 0; j < math.length(); j++) {
					char c = math.charAt(j);
					if (!('0' <= c && c <= '9')) {
						trueNum = false;
						break;
					}
				}

				// 숫자가 맞다면 다음으로
				if (trueNum == false) {
					System.out.println("잘못입력했습니다. 다시 입력해주세요.");
					continue;
				}

				// 1 ~ 100사이의 숫자
				int stringToNum = Integer.parseInt(math);
				if (stringToNum < 0 || stringToNum > 100) {
					System.out.println("범위를 초과 했습니다. 다시 입력해주세요.");
					continue;
				}
				// 조건이 모두 맞다면 국어 반복문 종료
				break;
			}

			// 데이터를 배열에 대입
			arr[i][0] = name;
			arr[i][1] = korean;
			arr[i][2] = english;
			arr[i][3] = math;
		}

		//------------------------------------
		
		// 점수를 확인할 배열 만들고 숫자로 만들어서 과목별 점수 넣기 (국영수)
		int studentGrade[][] = new int[studentNum][3];
		for (int j = 0; j < arr.length; j++) {
			studentGrade[j][0] = Integer.parseInt(arr[j][1]); // 국어
			studentGrade[j][1] = Integer.parseInt(arr[j][2]); // 영어
			studentGrade[j][2] = Integer.parseInt(arr[j][3]); // 수학
		}
		
		// 4. 국어, 수학, 영어 최고 점수
		int max = 0;
		for (int j = 0; j < studentGrade.length; j++) {
			if(max < studentGrade[j][0]) {
				max = studentGrade[j][0];
			}
		}
		
		// 5. 국어, 수학, 영어 최저 점수
		int min = studentGrade[0][0];
		for (int j = 0; j < studentGrade.length; j++) {
			if(min > studentGrade[j][0]) {
				min = studentGrade[j][0];
			}
		}
		
		// 6. 모든 점수의 총합
		int sum = 0;
		for (int j = 0; j < studentGrade.length; j++) {
			for (int j2 = 0; j2 < studentGrade[0].length; j2++) {
				sum += studentGrade[j][j2];
			}
			
		}
		
		// 7. 학생 수에 따른 평균
		double avg = (double)sum / studentNum;
		
		
		// print---------------------------------------------------
		System.out.println("국어 최고점수 :" + max);
		System.out.println("국어 최저점수 :" + min);
		System.out.println("점수 총합 :" + sum);
		System.out.printf("평균 점수: %.1f\n", avg);
	}
}
