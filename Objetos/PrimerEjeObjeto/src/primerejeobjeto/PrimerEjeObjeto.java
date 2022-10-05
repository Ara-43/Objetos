/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejeobjeto;

import Objeto.Libro;
import Servicios.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class PrimerEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroServicio Lb = new LibroServicio();
        Libro L1 = Lb.NewLibro();
        Lb.UsuarioLibro (L1);
        
//        String Usuario2, Contra2;
//        
//        System.out.println("Ingrese su usuario: ");
//        Usuario2 = leer.nextLine();
//        
//        System.out.println("");
//        
//        System.out.println("Ingrese la contraseña: ");
//        Contra2=leer.nextLine();
//        
//        if (Contra2.equals(L1.getContra()) && Usuario2.equals(L1.getUsario())){
//            System.out.println("ISBN: " + L1.getISBN() + " Libro: " + L1.getTitulo()+ " Autor: " + L1.getAutor() + " Numero de Paginas: " + L1.getNúmeroDePáginas() );
//        }
    }
    
}
