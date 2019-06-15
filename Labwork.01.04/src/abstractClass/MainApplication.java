package abstractClass;

public class MainApplication {

	public static void main(String[] args) {

		Shape s = new Square(5);
		double area1 = s.getArea();
		double perimeter1 = s.getPerimeter();

		System.out.println("The area of square is: " + area1);
		System.out.println("The perimeter of square is: " + perimeter1);
		
		Shape t = new Triangle(4, 5, 6);
		double area2 = t.getArea();
		double perimeter2 = t.getPerimeter();
		
		System.out.println("\nThe area of triangle is: " + area2);
		System.out.println("The perimeter of triangle is: " + perimeter2);
		
		Shape r = new Rectangle(10, 5);
		double area3 = r.getArea();
		double perimeter3 = r.getPerimeter();
		
		System.out.println("\nThe area of rectangle is: " + area3);
		System.out.println("The perimeter of rectangle is: " + perimeter3);

	}

}
