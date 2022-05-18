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
        double precio = scanner.nextDouble();
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

    public void consultarBolso(int id) {
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
    public ArrayList<Integer> todosIds(){
        ArrayList<Integer> ids = new ArrayList();
        for (int i = 0; i < bolsos.size(); i++) {
            ids.add(bolsos.get(i).id);
            
        }
        return ids;
    }
}
