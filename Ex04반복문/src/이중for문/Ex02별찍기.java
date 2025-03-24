package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {
		   // ***** 출력
	      for (int i = 0; i < 5; i++) { // 0~4, 5회반복
	         System.out.print("*");
	      }
	      
	      System.out.println();
	      System.out.println();

	      // *****
	      // *****
	      // *****
	      // *****
	      // *****
	      // 2. 1번for문을 5번 반복하는 for문
	      for (int j = 0; j < 5; j++) {
	         // 1. *****를 만드는 for문
	         for (int i = 0; i<5; i++) { 
	            System.out.print("*");
	         }
	         System.out.println();
	      }

	      System.out.println();
	      
	      // *
	      // **
	      // ***
	      // ****
	      // *****
	      // 3. 최종
	      for (int j = 0; j < 5; j++) {
	         // 1. *****를 만드는 for문
	         for (int i = 0; i <= j; i++) { 
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      
	      
	      
	      
	      
	      
	      
	   
	}

}
