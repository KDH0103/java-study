package 이차원배열실습;

public class Ex02_2차원배열예제 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];


		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = count++;

			}
		}
		
		
		 for(int i=0; i<array.length; i++) { // 행 반복
	         for(int j=0; j<array[i].length; j++) {

	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
		 }

	}

}
