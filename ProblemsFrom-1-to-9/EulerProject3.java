/*
 *link to the problem https://projecteuler.net/problem=3
 */

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject3 {
//i use polland rho algorith for factorizing number and its performance is very very good

    private final static BigInteger ZERO = new BigInteger("0");
    private final static BigInteger ONE = new BigInteger("1");
    private final static BigInteger TWO = new BigInteger("2");
    private final SecureRandom random = new SecureRandom();
    private ArrayList<BigInteger> ls;
    private BigInteger result;

    public BigInteger rho(BigInteger N) {
        BigInteger divisor;
        BigInteger c = new BigInteger(N.bitLength(), random);
        BigInteger x = new BigInteger(N.bitLength(), random);
        BigInteger xx = x;

        // check divisibility by 2
        if (N.mod(TWO).compareTo(ZERO) == 0) {
            return TWO;
        }

        do {
            x = x.multiply(x).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            divisor = x.subtract(xx).gcd(N);
        } while ((divisor.compareTo(ONE)) == 0);

        return divisor;
    }

    public void factor(BigInteger N) {
        if (N.compareTo(ONE) == 0) {
            return;// BigInteger.ONE;
        }
        if (N.isProbablePrime(20)) {
            // System.out.println(N);
            ls.add(N);
            return;//N;
        }
        BigInteger divisor = rho(N);
        factor(divisor);
        factor(N.divide(divisor));
    }

    public BigInteger getHPF(BigInteger num) {
        ls = new ArrayList();
        factor(num);
        Collections.sort(ls);
        result = (BigInteger) ls.get(ls.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        EulerProject3 eu3 = new EulerProject3();
        BigInteger N = new BigInteger("600851475143");
        System.out.println(eu3.getHPF(N));
    }
}
