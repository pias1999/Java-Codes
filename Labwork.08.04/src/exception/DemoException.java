package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.IOP.CodecPackage.TypeMismatch;

public class DemoException {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		//System.out.print("Enter X: ");
		//int x = scanner.nextInt();
		//System.out.print("Enter Y: ");
		/*int y = scanner.nextInt();
		
		double result = 0.0;
		result = x / y;
		System.out.println(result);*/
		
		//int[] array = new int [size];
		//int position = scanner.nextInt();
		int size = 5;
		System.out.print("Give array size: ");
		
		try{
			size = scanner.nextInt();
			int[] array = new int [size];
			
		}catch(NegativeArraySizeException e){ // negative
			
			System.err.println(e.toString());
			System.err.println("Wrong input. Negative value.");
			int[] array = new int [10];
			
		}catch(InputMismatchException e){ // type mismatch
			
			System.err.println(e.toString());
			System.err.println("Input must be an integer.");
			int[] array = new int [10];
			
		}
		System.out.println("Exceptions are taken care of.");
	}

}
