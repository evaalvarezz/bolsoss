/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaal
 */
public class GestionFicheros {

    public static final String ficheroBinario = "ficheroBinario";
    public static final String ficheroTexto = "ficheroTexto";

    public static void crearFicheros() {
        File fBinario = new File(ficheroBinario);
        File fTexto = new File(ficheroTexto);
        if (!fBinario.exists()) {
            try {
                fBinario.createNewFile();
            } catch (IOException e) {
                System.out.println("Error, no se puede crear fichero.");
            }
        }
        if (!fTexto.exists()) {
            try {
                fTexto.createNewFile();
            } catch (IOException e) {
                System.out.println("Error, no se puede crear fichero.");
            }
        }

    }

    public static void escribirFicheroBinario(ArrayList<Factura> factura) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
            o.writeObject(factura);
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de E/S.");
        }
    }

    public static ArrayList leerFicheroBinario() {
        ArrayList aux = null;
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(ficheroBinario));
            aux = (ArrayList) o.readObject();
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de E/S.");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
        }
        return aux;
    }

    public static void escribirFicheroTxt(ArrayList<Cliente> clientes) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(ficheroTexto));
            for (int i = 0; i < clientes.size(); i++) {
                pw.println(clientes.get(i).toStringFichero());
            }
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Cliente> leerFicheroTxt() {
        ArrayList<Cliente> aux = new ArrayList<Cliente>();
        Scanner scan = new Scanner(System.in);
        try {
            scan = new Scanner(new FileReader(ficheroTexto));
            String cadena;
            while (scan.hasNextLine()) {
                cadena = scan.nextLine();
                String trozos[] = cadena.split(";");
                if (trozos[0].equalsIgnoreCase("Invitado")) {
                    //Invitado(  String codigoReferido, String nif, String nombre, String apellidos, String direccion, int numTelf
                    aux.add(new Invitado(trozos[1], trozos[2], trozos[3], trozos[4], trozos[5],Integer.parseInt(trozos[6])));
		}else {
                    //Registrado(String fechaAlta, String contrasennya, String nomUsuario, String nif, String nombre, String apellidos, String direccion, int numTelf)
                    aux.add(new Registrado(trozos[1], trozos[2], trozos[3], trozos[4], trozos[5], trozos[6], trozos[7], Integer.parseInt(trozos[8])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
        return aux;

    }

}
