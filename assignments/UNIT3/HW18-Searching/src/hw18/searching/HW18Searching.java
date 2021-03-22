/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18.searching;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] toysPrice = {180, 150, 350, 700, 900, 150, 100, 60, 300};
        int toys;
        int x = 0;
        int search;
        int binarySearch;

        System.out.println("AUTHOR: ALISSON LEMA");
        System.out.println("====LINEAR  SEARCH ====");
        System.out.println(" ");

        System.out.println(" Enter the Toys Price ");
        toys = input.nextInt();
        System.out.println("the Toys price " + toys + " the price of the Toys is in the range: " + search(toysPrice, toys,x));

        System.out.println("=== BINARY  SEARCH ==== ");
        System.out.println(" ");

        System.out.println(" Enter the Toys price ");
        toys = input.nextInt();
        System.out.println("the toys price " + toys + " the price of the toys is in the range: " + binarySearch(toysPrice, toys));
    }

    private static int binarySearch(int[] toysPrice, int toys) {
        int n = toysPrice.length;
        for (int i = 0; i < n; i++) {
            if (toysPrice[i] == toys) {
                return i;
            }
        }
        return -1;
    }

    private static int search(int[] toysPrice, int toys, int x) {
        {
            int n =toysPrice.length;
            
            for (int i = 0; i < n; i++)
            {
                if (toysPrice[i] == x)
                    return i;
            }
        }
            return -1;
    }
    
}
        

