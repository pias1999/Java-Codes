
public class MainApplication {

	public static void main(String[] args) {
		
		Rational r1 = new Rational(5,7);
		Rational r2 = new Rational(2,3);
		Rational result1 = r1.add(r2);
		Rational result2 = r1.subtract(r2);
		Rational result3 = r1.multiply(r2);
		Rational result4 = r1.division(r2);
		
		
		System.out.println("Addition:  " +r1.toString() +" + " +r2.toString() + " = " +result1.toString());
		System.out.println("\nSubtraction:  " +r1.toString() +" - " +r2.toString() + " = " +result2.toString());
		System.out.println("\nMultiplication:  " +r1.toString() +" * " +r2.toString() + " = " +result3.toString());
		System.out.println("\nDivision:  " +r1.toString() +" / " +r2.toString() + " = " +result4.toString());

	}

}
