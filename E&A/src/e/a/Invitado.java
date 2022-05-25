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
    
    /**
     * Constructor con todos los atributos
     * @param codigoReferido
     * @param nif
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param numTelf 
     */
    public Invitado(String codigoReferido, String nif, String nombre, String apellidos, String direccion, int numTelf) {
        super(nif, nombre, apellidos, direccion, numTelf);
        this.codigoReferido = codigoReferido;
    }

    /**
     * Constructor con valores por defecto a los atributos.
     */
    public Invitado() {
        super();
        codigoReferido= "001";
    }
    /**
     * Método de herencia de Cliente que calcula el descuento que poseerá en la compra en caso que sea referido.
     * @return 
     */
    @Override
    public double descuentoCliente() {
        double descuento;
        if(codigoReferido.equalsIgnoreCase("000"))
            descuento=0.95; //5%
        else
            descuento=0.7;  //30%
        return descuento;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " codigoReferido= " + codigoReferido + '}';
    }
    
    /**
     * Método toStringFichero, prepara una linea de texto para la posterior creacion de objetos.
     * @return línea de texto
     */
    public String toStringFichero(){
        return this.getClass().getSimpleName() + ";"+ codigoReferido + super.toStringFichero();
        
    }
}
