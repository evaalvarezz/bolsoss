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
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

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
         
         //falta escribir fichero texto
         
         
}
