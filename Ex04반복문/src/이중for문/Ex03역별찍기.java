package 이중for문;

public class Ex03역별찍기 {

	public static void main(String[] args) {
//		*****
//		****
//		***
//		**
//		*
//	
//		

	      for (int j = 0; j < 5; j++) {
		         // 1. *****를 만드는 for문
		         for (int i = 0; i <5-j; i++) { 
		            System.out.print("*");
		         }
		         System.out.println();
		      }

	}

}
