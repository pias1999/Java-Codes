package labwork;

public abstract class Animal {
	int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public void walk() {

	}

	public abstract void eat();

}