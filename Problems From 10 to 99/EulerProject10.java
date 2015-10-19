/*
 Problem 10
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 Find the sum of all the primes below two million.
 link to the problem https://projecteuler.net/problem=10
 */

/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject10 {

    private static int[] generatePrimes(int max) {
        boolean[] isComposite = new boolean[max + 1];
        for (int i = 2; i * i <= max; i++) {
            if (!isComposite[i]) {
                for (int j = i; i * j <= max; j++) {
                    isComposite[i * j] = true;
                }
            }
        }
        int numPrimes = 0;
        for (int i = 2; i <= max; i++) {
            if (!isComposite[i]) {
                numPrimes++;
            }
        }
        int[] primes = new int[numPrimes];
        int index = 0;
        for (int i = 2; i <= max; i++) {
            if (!isComposite[i]) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int end = 2000000;
        boolean[] isPrime;
        isPrime = new boolean[end + 1];
        for (int i = 2; i <= end; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= end; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        long sum = 0;
        for (int i = 2; i <= end; i++) {
            if (isPrime[i]) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

}
