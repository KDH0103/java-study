package for문;

import java.util.Scanner;

public class 낙서장장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int j =1;
		for(int i=0;i<num;i++) {
			j+=i;
			System.out.print(j+" ");
		}
	}
}
