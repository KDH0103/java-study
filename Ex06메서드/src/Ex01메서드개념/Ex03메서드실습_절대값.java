package Ex01메서드개념;

import java.util.Scanner;

public class Ex03메서드실습_절대값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1,num2);
		System.out.print("결과 확인:" +result);

	}
	
	public static int getAbsoluteValue(int num1, int num2) {
		int result ;
		if(num1>num2) {
			result=num1-num2;
		}else {
			result = num2-num1;
		}
		
		return result;
	}

}
