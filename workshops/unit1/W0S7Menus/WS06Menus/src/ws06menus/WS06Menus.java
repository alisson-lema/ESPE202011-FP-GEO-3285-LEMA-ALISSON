
package ws06menus;
import java.util.Scanner;
import java.math.*;

public class WS06Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);  
       boolean mainLoop = true;
       int option;
       
        do{
            System.out.println("=====Calculator====");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");
            
             System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            
            switch(option){
                
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                     System.out.println("enter addend 1 -> ");
                     addend1 = input.nextInt();
                     System.out.println("enter addend 2 -> ");
                     addend2 = input.nextInt();
                     sum = addend1 + addend2;
                     System.out.println("the sum is -->" + sum);
                     break;
                case 2:
                    int minuend;
                    int subtrahend;
                    int subtraction;
                    System.out.println("Enter minuend -->");
                    minuend = input.nextInt();
                    System.out.println("Enter subtrahend -->");
                    subtrahend = input.nextInt();
                    subtraction = minuend - subtrahend;
                     System.out.println("The subtraction is -->" + subtraction);
                break;
                case 3:
                    int factor1;
                    int factor2;
                    int multiplication;
                    System.out.println("Enter factor 1--> ");
                    factor1 = input.nextInt();
                    System.out.println("Enter factor 2--> ");
                    factor2 = input.nextInt();
                    multiplication = factor1 * factor2;
                    System.out.println("The multiplication is-->" + multiplication);
                    break;
                case 4:
                    float dividend;
                    float divider;
                    float division;
                    System.out.println("Enter dividend -->");
                    dividend = input.nextFloat();
                    System.out.println("Enter divider --> ");
                    divider = input.nextFloat();
                    System.out.println("Enter division --> ");
                    division = input.nextFloat();
                    division= dividend/divider;
                    System.out.println("The division is ");
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
                      
            }
        }   
        
       
    





    

