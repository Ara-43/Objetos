/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sextoejeobjeto;

import Objeto.Cafetera;
import Service.ServiciosCafetera;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class SextoEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosCafetera C = new ServiciosCafetera();
        
        String p;
        int i;
        
        Cafetera Cafe = C.llenarCafetera();
        
        C.ServirTaza(Cafe);
        C.vaciarCafetera(Cafe);
        C.agregarCafe(Cafe);
        System.out.println("Desea preparar mas cafe?: ");
        p = leer.next();
        
        if(p.equals("Si" ) || p.equals("si")){
            
            System.out.println("Cuanto cafe hara?: ");
            int nCafe = leer.nextInt();
            
            for (i =0; i < nCafe; i++){
                C.llenarCafetera();
                C.ServirTaza(Cafe);
                C.vaciarCafetera(Cafe);
                C.agregarCafe(Cafe);
            }
        }
        System.out.println("Cafetera lista para el proximo cafe!");

    }

}
