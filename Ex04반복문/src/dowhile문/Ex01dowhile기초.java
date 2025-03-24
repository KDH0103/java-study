package dowhile문;

import java.util.Scanner;

public class Ex01dowhile기초 {

	public static void main(String[] args) {
		// do while문
		// while의 조건을 검사하기 전에, 무조건 한번은
		// 실행구문을 실행시켜주는 반복문

		// --> 검사조건이 false여도 한 번은 실행된다!

		// do(로직)while(조건);

//		int a = 3;
//		
//		do {
//			System.out.println("a는 0이다");
//		}while(a==0);
//		
//		//몸무게 감량 문제 다시 풀어보기!
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int goal = sc.nextInt();//목표
//		int now = sc.nextInt();//현재
//
//		do {
//			int kg = sc.nextInt();//이번주 감량 몸무게
//			now=now-kg;
//		} while(now>=goal);
//		System.out.println("종료!");
//		
		// 무한 반복문
		// while의 조건을 무조건 참이 되게 만듬때
		// 무한 반복문을 멈추고 싶을 때 :
		// --->내부에 조건을 걸어서, 조건에 해당될 때 break;
		int b = 0;

		while (true) {
			System.out.println(b++);

			if (b == 50) {
				break;
			}

		}

	}

}