package problem_3;

import java.util.Scanner;

public class Square extends Quadrilateral{
	int side = 5;
	
	@Override
	void getArea() {
		
		int area = side * side;
		
		System.out.println("Area of square is: " + area);
		
	}

}
