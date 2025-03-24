package dowhile문;

import java.util.Scanner;

public class 낙서낙서장 {

	public static void main(String[] args) {
	    // -1을 입력받으면 프로그램 종료
	      // 사용자의 입력값은 누적해서 가지고 있어야 함
	      
	      Scanner sc = new Scanner(System.in);
	      
	      // 사용자의 입력값
	      int input = sc.nextInt();
	      System.out.println("사용자의 입력값 : " + input);
	      
	      // 입력값 누적용 변수
	      int sum = 0;
	      
	      do{
	         // 사용자에게 입력받은 값을 누적 저장
	         sum += input;
	         System.out.println("누적값 : " + sum);
	         
	         // 입력값이 -1이 아닌 경우에는 다시 입력받기
	         input = sc.nextInt();
	         System.out.println("다시 입력받은 값 : " + input);
	      }while(input != -1); 
	      

	   }

	}
