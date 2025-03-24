package 보충수업;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;

		do {

			System.out.println("사용자의 입력값 : " + input);
			input = sc.nextInt();
			if (input != -1) { // -1이 아닐 때만 합산
				sum += input;
				System.out.println("현재 누적값: " + sum);
			}

		} while (input != -1); // -1이면 종료

		System.out.println("프로그램 종료. 최종 누적값: " + sum);
	}
}