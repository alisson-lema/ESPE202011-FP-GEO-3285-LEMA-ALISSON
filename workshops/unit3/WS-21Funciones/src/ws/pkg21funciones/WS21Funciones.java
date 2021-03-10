/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.pkg21funciones;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS21Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double consumo_en_kilowatts; 
        double costo_por_kilowatt; 
        double pago;
        
        System.out.print("ATHOR: ALISSON LEMA CHAVEZ \n ");
        System.out.print("Ingresa el valor de consumo en kilowatts: ");
        consumo_en_kilowatts = in.nextDouble();
        in.nextLine();
        
        System.out.print("Ingresa el valor de costo por kilowatt: ");
        costo_por_kilowatt = in.nextDouble();
        in.nextLine();
        
        pago=consumo_en_kilowatts*costo_por_kilowatt;
        System.out.println("Valor de pago: " + pago);
        
    }
    
}
