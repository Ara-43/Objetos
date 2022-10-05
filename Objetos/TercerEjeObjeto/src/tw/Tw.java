/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw;

import Objeto.Operacion;
import Servicios.ServicioOperaciones;

/**
 *
 * @author ailen
 */
public class Tw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperaciones Ope = new ServicioOperaciones();
        Operacion O1 = Ope.NewOperacion();
        Ope.Suma(O1);
        Ope.Resta(O1);
        Ope.Mult(O1);
        Ope.Div(O1);
      
    }
    
}
