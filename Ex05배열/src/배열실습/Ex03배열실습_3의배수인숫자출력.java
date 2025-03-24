package 배열실습;

import java.util.Scanner;

public class Ex03배열실습_3의배수인숫자출력 {

	public static void main(String[] args) {

		int array[] = new int[10];

		int result = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >>");
			array[i] = sc.nextInt();
			}
		
		System.out.print("3의 배수는:");
		for(int i = 0; i<10; i++) {
			if(array[i]%3==0) {
			System.out.print(array[i]+" ");
			}
		}
		
	}
}
