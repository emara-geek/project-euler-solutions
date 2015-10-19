/*
 *link to the problem https://projecteuler.net/problem=9
 */

/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject9 {

    public static int[] getOddPythagoreanTriplet(int j, int k) {
        int a = j * j - k * k;
        int b = 2 * j * k;
        int c = j * j + k * k;
        //System.out.println("(" + a + ", " + b + ", " + c + " )");
        int[] ar = {a, b, c};
        return ar;
    }

    public static int[] getEvenPythagoreanTriplet(int j) {
        int a = j;
        int b = ((a / 2) * (a / 2)) - 1;
        int c = b + 2;
        //System.out.println("(" + a + ", " + b + ", " + c + " )");
        int[] ar = {a, b, c};
        return ar;
    }

    public static int addArrayElements(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static long multiplyArrayElements(int[] ar, int ratio) {
        long factor = 1;
        for (int i = 0; i < ar.length; i++) {
            factor *= ar[i] * ratio;
        }
        return factor;
    }

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        final double NUM = 1000;
        long totalSum = 0;
        int flag = 0;
        int ratio = 0;
        for (int i = 1; i < NUM; i += 2) {
            int result = addArrayElements(getOddPythagoreanTriplet(i + 1, i));
            if (result <= NUM) {
                double rs = (NUM / result);
                if (Math.floor(rs) == (rs)) {
                    //System.out.println(i);
                    flag = i;
                    ratio = (int) rs;
                }
            } else {
                break;
            }
        }
        for (int i = 2; i < NUM; i += 2) {
            int result = addArrayElements(getEvenPythagoreanTriplet(i));
            if (result <= NUM) {
                double rs = (NUM / result);
                if (Math.floor(rs) == (rs)) {
                    //System.out.println(i);
                    flag = i;
                    ratio = (int) rs;
                }
            } else {
                break;
            }
        }
        if (flag % 2 == 0) {
           //System.out.println(ratio + "  " + flag);
            totalSum = multiplyArrayElements(getEvenPythagoreanTriplet(flag), ratio);
        } else {
            totalSum = multiplyArrayElements(getOddPythagoreanTriplet(flag + 1, flag), ratio);
        }
        System.out.println(totalSum);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

}
