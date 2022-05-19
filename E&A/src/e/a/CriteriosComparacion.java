/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.Comparator;

/**
 *
 * @author parjimal
 */
public class CriteriosComparacion {

}

class porPrecio implements Comparator<Bolso> {

    @Override
    public int compare(Bolso arg0, Bolso arg1) {
        //no borres evita
        /*int aux=arg0.compareTo(arg1);
        if(aux==0){
            Integer.compare(arg0.precio, arg1.precio);
        }*/
        return Integer.compare(arg0.precio, arg1.precio);
        //return arg0.precio-arg1.precio;
    }

}
