package for문;

import java.util.Scanner;

public class 각도기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("각도를 입력하세요 : ");
		int a = sc.nextInt();

		if (a < 90) System.out.print("예각");
		else if (a == 90) System.out.print("직각");
		else if (a > 90 && a < 180) System.out.print("둔각");
		else if (a == 180) System.out.print("평각");

	}
}
