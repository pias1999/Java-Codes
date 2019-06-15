// Purpose: Convert a Celsius temperature to Fahrenheit	
	
public class CelsiusToFahrenheit {	
	
	// main(): application entry point	
	public static void main(String[] args) {	
	   // set Celsius temperature of interest	
	   int celsius = 28;	
	
	   // convert to Fahrenheit equivalent	
	   int fahrenheit = 32 + ((9 * celsius) / 5);	
	
	   // display result	
	   System.out.println("Celsius temperature: " + celsius);	
	   //System.out.println("   " + celsius);	
	   System.out.println("Equals Fahrenheit temperature: " + fahrenheit);	
	   //System.out.println("   " + fahrenheit);	
	}	
}
