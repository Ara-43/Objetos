/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6.ejextra10;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class G6EjExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = (int) ((Math.random()*10)+1);
        int num2 = (int) ((Math.random()*10)+1);
        
        System.out.println("El primer numero es: "+num);
        System.out.println("");
        System.out.println("El segudo numero es: "+num2);
        System.out.println("");
        int mult;
        int result;
        do{
        System.out.println("Cuanto es: " + num + " * " + num2 + " ?");
        result = leer.nextInt();
        System.out.println("");
        
        mult = num * num2;
        if(mult == result){
            System.out.println("El resultado es correcto");
        } else {
            System.out.println("Multiplicaste mal, vuelve a multiplicar");
            System.out.println("");
            
            System.out.println("Cuanto es: " + num + " * " + num2 + " ?");
            result = leer.nextInt();
        }
        }while(mult != result);
               
   }
}
            

