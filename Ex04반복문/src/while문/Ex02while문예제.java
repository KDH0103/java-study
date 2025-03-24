package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		//사용자의 입력값
		int input = sc.nextInt();
		//입력값 누적용 변수
		int 누적결과 = 0;
		
		while(input != -1) {
			//사용자에게 입력받은 값을 누적 저장
			누적결과 += input;
			System.out.println("누적결과 : "+ 누적결과 );
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
		}
		
		
	}


}
