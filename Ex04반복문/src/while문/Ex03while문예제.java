package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		// [예제2]
		// 사용자의 입력값에서 홀수,짝수, 갯수를 세는 프로그램
		// -1을 입력하면 프로그램 종료
		// *입력값을 판별
		// -> 홀수라면, 홀수카운트+1, 짝수라면 짝수카운드+1
		// ----->홀수 셀 수 있는 변수, 짝수 셀수 있는 변수가 필요함!

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int 짝수개수 = 0;
		int 홀수개수 = 0;

		while (input != -1) {
			if (input % 2 == 0) {
				짝수개수 += 1;

			} else {
				홀수개수 += 1;

			}
			// 값을 재입력받기
			System.out.println("홀수개수 :" + 홀수개수);
			System.out.println("짝수개수 :" + 짝수개수);
			System.out.print("다시 정수를 입력해주세요 : ");
			input = sc.nextInt();
		}

	}

}
