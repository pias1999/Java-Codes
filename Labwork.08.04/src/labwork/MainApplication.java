package labwork;

public class MainApplication {

	public static void main(String[] args) {
		Animal s = new Spider();
		s.eat();

		Cat c = new Cat();
		c.eat();
		c.play();

		Fish f = new Fish();
		f.eat();
		f.getName();

	}

}