
public class Rational {

	private int numerator = 0;
	private int denominator = 1;
	
	public Rational(int numerator, int denumerator) {
		
		this.numerator = numerator;
		this.denominator = denumerator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}
	
	
	public Rational add(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a * d + b * c;
		int newDenominator = b * d;
		Rational result = new Rational(newNumerator, newDenominator);
		return result;
		
		
		/*return new Rational((this.numerator * r.denumerator) + (this.denumerator * r.numerator))/
		                   (this.denumerator * r.numerator);
		*/
		
		
		//return new Rational();
	}
	
	public Rational subtract(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a * d - b * c;
		int newDenominator = b * d;
		Rational result = new Rational(newNumerator, newDenominator);
		return result;
		
	}
	
	public Rational multiply(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a * c;
		int newDenominator = b * d;
		Rational result = new Rational(newNumerator, newDenominator);
		return result;
		
	}
	
public Rational division(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a * d;
		int newDenominator = b * c;
		Rational result = new Rational(newNumerator, newDenominator);
		return result;
		
	}
	
	
	

}

