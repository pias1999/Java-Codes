//double a=56.34, b=6.58334, c=-34.4265;
import java.lang.*;

public class FindSquareRootOfA2B2 {

	public static void main(String[] args) {
		double a = 56.34;
		double b = 6.58334;

		double squareOfA = Math.pow(a, 2);
		double squareOfB = Math.pow(b, 2);
		double sum = squareOfA + squareOfB;

		System.out.println("The square root is: " + Math.sqrt(sum));

	}

}