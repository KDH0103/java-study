package 배열실습;

public class Ex05배열실습_배열두배만들기 {

	public static void main(String[] args) {
		
		int array[]= {2,4,6,8,10};
		int[] result = new int [5];
		
		
		for(int i =0; i<5; i++) {
			result[i] = array[i] *2 ;
			}
		for(int i =0; i<5; i++) {

			System.out.print(result[i]+" ");
		}
	
		
	}

}
