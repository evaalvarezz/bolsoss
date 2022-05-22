/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

/**
 *
 * @author evaal
 */
public class Bolso implements Comparable<Bolso>{
    protected String marca;
    protected String color;
    protected String tamanyo;
    protected int cantidad;
    protected int precio;
    protected int id;

    /**
     * Constructor con todos los atributos.
     * @param marca
     * @param color
     * @param tamaño
     * @param cantidad
     * @param precio
     * @param id 
     */
    public Bolso(String marca, String color, String tamaño, int cantidad, int precio, int id) {
        this.marca = marca;
        this.color = color;
        this.tamanyo = tamaño;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id;
    }

    /**
     * Constructor predefinido.
     */
    public Bolso() {
        this.marca = "CHANEL";
        this.color = "BLANCO";
        this.tamanyo ="GRANDE";
        this.cantidad = 3;
        this.precio = 300; 
        this.id = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bolso{" + "marca=" + marca + ", color=" + color + ", tamanyo=" + tamanyo + ", cantidad=" + cantidad + ", precio=" + precio + "id="+id+'}';
    }

    @Override
    public int compareTo(Bolso arg0) {
        //return this.color.compareTo(arg0.color);//por String NO LO BORRES EVITA
        return Integer.compare(this.id, arg0.id);
    }
    
    
    
    
}
