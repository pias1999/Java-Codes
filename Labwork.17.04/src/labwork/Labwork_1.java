package labwork;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Labwork_1 {

	public static void main(String[] args) {

		// LIST
		/*
		 * List<String> listOfString = new ArrayList<String>();
		 * listOfString.add("83294789237"); listOfString.add("132947892");
		 * listOfString.add("94789237"); listOfString.add("49237");
		 * listOfString.add("52294789"); listOfString.add("8378927");
		 * listOfString.add("732989237");
		 * 
		 * System.out.println(listOfString.contains("49237"));
		 * listOfString.remove(3);
		 * 
		 * for(String x: listOfString){ System.out.println(x); }
		 */
		
		

		// STACK
		/*
		 * Stack<String> demo = new Stack<String>(); demo.push("83294789237");
		 * demo.push("13294789274");
		 * 
		 * for(String x: demo){ System.out.println(x); }
		 */
		
		

		// MAP
		  Map<Integer, String> mymap = new TreeMap<Integer, String>();
		  mymap.put(2132314, "Pias"); mymap.put(2132313, "Dipto");
		  mymap.put(2132312, "Navid"); mymap.put(2132315, "Shykat");
		  
		  System.out.println(mymap);
		 

		/*int[] integerArray = { 1, 2, 3, 4, 5, 6 };
		float[] floatArray = { 1, 2, 3, 4, 5, 6 };
		double[] doubleArray = { 1, 2, 3, 4, 5, 6 };
		
		print(integerArray);*/

	}

	public static <E> void print(E[] inputArray) {
		for (E x : inputArray) {
			System.out.println(x);
		}
	}

}
