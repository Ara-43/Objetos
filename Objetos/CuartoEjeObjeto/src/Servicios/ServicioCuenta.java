/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objeto.Cuenta;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioCuenta {
    
    public Cuenta NewCuenta(){
        
        Cuenta Ct1 = new Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su numero de Cuenta: ");
        Ct1.setNumeroCuenta(leer.nextInt());
        System.out.println("");
        System.out.println("Ingrese su DNI (Sin puntos): ");
        Ct1.setDNI(leer.nextInt());
        System.out.println("");
        System.out.println("Ingrese su saldo actual: ");
        Ct1.setSaldoActual(leer.nextInt());
        System.out.println("");
        
        return Ct1;
    }
    
    public void ingresar(Cuenta Ct1){
        int NewSaldo = 5000;
        int Suma;
        
        Suma = Ct1.getSaldoActual() + NewSaldo;
        
        System.out.println(Suma);
    }
    
    public void retirar(Cuenta Ct1){
        
    }
    
}
