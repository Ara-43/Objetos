/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioJuego;

import java.util.Scanner;
import objeto.JuegoG;

/**
 *
 * @author ailen
 */
public class ServicioJ {

    public JuegoG IngresoD() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        JuegoG xOJ = new JuegoG();

        System.out.println("Ingrese el nombre del jugador 1: ");
        xOJ.setJugador1(leer.next());
        System.out.println("Jugador 1 ¿cual elije? X / O: ");
        xOJ.setLetra(leer.next());
        System.out.println("");
        System.out.println("Ingrese el nombre del jugador 2: ");
        xOJ.setJugador2(leer.next());
        System.out.println("Jugador 2 ¿cual elije? X / O: ");
        xOJ.setLetra2(leer.next());
        System.out.println("");
        return xOJ;
    }

    public void InicioJuego(JuegoG xOJ) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i, j;

        System.out.println(xOJ.getJugador1() + " Que posicion desea colocar su letra " + xOJ.getLetra() + " : ");
        xOJ.setPosicion(leer.nextInt());
        System.out.println("");
        System.out.println(xOJ.getJugador2() + " Que posicion desea colocar su letra " + xOJ.getLetra2() + " : ");
        xOJ.setPosicion2(leer.nextInt());

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

            }
        }
    }
}
