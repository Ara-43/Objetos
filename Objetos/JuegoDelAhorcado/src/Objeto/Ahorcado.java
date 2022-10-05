/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author ailen
 */
public class Ahorcado {
    public String palabra;
    public int intentos;
    public int aciertos;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentos, int aciertos) {
        this.palabra = palabra;
        this.intentos = intentos;
        this.aciertos = aciertos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    
    
}
