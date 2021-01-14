
package hw03iterations;
import java.util.Scanner;
import java.math.*;

public class HW03Iterations {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        i = 0;
        
        System.out.println("=== This is while loop from 1 to 23 ===");
        
        while (i < 23){
            System.out.println("i -> " + (i+1));
            i++;
        }
            
            System.out.println("Multiplication Tables : 23 ");
        int top=12;
        int product=0;
        int table = 23;
        for (int j = 1; j <= top ; j++){
            product = table * j;
            System.out.println("23*" + j + " = " + product);
    }
    Scanner pot=new Scanner (System.in);
        int x,n=2;
        
        for(x=1;x<=20;x++)
        {
            int resultado=(int)Math.pow (n,x);
            
            System.out.println("El resultado es:" +resultado);
}

}
    
}
    

