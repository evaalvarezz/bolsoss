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
public class Registrado extends Cliente {
    protected String fechaAlta;
    protected String contrasennya;
    protected String nomUsuario;

    public Registrado() {
    }

    public Registrado(String fechaAlta, String contrasennya, String nomUsuario) {
        this.fechaAlta = fechaAlta;
        this.contrasennya = contrasennya;
        this.nomUsuario = nomUsuario;
    }

    public Registrado(String fechaAlta, String contrasennya, String nomUsuario, String nif, String nombre, String apellidos, String direccion, int numTelf) {
        super(nif, nombre, apellidos, direccion, numTelf);
        this.fechaAlta = fechaAlta;
        this.contrasennya = contrasennya;
        this.nomUsuario = nomUsuario;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getContrasennya() {
        return contrasennya;
    }

    public void setContrasennya(String contrasennya) {
        this.contrasennya = contrasennya;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    @Override
    public String toString() {
        return super.toString() + "fechaAlta=" + fechaAlta + ", contrasennya=" + contrasennya + ", nomUsuario=" + nomUsuario;
    }
    
    public String toStringFichero(){
        return super.toStringFichero() + ";"+ fechaAlta +";"+ contrasennya +";"+ nomUsuario;
    }

    @Override
    public double descuentoCliente() {
        double descuento;
        if(GestionUsuarios.eresReferido(nif))
            descuento=0.5; //50%
        else
            descuento=0.8; //20%
        
        return descuento;
    }
    
}
