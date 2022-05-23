/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author parjimal
 */
public class GestionUsuarios {

    protected static ArrayList<Cliente> clientes;
    /**
     * String sesion usado para saber si el usuario actual es "Invitado" o
     * "Registrado".
     */
    protected String sesion = new String();

    /**
     * Constructor que inicializa el ArrayList con 5 usuarios.
     */
    public GestionUsuarios() {
        clientes = new ArrayList();
        //String fechaAlta, String contrasennya, String nomUsuario, String nif, String nombre, String apellidos, String direccion, int numTelf
        clientes.add(new Registrado("dd/mm/aaaa", "1234", "pepe", "00000000A", "Pepe", "Pepón", "Calle pepe", 666666666));
        clientes.add(new Registrado("dd/mm/aaaa", "1234", "susana", "00000001A", "Susana", "Lopez", "Calle susana", 666666666));
        clientes.add(new Registrado("dd/mm/aaaa", "1234", "eva", "00000002A", "Eva", "Alvarez", "Calle eva", 666666666));
        clientes.add(new Registrado("dd/mm/aaaa", "1234", "ale", "00000003A", "Ale", "PJ", "Calle ale", 666666666));
        clientes.add(new Registrado("dd/mm/aaaa", "1234", "pepa", "00000004A", "Pepa", "Pepona", "Calle pepa", 666666666));
    }

    /**
     * Constructor que inicializa el ArrayList con "cuantos" elementos. siendo
     * los pares Invitados e impares Registrados.
     *
     * @param cuantos
     */
    public GestionUsuarios(int cuantos) {
        clientes = new ArrayList();
        for (int i = 0; i < cuantos; i++) {
            if (i % 2 == 0) {
                clientes.add(new Invitado());
            } else {
                clientes.add(new Registrado());
            }
        }

    }

    /**
     * Constrcutor que inicializa el ArrayList con otro recibido por su
     * argumento de entrada.
     *
     * @param cliente
     */
    public GestionUsuarios(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    /**
     * Método que comprueba si el código referido de Invitado es válido.
     *
     * @param nif
     * @return
     */
    public static boolean eresReferido(String nif) {
        boolean bool = false;
        for (int i = 0; i < clientes.size() && !bool; i++) {
            if (clientes.get(i) instanceof Invitado && ((Invitado) (clientes.get(i))).codigoReferido.equalsIgnoreCase(nif)) {
                bool = true;
            }
        }
        return bool;
    }

    /**
     * Método que añade al ArrayList un Invitado.
     *
     * @return su posicion en el ArrayList
     */
    public int inicioInvitado() {
        Scanner lector = new Scanner(System.in);
        int n = 0;
        boolean bool = false;

        String codRef;
        System.out.println("¿Tiene código referido? (Y/N)");
        if (lector.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("Introduce el código referido: ");
            codRef = lector.nextLine();
        } else {
            codRef = "000";
        }
        System.out.println("Introduce nombre: ");
        String nom = lector.nextLine();
        System.out.println("Introduce apellidos: ");
        String ap = lector.nextLine();
        System.out.println("Introduce DNI: ");
        String nif = lector.nextLine();
        System.out.println("Introduce direccion: ");
        String dir = lector.nextLine();
        System.out.println("Introduce un número de teléfono: ");
        int num = lector.nextInt();

        //String codigoReferido, String nif, String nombre, String apellidos, String direccion, int numTelf
        clientes.add(new Invitado(codRef, nif, nom, ap, dir, num));

        for (int i = 0; i < clientes.size() && !bool; i++) {
            if (clientes.get(i) instanceof Invitado && clientes.get(i).nif.equalsIgnoreCase(nif)) {
                bool = true;
                n = i;
            }
        }
        return n;
    }

    /**
     * Método que carga el sistema para Registrado
     *
     * @return su posicion en el ArrayList
     */
    public int inicioRegistrado() {
        int n = 5666;
        boolean bool = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el username y contraseña (user pass): ");
        String user = lector.next();
        String pass = lector.next();

        for (int i = 0; i < clientes.size() && !bool; i++) {
            if (clientes.get(i) instanceof Registrado && ((Registrado) clientes.get(i)).nomUsuario.equalsIgnoreCase(user) && ((Registrado) clientes.get(i)).contrasennya.equalsIgnoreCase(pass)) {
                bool = true;
                n = i;
            }
        }

        return n;
    }

    /**
     * Método que lista todos los usuarios.
     */
    public void listarUsuarios() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf(clientes.get(i).toString());

        }
    }

    /**
     * Método que elimina un usuario a partir de su dni
     */
    public void eliminarUsuario() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzce el nif");
        String nif = lector.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).nif.equalsIgnoreCase(nif)) {
                clientes.remove(i);
                System.out.println("El bolso se eliminado correctamente.");
            }
        }

    }

    /**
     * Método que añade un usuario Registrado al ArrayList.
     */
    public void anyadirUsuario() {
        Scanner lector = new Scanner(System.in);
        String fechaAlta = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        System.out.println("Introduce nomUsuario(String): ");
        String nomUsuario = lector.nextLine();
        System.out.println("Introduce contraseña(string): ");
        String contrasennya = lector.nextLine();
        System.out.println("Introduce nombre: ");
        String nom = lector.nextLine();
        System.out.println("Introduce apellidos: ");
        String ap = lector.nextLine();
        System.out.println("Introduce DNI: ");
        String nif = lector.nextLine();
        System.out.println("Introduce direccion: ");
        String dir = lector.nextLine();
        System.out.println("Introduce un número de teléfono: ");
        int num = lector.nextInt();

        //String fechaAlta, String contrasennya, String nomUsuario, String nif, String nombre, String apellidos, String direccion, int numTelf
        clientes.add(new Registrado(fechaAlta, contrasennya, nomUsuario, nif, nom, ap, dir, num));

    }
}
