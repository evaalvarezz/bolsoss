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
    //File usuarios = new File("usuarios
    
    public static final String ficheroBinario="ficheroBinarioProyecto";
	
	public static final String ficheroTexto="ficheroTextoproyecto";
        
        public static void crearFicheros() {
		File fBinario= new File(ficheroBinario);
		File fTexto=new File(ficheroTexto);
                if(!fBinario.exists()) {
			try {
				fBinario.createNewFile();
			} catch (IOException e) {
				System.out.println("Error de E/S.");
			}
		}
		if(!fTexto.exists()) {
			try {
				fTexto.createNewFile();
			} catch (IOException e) {
				System.out.println("Error de E/S.");
			}
		}
		
	}
        public static void escribirFicheroBinario(ArrayList<Cliente> clientes) {
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
			o.writeObject(clientes);
			o.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de E/S.");
		}
	}
        public static ArrayList<Cliente> leerFicheroBinario(){
		ArrayList<Cliente> aux=null;
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream(ficheroBinario));
			aux=(ArrayList<Cliente>) o.readObject();
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
        
        
        
         public static void escribirFichero(ArrayList<Cliente> clientes) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("ficheroTexto"));
        for (int i = 0; i < clientes.size(); i++) {
            pw.println(clientes.get(i).toStringFichero());
        }
        pw.close();
        System.out.println("Guardado con exito");
}
         
        
         public static ArrayList<Cliente> leerFicheroTxt(){
		ArrayList<Cliente> aux = new ArrayList<Cliente>();
		Scanner scan = null ;
		try {
			 scan = new Scanner(new FileReader(ficheroTexto));
			 String cadena;
			 while (scan.hasNextLine()) {
				cadena = scan.nextLine();
				String trozos[] = cadena.split(";");
				if (trozos[0].equalsIgnoreCase("Invitado")) {
					//Invitado(String nif, String nombre, String apellidos, String direccion, int numTelf)
					aux.add(new Invitado(trozos[1], trozos[2], trozos[3], trozos[4], Integer.parseInt(trozos[3]) ));
				}else {
					//Registrado(String fechaAlta, String contrasennya, String nomUsuario, String nif, String nombre, String apellidos, String direccion, int numTelf)
					aux.add(new Registrado(trozos[1], trozos[2],trozos[3],trozos[4], trozos[5],trozos[6],trozos[7], Integer.parseInt(trozos[8])));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
		return aux;
		
	}
         
}
