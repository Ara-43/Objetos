/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package newpackageEnti;

/**
 *
 * @author ailen
 */
public class Persona {

    public String genero;
    public String nombre;
    public int dia;
    public int mes;
    public int año;
    public String apellido;
    public double estatura;
 
    public Persona(){
        
    }

    public Persona(String genero, String nombre, int dia, int mes, int año, String apellido, double estatura) {
        this.genero = genero;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    
    

}
