package problem_3;

import java.util.Scanner;

public class Rectangle extends Quadrilateral{
	int height = 5;
	int width = 8;

	@Override
	void getArea() {
		
		int area = height * width;
		System.out.println("Area of rectangle is: " + area);
		
	}

}

