package labwork;

public class MainApplication {

	public static void main(String[] args) {

		Car c = new Car(4, "BMW", 5);
		c.move();

		Train t = new Train(100, "Train", 1000, 10);
		t.move();

		Boat b = new Boat(0, "Boat", 20, 2);
		b.move();

	}

}
