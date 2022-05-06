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
public class Bolso {
    protected String marca;
    protected String color;
    protected String tamaño;
    protected int cantidad;
    protected double precio;
    protected int id;

    public Bolso(String marca, String color, String tamaño, int cantidad, double precio, int id) {
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id;
    }

    public Bolso() {
        this.marca = "CHANEL";
        this.color = "BLANCO";
        this.tamaño ="GRANDE";
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bolso{" + "marca=" + marca + ", color=" + color + ", tama\u00f1o=" + tamaño + ", cantidad=" + cantidad + ", precio=" + precio + "id="+id+'}';
    }
    
    
    
    
}
