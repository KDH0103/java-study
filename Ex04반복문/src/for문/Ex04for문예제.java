package for문;

import java.util.Scanner;

public class Ex04for문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("행 개수:");
	int input = sc.nextInt();
	
    for (int j = 0; j < input; j++) {
        // 1. *****를 만드는 for문
        for (int i = 0; i <input-j; i++) { 
           System.out.print("*");
        }
        System.out.println();
     }
	
    
    
    
    
	
	}
	

}
