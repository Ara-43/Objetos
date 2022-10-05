/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartoejeobjeto;

import Objeto.Cuenta;
import Servicios.ServicioCuenta;

/**
 *
 * @author ailen
 */
public class CuartoEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCuenta Cue = new ServicioCuenta();
        Cuenta Ct1 = Cue.NewCuenta();
        
        Cue.ingresar(Ct1);
    }

}
