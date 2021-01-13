package fp02_controlstatement;
import java.util.Scanner;
import java.math.*;

public class FP02_controlStatement {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter an integer --");
        
        int num;
        
        num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("      The number entered is even--  " + num
            );
        } else {
            System.out.println("   The number entered is odd--" + num);
        }
    }
    
}
