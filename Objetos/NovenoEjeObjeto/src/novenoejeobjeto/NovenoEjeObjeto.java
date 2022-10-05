/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenoejeobjeto;

import Objeto.Matematica;
import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class NovenoEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Matematica Mat = new Matematica();

        Mat.setNum((double) (Math.random() * 20 + 1));
        System.out.println("El primer numero es: " + Mat.getNum());
        System.out.println("");
        Mat.setNum2((double) (Math.random() * 20 + 1));
        System.out.println("El segundo numero es: " + Mat.getNum2());
        System.out.println("");
        devolverMayor(Mat);
        calcularPotencia(Mat);
        calculaRaiz(Mat);
    }

    /**
     *
     * @param Mat
     * @return
     */
    public static Matematica devolverMayor(Matematica Mat) {

        if (Mat.getNum() > Mat.getNum2()) {
            System.out.println("El numero " + Mat.getNum() + " es el mayor");
            System.out.println("");
        } else {
            System.out.println("El numero " + Mat.getNum2() + " es el mayor");
            System.out.println("");
        }
        return null;

    }

    public static Matematica calcularPotencia(Matematica Mat) {
        int Absnum, Absnum2, rest, rest2;
        Absnum = (int) Math.abs(Mat.getNum());
        System.out.println("");
        System.out.println("El primer numero redondeado es: " + Absnum);
        Absnum2 = (int) Math.abs(Mat.getNum2());
        System.out.println("");
        System.out.println("El segundo numero redondeado es: " + Absnum2);
        System.out.println("");

        rest = (int) Math.pow(Absnum, Absnum2);
        rest2 = (int) Math.pow(Absnum2, Absnum);

        if (Mat.getNum() > Mat.getNum2()) {
            System.out.println(Absnum + " ^ " + Absnum2 + " = " + rest);
            System.out.println("");
        } else {
            System.out.println(Absnum2 + " ^ " + Absnum + " = " + rest2);
            System.out.println("");
        }

        return null;

    }

    public static Matematica calculaRaiz(Matematica Mat) {
        int Absnum, Absnum2;
        Absnum = (int) Math.abs(Mat.getNum());
        Absnum2 = (int) Math.abs(Mat.getNum2());

        if (Mat.getNum() < Mat.getNum2()) {
            double resultado = Math.sqrt(Absnum);
            System.out.println("La raiz cuadrada de " + Absnum + " es: " + resultado);
            System.out.println("");
        } else {
            double resultado = Math.sqrt(Absnum2);
            System.out.println("La raiz cuadrada de " + Absnum2 + " es: " + resultado);
            System.out.println("");
        }
        return null;
    }

}
