/**
 * Problem 4 A palindromic number reads the same both ways. The largest
 * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Taha Emara
 */
public class EulerProject4 {

    private static int[] generateArray(int start, int end) {
        int ar[] = new int[(end - start) + 1];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = start + i;
        }
        return ar;
    }

    private static boolean isPalindromic(int num) {
        boolean rs = false;
        int copy = num;
        int reverse = 0;
        while (num > 0) {
            int n = num % 10;
            num = num / 10;
            reverse = reverse * 10 + n;
        }
        if (reverse == copy) {
            rs = true;
        }
        return rs;
    }

    public static void main(String[] args) {
        ArrayList arls = new ArrayList();
        int start = 900;
        int end = 999;
        int a[] = generateArray(start, end);
        for (int i = start; i < end + 1; i++) {
            for (int j : a) {
                if (j >= i) {
                    int r = j * i;
                    if (isPalindromic(r)) {
                        arls.add(j * i);
                    }
                }
            }
        }
        Collections.sort(arls);
        System.out.println(arls.get(arls.size() - 1));
    }
}
