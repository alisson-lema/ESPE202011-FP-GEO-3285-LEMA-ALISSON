/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11_recursion_example;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW11_Recursion_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
        
        do {
            option = printMenu(input);
    
    switch(option){    
                case 1 :
                    DeclareTheFlowCalculation(input);                                                                      
                 break;

                case 2 :
                   DeclareTheCalculationOfRotationalDisplacement(input);
                break;  
				
		case 0 :
                    DeclareFarewell();
                    break;
                default :
                    System.out.println("invalid option\n\n");
                    break;
                    
            }
        } while ( option !=0);
        // TODO code application logic here
    }

    private static int printMenu(Scanner input) {
        int option;
        System.out.println("Hello, choose an option");
        System.out.println("1.-Calculate the flow rate by speed and time");
        System.out.println("2.-Calculate the rotational displacement of a "
                + "landslide using : Width of the break surface, length of"
                + " the break surface and depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain.");
        System.out.println("0.- Exit");
        System.out.println("Enter your menu option-->");
        option = (int) input.nextFloat();// TODO code application logic here
        return option;
    }

    private static void DeclareFarewell() {
        System.out.println(" See you later ");
        System.exit(0);
    }

    private static void DeclareTheCalculationOfRotationalDisplacement(Scanner input) {
        System.out.println("Enter the width of the break surface (Wr or Ar)-->");
        float Wr = input.nextFloat();
        System.out.println("Enter the length of the break surface (Lr)--> ");
        float Lr = input.nextFloat();
        System.out.println("Enter the depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain(Dr or Pr)--> ");
        float Dr = input.nextFloat();
        float pi;
        pi = (float) 3.1415926535897932;
        float V = (((pi) * (Wr * Dr * Lr)) / (6));
        System.out.println("The rotational displacement is --> " + V  );
    }

    private static void DeclareTheFlowCalculation(Scanner input) {
        System.out.println("Enter the calculated speed (m^3/hr)-->");
        float Q;
        float v=input.nextFloat();
        System.out.println("Enter the calculated time (min)--> ");
        float t=input.nextFloat();
        Q= v/t;
        System.out.println(" The Flow is whit speed -> " + v + " and "
                + " time -> " + t + " is ->" + Q);
    }
    
}
