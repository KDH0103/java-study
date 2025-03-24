package for문;

import java.util.Scanner;

public class 만나이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요:");
		int year = sc.nextInt();
		System.out.print("월를 입력하세요:");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요:");
		int day = sc.nextInt();
		
		final int now = 2025;
		
		
		System.out.println(year+"년"+month+"월"+day+"일생의 만나이를 출력하기");
		System.out.print(">>>>>"+year+"."+month+"."+day +":"+ (now-year));
		
		
	}

}
