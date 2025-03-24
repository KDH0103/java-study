package 이차원배열실습;

public class Ex03_2차원배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5];

//		array[0][0] = 1;
//		array[0][1] = 6;
//		array[0][2] = 11;
//		array[0][3] = 16;
//		array[0][4] = 21;
//		
//		array[1][0] = 2;
//		array[1][1] = 7;
//		array[1][2] = 12;
//		array[1][3] = 17;
//		array[1][4] = 22;		

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
