package problem_1;

public class Difference {
	public static void main(String args[]) {
		int temp, size;
		int array[] = { 3, 5, 2, 7, 6, 9 };
		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("First largest number is: " + array[size - 1]);
		System.out.println("second largest number is: " + array[size - 2]);
		
		System.out.println("Difference: " + (array[size - 1] - array[size - 2]));
	}
}