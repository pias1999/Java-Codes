package march_29;

import java.awt.Color;

public class ColoredPoint extends Point {
	private Color color;

	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public ColoredPoint(int x, int y) {
		this(x, y, Color.BLACK); // point with default value
	}

	public ColoredPoint() {
		color = Color.BLACK; // what will be the values of x and y?
	}
	
}
