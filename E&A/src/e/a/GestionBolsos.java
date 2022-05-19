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

    public int ExcepcionPropia() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce id de bolso");
        int id = 0;

        try {
            id = scanner.nextInt();
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

    public void annadirBolso() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzce la marca");
        String marca = scanner.nextLine();
        System.out.println("Introduzca color");
        String color = scanner.nextLine();
        System.out.println("Introduzca el tamaño");
        String tamaño = scanner.nextLine();
        System.out.println("Introduzca el numero de bolsos");
        int cantidad = scanner.nextInt();
        System.out.println("Introduzca el precio");
        int precio = scanner.nextInt();
        int id = ExcepcionPropia();
        bolsos.add(new Bolso(marca, color, tamaño, cantidad, precio, id));
        System.out.println("El bolso se ha añadido correctamente");
    }

    public void eliminarBolso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzce el id");
        int id = scanner.nextInt();
        for (int i = 0; i < bolsos.size(); i++) {
            if (bolsos.get(i).id == id) {
                bolsos.remove(i);
                System.out.println("El bolso se eliminado correctamente.");
            }
        }

    }

    public void listarBolso() {
        for (int i = 0; i < bolsos.size(); i++) {
            System.out.println(bolsos.get(i));
        }
    }
    
    public void listarBolsoAsc(){
        ArrayList<Bolso> copia = new ArrayList(bolsos);
        Collections.sort(copia, new porPrecio());
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i));
        }
    }
    
    public boolean existeBolso(int id){
        boolean bool=false;
        for (int i = 0; i < bolsos.size() && bool == false; i++) {
            if (bolsos.get(i).id == id) {
                bool = true;
            }
        }
        return bool;
    }

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
    public boolean comprarBolso(int posicion){
        boolean bool=false;
        if(bolsos.get(posicion).cantidad!=0){ //hay bolsos
            bolsos.get(posicion).cantidad --; 
            bool=true;
        }
        else{ //existen 0 bolsos
            System.out.println("Lo sentimos, no se puede comprar");
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
