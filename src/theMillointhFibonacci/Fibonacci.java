package theMillointhFibonacci;

import java.math.BigInteger;

public class Fibonacci {
    public static final BigInteger ZERO = BigInteger.valueOf(0);
    public static final BigInteger ONE  = BigInteger.valueOf(1);
    public static final BigInteger TWO  = BigInteger.valueOf(2);

    public static BigInteger fib(BigInteger num) {
        BigInteger result = fibNum(ONE, ZERO, ZERO, ONE, num.abs());
        return (num.signum() < 0) && num.mod(TWO).equals(ZERO) ? result.negate() : result;
    }

    public static BigInteger fibNum(BigInteger a, BigInteger b, BigInteger c, BigInteger d, BigInteger n) {
        if (n.equals(ZERO))
            return b;
        if (n.mod(TWO).equals(ZERO))
            return fibNum(a, b, c.pow(2).add(d.pow(2)), c.multiply(d.multiply(TWO)).add(d.pow(2)), n.divide(TWO));
        else
            return fibNum(b.multiply(d).add(a.multiply(d)).add(a.multiply(c)), b.multiply(c).add(a.multiply(d)), c, d, n.subtract(ONE));
    }

}