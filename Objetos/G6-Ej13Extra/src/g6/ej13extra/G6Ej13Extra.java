/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6.ej13extra;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ailen
 */
public class G6Ej13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una altura");
        System.out.print("");
        int altura = leer.nextInt();
        dibujaEscaleraNumeros(altura);
    }   
 
    public static void dibujaEscaleraNumeros (int altura){
        for (int numero=1;numero<=altura;numero++){
            //Este bucle muestra los numeros en cada fila
            for(int i=1;i<=numero;i++){
                System.out.print(i);
            }
            //Saltamos de linea
            System.out.println("");
        }
    }
}
