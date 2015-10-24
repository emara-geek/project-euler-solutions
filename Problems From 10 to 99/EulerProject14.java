package eulerproject;
/*
 *link to the problem https://projecteuler.net/problem=14
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject14 {

    public static int getChainLength(long num) {
        int count = 1;
        while (num != 1&&num>0) {
            count++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num) + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        final long STARTTIME = System.currentTimeMillis();
        HashMap<Integer, Integer> map = new HashMap<>();
        final long to = 1000000;
        for (int i = 1; i < to; i++) {
            map.put(getChainLength(i), i);
        }
        int maxkey = Collections.max(map.keySet());  
        int result=map.get(maxkey);
        System.out.println(result);
        final long ENDTIME = System.currentTimeMillis();
        System.out.println("Total execution time: " + (ENDTIME - STARTTIME));
    }

}
