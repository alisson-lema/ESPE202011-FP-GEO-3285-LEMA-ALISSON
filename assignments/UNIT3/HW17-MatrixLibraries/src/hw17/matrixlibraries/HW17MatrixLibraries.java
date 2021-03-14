/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17.matrixlibraries;

import static ec.edu.espe.Matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.Matrix.BasicMatrix.prettyPrinMatrix;
import static ec.edu.espe.Matrix.BasicMatrix.readMatrix;
import static ec.edu.espe.Matrix.BasicMatrix.subtractionTwoMatrices;
import static ec.edu.espe.Matrix.BasicMatrix.transpose;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int columns;
        int rows;
        float[][] matrixD;
        float[][] matrixH;
        float[][] t;
        float[][] matrixC;

        Scanner input = new Scanner(System.in);
        System.out.println(" ==== AUTHOR : Alisson Lema Chavez  ====");

        System.out.println("Enter the matrix dimensions");
        System.out.print("\n columns ---> ");
        rows = input.nextInt();

        System.out.print("\n rows ---> ");
        columns = input.nextInt();

        matrixD = new float[rows][columns];
        matrixH = new float[rows][columns];
        matrixC = new float[rows][columns];
        t = new float[rows][columns];

        System.out.println("Enter the elements of the matrix ");
        matrixD = readMatrix(rows, columns, "Matrix D", input);
        matrixH = readMatrix(rows, columns, "Matrix H", input);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("-------- > Matrix D");

        prettyPrinMatrix(rows, columns, matrixD);
        System.out.println("");

        System.out.println("-------- > Matrix H");

        prettyPrinMatrix(rows, columns, matrixH);
        System.out.println("");

        transpose(columns, rows, t, matrixD);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("========The Transpose of matrice is ========");

        prettyPrinMatrix(rows, columns, t);

        System.out.println("");
        System.out.println("======== The subtraction of matrices is ========");
        matrixC = subtractionTwoMatrices(rows, columns, matrixD, matrixH);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println("======== The addition of matrices is ========");

        matrixC = addTwoMatrices(rows, columns, matrixD, matrixH);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");

        System.out.println("======== SEE YOU LATER FRIEND ========");
        
    }
    
}
