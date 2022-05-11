/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author parjimal
 */
public class GestionUsuarios {
    
     protected ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public GestionUsuarios(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }
    
     public GestionUsuarios() {
        clientes = new ArrayList();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
               clientes.add(new Invitado());
            } else {
                clientes.add(new Registrado());
            }
        }
    }

    public GestionUsuarios(int cuantos) {
        for (int i = 0; i < cuantos; i++) {
            if (i % 2 == 0) {
               clientes.add(new Invitado());
            } else {
                clientes.add(new Registrado());
            }
        }

    }

    public void listarUsuarios() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf(clientes.get(i).toString());

        }
    }
    /*
    public Cliente añadirUsuario() {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        boolean correcto;
        String nombre;
        String nif;
        String apellidos;
        String direccion;
        int numTelf;
        double precio;
        Factura facturra = null;
          do {
            System.out.println("Añadir Cliente");
            do {
                correcto = true;

                System.out.println("1. cliente nuevo.");
                System.out.println("2. cliente registrado.");
                System.out.println("3. añadir y salir.");
                try {
                    numero = lector.nextInt();
                    if (numero == 1 || numero == 2) {
                        System.out.println("Introduce el nombre.");
                        lector.nextLine();
                        nombre = lector.nextLine();
                       System.out.println("Introduce el nif.");
                        lector.nextLine();
                        nif = lector.nextLine();
                        System.out.println("Introduceapellidos.");
                        apellidos = lector.nextLine();
                        System.out.println("Introduce direccion.");
                        direccion = lector.nextLine();
                        System.out.println("Introduce numero de telefono.");
                        numTelf = lector.nextInt();
                        do {
                            try {
                                System.out.println("Introduce dia,mes y anyo");
                                fecha = new Fecha(lector.nextInt(), lector.nextInt(), lector.nextInt());
                                Vuelos.excepcionFecha(fecha);
                                fechaCorrecta = true;
                            } catch (ExcepcionFecha e) {
                                System.out.println("Por favor, introduce una fecha correcta.");
                                System.out.println(e.getMessage());
                                fechaCorrecta = false;
                            }
                        } while (!fechaCorrecta);
                        switch (numero) {
                            case 1:
                                System.out.println("Vuelo Nacional creado correctamente. Pulsa 3 para salir y añadir");
                                aux = new Nacionales( id, nombre,  origen,  destino,  fecha,  nPasajeros,precio);
                                break;
                            case 2:
                                 boolean escala=false;
                                
                        System.out.println("introduce si te vuelo tiene escala true/false");
                        escala=lector.hasNext();
                        
                        if(escala==true)
                             System.out.println("Introduce ciudades separas por /");
                             String paradas = lector.nextLine();  
                        
                        aux = new Internacionales(  escala,  paradas,  id, nombre,  origen,  destino,  fecha,  nPasajeros,  precio);
                            
                                break;
                            case 3:
                                System.out.println("Vuelo Nacional creado correctamente. Pulsa 3 para salir y añadir");
                                break;
                            default:
                                System.out.println("Por favor, introduce un número entre 1 y 3 para seleccionar.");

                        }

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
                    lector.nextLine();
                    correcto = false;
                }
            } while (!correcto);
        } while (numero != 3);
        return aux;
    }

    public void agregarVuelos(Vuelos a) {
        vuelos.add(a);
        System.out.println("Los vuelos creados han sido añadidos correctamente.");
    }
*/
     
     
    
    public void iniciarSesion(){
        
    }
    public void comprar(){
        
    }
    public void devolver(){
        
    }

    @Override
    public String toString() {
        return "GestionUsuarios{" + "clientes=" + clientes + '}';
    }
    
   
    
}
