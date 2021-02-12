/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicsformula;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PhysicsFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Entrada = new Scanner(System.in);
        float  a,ts,t,vf,vini,hmax ;
         double ang;
        double total;
        int op;
    do{
        System.out.println("======BIENVENIDO a Tiro Parabolico======");
 System.out.println("1.Calcular Altura Maxima");
System.out.println("2.Calcular Tiempo de Altura Maxima");
System.out.println("3.Calcular Tiempo en el Aire");
System.out.println("4.Alcanze Maximo");
System.out.println("5.Salir");

 System.out.println("Introduce Opcion ");
op=Entrada.nextInt();  

    switch(op) {
case 1: 
     System.out.println("Calcular Altura Maxima");
         System.out.println("Ingresa Velocidad Inicial: ");
          vini=Entrada.nextFloat();
         
          System.out.println("Ingresa el Angulo: ");
          ang=Entrada.nextDouble();
          total=(Math.pow((vini*Math.sin(ang)),2))/(2*9.8);
          System.out.println("La Altura Maxima es:"+total+"Mts");
          System.out.println();
          break;
case 2 :
    
        System.out.println("	Calcular Tiempo de Altura Maxima");
       
         System.out.println("Ingresa Velocidad Inicial: ");
          vini=Entrada.nextFloat();
         
          System.out.println("Ingresa el Angulo: ");
          ang=Entrada.nextDouble();
       
          total=((vini*Math.sin(ang))/9.8);
          System.out.println("El Tiempo de Altura Maxima es:"+total+"S");
          System.out.println();
          break;  
          
          
          
          case 3 :
    
        System.out.println("Calcular Tiempo en el Aire");
        System.out.println("Ingresa Velocidad Inicial: ");
          vini=Entrada.nextFloat();
         
          System.out.println("Ingresa el Angulo:");
          ang=Entrada.nextDouble();
          total=(((2*vini)*Math.sin(ang))/9.8);
          System.out.println("El Tiempo en el Aire:"+total+"S");
          System.out.println();
          break;  
          
          case 4 :
    
        System.out.println("	Calcular Alcanze Maxima");
          
         System.out.println("Ingresa Velocidad Inicial: ");
          vini=Entrada.nextFloat();
         
          System.out.println("Ingresa el Angulo:");
          ang=Entrada.nextDouble();
          total=((2*Math.pow(vini, 2))*(Math.sin(ang))*(Math.cos(ang)))/9.8;
          System.out.println("El Alcanze Maximo es:"+total+"M");
          System.out.println();
          break;  
    
    default: 
        
System.out.println("Good Bye");
System.out.println();
    }
    }while (op!=5);
    
    }
    public static int TiroParabolico(int TiroParabolico) {
       TiroParabolico i=new TiroParabolico();
       i.menu();
            return 0;
    }

    private static class TiroParabolico {

        public TiroParabolico() {
        }

        private void menu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
