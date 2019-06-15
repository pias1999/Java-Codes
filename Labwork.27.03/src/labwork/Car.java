package labwork;

public class Car extends Vehicles {

	public Car(int numberOfWheels, String name, int numberOfSeats) {
		super(numberOfWheels, name, numberOfSeats);
		System.out.print("It moves on road. ");
	}

}
