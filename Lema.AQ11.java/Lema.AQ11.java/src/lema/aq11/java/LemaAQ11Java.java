/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lema.aq11.java;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class LemaAQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);

        int add = 0;
        int[] arreglo = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the " + i + " num:");
            arreglo[i] = ent.nextInt();
            add += arreglo[i];

        }
        for (int i = 0; i < 5; i++) {

            System.out.println("In the position "  + " it was saved: " + arreglo[i]);
            System.out.println("The sum total is: " + add);
            Scanner sc = new Scanner(System.in);
        }

        int i;
        float s = 0, p = 3;
        int[] a = new int[3];

        for (i = 0; i < 3; i++) {
            System.out.println("Enter the integer in position : " + (i + 1));

            a[i] = input.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            s = s + a[i];

            p = s / a.length;
        }
        System.out.println("the average is: " + p);
        
       
        
        int[] number = new int[5]; 
        double suma = 0;              
        float average[];
        int matrix[] ={12,23,34,98,87,65,0};
        int value;
         number = new int[5]; 
         average=new float[3]; 
        System.out.println("ENTER THE 5 VALUES FOR ADDTION : ");
        for (i = 0; i <= 7; i++) {
            System.out.print("Enter the values "+ i + "->");
            number[i]=input.nextInt();
        }
        for (i = 1; i <= 3; i++) {
          System.out.print("Enter the values "+ i + "->");
            average[i]=input.nextInt();  
        }
        System.out.print("values is ");
         for (i = 0; i < 7; i++){
             System.out.println(number[i]);
         }
    }
    
}

