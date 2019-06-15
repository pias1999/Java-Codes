
// Write a java program to insert an element into an array
import java.util.Scanner;

public class Labwork_2 {

	public static void main(String[] args) {
		int array[] = { 15, 24, 36, 14, 18 };

		System.out.print("The array is : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.print("\nEnter a value: ");
		Scanner inputReader = new Scanner(System.in);
		int value = inputReader.nextInt();

		for (int j = 0; j < array.length + 1; j++) {
			if (j == array.length - 1) {
				array[j] = value;
			}
		}

		System.out.print("The new array is: ");
		for (int k = 0; k < array.length; k++) {

			System.out.print(array[k] + " ");
		}
	}

}
