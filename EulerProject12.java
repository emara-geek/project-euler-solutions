/*
 *link to the problem https://projecteuler.net/problem=12
 */
import java.util.HashMap;

/**
 * @author Taha Emara 
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject12 {

    public static int getNumberOFDividors(long num) {
        int count = 1;
        HashMap<Long, Long> factors = new HashMap<>();
        long flag = 1;
        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.put(i, flag);
                flag++;
                num /= i;
            }
            flag = 1;
        }
        for (long p : factors.keySet()) {
            long h = factors.get(p);
            count *= (h + 1);
        }
        return count;
    }

    public static int getTriangularNum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int logOfBase(long base, long num) {
        double result = Math.log(num) / Math.log(base);
        return (int) Math.floor(result);
    }

    public static void main(String[] args) {
        final long STARTTIME = System.currentTimeMillis();
        int num = 0;
        final int LIMIT = 500;
        int divc = 1;
        long result = 1;
        while (divc < LIMIT) {
            result = getTriangularNum(num);
            divc = getNumberOFDividors(result);
            num++;
        }
        System.out.println(result);
        final long ENDTIME = System.currentTimeMillis();
        System.out.println("Total execution time: " + (ENDTIME - STARTTIME));
    }

}
