/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

/**
 *
 * @author HP
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplying = (int) 8.5;
        int multiplier = (int) 18.15;
        float result = 0;
        int x = 0;
        int y = 0;
        
        //call to multiplyTwoNumbers () function
        result = multiplyTwoNumbers(multiplying, multiplier);
        
        System.out.println("Result of 8.5 and 18.15 is  -> " + result); //91.975 or ?
        
        y = f(6);
        System.out.println("6^4 ->" + y);
        
        y = f(-6);
        System.out.println("-6^4 ->" + y); //625
        
        x = -1;
        y = f(x);
        System.out.println("the cube of ->" + x + " <- is equalto -> " + y);
        
    }
    //function definition
    //return data type   name  parameter1  parameter2
    public static float multiplyTwoNumbers(int multiplying, int multiplier) {
        //body of the function
        float result = 0.0F;
        
        //             6.5      14.15  -> 91.975
        //result       int       int 
        result =  (float)multiplying * (float)multiplier;
        return result;
        
    }
    
    public static int f(int x){
        int y = 0;
        
        y = x * x;
        
        return y;
    }
    
    public static int g(int x){
        int y = 0;
        
        y = x * x + 2 * x + 1;
        
        return y;
    }
    
}
