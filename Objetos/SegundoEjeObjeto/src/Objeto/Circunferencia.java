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
public class Circunferencia {
    private double Radio;
    private double Perimetro;
    private double Area;
    private double number;
    
    public Circunferencia(){
        
    } 

    public Circunferencia(double Radio, double Perimetro, double Area, double number) {
        this.Radio = Radio;
        this.Perimetro = Perimetro;
        this.Area = Area;
        this.number = number;
    }

    public double getRadio() {
        return Radio;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public double getArea() {
        return Area;
    }

    public double getNumber() {
        return number;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void CrearCircunferencia(Circunferencia C1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
