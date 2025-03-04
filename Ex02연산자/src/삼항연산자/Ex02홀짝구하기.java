package 삼항연산자;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수입력 :" );
	
	int a = sc.nextInt();
	
	String result = a%2 ==0 ? "짝수" : "홀수";
	
	System.out.println(result);

	

	}

}
