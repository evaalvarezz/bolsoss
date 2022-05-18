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
public class ExcepcionPropia extends Exception {
    
        public ExcepcionPropia() {
		super(" Ese id ya esta registrado ");
	}
        
	public ExcepcionPropia(String mensaje) {
		super(mensaje);
	}
    
}
