package problem_5;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.IOP.CodecPackage.TypeMismatch;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try{
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value 1: ");
		 int x = scanner.nextInt();
		 System.out.print("Enter value 2: ");
		
		  int y = scanner.nextInt();
		  
		  double result = 0.0; 
		  result = x / y; System.out.println(result);
		 
			System.out.println();
			int c[] = {1};
			c[40] = 100;

		} catch (InputMismatchException e) {

			System.err.println(e.toString());
			System.err.println("Input must be an integer.");
			int[] array = new int[10];

		} catch (ArithmeticException e) {

			System.err.println(e.toString());
			System.err.println("Arithmetic exception.");
			int[] array = new int[10];

		} finally {
			System.out.println("Exceptions are taken care of.");
		}
	}

}
