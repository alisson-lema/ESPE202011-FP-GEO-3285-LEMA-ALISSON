/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author HP
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // if we have the Math Library 
        // we import and use it
        
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float AbsolutValue=0.0F;
        
        
        number= 9; // squareRoot = ? -> 3
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<- is -> " + squareRoot);
        
        number= 49; // ? 7
         squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<- is -> " + squareRoot);
        
        number = 5; // ? 2.23
         squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<- is -> " + squareRoot);
        
        base = 3;
        exponent=2;
        //power= 9 ?
        power=(float)Math.pow(base, exponent);
        System.out.println(base + "^"+ exponent+ "=" + power);
       
        
        base=2;
        exponent=4;
        //power= 16 ?
        power=computePower(base,exponent);
        System.out.println(base + "^"+ exponent+ "=" + power);
        
        base= 78;
        exponent=5;
        //calculator 78^5
        // 2.887.174.368
       power=computePower(base,exponent);
        System.out.println(base + "^"+ exponent+ "=" + power);
        
        AbsolutValue =getAbsoluteValue(number);
        number = -5;
        AbsolutValue =getAbsoluteValue(number);
        System.out.println("The absolutValue of ->" + number+ "is" + AbsolutValue);
        
        number = 5;
        AbsolutValue =getAbsoluteValue(number);
        System.out.println("The absolutValue of ->" + number+ "is" + AbsolutValue);
        
        // if we dont have the library, what would we do?
        //we should create the feature,the library
        //our own algorithm to compute the square root.
    }
   
    public static float computePower(float base, float exponent){
        float power;
        power=1.0F;
        
        for(int i = 1; i <= (int)exponent; i++){
            power = power * base;
        }
        
        return power;
    }
    private static float getAbsoluteValue(float number){
        if (number<0){
            return - number;
        }else{
            return number;
        }
//       if (number <0){
//        number = number * -1;
//        return number;
//    }
//       return number;
}
    
}
