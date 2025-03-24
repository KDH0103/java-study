package for문;

import java.util.Scanner;

public class 개미군단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사냥감의 체력 : ");
		int hp = sc.nextInt();
		int 장 = 5;
		int 병 = 3;
		int 일 = 1;

		int 장수 = hp/장;
		int a = hp%장;
		int 병수 = a/3;
		int b = a%3;
		int 일수 = b/1;
		
		System.out.println(장수+병수+일수);
		

	}

}
