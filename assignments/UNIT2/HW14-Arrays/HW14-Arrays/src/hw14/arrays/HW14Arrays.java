/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.arrays;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);

        double[] notas = new double[numAlum]; 
    
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        System.out.println("=================");
        media = suma / notas.length;
        System.out.printf("Nota media del curso: %.2f %n", media);

        System.out.println("==================");
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
            System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
    }
}
}
