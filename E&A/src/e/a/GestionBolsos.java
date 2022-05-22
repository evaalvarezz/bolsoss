/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author evaal
 */
public class GestionBolsos {

    protected ArrayList<Bolso> bolsos = new ArrayList<Bolso>();

    /**
     * Método que incorpora una Exception. En caso de crear un Bolso con id duplicado <br>
     * crea bucle infinito.
     * @return id del nuevo Bolso
     */
    public int ExcepcionPropia() {

        Scanner lector = new Scanner(System.in);
        System.out.println("introduce id de bolso");
        int id = 0;

        try {
            id = lector.nextInt();
            for (int i = 0; i < bolsos.size(); i++) {
                if (id == bolsos.get(i).id) {
                    throw new ExcepcionPropia("este id ya esta registrado en un bolso");
                }
            }
        } catch (e.a.ExcepcionPropia ex) {
            ex.getMessage();
        }

        return id;
    }

    /**
     * Método que añade un Bolso al ArrayList bolsos
     */
    public void annadirBolso() {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzce la marca");
        String marca = lector.nextLine();
        System.out.println("Introduzca color");
        String color = lector.nextLine();
        System.out.println("Introduzca el tamaño");
        String tamaño = lector.nextLine();
        System.out.println("Introduzca el numero de bolsos");
        int cantidad = lector.nextInt();
        System.out.println("Introduzca el precio");
        int precio = lector.nextInt();
        int id = ExcepcionPropia();
        bolsos.add(new Bolso(marca, color, tamaño, cantidad, precio, id));
        System.out.println("El bolso se ha añadido correctamente");
    }

    /**
     * Método que elimina un Bolso del ArrayList bolsos
     */
    public void eliminarBolso() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzce el id");
        int id = lector.nextInt();
        for (int i = 0; i < bolsos.size(); i++) {
            if (bolsos.get(i).id == id) {
                bolsos.remove(i);
                System.out.println("El bolso se eliminado correctamente.");
            }
        }

    }

    /**
     * Método que lista todos los Bolso del ArrayList bolsos
     */
    public void listarBolso() {
        for (int i = 0; i < bolsos.size(); i++) {
            System.out.println(bolsos.get(i));
        }
    }
    
    /**
     * Método que lista todos los Bolso por precio ascendente del ArrayList bolsos
     */
    public void listarBolsoAsc(){
        ArrayList<Bolso> copia = new ArrayList(bolsos);
        Collections.sort(copia, new porPrecio());
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i));
        }
    }
    
    /**
     * Método que comprueba si existe un Bolso en ArrayList bolsos
     * @param id de Bolso
     * @return si existe o no
     */
    public boolean existeBolso(int id){
        boolean bool=false;
        for (int i = 0; i < bolsos.size() && bool == false; i++) {
            if (bolsos.get(i).id == id) {
                bool = true;
            }
        }
        return bool;
    }

    /**
     * Método que llama al toString el Bolso a partir de su id.
     */
    public void consultarBolso() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe el id del bolso");
        int id = lector.nextInt();
        boolean bool = false;
        for (int i = 0; i < bolsos.size() && bool == false; i++) {
            if (bolsos.get(i).id == id) {
                System.out.println(bolsos.get(i));
                bool = true;
            }
        }
        if (!bool) {
            System.out.println("No se ha encontrado la referencia.");
        }
    }
    
    /**
     * Método que mediante el id de Bolso, retorna su posicion en ArrayList bolsos.
     * @param id de Bolso
     * @return posicion en bolsos
     */
    public int posBolso(int id){
        boolean bool = false;
        int pos=0;
        for (int i = 0; i < bolsos.size() && !bool; i++) {
             if (bolsos.get(i).id == id){
                 pos=i;
                 bool=true;
             }
        }
        return pos;
    }
    /**
     * Método que comprueba si quedan bolsos de la posicion especificada.<br>
     * En caso de cantidad &gt; 0, la reduce en 1.
     * @param posicion
     * @return Si se ha realizado o no la deduccion de cantidad.
     */
    public boolean comprarBolso(int posicion){
        boolean bool=false;
        if(bolsos.get(posicion).cantidad!=0){ //hay bolsos
            bolsos.get(posicion).cantidad --; 
            bool=true;
        }
        else{ //existen 0 bolsos
            System.out.println("Lo sentimos, no quedan existencias.");
        }
        
        return bool;
    }
    
    
    /*
    public ArrayList<Integer> todosIds(){
        ArrayList<Integer> ids = new ArrayList();
        for (int i = 0; i < bolsos.size(); i++) {
            ids.add(bolsos.get(i).id);
        }
        return ids;
    }*/
}
