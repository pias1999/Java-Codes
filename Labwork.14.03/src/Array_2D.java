import java.util.Scanner;


public class Array_2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int [][] matrix = new int [4][4];
		//matrix [3][1] = 5;
		
		int matrix [][] = {
				 
						{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
						
						};
		printDiagonal(matrix);
		
		/*for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(matrix [i][j]+ " ");
			}
			System.out.println();
		}
		
	}*/
  }
		public static void printDiagonal(int [][] array){
			
			int i = 0, j = 0;
			while(true){
				
				
				i++;
				j++;
			}
			
			
			
			
			
			/*for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array.length; j++){
					if((i == j) || (i + j == 3))
					System.out.println(array [i][j]);
				}
				System.out.println();
			}*/
	

}
	
}
