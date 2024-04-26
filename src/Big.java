import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        displayFactorial();
    }
    public static void displayFactorial() {
        System.out.println("Number\tFactorial");
        for (int i = 0; i <= 34000000; i++) { //determines table length
            System.out.println(i + "\t" + factorial(i));
        }
    }
        public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
        }
    }
