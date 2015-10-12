/**
 * Problem 5: 2520 is the smallest number that can be divided by each of the
 * numbers from 1 to 10 without any remainder. What is the smallest positive
 * number that is evenly divisible by all of the numbers from 1 to 20?
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Taha Emara 
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject5 {

    public static ArrayList<Integer> listPrimes(int from, int to) {
        ArrayList<Integer> arls = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[to + 1];
        for (int i = 2; i <= to; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= to; i++) { //eratosthenes sieve
            if (isPrime[i]) {
                for (int j = i; i * j <= to; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= to; i++) {
            if (isPrime[i]) {
                if (i >= from) {
                    arls.add(i);
                    //  System.out.println(i);
                }
            }
        }
        return arls;
    }

    public static int logOfBase(int base, int num) {
        double result = Math.log(num) / Math.log(base);
        if (result == (int) result) {
            return (int) result;
        } else {
            return 1;
        }
    }

    public static int[] convertToIntegersArray(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

    public static int getLCM(int from, int to) {
        ArrayList<Integer> pr = listPrimes(from, to);
        int[] primes = convertToIntegersArray(pr);
        int repeatence[] = new int[primes.length];
        for (int i : repeatence) {
            repeatence[i] = 1;
        }
        //ArrayList<Integer> tempRep = new ArrayList<Integer>();
        int tempRep[] = new int[to];
        int k = 0;
        for (int prime : primes) {
            int maxRepeatence = 1;
            int j = 0;
            if (prime * prime <= to) {
                for (int i = prime; i <= to; i++) {
                    int rs = logOfBase(prime, i);
                    tempRep[j] = rs;
                    j++;
                }
                Arrays.sort(tempRep);
                maxRepeatence = tempRep[tempRep.length - 1];
                // System.out.println(maxRepeatence);
            }
            Arrays.fill(tempRep, 0);
            repeatence[k] = maxRepeatence;
            k++;
        }
        int result = 1;
        for (int i = 0; i < repeatence.length; i++) {
            result = (int) Math.pow(primes[i], repeatence[i]) * result;
        }
        return result;
    }

    public static void main(String[] args) {
        int from = 1;
        int to = 20;
        int result = getLCM(from, to);
        System.out.println(result);
    }
}
