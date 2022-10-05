/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objeto.Operacion;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioOperaciones {
    
    public Operacion NewOperacion() {

        Operacion O1 = new Operacion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero: ");
        O1.setNumero1(leer.nextInt());
        System.out.println("");
        System.out.println("Ingrese el segundo numero: ");
        O1.setNumero2(leer.nextInt());
        System.out.println("");

        return O1;
    }
    
    public void Suma(Operacion O1){
        
        O1.setSuma(O1.getNumero1() + O1.getNumero2());
        
        System.out.println("La suma de ambos numeros es igual a: " + O1.getSuma());
        System.out.println("");
    }
    
    public void Resta(Operacion O1){
        
        O1.setResta(O1.getNumero1() - O1.getNumero2());
        System.out.println("La resta de ambos numeros es igual a: " + O1.getResta());
        System.out.println("");
    }
    
    public void Mult(Operacion O1){
        
        O1.setMultiplicacion(O1.getNumero1() * O1.getNumero2());
        System.out.println("La multiplicacion de ambos numeros es igual a: " + O1.getMultiplicacion());
        System.out.println("");
    }
    
    public void Div(Operacion O1){
        
        if(O1.getNumero1() > O1.getNumero2()){
             O1.setDivision(O1.getNumero1() / O1.getNumero2());
        }else{
             O1.setDivision(O1.getNumero2() / O1.getNumero1());
        }
        
        System.out.println("La division de ambos numeros es igual a: " + O1.getDivision());
        System.out.println("");
       
    }
}
