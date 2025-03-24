package for문;

import java.util.Scanner;

public class 세균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("세균의 마리수 :");
		int n = sc.nextInt();
		System.out.print("경과한 시간(한시간 단위) :");
		int t = sc.nextInt();
		// i시간, j마리수

		for (int i = 0; i < t; i++) {
			n *= 2;
		}
		System.out.println(n);
	}

}
