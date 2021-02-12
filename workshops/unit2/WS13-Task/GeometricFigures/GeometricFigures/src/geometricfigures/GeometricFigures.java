/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricfigures;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GeometricFigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
  int opcion=0;
  do{
  System.out.println(" ======== CALCULATOR========= ");
  System.out.println("1. Calculator for the area of ​​the Pentagon ");
  System.out.println("2. Calculator for the area of ​​the Rhomboid ");
  System.out.println("3. Calculator for the area of ​​the Trapezoid ");
  System.out.println("4. -> Exit");
  System.out.println("Enter your menu option --> ");
  opcion = input.nextInt();
  switch (opcion){
  
   
      
        case 1:
         System.out.println("Enter the perimeter");
         int perimetro = input.nextInt();
         System.out.println("Enter the Apothem");
         int apotema= input.nextInt();
         System.out.println("THE PENTAGON AREA IS :"+areapentagono(perimetro,apotema));
        break;
        case 2:
         System.out.println("ENTER THE BASE");
         int base_r =input.nextInt();
         System.out.println("ENTER HEIGHT");
         int altura_r =input.nextInt();
         System.out.println(" THE RHOMBOI AREA IS  :"+arearomboide(base_r,altura_r));
        break;
        case 3:
         System.out.println("ENTER MAJOR BASE ");
         int base_ma=input.nextInt();
         System.out.println("ENTER DE MINOR BASE");
         int base_me=input.nextInt();
         System.out.println("ENTER HEIGHT");
         int altura_t=input.nextInt();
         System.out.println(" THE AREA OF THE TRAPEZOID IS :"+areatrapecio(base_ma,base_me,altura_t));
        break;
        
        case 4:
         System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;   

  }
 
  }while(opcion!=4);
 }

public static int areapentagono(int p, int a){
     return (p*a) / 2;
    }
  public static int arearomboide(int b,int h){
     return b*h ;
    }
  public static int areatrapecio (int B , int b , int h){
  
   return ((B+b)/2)*h;
    }
    
}
