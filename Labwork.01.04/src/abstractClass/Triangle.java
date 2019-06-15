package abstractClass;

class Triangle extends Shape {

	int a, b, c;

	public Triangle(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	@Override
	public double getArea() {
		
		int s = (this.a + this.b + this.c) / 2;

		return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
	}

	@Override
	public double getPerimeter() {
		
		return this.a + this.b + this.c;
	}

}