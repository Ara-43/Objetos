/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoa;

/**
 *
 * @author ailen
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador {

    public String pedirLetra() {
        String valor = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            Tablero tablero = new Tablero();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese la palabra: ");
            tablero.setPalabra(leer.next());

            System.out.print("Ingrese letra   : ");
            valor = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }
}
