package labwork;

public class Train extends Vehicles {

	int numberOfBogeys;

	public Train(int numberOfWheels, String name, int numberOfSeats, int numberOfBogeys) {
		super(numberOfWheels, name, numberOfSeats);
		this.numberOfBogeys = numberOfBogeys;
		System.out.print("\nThis vehicle has " + numberOfBogeys + " bogeys. ");
		System.out.print(" It moves on track. ");
	}

}
