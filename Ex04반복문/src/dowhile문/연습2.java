package dowhile문;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		final int 양 = 12000;
		final int 음 = 2000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("먹은 양고기 갯수 입력해주세요:");
		int n = sc.nextInt();
		System.out.print("음료수 갯수 입력해주세요:");
		int k = sc.nextInt();
		
		int result = n%10==0? k-(n/10) : k;
		
		System.out.println(양*n + result*음);

	}

}
