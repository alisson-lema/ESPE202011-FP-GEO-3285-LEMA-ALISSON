/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author HP
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] integersToSort = {9, 7, 1, 6, 2, 3};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.Sort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
        
        int[] integersToSort2 = {8, 1, 7, 2, 5};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.Sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
        integersToSort2 =new int [] {9, 7, 3, 1, 4};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.Sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
         integersToSort2 =new int [] {5, -5, -6, -4, 1, 7};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.Sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
       
         SelecctionSort selecctionSort = new SelecctionSort();

       integersToSort2 = new int[]{42, 30, -5, 7, 1, 50};
        
        System.out.println("Sorting integers by SELECTION SORT");
        printArray(integersToSort2);
        int[] sortedArray = selecctionSort.sort(integersToSort2);
        System.out.println("");
        printArray(sortedArray);
        
//        int a=7;
//        int b=9;
//        System.out.println("a (inside main) -> " + a); //7
//        System.out.println("b (inside main) -> " + b); //9
//        System.out.println(" addition -> " + BubbleSort.add(a, b)); //16
//        System.out.println("a (inside main after calling add())-> " + a); // 0 ? 7
//        System.out.println("b (inside main after calling add())-> " + b); // 0 ? 9
        
    }

    
    public static void printArray(int[] integers){
        int n = integers.length;
        for (int i = 0 ; i <n;i++){
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

    
    
}
