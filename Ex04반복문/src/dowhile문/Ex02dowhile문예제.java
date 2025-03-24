package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {
		// 랜덤수 만드는법
		// 1. 랜덤 수를 만들어주는 도구 꺼내기
		Random ran = new Random();
		// 2. 도구를 이용해서 랜덤수 생성
		// 소괄호 안에 추출하고 싶은 숫자의 갯수를 적기
		int ranNum = ran.nextInt(9) + 1;
		// System.out.println(ranNum);

		Scanner sc = new Scanner(System.in);

		// 게임을 계속 진행할지 여부를 결정하는 변수
		boolean play = true;

		// do-while 문을 사용하여 반복 실행
		// 덧셈을 반복
		do {
			// 1~9 사이의 랜덤한 숫자 두 개 생성
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;

			// 덧셈 문제 제시
			System.out.print(a + " + " + b + " = ");
			int answer = sc.nextInt(); // 사용자 입력 받기

			// 사용자의 입력이 정답인지 확인
			if (answer == a + b) {
				System.out.println("정답!"); // 정답이면 메시지 출력
			} else {
				// 틀린 경우, 계속할지 묻는 반복문
				while (true) {
					System.out.print("틀렸는데 계속할래? (Y/N) >> ");
					String go = sc.next(); // 사용자의 응답 받기

					if (go.equals("N")) { // 사용자가 'N'을 입력하면 게임 종료
						System.out.println("게임을 종료합니다.");
						play = false; // 루프를 종료하기 위해 play를 false로 변경
						break; // 내부 while (계속할래?) 종료
					} else if (go.equals("Y")) { // 사용자가 'Y'를 입력하면 새 문제 출제
						break; // 내부 while (계속할래?) 종료 후 새로운 문제 출제
					} else {
						System.out.println("잘못된 입력입니다. Y 또는 N을 입력하세요."); // 유효하지 않은 입력 시 경고 메시지 출력
					}
				}
			}
		} while (play); // play 변수가 true일 때만 문제풀이 반복 (false면 종료)
	}
}
