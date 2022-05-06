/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import e.a.Bolso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaal
 */
public class GestionBolsos {
    
    protected ArrayList<Bolso> bolsos= new ArrayList<Bolso>(); 
    
    
            
            
            
   
    public void annadirBolso() {
        
		Scanner scanner = new Scanner(System.in);
		boolean correcto = false;
		
		System.out.println("Introduzce la marca");
		String marca = scanner.nextLine();
		System.out.println("Introduzca color");
		String color = scanner.nextLine();
		System.out.println("Introduzca el tamaño");
		String tamaño = scanner.nextLine();
		System.out.println("Introduzca el numero de bolsos");
		int cantidad = scanner.nextInt();
		System.out.println("Introduzca el precio");
		double precio = scanner.nextDouble();
                System.out.println("Introduzca el id");
		int id = scanner.nextInt();
                bolsos.add( new Bolso( marca ,color ,tamaño ,cantidad ,precio,id));
		System.out.println("El bolso se ha añadido correctamente");
	}
}
