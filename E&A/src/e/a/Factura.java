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
    protected String refe;
    protected int precioTotal;
    protected String nifCliente;
    protected int idBolso;
      

    /**
     * Constructor predefinido
     */
    public Factura() {
        refe = "1";
        precioTotal = 500;
        nifCliente = "00988";
        idBolso=1;
    }

    /**
     * Constructor con todos los atributos
     * @param refe
     * @param precioTotal
     * @param nifCliente
     * @param idBolso 
     */
    public Factura(String refe, int precioTotal, String nifCliente, int idBolso) {
        this.refe = refe;
        this.precioTotal = precioTotal;
        this.nifCliente = nifCliente;
        this.idBolso = idBolso;
    }

    public String getRefe() {
        return refe;
    }

    public void setRefe(String refe) {
        this.refe = refe;
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

    public int getIdBolso() {
        return idBolso;
    }

    public void setIdBolso(int idBolso) {
        this.idBolso = idBolso;
    }

    @Override
    public String toString() {
        return "Factura{" + "refe=" + refe + ", precioTotal=" + precioTotal + ", nifCliente=" + nifCliente + ", idBolso=" + idBolso + '}';
    }
    
   
    
    }
