package Ex01메서드개념;

public class Ex08메소드실습_평균 {

	public static void main(String[] args) {
		
		int[]array = {15,10,2,8,23};
		
		average(array);

	}
	
	public static void average(int[]a) {
		double sum =0;
		for(int i=0; i<a.length; i++) {
			
			sum +=a[i];
			}
		System.out.print("평균값은"+sum/a.length);
	}

}
