/*
 * http://puntocomnoesunlenguaje.blogspot.com/2015/11/ejercicio-basico-clases-java-clase-nif.html
 */
package Objeto;

/**
 *
 * @author ailen
 */
public class NIF {
    private int dni;
    private char letra;

    public NIF() {
    }

    public NIF(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
}
