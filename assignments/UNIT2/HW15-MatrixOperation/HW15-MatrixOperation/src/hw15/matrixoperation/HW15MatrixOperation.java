/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import javax.swing.JOptionPane;

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
     int filas=Integer.parseInt(JOptionPane.showInputDialog("Digita las filas de las matries"));
     int columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita las columnas de las matrices"));
     int matrizA[][]=new int[filas][columnas];
     int matrizB[][]=new int[filas][columnas];
     int matrizC[][]=new int[filas][columnas];
     int matrizRes[][]=new int[filas][columnas];
        System.out.println("Datos de la Matriz A:");
        for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
        matrizA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+i+"]["+j+"]"+" de la matriz A"));
        System.out.print(matrizA[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("Datos de la Matriz B:");
        for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
        matrizB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+i+"]["+j+"]"+" de la matriz B"));                            
        System.out.print(matrizB[i][j]+" ");
        }
        System.out.println();
        }  
        System.out.println("Datos de la Matriz c:");
        for(int i=0;i<filas;i++){  
        for(int j=0;j<columnas;j++){
        matrizC[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+i+"]["+j+"]"+" de la matriz c"));                            
        System.out.print(matrizC[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("Resta de las tres matrices:");
        for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
        matrizRes[i][j]=matrizA[i][j]-matrizB[i][j]-matrizC[i][j];                            
        System.out.print(matrizRes[i][j]+" ");
        }
        System.out.println();
}
    }
    
}
