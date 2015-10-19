/**
 * Problem 7 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we
 * can see that the 6th prime is 13. What is the 10 001st prime number?
 */

/**
 * try to see a table of π(x) pi funtion to know why i choose 110000 as an end of sieving 
 * https://en.wikipedia.org/wiki/Prime-counting_function
 */

/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject7 {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int end = 110000; 
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
        int flag = 0;
        for (int i = 2; i <= end; i++) {
            if (isPrime[i]) {
                flag++;
                if (flag == 10001) {
                    System.out.println(i);
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

}
