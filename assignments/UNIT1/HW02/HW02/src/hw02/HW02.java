import java.util.Scanner;
import java.math.*;

public class HW02 {
    public static void main(String[] args){
        // Your code here!
        Scanner ingreso=new Scanner(System.in);
        int mayor=0;
        short menor=0;
        float respuesta=0;
        float pi=3.1416f;
        System.out.println("Ingrese el eje Mayor");
        mayor=ingreso.nextInt();
        System.out.println("Ingrese el eje Menor");
        menor=ingreso.nextShort();
        respuesta=pi*(mayor*menor);
        System.out.println("El area del elipse es: "+respuesta);     
    }
}

