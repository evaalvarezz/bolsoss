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
public abstract class Cliente {
    protected String nif; //IMPLEMENTAR HASHMAP
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected int numTelf;
    

    /**
     * Constructor con todos los atributos.
     * @param nif
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param numTelf 
     */
    public Cliente(String nif, String nombre, String apellidos, String direccion, int numTelf) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numTelf = numTelf;
        
    }

    /**
     * Constructor predefinido.
     */
    public Cliente() {
        nif="00000000-T";
        nombre="Juana";
        apellidos="Álvarez";
        direccion="Calle Leona 1";
        numTelf=666666666;
    }

    /**
     * Método que calcula un descuento en base al tipo de Cliente.
     * @return descuento en decimal (0 - 0.99)
     */
    public abstract double descuentoCliente();

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(int numTelf) {
        this.numTelf = numTelf;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ "nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion +'}';
    }

   
    
    
    public String toStringFichero()  {
         return this.getClass().getSimpleName()+ ";" + nif + ";" + nombre + ";" + apellidos + ";" + direccion + ";" + numTelf ;
         
    }
    
}
