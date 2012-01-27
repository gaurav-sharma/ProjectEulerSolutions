/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author GSharma
 */
public class ProblemThree {

    private static double theNum = 600851475143L;

    public static void main(String[] args) {

        double lastFactor, factor, maxFactor;

        if (theNum % 2 == 0) {
            lastFactor = 2;
            theNum = theNum / 2;

        } else {
            lastFactor = 1;
        }
        factor = 3;

        maxFactor = Math.sqrt(theNum);
        while (theNum > 1 && factor <= maxFactor) {
            if (theNum % factor == 0) {
                theNum = theNum / factor;
                lastFactor = factor;
                while (theNum % factor == 0) {
                    theNum = theNum / factor;
                }
                maxFactor = Math.sqrt(theNum);
            }
            factor = factor + 2;
        }
        if (theNum == 1) {
            System.out.println((int) lastFactor);
        } else {
            System.out.println((int) theNum);
        }
    }
}
