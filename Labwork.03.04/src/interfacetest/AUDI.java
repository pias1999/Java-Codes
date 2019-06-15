package interfacetest;

public class AUDI implements ICar, IAdvancedCar {

	@Override
	public void move() {
		System.out.println("AUDI is moving.");

	}

	@Override
	public void stop() {
		System.out.println("AUDI has been stopped.");

	}

	@Override
	public void accelerate() {
		System.out.println("AUDI is being accelerated.");

	}

	@Override
	public void getTracked() {
		System.out.println("AUDI is being tracked.");

	}

	@Override
	public void containsAdvancedDevice() {
		System.out.println("AUDI contains smart devices.");

	}

}
