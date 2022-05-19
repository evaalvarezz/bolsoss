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
    protected ArrayList<Factura> facturas= new ArrayList<Factura>();
    
    
    public String newRefe(){
        return String.valueOf(facturas.size());
    }
    public void listarFacturas(){
        for (int i = 0; i < facturas.size(); i++) {
            facturas.get(i);
        }
    }
    public void eliminarFactura(String refe){
        boolean bool=false;
        for (int i = 0; i < facturas.size()&& !bool; i++) {
            if(facturas.get(i).refe.equalsIgnoreCase(refe)){
                facturas.remove(i);
                bool=true;
                System.out.println("Factura eliminada correctamente.");
            }
        }
    }
    public boolean existeFactura(String refe){
        boolean bool=false;
        for (int i = 0; i < facturas.size() && !bool; i++) {
            if(facturas.get(i).refe.equalsIgnoreCase(refe)){
                bool=true;
            }
        }
        return bool;
    }

    public void consultarFacturas(String refe){
        boolean bool=false;
        for (int i = 0; i < facturas.size() && !bool; i++) {
            if(facturas.get(i).refe.equalsIgnoreCase(refe)){
                facturas.get(i);
                bool=true;
            }
        }
    }
}
