package 변수와자료형;

import java.util.Scanner;

public class Ex01변수 {

	public static void main(String[] args) {
		//[예제] 사용자가 입력해준 숫자를 변수에 저장하고, 출력
		
		//1.입력 도구를 꺼내기
		Scanner sc = new Scanner(System.in);
		
		//2.정수 입력 받기
		//2-1. 안내메시지
		System.out.print("숫자를 입력해주세요 >>");
		
		//2-2 사용자가 입력한 숫자를 바로 변수에 저장
		int input = sc.nextInt();
		
		//3. 입력받은 숫자를 출력
		System.out.println(input);
		
	}

}
