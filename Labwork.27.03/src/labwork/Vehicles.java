package labwork;

public class Vehicles {

	int numberOfWheels;
	String name;
	int numberOfSeats;

	public Vehicles(int numberOfWheels, String name, int numberOfSeats) {
		this.numberOfWheels = numberOfWheels;
		this.name = name;
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	protected void move() {

		System.out.println("This vehicle has " + this.numberOfWheels + " wheels. Its name is " + this.name + ". It has "
				+ this.numberOfSeats + " seats.");

	}

	protected void brake() {

	}

}
