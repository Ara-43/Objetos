/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author ailen
 */
public class JuegoG {
    private String Jugador1;
    private String Jugador2;
    private int posicion;
    private String letra;
    private String letra2;
    private int posicion2;

    public JuegoG() {
    }

    public JuegoG(String Jugador1, String Jugador2, int posicion,String letra,String letra2,int posicion2) {
        this.Jugador1 = Jugador1;
        this.Jugador2 = Jugador2;
        this.posicion = posicion;
        this.letra = letra;
        this.letra2 = letra2;
        this.posicion2 = posicion2;
    }

    public String getJugador1() {
        return Jugador1;
    }

    public void setJugador1(String Jugador1) {
        this.Jugador1 = Jugador1;
    }

    public String getJugador2() {
        return Jugador2;
    }

    public void setJugador2(String Jugador2) {
        this.Jugador2 = Jugador2;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getLetra2() {
        return letra2;
    }

    public void setLetra2(String letra2) {
        this.letra2 = letra2;
    }

    public int getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(int posicion2) {
        this.posicion2 = posicion2;
    }
    
    
    
}
