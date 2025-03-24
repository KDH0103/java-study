package for문;

public class Ex01for문기초 {

	public static void main(String[] args) {
		// for문과 달리, 반복 횟수가 정해진 반복문
		// while문과 달리, 반복 횟수가 정해진 반복문

		// 기본 구조
		// for(초기화 구문; 조건식; 반복후작업) {로직}
		// -초기화구문 : 반복문이 처음 시작될 때 딱 한번만 실행
		// -조건식 : 반복 조건
		// -반복후작업 : 로직 반복 후 작업해야 하는 파트

		// i가 0부터 5가 되기 전까지
		for (int i = 1; i < 13; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		

		// 연습1. 96부터 73까지 출력(반복후 작업 포인트)
		for (int i = 96; i > 72; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// 연습2.
		for (int i = 96; i > 72; i--) {
			if (!(i % 2 == 0)) {
				System.out.print(i + " ");
			}

		}
		
		System.out.println();
		//3.
	
		// -1부터 100까지 쭉 나열 하고 합하기
		
		int sum = 0;
		
		for(int i=1; i<101; i++) {
		sum += i%2==0 ? -i:i;
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("합"+sum);
		


	
	
	}
}
