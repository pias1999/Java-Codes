import java.util.Scanner;
//import java.lang.*;

public class Labwork_1 {

	public static void main(String[] args) {
		
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Give two Numbers: ");
		int number1 = inputReader.nextInt();
		int number2 = inputReader.nextInt();
		int result = (int) Math.pow(number1, number2);
		
		System.out.println("The numbers are " + number1 + " and " + number2);
		System.out.println("The result is:  " + result);
		
		

	}

}
