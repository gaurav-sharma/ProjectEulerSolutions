/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author GSharma
 */
public class ProblemFour {

    public static void main(String [] args) {
        
        long time = System.currentTimeMillis();
        
        int num = 1, temp = 0;
                
        for(int i = 999; i >100; i--) {
            for(int j = i; j > 100; j--) {
                num = i * j;
                if(isPalindrome(num)) {
                    if(num > temp) {
                        temp = num;                        
                    }
                    break;
                }
            }
        }
        System.out.println("The time it took is " 
                + (System.currentTimeMillis() - time) 
                + " milliseconds");
        
        System.out.println("Palindrome = " + temp);
    }

    private static boolean isPalindrome(int num) {
        String straight = Integer.toString(num);
        String rev = new StringBuffer(straight).reverse().toString();
        
        return rev.equals(straight);
    }

    
}
