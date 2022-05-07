/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.a;

import java.util.Scanner;

/**
 *
 * @author evaal
 */
public class BolsosEA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        GestionBolsos gestionBolso = new GestionBolsos();

        int opcion2;
        int opcion;
        do {
            System.out.println("Bienvenidos a bolsos guays");
            System.out.println("1.Soy empleado");
            System.out.println("2.Soy cliente");
            System.out.println("3.Salir de bolsos guays");
            opcion = lector.nextInt();
            if (opcion == 1) {
                System.out.println("Introduce contraseña");
                String cadena = lector.next();
                String contrasenya = "5584"
                        + "";
                if (cadena.equalsIgnoreCase(contrasenya)) {
                    do {
                        System.out.println("Que deseea hacer ");
                        System.out.println("1.Añadir bolso");
                        System.out.println("2.Eliminar bolso");
                        System.out.println("3.Listar bolso");
                        System.out.println("4.Consultar cantidad bolso por id");
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestionBolso.annadirBolso();
                                break;
                            case 2:
                                gestionBolso.eliminarBolso();
                                break;
                            case 3:
                                gestionBolso.listarBolso();
                                break;
                            case 4:
                                System.out.println("Introduce el id");
                                int id = lector.nextInt();
                                //gestionBolso.consultarBolso(id);
                                break;
                            default:
                                System.out.println(" Introduzca 1, 2 o 3");
                                break;
                        }
                    } while (opcion2 != 4);
                } else if (opcion == 2) {

                } else {
                    System.out.println("Hasta pronto");
                }

            }
        }while (opcion != 3);

            /*
			System.out.println("3.- Consulta de vuelos con un origen, destino, minimo y maximo determinado");
			System.out.println("4.- Actualizar bolso");
			System.out.println("5.- Volcar info a un fichero de texto");
			System.out.println("6.- Volcar info a un fichero binario");//escribir
			System.out.println("7.- Cargar info a un fichero binario");
			System.out.println("8.- Cargar info a un fichero de texto");
			System.out.println("9.- Consulta ordenada con un origen y destino, ordenador por precio");
			System.out.println("10.- Consulta ordenada por rentabilidad");
			System.out.println("11.- Eliminar bolso");
			System.out.println("12.- Precio medio de los vuelos con un origen y destino determinado");
			System.out.println("13.- Consulta ordenado de vuelos internacionales con un origen determinado");
             */

    }

}
