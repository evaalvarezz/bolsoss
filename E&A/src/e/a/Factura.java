/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

/**
 *
 * @author parjimal
 */
public class Factura {
    //crear arraylist con refe -> se convertirá a file facturas
    protected double precioTotal;
    protected String nifCliente;

    public Factura() {
        precioTotal=500;
    }

    public Factura(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
   
    
    }
