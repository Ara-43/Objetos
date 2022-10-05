/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelahorcado;

import Objeto.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class JuegoDelAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         
         
        Ahorcado a = new Ahorcado();
       
        
        System.out.println("Ingrese la palbra para eljuego: ");
        a.setPalabra(leer.next());
        
        System.out.println("Cuantos intentos tendra el jugador? ");
        a.setIntentos(leer.nextInt());
        
      
        
      
    }
    
}
