/**
 * Problem 6 The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of the first ten natural
 * numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025 −385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */

/**
 * @author Taha Emara Youtube Cahnnel : http://www.youtube.com/user/omar0103637
 * Facebook Page : https://www.facebook.com/IcPublishes Linkedin Profile :
 * http://eg.linkedin.com/pub/taha-emara/a4/1ab/524/
 */
class EulerProject6 {

    public static int sumConsecutiveNumbers(int to) {
        return (to / 2) * (to + 1);
    }

    public static int sumConsecutiveSquareNumbers(int to) {
        return (to * (2 * to + 1) * (to + 1)) / 6;
    }

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int num = 100;
        int result = (int) Math.pow(sumConsecutiveNumbers(num), 2) - sumConsecutiveSquareNumbers(num);
        System.out.println(result);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

}
