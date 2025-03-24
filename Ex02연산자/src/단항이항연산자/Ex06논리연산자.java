package 단항이항연산자;

public class Ex06논리연산자 {

	public static void main(String[] args) {
		//논리연산자
		// - !(피연산자) : 피연산자의 결과를 반대로
		// - (피연산자) && (피연산자) : 둘 다 참이어야 TRUE
		// - (피연산자) || (피연산자) : 둘 다 참이어야 TRUE
		
		
	System.out.println(!(1>3)&& (3<4));
	
	boolean a =!(a>3) && (3<4);
	System.out.println(a);
	}

}
