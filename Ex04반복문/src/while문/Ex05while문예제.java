package while문;

import java.util.Scanner;

public class Ex05while문예제 {

	public static void main(String[] args) {
		//예제4
		//A,B를 입력 받은 후 두 수의 차를 출력하는 프로그램
		
		//1-1. 입력 도구 꺼내기
		//1-2 A,b변수에 정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("A 입력 >>");
		int a = sc.nextInt();
		System.out.print("B 입력 >>");
		int b = sc.nextInt();
		
		//2.반복
		//2-1 반복조건 - a,b가 둘다 0이 아닐때
		//2-2 반복내용 - 그당시 a-b가 뭔지 출력
		
		while(!(a==0 && b==0)) {
			
			System.out.println("결과 입력 >>" + (a-b));
			System.out.print("A 입력 >>");
			a = sc.nextInt();
			System.out.print("B 입력 >>");
			b = sc.nextInt();
			
		}
		System.out.print("종료되었습니다.");
		//3종료
		//a,b 둘다 0 받으면 종료
		
	}

}
