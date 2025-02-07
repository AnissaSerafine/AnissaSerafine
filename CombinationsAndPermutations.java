import java.math.BigInteger;

public class CombinationsAndPermutations {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger permutation(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    public static BigInteger combination(int n, int r) {
        return permutation(n, r).divide(factorial(r));
    }

    public static void main(String[] args) {
        int n = 45, r = 17;
        System.out.println("P(" + n + ", " + r + ") = " + permutation(n, r));
        System.out.println("C(" + n + ", " + r + ") = " + combination(n, r));
        Hi my name is Sophia
    }
}
