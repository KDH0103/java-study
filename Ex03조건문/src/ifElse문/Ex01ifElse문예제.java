package ifElse문;

import java.util.Scanner;

public class Ex01ifElse문예제 {

	public static void main(String[] args) {
		// 사용자가 입력해준 점수(grade)가
		// 60 이상이라면 "합격입니다." 출력
		// 아니라면, "불합격입니다."출력
		// if Else 문
		// if(조건식) {
		// 참일 경우 실행
		// } else {
		// 거짓인 경우 실행
		// }

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력해주세요 :");
		int grade = sc.nextInt();

		if (grade >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
