package switch문;

import java.util.Scanner;

public class Ex01switch문 {

	public static void main(String[] args) {
		// switch문
		// - 어떤 값과 일치하는지를 조건으로 삼을 수 있는 조건문(boolean이 아님)
		// - 각각의 case마다 꼭 break를 넣어주기
		
		//문법
//		switch(boolean이 아닌 식이나 데이터) {
//		case 값1 : 
//			실행문1
//			break;
//		case 값2 :
//			실행문2
//			break;
//		default :
//			모든 case에 다 맞지 않을 경우 (else)
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		String season ="";
		
		if(month>12 || month<1) {
		System.out.println("잘못된 숫자입니다.");
		} else {
		switch(month){
		case 1,2,12 :
			season = "겨울";
			break;
		case 3,4,5 :
			season = "봄";
			break;
		case 6,7,8 :
			season = "여름";
			break;
		case 9,10,11 :
			season = "가을";
			break;
	
		}
		System.out.println("지금은" + season+"입니다.");
		}
		
		

		}
		
		
	}




//switch(month) {
//case 1 :
//	System.out.print(month+"월은 겨울입니다.");
//	break;
//case 2 :
//	System.out.print(month+"월은 겨울입니다.");
//	break;
//case 3 :
//	System.out.print(month+"월은 봄입니다.");
//	break;
//case 4 :
//	System.out.print(month+"월은 봄입니다.");
//	break;
//case 5 :
//	System.out.print(month+"월은 봄입니다.");
//	break;
//case 6 :
//	System.out.print(month+"월은 여름입니다.");
//	break;
//case 7 :
//	System.out.print(month+"월은 여름입니다.");
//	break;
//case 8 :
//	System.out.print(month+"월은 여름입니다.");
//	break;
//case 9 :
//	System.out.print(month+"월은 가을입니다.");
//	break;
//case 10 :
//	System.out.print(month+"월은 가을입니다.");
//	break;
//case 11 :
//	System.out.print(month+"월은 가을입니다.");
//	break;
//case 12 :
//	System.out.print(month+"월은 겨울입니다.");
//	break;
//default :
//	System.out.print("1~12 사이의 숫자를 입력해주세요");
