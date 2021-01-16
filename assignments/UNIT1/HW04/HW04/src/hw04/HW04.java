
package hw04;
import java.util.Scanner;
import java.math.*;

public class HW04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Calcular el area de una elipse");
            System.out.println("2. -> Multiplication Tables : 20");
            System.out.println("3. -> 2 raised to power");
            System.out.println("4. -> This is a while loop from 1 to 30 ");
            System.out.println("5. -> Exit"); 

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    Scanner ingreso=new Scanner(System.in);
        int mayor=0;
        short menor=0;
        float respuesta=0;
        float pi=3.1416f;
        System.out.println("Ingrese el eje Mayor");
        mayor=ingreso.nextInt();
        System.out.println("Ingrese el eje Menor");
        menor=ingreso.nextShort();
        respuesta=pi*(mayor*menor);
        System.out.println("El area del elipse es: "+respuesta);
                   break;
                case 2:
                    System.out.println("Multiplication Tables : 20");
                       int top=12;
                       int product=0;
                       int table = 20;
                    for (int j = 1 ; j <= top ; j++)
                    product = table * j;
                {
                    String j = null;
                    System.out.println("20 * " + j + " = " + product);
                }
                    break;

                case 3: 
                Scanner pot = new Scanner (System.in);
                  int x,n=2;
        
                 for(x=1;x<=12;x++);
        
                 int resultado=(int)Math.pow (n,x);
            
                 System.out.println("El resultado es:" +resultado);
                    
        
                    break;
                    case 4:
                        int i;
                        i = 0;

                    System.out.println("==== This is a while loop from 1 to 30 ====");

                   while (i < 30) 
                   System.out.println("i -> " + (i + 1));
                    i++;
         
                    break;
                case 5:
                    System.out.println("See you tomorrow my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

    }
    

       
   
    

    

 

         
        
