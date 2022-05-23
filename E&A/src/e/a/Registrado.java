/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

/**
 * Clase Registrado, hereda de Cliente
 * @author parjimal
 */
public class Registrado extends Cliente {
    protected String fechaAlta;
    protected String contrasennya;
    protected String nomUsuario;

    /**
     * Método que inicializa Registrado a valores predeterminados.
     */
    public Registrado() {
        super();
        fechaAlta="dd-MM-yyyy";
        contrasennya="1234";
        nomUsuario="pepa";
    }
    
    /**
     * Método que inicializa Registrado con valores del argumento de entrada.
     * @param fechaAlta
     * @param contrasennya
     * @param nomUsuario
     * @param nif
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param numTelf 
     */
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
    
    /**
     * Método toStringFichero, prepara una linea de texto para la posterior creacion de objetos.
     * @return línea de texto
     */
    public String toStringFichero(){
        return super.toStringFichero() + ";"+ fechaAlta +";"+ contrasennya +";"+ nomUsuario;
    }

    /**
     * Método de herencia de Cliente que calcula el descuento que poseerá en la compra en caso que sea referido.
     * @return 
     */
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
