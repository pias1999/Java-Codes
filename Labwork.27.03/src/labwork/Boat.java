package labwork;

public class Boat extends Vehicles {

	int numberOfPropellers;

	public Boat(int numberOfWheels, String name, int numberOfSeats, int numberOfPropellers) {
		super(numberOfWheels, name, numberOfSeats);
		this.numberOfPropellers = numberOfPropellers;
		System.out.print("\nThis vehicle has " + numberOfPropellers + " propellers. ");
		System.out.print(" It moves on water. ");
	}

}
