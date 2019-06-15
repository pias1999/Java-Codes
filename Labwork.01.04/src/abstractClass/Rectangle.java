package abstractClass;

class Rectangle extends Shape{
	
	int height, width;
	
	public Rectangle(int height, int width){
		
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * (this.height + this.width);
	}
	
}