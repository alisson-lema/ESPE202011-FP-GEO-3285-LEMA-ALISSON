
package ws08debugging;
import java.util.Scanner;
import java.math.*;
public class WS08debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 12;

        product = 0;

        do {
            System.out.println("Enter the table you want to study ");
            System.out.println("0 (zero) to exit  --> ");

            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println("Studying the Table of ----> " + multiplicand + " <----");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x " + multiplier + " = " + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);

        System.out.println("Come back soon friend");
 
    }
    
}
