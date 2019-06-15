
public class DateCalculator {
	private static int myBirthDate = 1997;
	private static int myCurrentDate = 2019;
	
	
	public void myAge(int myBirthDate, int myCurrentDate) {
		this.myBirthDate = myBirthDate;
		this.myCurrentDate = myCurrentDate;
		
	}
	private static void calculateAge() {
		
		int age = myCurrentDate - myBirthDate;
		System.out.println("I am " + age + " years old.");
	}

	public static void main(String[] args) {
		
		calculateAge();

	}

}
