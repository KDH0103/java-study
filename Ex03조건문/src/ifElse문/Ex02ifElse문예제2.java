package ifElse문;

import java.util.Scanner;

public class Ex02ifElse문예제2 {

	public static void main(String[] args) {
		System.out.println("=== EVERLAND RESORT===");
	Scanner sc = new Scanner(System.in);
	
	int ticket = 5000;
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	System.out.print("인원수를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(age>=20) {
		System.out.print("총 "+ ticket*num +"원 입니다.");
	} else {
		System.out.print("총 "+ ticket/2*num +"원 입니다.");
	}

	}

	
}
