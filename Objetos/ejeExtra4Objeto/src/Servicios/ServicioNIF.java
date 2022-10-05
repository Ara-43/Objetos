/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objeto.NIF;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class ServicioNIF {
    public NIF NewServiceNIF(){
        
        NIF dniL = new NIF();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        do {
            System.out.print("Introduce dni: ");
            dniL.setDni(leer.nextInt());
        } while (dniL.getDni() <= 0);
        letras = calcularLetra(dniL);
        return dniL;
    }
    
    public char calcularLetra(NIF dniL){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                      
        return letras[dniL.getDni() % 23];
    }
}
