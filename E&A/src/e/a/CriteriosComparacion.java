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

/**
 * Clase que mediante la interfaz Comparator, compara 2 bolsos por el atributo precio.
 * @author parjimal
 */
class porPrecio implements Comparator<Bolso> {

    @Override
    public int compare(Bolso arg0, Bolso arg1) {
        return Integer.compare(arg0.precio, arg1.precio);
    }

}

/**
 * Clase que mediante la interfaz Comparator, compara 2 bolsos por los atributos cantidad y precio.
 * @author parjimal
 */
class porCantidadporPrecio implements Comparator<Bolso> {

    public int compare(Bolso arg0, Bolso arg1) {
        int aux = Integer.compare(arg0.cantidad, arg1.cantidad);
        if (aux == 0) {
            aux = Integer.compare(arg0.precio, arg1.precio);
        }
        return aux;
    }

}
