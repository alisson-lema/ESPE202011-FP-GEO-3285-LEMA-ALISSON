
package hw11_recursion;
import java.util.Scanner;
import java.math.*;

public class HW11_Recursion {

    /**
     * @param args the command line arguments
     */
    public static int Mult(int a, int b){
      if (a== 0 ||b==0) {
         return 0;
         
      }else{
          return a+Mult(a,(b-1));
      }
    }
    
    public static void main(String[] args) {
        int a,b;
        Scanner input =new Scanner (System.in);
        System.out.println("Enter de number 1");
        a=input.nextInt();
        System.out.println("Enter de number 2");
        b=input.nextInt();
        
        while (b< 0 || a<0){
            System.out.println("The numbers is possitive");
            System.out.println("Enter de number 1");
            a=input.nextInt();
            System.out.println("Enter de number 2");
            b=input.nextInt();
        }
        System.out.println("The multiplication " + a +" * " + b + " is =" + Mult(a,b));
    }
    }
    


