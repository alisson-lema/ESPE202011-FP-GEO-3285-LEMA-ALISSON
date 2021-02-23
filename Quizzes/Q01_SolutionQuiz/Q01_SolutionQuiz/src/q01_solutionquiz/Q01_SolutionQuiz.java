/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q01_solutionquiz;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q01_SolutionQuiz {

    private static Object scanner;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int totalOfStudents = 0;
        String[] Students;
        float[] Averages;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number of students you want to register -> ");
        totalOfStudents = scanner.nextInt();

        Students = new String[totalOfStudents];
        Averages = new float[totalOfStudents];

        for (int i = 0; i < totalOfStudents; i++) {
            scanner.nextLine();
            System.out.print(" Please Enter the name of students:" + i + " -> ");
            Students[i] = scanner.nextLine();
            System.out.print(" Please enter " + Students[i] + " average ->");
            Averages[i] = scanner.nextFloat();
        }

        System.out.println(" Student   ->  \t     average ");

        for (int i = 0; i < totalOfStudents; i++) {
            System.out.println(Students[i] + " ->  \t " + Averages[i]);
             
    }
    
}

}
