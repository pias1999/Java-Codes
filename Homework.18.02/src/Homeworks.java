import java.util.Scanner;

public class Homeworks {

	public static void main(String[] args) {
		Scanner inputTaker = new Scanner(System.in);
		System.out.println("Enter two strings:");
		String s1 = inputTaker.nextLine();
		String s2 = inputTaker.nextLine();

		System.out.println("Length of S1 is: " + s1.length());
		System.out.println("Length of S2 is: " + s2.length());

		System.out.println("\nThe string S1 is: " + s1.replace(" ", "_"));
		System.out.println("\nThe first character of S1 is: " + s1.charAt(0));

		if (s1.compareTo(s2) == 0) {
			System.out.println("\nThe string S1 and S2 are equal.");
		} else {
			System.out.println("\nThe string S1 and S2 are not equal.");
		}
		System.out.println("\nThe first occurence of \"a\" is at position: " + s1.indexOf("a"));
		if (isSubstring(s1, s2)) {
			System.out.println("\nThe first string is a substring of the second.");
		} else {
			System.out.println("\nThe first string is NOT a substring of the second.");
		}

		System.out.println("\nThe lowercase string is: " + s1.toLowerCase());
		System.out.println("The uppercase string is: " + s2.toUpperCase());

		System.out.print("The array is: ");
		for (char array : s1.toCharArray()) {
			System.out.print(array + "   ");
		}

	}

	private static boolean isSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		return false;
	}

}
