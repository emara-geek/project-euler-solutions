/*
 *link to the problem https://projecteuler.net/problem=1
 */
/**
 *
 * @author Taha Emara
 */
public class EulerProject1 {

    public static void main(String[] args) {
        int num=1000;
        int sum=0;
        for (int i = 0; i < num; i++) {
            if(i%3==0 ||i%5==0){
            sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
