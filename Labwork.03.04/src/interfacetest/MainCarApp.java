package interfacetest;

public class MainCarApp {

	public static void main(String[] args) {

		AUDI a = new AUDI();
		a.accelerate();
		a.containsAdvancedDevice();

		BMW b = new BMW();
		b.move();
		b.stop();

	}

}
