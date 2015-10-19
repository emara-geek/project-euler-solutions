/*
 *link to the problem https://projecteuler.net/problem=8
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Taha Emara
 * Youtube Cahnnel  : http://www.youtube.com/user/omar0103637
 * Facebook Page    : https://www.facebook.com/IcPublishes 
 * Linkedin Profile : http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
public class EulerProject8 {

    public static long multiplyNumberDigits(long num) {
        long result = 1;
        while (num > 0) {
            long digit = num % 10;
            num = num / 10;
            result *= digit;
        }
        return result;
    }

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        final String INPUT = "73167176531330624919225119674426574742355349194934969835"
                + "2031277450632623957831801698480186947885184385861560789112949"
                + "4954595017379583319528532088055111254069874715852386305071569"
                + "3290963295227443043557668966489504452445231617318564030987111"
                + "2172238311362229893423380308135336276614282806444486645238749"
                + "3035890729629049156044077239071381051585930796086670172427121"
                + "8839987979087922749219016997208880937766572733300105336788122"
                + "0235421809751254540594752243525849077116705560136048395864467"
                + "0632441572215539753697817977846174064955149290862569321978468"
                + "6224828397224137565705605749026140797296865241453510047482166"
                + "3704844031998900088952434506585412275886668811642717147992444"
                + "2928230863465674813919123162824586178664583591245665294765456"
                + "8284891288314260769004224219022671055626321111109370544217506"
                + "9416589604080719840385096245544436298123098787992724428490918"
                + "8845801561660979191338754992005240636899125607176060588611646"
                + "7109405077541002256983155200055935729725716362695618826704282"
                + "52483600823257530420752963450";
        final int NUMOFDIGITS = 13;
        StringBuilder sb = new StringBuilder();
        ArrayList results = new ArrayList();
        for (int i = 0; i <= INPUT.length() - NUMOFDIGITS; i++) {
            sb.append(INPUT.substring(i, i + NUMOFDIGITS));
            long num = Long.parseLong(sb.toString());
            results.add(multiplyNumberDigits(num));
            sb.setLength(0);
        }

        Collections.sort(results);
        long maxResult = (long) results.get(results.size() - 1);
        System.out.println(maxResult);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
