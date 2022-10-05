/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objeto.Cafetera;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServiciosCafetera {

    public Cafetera llenarCafetera() {

        Cafetera Cafe = new Cafetera();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cafe.setCapacidadMaxima(5000);
        System.out.println("La cantidad maxima de la cafetera es 5 Litros");

        if (Cafe.getCantidadActual() == 0) {
            System.out.println("Ingrese la cantidad de granos de cafe a la maquina: ");
            Cafe.setCantidadActual(leer.nextInt());
        }

        if (Cafe.getCantidadActual() == Cafe.getCapacidadMaxima()) {

            System.out.println("La cafetera esta llena!");

        }
        
        if (Cafe.getCantidadActual() < Cafe.getCapacidadMaxima()) {
            String pregunta;
            System.out.println("La cafetera tiene capacidad para mas, desea agregar mas? ");
            pregunta = leer.next();

            if (pregunta.equals("si") || pregunta.equals("Si")) {
                int resta, masCafe;
                resta = Cafe.getCapacidadMaxima() - Cafe.getCantidadActual();
                System.out.println("Para llenar la cfetera te falta: " + resta);
                System.out.println("Agrega lo que falta: ");
                masCafe = leer.nextInt();

                Cafe.setCantidadActual(Cafe.getCantidadActual() + masCafe);

            }
        }
         return Cafe;
    }

    public int ServirTaza(Cafetera Cafe) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int tazaVacia;

        System.out.println("Ingrese la medida de la taza: ");
        tazaVacia = leer.nextInt();
        System.out.println("Sirviendo la taza...");
        int litros = Cafe.getCantidadActual() - tazaVacia;
        System.out.println("");
        if (tazaVacia > Cafe.getCantidadActual()) {
            int CafeF;

            CafeF = tazaVacia - Cafe.getCantidadActual();
            System.out.println("Falto cafe!, le falto: " + CafeF + " Litros");
        }
        if (litros != 0) {
            System.out.println("Sobro cafe! sobro: " + litros);
        } else {
            System.out.println("La taza se lleno!");
        }

        return litros;
    }

    public void vaciarCafetera(Cafetera Cafe) {
        Cafe.setCantidadActual(0);
    }

    public int agregarCafe(Cafetera Cafe) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Desea agregar cafe? ");
        String Pre = leer.next();

        if (Pre.equals("Si") || Pre.equals("si")) {
            System.out.println("Cuanto cafe va a agregar?: ");
            Cafe.setCantidadActual(leer.nextInt());
        } else {
            System.out.println("Fin del preparado");
        }
        return Cafe.getCantidadActual();
    }
}
