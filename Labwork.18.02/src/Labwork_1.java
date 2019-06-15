public class Labwork_1 {

	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 7};
		int [] roll = new int[5];
		roll[2] = 1;
		
		
		
		// for loop
		for(int i = 0; i < numbers.length; i++){
			
			System.out.print(numbers[i] + " ");
		
		}
		
		// for each loop
		for(int x : roll){
			System.out.print("\n" + x + " ");
			
		}
		
		// while loop
		int j = 0;
		/*while(j < 10){
			
			
			j++;
		}*/
		
		// do while
		/*int k = 0;
		do{
			
			k++;
		}while(k < 10);*/

	}

}
