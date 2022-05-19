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
public class Invitado extends Cliente{
    protected String codigoReferido;
    

    public Invitado(String codigoReferido, String nif, String nombre, String apellidos, String direccion, int numTelf) {
        super(nif, nombre, apellidos, direccion, numTelf);
        this.codigoReferido = codigoReferido;
    }

    public Invitado(String codigoReferido) {
        this.codigoReferido = codigoReferido;
    }

    public Invitado() {
        super();
        codigoReferido= "001";
    }
    @Override
    public double descuentoCliente() {
        double descuento=0.95;
        return descuento;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ "codigoReferido=" + codigoReferido + '}';
    }
}
