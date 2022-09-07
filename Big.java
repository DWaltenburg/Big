//https://books.trinket.io/thinkjava/chapter10.html#sec128 Exercise 4-5

import java.math.BigInteger;

public class Big {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i <= 30; i++) {
            System.out.printf("Factorial of %d is %d", i, FactorialOf(i));
            System.out.println("");
        }
        System.out.println(pow(10,100));
    }

    public static BigInteger FactorialOf(int i) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static BigInteger pow(int x, int n) {
        if (n == 0)
            return BigInteger.valueOf(1);

        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
