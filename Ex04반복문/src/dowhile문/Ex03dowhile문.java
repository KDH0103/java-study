package dowhile문;

import java.util.Scanner;

public class Ex03dowhile문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String id = "test";
		final String pw = "test1234";
		int count = 0;

		do {
			// 로그인 실패 횟수를 샌다
			System.out.print("아이디를 입력하세요 :");
			String inputid = sc.next();
			System.out.print("비밀번호를 입력하세요 :");
			String inputpw = sc.next();

			if (id.equals("inputid") && pw.equals("inputpw")) {
				System.out.println("로그인 성공");
				break;
			} else {

				System.out.println("로그인 실패");
				count++;
				if (count == 3) {
					System.out.println("세번이상틀렸어요~");
					break;
				}

			}
		} while (true);

	}

}
