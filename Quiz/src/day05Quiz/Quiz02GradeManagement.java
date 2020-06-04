package day05Quiz;

import java.util.Scanner;

public class Quiz02GradeManagement {
	public static void main(String[] args) {
		// 성적 통계 프로그램
		// 통계를 산출할 학생의 수 >

		// 배열 동적 할당 > student[통계를 낼 학생 수][이름,국,영,수]
		// ex) 홍길동 국, 영, 수 | 일지매 국, 영, 수

		// 이름, 과목 점수 입력 >>
		// 과목 점수를 입력을 받을 때 숫자가 아니면 다시 입력해주세요.

		// 1~100사이의 숫자만 입력받기 -> 넘어가면 범위를 초과했습니다. 다시 입력해주세요.

		// 국어, 수학, 영어의 최고 점수 산출하기
		// 국어, 수학, 영어의 최저 점수 산철하기

		// 모든 점수의 총합
		// 학생 수의 따른 평균 구하기

		// ----------------------

		// 초기화
		int n = 0;
		int sum = 0;
		int avg = 0;

		// 학생 데이터 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 명의 학생을 입력하시겠습니까 > ");

		// 배열 동적 할당
		n = scanner.nextInt();
		String student[][] = new String[n][4];

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
			student[i][0] = scanner.next();

			// 국어 점수 입력 받기
			// 초기화
			char toChar = ' ';
			int toInt = 0;
			String score = "";
			System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해주세요.");
			student[i][1] = scanner.next();

			boolean b = true;
			while (b == true) {
				// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				} else {
					for (int j = 0; j < student.length; j++) {
						toChar = student[i][1].charAt(j);
						// 입력한 숫자가 맞으면 숫자로 변환해주기
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][1];
							toInt = Integer.parseInt(score);
						}
						// 숫자가 아니라면
						if (!('0' <= toChar && toChar <= '9')) {
							System.out.println("잘못입력했습니다.");
							System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해주세요.");
							student[i][1] = scanner.next();
							j--;
						}
						// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
						else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
							System.out.println("잘못입력했습니다.");
							System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해주세요.");
							student[i][1] = scanner.next();
							toChar = student[i][1].charAt(j);
							// 입력한 숫자가 맞으면 숫자로 변환해주기
							if ('0' <= toChar && toChar <= '9') {
								score = student[i][1];
								toInt = Integer.parseInt(score);
							}
							// 입력한게 숫자가 아니라면 toChar에 저장하고 반복문 실행하기
							else {
								toChar = student[i][1].charAt(j);
							}
							j--;
						}
					}
				}
				
				
			}

			// -------------------------------

			// 영어 점수 입력 받기
			System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해주세요.");
			student[i][2] = scanner.next();

			b = true;
			while (b == true) {
				toChar = ' ';
				toInt = 0;
				score = "";
				for (int j = 0; j < student.length; j++) {
					toChar = student[i][2].charAt(j);
					if (!('0' <= toChar && toChar <= '9')) { // 숫자가 아니라면
						System.out.println("잘못입력했습니다.");
						System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해주세요.");
						student[i][2] = scanner.next();
						j--;
					}
					// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
					else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
						System.out.println("잘못입력했습니다.");
						System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해주세요.");
						student[i][2] = scanner.next();
						toChar = student[i][2].charAt(j);
						// 입력한 숫자가 맞으면 숫자로 변환해주기
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][2];
							toInt = Integer.parseInt(score);
						}
						// 입력한게 숫자가 아니라면 toChar에 저장하고 반복문 실행하기
						else {
							toChar = student[i][2].charAt(j);
						}
					}
				}
				// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				}
			}

			// -------------------------------

			// 수학 점수 입력 받기
			System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해주세요.");
			student[i][2] = scanner.next();

			b = true;
			while (b == true) {
				toChar = ' ';
				toInt = 0;
				score = "";
				for (int j = 0; j < student.length; j++) {
					toChar = student[i][3].charAt(j);
					if (!('0' <= toChar && toChar <= '9')) { // 숫자가 아니라면
						System.out.println("잘못입력했습니다.");
						System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해주세요.");
						student[i][3] = scanner.next();
						j--;
					}
					// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
					else if (('0' <= toChar && toChar <= '9') && (toInt < 1 || toInt > 100)) {
						System.out.println("잘못입력했습니다.");
						System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해주세요.");
						student[i][3] = scanner.next();
						toChar = student[i][3].charAt(j);
						// 입력한 숫자가 맞으면 숫자로 변환해주기
						if ('0' <= toChar && toChar <= '9') {
							score = student[i][3];
							toInt = Integer.parseInt(score);
						}
						// 입력한게 숫자가 아니라면 toChar에 저장하고 반복문 실행하기
						else {
							toChar = student[i][3].charAt(j);
						}
					}
				}
				// 숫자로 적었는가? // 1~100까지의 올바른 범위로 입력했는가?
				if (('0' <= toChar && toChar <= '9') && (toInt >= 1 || toInt <= 100)) {
					b = false;
				}
			}
		}

		// ------------------------

		// 국어, 영어, 수학의 최고/최저 점수 산출하기
		int maxKorean, maxEnglish, maxMath, minKorea, minEnglish, minMath;
		maxKorean = maxEnglish = maxMath = minKorea = minEnglish = minMath = 0;

		for (int i = 0; i < student.length; i++) {
			// 문자열을 숫자로 바꿔주기
			String koreanScore = student[i][1];
			String englishScore = student[i][2];
			String mathScore = student[i][3];
			int koreanCompare = Integer.parseInt(koreanScore);
			int englishCompare = Integer.parseInt(englishScore);
			int mathCompare = Integer.parseInt(mathScore);

			// 국어 점수의 최고/최저점
			// compare의 값이 maxKorean의 값보다 크면 maxKorean에 compare값 저장
			if (koreanCompare > maxKorean) {
				maxKorean = koreanCompare;
			}
//			if (koreanCompare < minKorean) {
//				maxKorean = koreanCompare;
//			}

			// 영어 점수의 최고/최저점
			if (englishCompare > maxEnglish) {
				maxEnglish = englishCompare;
			}

			// 수학 점수의 최고/최저점
			if (mathCompare > maxMath) {
				maxMath = mathCompare;
			}
		}

		// 모든 점수의 총합

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 4; j++) {
				// 문자열을 숫자로 변환하기
				int stringToInt = Integer.parseInt(student[i][j]);
				// 변환한 숫자를 합하기
				sum += stringToInt;
			}
		}

		// 학생 수의 따른 평균 구하기
		avg = sum / n;

		// 출력하기
		System.out.println("국어 최고점 = " + maxKorean);
		System.out.println("영어 최고점 = " + maxEnglish);
		System.out.println("수학 최고점 = " + maxMath);
		System.out.println("모든 점수의 총합 = " + sum);
		System.out.println("평균 점수 = " + avg);
	}
}
