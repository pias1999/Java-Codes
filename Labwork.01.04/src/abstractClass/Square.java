package abstractClass;

class Square extends Shape {

	int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		
		return this.side * this.side;
	}

	@Override
	public double getPerimeter() {
		
		return 4 * this.side;
	}

}