package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		
		//1. 현재, 목표 몸무게 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 :");
		int 현재몸무게 = sc.nextInt();
		System.out.print("목표몸무게 :");
		int 목표몸무게 = sc.nextInt();
		int sum = 0;
		int n = 0;
		
		//2.일주일당 빠지는 값 받고
		// 현재 - 주차별감소량의합 <목표몸무게 멈춤
		
		while(현재몸무게>목표몸무게) {
			System.out.print(++n +"주차 감량 몸무게 :"); 
			int 뺀몸무게 = sc.nextInt();
			현재몸무게 -=뺀몸무게;
			
			}
		
		//3.종료메시지
		System.out.print("종료되었습니다.");
	}

}
