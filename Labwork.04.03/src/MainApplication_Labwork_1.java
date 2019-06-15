
public class MainApplication_Labwork_1 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		//c1.move();
		Car c2 = new Car("AUDI", "Black");
		//c2.move();
		Car c3 = new Car("BMW", "Black", 878);
		
		System.out.println(c3.getName());
		
		c3.setName("Porsche");
		
		c3.move();

	}

}
