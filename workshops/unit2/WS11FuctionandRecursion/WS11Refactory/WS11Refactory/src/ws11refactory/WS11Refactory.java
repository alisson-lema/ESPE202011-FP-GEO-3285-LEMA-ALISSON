/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11refactory;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS11Refactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);

        int operand1;
        int operand2;
        int result;
        char option;

        do {
            System.out.print("Enter the number 1: ");
            operand1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the number 2: ");
            operand2 = scanner.nextInt();
            scanner.nextLine();

            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                showMultiplication(operand1, operand2);
            } else if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                showAdittion(operand1, operand2);
            } else if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                showModulus(operand1, operand2);
            } else if (operand1 % 11 == 0 && operand2 % 11 == 0) {
                showMultiplicationTables(operand1, operand2);
            } else if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                showDivision(operand1, operand2);
            } else {
                System.out.println("This operation does not exist");
            }

            System.out.println("Do you want to ask again, if so, enter any NUMBER,"
                    + " otherwise enter a LETTER -> n <--  ");
            option = scanner.nextLine().charAt(0);

        } while (option != 'n');
    }

    private static void showDivision(int operand1, int operand2) {
        int result;
        result = (operand1 / operand2);
        System.out.println("The division is : " +operand1 + " / " + operand2 + " = " + result);
    }

    private static void showModulus(int operand1, int operand2) {
        int result;
        result = operand1 % operand2;
        System.out.println("The module is: " +operand1 + " % " + operand2 + " = " + result);
    }

    private static void showAdittion(int operand1, int operand2) {
        int result;
        result = operand1 + operand2;
        System.out.println("The sum is: " +operand1 + " + " + operand2 + " = " + result);
    }

    private static void showMultiplication(int operand1, int operand2) {
        int result;
        result = operand1 * operand2;
        System.out.println("The multiplication is: " + operand1 + " x " + operand2 + " = " + result);
    }
    
    public static void showMultiplicationTables(int paramOperand1, int paramOperand2){
        for (int j = 1; j <= 12; j++) {
                    System.out.println(paramOperand1 + " x " + j + " = " + (paramOperand1 * j));
                }

                if (paramOperand1 != paramOperand2) {
                    for (int j = 1; j <= 12; j++) {
                        System.out.println(paramOperand2 + " x " + j + " = " + (paramOperand2 * j));
                    }
                } 
     }      
        }
