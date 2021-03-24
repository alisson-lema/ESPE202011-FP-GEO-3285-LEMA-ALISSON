/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19.arraynumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class HW19ArrayNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[6];
        for(int i=0;i < numbers.length;i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+ "º Number :",0));
        }
        String Cadena ="Undoordered Numbers \n";
        for(int i=0;i < numbers.length;i++){
            Cadena = Cadena + numbers[i] + "    ";
        }
         Insercion(numbers);
        Cadena = Cadena  + "\nOrdered Numbers ";
        for(int i=0;i < numbers.length;i++){
                Cadena = Cadena + "\n" +  numbers[i] ;
            
        }
        JOptionPane.showMessageDialog(null,Cadena);
 }
public static void Insercion (int[] numbers) {
      for (int i=1; i < numbers.length; i++) {
         int aux = numbers[i];
          int pos = i;
         while ((pos > 0) && (numbers[pos - 1] > aux)){
              numbers[pos] = numbers[pos -1];
              pos --;
          }
          numbers[pos]=aux;
      }
}
}

    


    

