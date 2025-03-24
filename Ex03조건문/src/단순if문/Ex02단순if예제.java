package 단순if문;

import java.util.Scanner;

public class Ex02단순if예제 {

	public static void main(String[] args) {
		//입력받은 숫자가 3의 배수이자, 5의 배수인지 판별
		
		//입력도구 꺼내기
	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(num%3==0 && num%5==0) {
		System.out.println("3과 5의 배수입니다");
		
	}else {
		
		System.out.println("3과 5의 배수가 아닙니다.");
	}
	

	}

}
