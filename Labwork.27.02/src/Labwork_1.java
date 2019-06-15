// Write a program to find the max and min of an array

public class Labwork_1 {

	public static void main(String[] args) {
		int max = 0, min = 0;
		int array[] = { 15, 36, 24, 18, 14 };

		System.out.print("The array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] < array[0]) {
				min = array[j];
			}
		}
		System.out.println("\n\nMaximum value of the array is: " + max);
		System.out.println("Minimum value of the array is: " + min);

	}
}
