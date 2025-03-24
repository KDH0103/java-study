package 이중for문;

public class Ex01이중for문메인기초 {

	public static void main(String[] args) {
		// 조건문 안에 조건문을 넣듯이, for문안에 for문을 넣어도 된다.
		
		for(int i=1; i<6; i++) {
			System.out.println("i는"+i);
			for(int j=11; j<16; j++) {
				
				System.out.println("j는"+j);
				
			}
		}
		
		
		

	}

}
