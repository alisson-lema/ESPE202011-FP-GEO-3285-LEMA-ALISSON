/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;

import ec.edu.espe.Tax.BasicTax;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentege = 12;
        
        Scanner input = new Scanner (System.in);
        System.out.println("----Alisson Lema Taxes-----");
        System.out.println(" IVA -->");
        System.out.println(" Entrer the price of your products");
        price =input.nextFloat();
        
        ivaValue = BasicTax.computeIva(price,ivaPercentege);
        totalPrice = price + ivaValue;
        
        System.out.println("Total price" + totalPrice);
        
        
    }
    
    
}
