/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.*;

/**
 *
 * @author GSharma
 */
public class ProblemSeven {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long i = 2;
        ArrayList<Long> arr = new ArrayList<Long>();
        
        while (arr.size() < 10001) {
            if (!isPrime(i)) {
                arr.add(i);
            }
            i++;
        }
        
        System.out.println("The time it took is " 
                + (System.currentTimeMillis() - time) 
                + " milliseconds");
        System.out.println(arr.get((arr.size() - 1)));
    }

    private static boolean isPrime(long l) {
        boolean ret = false;
        int sqrt = (int) Math.sqrt(l);
        
        for(int i = 2; i <= sqrt; i++) {
            if(l % i == 0) {
                ret = true;
                break;
            }
        }
        return ret;
    }
}