public class Labwork_3 {

	public static void main(String[] args) {
		
		byte a = 8;
		byte b = 24;
		byte orResult = (byte) (a | b);
		byte andResult = (byte) (a & b);
		byte notResult = (byte) ~a;
		byte xorResult = (byte) (a^b);
		
		int result = (a >>> 3);
		
		System.out.println("Result of OR: " + orResult);
		System.out.println("Result of AND: " + andResult);
		System.out.println("Result of NOT: " + notResult);
		System.out.println("Result of XOR: " + xorResult);
		System.out.println(result);

	}

}
