/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author GSharma
 */
public class ProblemNine {
    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        
        int a = 0, b = 0, c = 0;
        int j = (1000 - 3) / 3, k = (1000 - 1 - a);
        
        outerloop:
        for(a = 1; a < j; a++) {
            for(b = a; b < k; b++) {
                int sq = a*a + b*b;
                
                c = (int) Math.sqrt(sq);
                
                if ((a + b + c == 1000) && (c*c == sq)) {
                    System.out.println(a*b*c);
                    break outerloop;
                }
            }
        }
        
        System.out.println("The time it took is " 
                + (System.currentTimeMillis() - time) 
                + " milliseconds");
        
    }
}
