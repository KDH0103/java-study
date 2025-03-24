package for문;

import java.util.Scanner;

public class Ex03for문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int count = sc.nextInt();
		
		System.out.print("어느 수까지 출력:");
		int num = sc.nextInt();
		
		

		for (int i = 1; i <= num; i++) {
	
			System.out.println(count + "*" + i + "=" + i * count);

		}

	}

}
