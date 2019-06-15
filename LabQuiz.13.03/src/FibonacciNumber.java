public class FibonacciNumber {

    public static void main(String[] args) {

        int term1 = 0, term2 = 1, nextTerm;

        for (int i = 0; i <= 1000; i++){
        	
            System.out.print(term1 + "  ");

            nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
    }
}