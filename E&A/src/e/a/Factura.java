/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.ArrayList;

/**
 *
 * @author parjimal
 */
public class Factura {
    GestionBolsos gestionBolso = new GestionBolsos();
    //crear arraylist con refe -> se convertirá a file facturas
    protected int precioTotal;
    protected String nifCliente;
    protected ArrayList<Integer> idBolso = new ArrayList();
      

    public Factura() {
        precioTotal = 500;
        nifCliente = "00988";
        idBolso=gestionBolso.todosIds();
        
    }

    public Factura(int precioTotal, String nifCliente, ArrayList idBolso) {
        this.precioTotal = precioTotal;
        this.nifCliente = nifCliente;
        this.idBolso = idBolso;
    }

    public ArrayList<Integer> getIdBolso() {
        return idBolso;
    }

    public void setIdBolso(ArrayList<Integer> idBolso) {
        this.idBolso = idBolso;
    }
    
    
    

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    

 

    @Override
    public String toString() {
        return "Factura{" + "precioTotal=" + precioTotal + ", nifCliente=" + nifCliente + ", idBolso=" + idBolso + '}';
    }
    

   
   
    
    }
