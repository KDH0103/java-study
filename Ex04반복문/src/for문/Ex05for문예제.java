package for문;

public class Ex05for문예제 {

	public static void main(String[] args) {
		for (int j = 0; j < 5; j++) {
			//공백을 출력하는 for문
			//전체 줄수 - 현재 진행된 줄 수
			//5- j
			for (int i = 0; i<5-j-1; i++) {
				System.out.print(" ");
				
			}
			
			// 1. *****를 만드는 for문
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
