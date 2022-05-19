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
        GestionUsuarios gestionUsuario = new GestionUsuarios();
        GestionFactura gestionFactura = new GestionFactura();

        int opcion2;
        int opcion;
        do {
            System.out.println("Bienvenidos a bolsos guays");
            System.out.println("1.Soy empleado");
            System.out.println("2.Soy cliente");
            System.out.println("3.Salir de bolsos guays");
            opcion = lector.nextInt();
            if (opcion == 1) {
                System.out.println("Introduce contraseña(5584)");
                String cadena = lector.next();
                String contrasenya = "5584";
                if (cadena.equalsIgnoreCase(contrasenya)) {
                    do {
                        System.out.println("Bienvenido empleado. Que deseea hacer ");
                        System.out.println("1.Añadir bolso");
                        System.out.println("2.Eliminar bolso");
                        System.out.println("3.Listar bolso");
                        System.out.println("4.Consultar cantidad bolso por id");
                        System.out.println("5.Listar usuarios");
                        System.out.println("6.Eliminar usuario");
                        System.out.println("7.Listar facturas");
                        System.out.println("8.Eliminar factura");
                        System.out.println("9.Salir");
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
                                int pos=gestionBolso.consultarBolso();
                                break;
                            case 5:
                                gestionUsuario.listarUsuarios();
                                break;
                            case 6:
                                gestionUsuario.eliminarUsuario();
                                break;
                            case 7:
                                //gestionFactura.listarFactura();
                                break;
                            case 8:
                                //gestionFactura.eliminarFactura();
                                break;
                            default:
                                System.out.println("ERROR. Introduzca 1, 2 o 3");
                        }
                    } while (opcion2 != 9);
                } else {
                    System.out.println("Contraseña errónea.");
                }
            } else if (opcion == 2) {
                int opc;
                do{
                    System.out.println("Inicio de sesión\n");
                    System.out.println("1. Iniciar sesión");
                    System.out.println("2. Registrarse");
                    System.out.println("3. Invitado");
                    opc=lector.nextInt();
                    switch(opc){
                        case 1:
                            //gestionUsuario.inicio();
                            break;
                        case 2: 
                            gestionUsuario.anyadirUsuario();
                            break;
                        case 3:
                            //invitado
                            break;
                        default:
                            System.out.println("Error, vuelva a intentarlo.");
                    }
                }while(opc<1 && opc>3);
                do {
                    int pos;
                    System.out.println("Bienvenido usuario \n");
                    System.out.println("1.Listar bolsos por precio ascendente");
                    System.out.println("2.Descripcion de bolso");
                    System.out.println("3.Comprar bolso");
                    System.out.println("4.Delvolver bolso");
                    System.out.println("5.Revisar factura");
                    System.out.println("6.Salir");
                    opcion2 = lector.nextInt();
                    switch (opcion2) {
                        case 1:
                            gestionBolso.listarBolsoAsc();
                            break;
                        case 2:
                            pos = gestionBolso.consultarBolso();
                            break;
                        case 3:
                            pos = gestionBolso.consultarBolso();
                            boolean bool = gestionBolso.comprarBolso(pos);
                            if(bool){
                                //int precioTotal, String nifCliente, ArrayList idBolso
                                //gestionFactura.add(new Factura(gestionBolso.bolsos.get(pos).precio, gestionUsuario.clientes ... ));
                                //Realizar compra
                                //gestionFactura.generar();
                            }
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        default:
                            System.out.println("ERROR. Introduzca la opción");
                    }
                } while (opcion2 != 4);
            } else {
                System.out.println("Hasta pronto");
            }
        } while (opcion != 3);

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
