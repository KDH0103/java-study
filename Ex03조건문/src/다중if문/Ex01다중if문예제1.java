package 다중if문;

import java.util.Scanner;

public class Ex01다중if문예제1 {

	public static void main(String[] args) {
		//다중if문
		//if(조건1) {
		// 조건 1이 참일때	
		//} else if(조건2){
		// 조건 2가 참일때
		//}else if(조건3) {
		//조건 3이 참일때
		//} else {
		// 조건 1~3 다 거짓일때
		//}
		
		//성적 산출 프로그램
		// 90이상 a
		// 80이상 90 미만 b
		// 70 이상 80 미만 c
		// 70미만(나머지) d
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력하세요 : ");
	
	int grade = sc.nextInt();
	
	if(grade>=90) {
		System.out.print("A 학점입니다.");
	}else if (grade>=80) {
		System.out.print("B 학점입니다.");
	}else if(grade>=70) {
		System.out.print("C 학점입니다.");
	}else {
		System.out.print("D 학점입니다.");
	}
	
	
		

	}

}
