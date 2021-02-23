/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner ent =new Scanner(System.in);
     
     System.out.println("Enter number of rows ->");
     int fil=ent.nextInt();
     System.out.println("Enter number of columns ->");
     int col = ent.nextInt();
     
     System.out.println();
     System.out.println("Enter matrix A:");
     int [][] m1=readMatrix(fil,col);
     
     System.out.println();
     System.out.println("Enter matrix B:");
     int [][] m2=readMatrix(fil,col);
     
     System.out.println();
     System.out.println("Enter matrix C:");
     int [][] m3=readMatrix(fil,col);
     
     int [][] subtraction =Msubtraction(m1,m2,m3);
     
     System.out.println();
     System.out.println("M1-M2-M3=");
     printMatrix(subtraction);
    }
    
    public static int [][]readMatrix(int fila ,int columna){
        int [][] rslt = new int [fila][columna];
        Scanner sc = new Scanner (System.in);
        
        for (int i =0; i< fila ;i++){
            for (int j =0;j<columna; j++){
                rslt[i][j] = sc.nextInt();
            }
        }
        return rslt;
    }    

    private static int[][] Msubtraction(int[][] m1, int[][] m2, int[][] m3) {
      int fil = m1.length;
      int col=m1[0].length;
      int [][] result = new int [fil][col];
      
      for (int i=0; i< fil; i++){
          for (int j=0; j< col;j++){
              result[i][j]=m1[i][j]-m2[i][j]-m3[i][j];
          }
      }
      return result;
    }

    private static void printMatrix(int[][] matrix) {
      int fil = matrix.length;
      int col =matrix[0].length;
      
      for(int i=0; i< fil; i++){
          for(int j = 0; j< col; j++){
              System.out.println(matrix[i][j] +" ");
          }
          System.out.println();
      }
    }
}

    
   

    
  


