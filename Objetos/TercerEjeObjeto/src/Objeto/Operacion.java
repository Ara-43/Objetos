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
public class Operacion {
    private int Numero1;
    private int Numero2;
    private int Suma;
    private int Resta;
    private int Multiplicacion;
    private int Division;
    
    public Operacion(){
        
    }

    public Operacion(int Numero1, int Numero2, int Suma, int Resta, int Multiplicacion, int Division) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        this.Suma = Suma;
        this.Resta = Resta;
        this.Multiplicacion = Multiplicacion;
        this.Division = Division;
    }

    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }

    public int getSuma() {
        return Suma;
    }

    public void setSuma(int Suma) {
        this.Suma = Suma;
    }

    public int getResta() {
        return Resta;
    }

    public void setResta(int Resta) {
        this.Resta = Resta;
    }

    public int getMultiplicacion() {
        return Multiplicacion;
    }

    public void setMultiplicacion(int Multiplicacion) {
        this.Multiplicacion = Multiplicacion;
    }

    public int getDivision() {
        return Division;
    }

    public void setDivision(int Division) {
        this.Division = Division;
    }
    
    
}
