/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.ArrayList;

/**
 *
 * @author evaal
 */
public class GestionFactura {

    protected static ArrayList<Factura> facturas;
    
    public GestionFactura(){
        facturas = new ArrayList<Factura>();
    }
    public GestionFactura(ArrayList<Factura> fac){
        facturas = fac;
    }

    /**
     * Método que genera una refe aleatoria en base al tamaño del ArrayList
     * facturas<br>
     * de esta manera nunca existirán referencias duplicadas.
     *
     * @return refe
     */
    public String newRefe() {
        return String.valueOf(facturas.size());
    }

    /**
     * Método que llama al toString de cada Factura del ArrayList
     */
    public void listarFacturas() {
        for (int i = 0; i < facturas.size(); i++) {
            facturas.get(i);
        }
    }

    /**
     * Método que crea Factura en el ArrayList y su correspondiente fichero.
     *
     * @param precio
     * @param nif
     * @param id
     */
    public void crearFactura(int precio, String nif, int id) {
        //                      String refe, int precioTotal, String nifCliente, int idBolso
        Factura f = new Factura(newRefe(), precio, nif, id);
        facturas.add(f);
        GestionFicheros.exportarFactura(f);
    }

    /**
     * Método que elimina una Factura del ArrayList y su fichero.
     *
     * @param refe
     */
    public void eliminarFactura(String refe) {
        boolean bool = false;
        for (int i = 0; i < facturas.size() && !bool; i++) {
            if (facturas.get(i).refe.equalsIgnoreCase(refe)) {
                GestionFicheros.eliminarFactura(facturas.get(i));
                facturas.remove(i);
                bool = true;
            }
        }
        if (!bool) {
            System.out.println("No existe la factura.");
        }
    }

    /**
     * Método que elimina todas las Factura de facturas.
     */
    public void eliminarTodo() {
        for (int i = 0; i < facturas.size(); i++) {
            GestionFicheros.eliminarFactura(facturas.get(i));
            facturas.remove(i);
        }
        System.out.println("Todas las facturas han sido eliminadas correctamente.");
    }

    /**
     * Método que devuelve si existe una Factura en ArrayList a partir de refe y si existe su fichero.
     *
     * @param refe
     * @return si existe o no
     */
    public boolean existeFactura(String refe) {
        boolean bool = false;
        for (int i = 0; i < facturas.size() && !bool; i++) {
            if (facturas.get(i).refe.equalsIgnoreCase(refe) && GestionFicheros.existeFactura(facturas.get(i))) {
                bool = true;
            }
        }
        return bool;
    }

    /**
     * Método que busca Factura a partir de su refe y llama a su toString()
     *
     * @param refe
     */
    public void consultarFacturas(String refe) {
        boolean bool = false;
        for (int i = 0; i < facturas.size() && !bool; i++) {
            if (facturas.get(i).refe.equalsIgnoreCase(refe)) {
                System.out.println(facturas.get(i));
                
                bool = true;
            }
        }
    }
}
