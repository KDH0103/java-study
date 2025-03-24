package 이차원배열실습;

public class Ex04_2차원배열예제 {

	public static void main(String[] args) {
		int [][] array = new int [5][5];
		
		int count =1;
		
		System.out.println("원본");
		
		for(int i =0; i<array.length; i++) {
			for(int j =0; j<array[i].length; j++) {
				
				array[i][j] =count++;
				System.out.print(array[i][j] + " \t");
			}
			System.out.println();
		}
		

		System.out.println("90도 회전");

		int [][] array2 = new int [5][5];
		
		int count2 =1;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][array2[i].length-1-j] = count2++;

			}
		}
		
		
		 for(int i=0; i<array2.length; i++) { // 행 반복
	         for(int j=0; j<array2[i].length; j++) {

	            System.out.print(array2[j][i] + "\t");
	         }
	         System.out.println();
		 }
		

	}

}
