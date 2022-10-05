/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Objeto.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioCircunferencia {

    public Circunferencia NewCircunferencia() {

        Circunferencia C1 = new Circunferencia();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el diametro: ");
        C1.setNumber(leer.nextDouble());
        System.out.println("");

        return C1;
    }
    
    public void CrearCircunferencia(Circunferencia C1 ){
        
          C1.setRadio(C1.getNumber() / 2);
          
          System.out.println("Su Radio es: " + C1.getRadio());
          System.out.println("");
    }
    
    public void Area(Circunferencia C1){
        
        C1.setArea(3.14 * (C1.getRadio() * 2));
        
        System.out.println("Su Area es: " + C1.getArea());
        System.out.println("");
    }
    
    public void Perimetro(Circunferencia C1){
        
        C1.setPerimetro(2 * 3.14 * C1.getRadio());
        
        System.out.println("Su Perimetro es: " + C1.getPerimetro());
        System.out.println("");
    }

}
