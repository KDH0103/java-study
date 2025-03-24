package 배열실습;

import java.util.Scanner;

public class Ex04배열실습_키큰사람 {

	public static void main(String[] args) {
		
		int count =0;
		
		int[]array = {149,180,192,170};
		
		System.out.print("키를 입력하세요:");
		int height = 160;
		
		for(int i=0; i<4; i++) {
			if(array[i]> height) {
				count ++;
			}
			
		}System.out.print(count);
		
	}

}
