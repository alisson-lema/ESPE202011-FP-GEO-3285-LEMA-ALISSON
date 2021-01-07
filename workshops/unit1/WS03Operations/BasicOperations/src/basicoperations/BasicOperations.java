/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author HP
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int product;
        int multiplicant;
        int multiplier;
        
        int dividend;
        int divisor;
        int quotient;
        
        int remanider;
        
        minuend = -23;
        subtrahend = -6;
        
        multiplicant = 10;
        multiplier = 90;
        
        dividend = 100;
        divisor = 50;
        
        //initilization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
       
        System.out.println("The addition of" + addend1 + " + " + addend2 + 
                " is equal to -->" + sum );
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + (sum++));
        
        System.out.println("sum is equal to --> " + ((++sum)));
        
        System.out.println("the subtraction of " + minuend + " - " + subtrahend +
                " is equal to " + (minuend - subtrahend));
        
        product = multiplier * multiplicant;
        
        System.out.println("the multiplication of " + multiplier + " * "
              + multiplicant + " is equal to --> " + product);
        
        quotient = dividend / divisor;
        
        System.out.println("the division of " + dividend + " / " 
                + " is equal to --> " + quotient);
        
        remanider = dividend % divisor;
        
        System.out.println("the division remanider of " + dividend + " % " 
                + divisor + " is equal to --> " + remanider);
            }
    
}
