package while문;

import java.util.Random;
import java.util.Scanner;

public class 연습 {
	// [예제2]
	// 사용자의 입력값에서 홀수,짝수, 갯수를 세는 프로그램
	// -1을 입력하면 프로그램 종료
	// *입력값을 판별
	// -> 홀수라면, 홀수카운트+1, 짝수라면 짝수카운드+1
	// ----->홀수 셀 수 있는 변수, 짝수 셀수 있는 변수가 필요함!

	public static void main(String[] args) {
		// 랜덤수 만드는법
		// 1. 랜덤 수를 만들어주는 도구 꺼내기
		Random ran = new Random();
		// 2. 도구를 이용해서 랜덤수 생성
		// 소괄호 안에 추출하고 싶은 숫자의 갯수를 적기
		int ranNum = ran.nextInt(9) + 1;
		// System.out.println(ranNum);

		Scanner sc = new Scanner(System.in);

		do {
			// 1. 랜덤수 2개 생성
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;

			// 2. 사용자에게 질문+답
			System.out.print(a + "+" + b + "=");
			int answer = sc.nextInt();

			// 3. 정답 판별
			if (answer == a + b) {
				System.out.println("정답!");
			} else {
				System.out.print("틀렸는데 계속할래? >> ");
				String go = sc.next();
				// String의 값을 비교하는 방법 : 변수.equals(비교값)
				if (!(go.equals("Y"))) {
					break;
				}
			}
		} while (true);
		System.out.println("종료!");
	}
}
