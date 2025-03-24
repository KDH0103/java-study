package dowhile문;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선생님의 나이를 입력해주세요");
		
		int age = sc.nextInt();
		
		System.out.println(age+"살 선생님 : "+(2025-age)+"년생입니다." );
	}
}