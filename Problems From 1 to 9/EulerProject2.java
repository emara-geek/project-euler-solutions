/*
 *link to the problem https://projecteuler.net/problem=2
 */
 
/**
 *
 * @author Taha Emara
 */
public class EulerProject2 {

    public static void main(String[] args) {
        final long NUM = 4000000;
        long a = 0;
        long c = 0;
        long i = 0;
        long b = 1;
        long sum = 0;
        while (c < NUM) {
            a = b;
            b = c;
            c = a + b;
            long temp = c;
            if (temp % 2 == 0 && temp < NUM) {
                sum = sum + c;
                System.out.println(sum);
            }
        }
    }
}
