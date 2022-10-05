/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objeto.Libro;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class LibroServicio {

    public Libro NewLibro() {
        Libro L1 = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su usuario: ");
        L1.setUsario(leer.nextLine());
        System.out.println("");
        System.out.println("Ingrese la contraseña: ");
        L1.setContra(leer.nextLine());
        System.out.println("");
        System.out.println("Ingrese el ISBN: ");
        L1.setISBN(leer.nextLine());
        System.out.println("");
        System.out.println("Titulo del libro: ");
        L1.setTitulo(leer.nextLine());
        System.out.println("");
        System.out.println("Autor del titulo: ");
        L1.setAutor(leer.nextLine());
        System.out.println("");
        System.out.println("Numero de paginas: ");
        L1.setNúmeroDePáginas(leer.nextInt());
        System.out.println("");
        return L1;

    }
    
    /**
     *
     * @param L1
     */
  public void UsuarioLibro (Libro L1 ){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String Usuario2, Contra2;
        
        System.out.println("Ingrese su usuario: ");
        Usuario2= leer.nextLine();
        
        System.out.println("");
        
        System.out.println("Ingrese la contraseña: ");
        Contra2=leer.nextLine();
        
        if (Contra2.equals(L1.getContra()) && Usuario2.equals(L1.getUsario())){
            System.out.println("ISBN: " + L1.getISBN() + " Libro: " + L1.getTitulo()+ " Autor: " + L1.getAutor() + " Numero de Paginas: " + L1.getNúmeroDePáginas() );
        }else{
            System.out.println("Contraseña incorrecta");
        }
        
    }
   
}

