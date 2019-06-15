// Write a java code to calculate the average value of an array
public class Labwork_3 {

	public static void main(String[] args) {
		int array[] = { 15, 21, 36, 14, 18 };
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.print("The sum is: " + sum);
		double average = sum / (array.length);
		System.out.print("\nThe average is: " + average);

	}

}
