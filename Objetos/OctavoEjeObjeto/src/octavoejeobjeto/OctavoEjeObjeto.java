/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavoejeobjeto;

import Objeto.Cadena;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class OctavoEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cad = new Cadena();
        //int Longitud;
        System.out.println("Ingrese la frase: ");
        cad.setFrase(leer.next());

        System.out.println("");
        mostrarVocales(cad);
        System.out.println("");
        invertirFrase(cad);
        System.out.println("");
        compararLongitud(cad);
        System.out.println("");
        unirFrases(cad);
        System.out.println("");
        reemplazar(cad);
        System.out.println("");
        contiene(cad);
        //System.out.println(cad.getLongitud());

    }

    public static Cadena mostrarVocales(Cadena cad) {
        int contador = 0;
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        for (int x = 0; x < cad.getFrase().length(); x++) {
            if ((cad.getFrase().charAt(x) == 'a') || (cad.getFrase().charAt(x) == 'e') || (cad.getFrase().charAt(x) == 'i') || (cad.getFrase().charAt(x) == 'o') || (cad.getFrase().charAt(x) == 'u')) {
                contador++;
            }
            
            if((cad.getFrase().charAt(x) == 'a') || (cad.getFrase().charAt(x) == 'A')){
            contA=contA+1;
        }
            if((cad.getFrase().charAt(x) == 'e') || (cad.getFrase().charAt(x) == 'E')){
            contE = contE + 1;
        }
            if((cad.getFrase().charAt(x) == 'i') || (cad.getFrase().charAt(x) == 'I')){
            contI=contI+1;
        }
            if((cad.getFrase().charAt(x) == 'o') || (cad.getFrase().charAt(x) == 'O')){
            contO=contO+1;
        }
            if((cad.getFrase().charAt(x) == 'u') || (cad.getFrase().charAt(x) == 'U')){
            contU=contU+1;
        }
            
        }
        System.out.println("---- La frase: " + cad.getFrase() + " tiene " + contador + " vocales ----");
        System.out.println("");
        System.out.println("de las cuales: ");
        System.out.println("A tiene: " + contA );
        System.out.println("E tiene: " + contE);
        System.out.println("I tiene: " + contI);
        System.out.println("O tiene: " + contO);
        System.out.println("U tiene: " + contU);
        return null;
    }

    public static Cadena invertirFrase(Cadena cad) {
        //String[] NewFrase = new String[cad.getFrase().length()];
        String nF = cad.getFrase();
        String invertir = "";

        for (int i = nF.length() - 1; i >= 0; i--) {
            invertir += nF.charAt(i);
            //NewFrase[i] = cad.getFrase().substring(i, i-1);
            //System.out.println(NewFrase[i]);
        }
        System.out.println("---- La frase " + cad.getFrase() + " invertida seria: " + invertir + " ----");
        return null;
    }

    public static Cadena compararLongitud(Cadena cad) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cad.setLongitud(cad.getFrase().length());
        System.out.println("Ingrese otra frase/palabra: ");
        cad.setFrase2(leer.next());

        int Cad2 = cad.getFrase2().length();

        System.out.println("---- La primera frase " + cad.getFrase() + " tiene: " + cad.getLongitud() + " letras ----");
        System.out.println("");
        System.out.println("---- La segunda frase" + cad.getFrase2() + " tiene: " + Cad2 + " letras ----");
        return null;
    }

    public static Cadena unirFrases(Cadena cad) {
        String cad1, cad2;

        cad1 = cad.getFrase();
        cad2 = cad.getFrase2();
        //String cad3 = cad1.concat(cad2);
        System.out.println(cad1 + " " + cad2);
        //System.out.println(cad3);

        return null;
    }

    public static Cadena reemplazar(Cadena cad) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String newString1, newString2;
        System.out.println("Su primera frase/palabra contine letra 'A'? S(Si)-N(No): ");
        String res = leer.next();
        System.out.println("");
        if (res.equals("Si") || res.equals("si")) {
            System.out.println("Que simbolo quiere colocar en el lugar de la 'A'? ");
            String simb = leer.next();
            System.out.println("");
            newString1 = cad.getFrase().replace("a", simb).replace("A", simb);
            newString2 = cad.getFrase2().replace("a", simb).replace("A", simb);
            System.out.println(cad.getFrase() + " y " + cad.getFrase2() + " cambiando la letra 'a' queda: " + newString1 + " , " + newString2);
        }

        return null;
    }

    public static Cadena contiene(Cadena cad) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que letra buscar en la frase?");
        String busLetra = leer.next();

        String cad1 = cad.getFrase();
        String cad2 = cad.getFrase2();
        String cad3 = cad1.concat(cad2);
        

        System.out.println("La primera frase contiene la letra " + busLetra + ":");
        System.out.println(cad1.contains(busLetra));
        System.out.println("");
        System.out.println("La segunda frase contiene la letra " + busLetra + ":");
        System.out.println(cad2.contains(busLetra));

        return null;
    }
}
