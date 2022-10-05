/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejeobjeto;

import Objeto.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author ailen
 */
public class SegundoEjeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioCircunferencia Cir = new ServicioCircunferencia();
        Circunferencia C1 = Cir.NewCircunferencia();
        Cir.CrearCircunferencia(C1);
        Cir.Area(C1);
        Cir.Perimetro(C1);
    }
    
}
