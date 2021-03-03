/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lema.aulio.q11.java;

import java.util.Scanner;
/**
 *
 * @author martin lema
 */
public class LEMAAULIOQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|LEMAAULIOQ11Java |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Add the elements");
        System.out.println("Enter five items by keyboard");

        int M = input.nextInt();
        int A = input.nextInt();
        int R = input.nextInt();
        int T = input.nextInt();
        int I = input.nextInt();
        int[] b = {M, A, R, T, I};
        int add = 0;
        System.out.println("the result of the sums is equal a"
                + PrintTaxPercentage(add, M, A, R, T, I));

        // SECOND PART.....................................
        System.out.println("the average of three elements in an array");
        System.out.println("Enter all three items");

        float o = input.nextInt();
        float l = input.nextInt();
        float a = input.nextInt();

        float[] m = {o, l, a};
        float average = 0;
        System.out.println("The average result is equal to" + PrintAverage(average, o, l, a));
        //PART THREE----------------------------------------------------------------
        System.out.print("Enter the number to search ");
        int[] p = {12, 23, 34, 98, 87, 65, 0};
        int find;
        find = input.nextInt();
        findNumber(p, find);

    }

    //FUNCTIONS-----------------------------------------------------------
    //FUNCTION 1
    public static int PrintTaxPercentage(int add, int t, int s, int u, int y, int z) {
        int[] e = {t, s, u, y, z,};
        for (int i = 0; i < e.length; i++) {
            add =e[i];
        }
        return add;
    }

    //FUNCTION SECOND...........................................
    public static float PrintAverage(float average, float t, float e, float a) {
        float[] b = {t, a, e};
        for (int i = 0; i < b.length; i++) {
            average = (b[i]/3);
        }
        return average;
    }

    //FUNCTION THREE..........................................................
    private static void findNumber(int[] a, int find) {
        for (int i = 0; i < a.length; i++) {
            if (find == a[i]) {
                System.out.println("The number " + a[i] + "THE NUMBER HAS BEEN FOUND ");

            }
        }
    }
}
