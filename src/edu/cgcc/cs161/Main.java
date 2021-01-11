package edu.cgcc.cs161;

public class Main {

    // Create a program that declares two variables, a and b. Set the variables equal to 0 and 4
    // respectively, if a is greater than b print "a is greater than b"; otherwise print
    // "b is greater than or equal to a".
    
    /* PSEUDOCODE
     * Program start
     * Declare variable a
     * Declare variable b
     * Initialize variable a = 0
     * Initialize variable b = 4
     * if a is more than b
     *   print "a is greater than b"
     * otherwise
     *   print "b is greater than or equal to a"
     * Program end
     */

    static int a;
    static int b;
    
    public static void main(String[] args) {
        a = 0;
        b = 4;
        
        if(a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than or equal to a");
        }
    }

}
