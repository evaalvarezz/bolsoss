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

    public Invitado() {
    }

    public Invitado(String nif, String nombre, String apellidos, String direccion, int numTelf) {
        super(nif, nombre, apellidos, direccion, numTelf);
    }

    @Override
    public double descuentoCliente() {
        double descuento=0.95;
        return descuento;
    }
    
}
