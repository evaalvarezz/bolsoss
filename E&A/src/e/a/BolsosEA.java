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
        Administrador admin = new Administrador(); //user: admin , pass:1234
        GestionBolsos gestionBolso = new GestionBolsos(); 
        GestionUsuarios gestionUsuario;
        GestionFactura gestionFactura;

        
        if(GestionFicheros.existeFichUsuario()){
            gestionUsuario = new GestionUsuarios(GestionFicheros.cargarUsuario());
            System.out.println("Datos de clientes cargados correctamente.");
        }else{
            gestionUsuario= new GestionUsuarios();
            System.out.println("Sistema inicial.");
        }
        
        if(GestionFicheros.existeFichFactura()){
            gestionFactura = new GestionFactura(GestionFicheros.cargarFactura());
            System.out.println("Datos de clientes cargados correctamente.");
        }else{
            gestionFactura= new GestionFactura();
            System.out.println("Sistema inicial.");
        }
        
        int posRegistrado = 5666;

        int opcion2;
        int opcion;
        do {
            System.out.println("Bienvenidos a bolsos guays\n");
            System.out.println("1.Soy empleado");
            System.out.println("2.Soy cliente");
            System.out.println("3.Salir de bolsos guays");
            opcion = lector.nextInt();
            if (opcion == 1) {
                System.out.println("Introduce usuario y contraseña(user pass): ");
                String usuario = lector.next();
                String pass = lector.next();
                if (admin.login(usuario, pass)) {
                    do {
                        System.out.println("Bienvenido administrador. Que deseea hacer ");
                        System.out.println("1.Añadir bolso");
                        System.out.println("2.Eliminar bolso");
                        System.out.println("3.Listar bolso");
                        System.out.println("4.Consultar cantidad bolso por id");
                        System.out.println("5.Listar usuarios");
                        System.out.println("6.Eliminar usuario");
                        System.out.println("7.Listar facturas");
                        System.out.println("8.Leer fichero de factura");
                        System.out.println("9.Eliminar factura");
                        System.out.println("10.Eliminar todas las facturas");
                        System.out.println("11.Volcar Clientes a fichero de texto");
                        System.out.println("12.Cargar Clientes de fichero de texto");
                        System.out.println("13.Volcar Facturas a fichero binario");
                        System.out.println("14.Cargar Facturas en fichero binario");
                        System.out.println("15.Salir");
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
                                gestionBolso.consultarBolso();
                                break;
                            case 5:
                                gestionUsuario.listarUsuarios();
                                break;
                            case 6:
                                gestionUsuario.eliminarUsuario();
                                break;
                            case 7:
                                gestionFactura.listarFacturas();
                                break;
                            case 8:
                                System.out.println("Introduce la referencia: ");
                                String referencia=lector.next();
                                if(GestionFicheros.existeFactura(referencia)){
                                    GestionFicheros.leerFactura(referencia);
                                }
                                else{
                                    System.out.println("No existe la factura.");
                                }
                            case 9:
                                System.out.println("Introduce la referencia: ");
                                String refe = lector.next();
                                gestionFactura.eliminarFactura(refe);
                                break;
                            case 10:
                                System.out.println("¿Estás seguro? (Y/N)");
                                if (lector.nextLine().equalsIgnoreCase("Y")) {
                                    gestionFactura.eliminarTodo();
                                }
                                System.out.println("Facturas limpiadas con éxito.");
                                break;
                            case 11:
                                GestionFicheros.escribirFicheroTxt(gestionUsuario.clientes);
                                break;
                            case 12:
                                GestionFicheros.leerFicheroTxt();
                                break;
                            case 13:
                                GestionFicheros.escribirFicheroBinario(gestionFactura.facturas);
                                break;
                            case 14:
                                GestionFicheros.leerFicheroBinario();
                                break;
                            default:
                                System.out.println("ERROR. Introduzca la opcion deseada");
                        }
                    } while (opcion2 != 15);
                } else {
                    System.out.println("Credenciales erróneas, vuelve a intentarlo.");
                }
            } else if (opcion == 2) {
                int opc;
                do {
                    posRegistrado = 5666;
                    System.out.println("Inicio de sesión\n");
                    System.out.println("1. Iniciar sesión");
                    System.out.println("2. Registrar una cuenta");
                    System.out.println("3. Invitado");
                    opc = lector.nextInt();
                    switch (opc) {
                        case 1:
                            posRegistrado = gestionUsuario.inicioRegistrado();
                            if (posRegistrado == 5666) {
                                System.out.println("Credenciales incorrectas. Vuelva a intentarlo.");
                                posRegistrado = 5666;
                            } else {
                                gestionUsuario.sesion = "Registrado";
                            }
                            break;
                        case 2:
                            gestionUsuario.anyadirUsuario();
                            break;
                        case 3:
                            posRegistrado = gestionUsuario.inicioInvitado();
                            gestionUsuario.sesion = "Invitado";
                            break;
                        default:
                            System.out.println("Error, vuelva a intentarlo.");
                    }
                } while (posRegistrado == 5666);
                if (gestionUsuario.sesion.equalsIgnoreCase("Registrado")) {
                    do {
                        int posicion, id;
                        String refe;
                        System.out.println("Bienvenido usuario " + ((Registrado) gestionUsuario.clientes.get(posRegistrado)).nomUsuario + "\n");
                        gestionBolso.listarMarca();
                        System.out.println("1.Listar bolsos por precio ascendente");
                        System.out.println("2.Listar bolsos por cantidad y precio ascendente");
                        System.out.println("3.Descripcion de bolso");
                        System.out.println("4.Comprar bolso y generar factura");
                        System.out.println("5.Revisar factura");
                        System.out.println("6.Devolver compra");
                        System.out.println("7.Salir");
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestionBolso.listarBolsoAsc();
                                break;
                            case 2:
                                gestionBolso.listarBolsoCantPrecio();
                                break;
                            case 3:
                                gestionBolso.consultarBolso();
                                break;
                            case 4:
                                System.out.println("Escriba el id del bolso: ");
                                id = lector.nextInt();
                                posicion = gestionBolso.posBolso(id);
                                if (gestionBolso.comprarBolso(posicion)) {
                                    int precioTot = (int) (gestionBolso.bolsos.get(posicion).precio * gestionUsuario.clientes.get(posRegistrado).descuentoCliente());
                                    gestionFactura.crearFactura(precioTot, gestionUsuario.clientes.get(0).nif, id);
                                }
                                break;
                            case 5:
                                System.out.println("Escriba la referencia de su factura: ");
                                refe = lector.next();
                                
                                if(GestionFicheros.existeFactura(refe)){
                                    GestionFicheros.leerFactura(refe);
                                } else {
                                    System.out.println("No existe la factura.");
                                }
                                break;
                            case 6:
                                System.out.println("Escriba la referencia de su factura: ");
                                refe = lector.next();
                                if (gestionFactura.existeFactura(refe)) {
                                    gestionFactura.eliminarFactura(refe);
                                    System.out.println("Recibirá su dinero en media hora. Muchas gracias por su compra.");
                                } else {
                                    System.out.println("No existe la factura.");
                                }
                                break;
                            default:
                                System.out.println("ERROR. Introduzca opción de nuevo");
                        }
                    } while (opcion2 != 7);
                } else {
                    do {
                        int posicion, id;
                        System.out.println("Bienvenido Invitado\n");
                        gestionBolso.listarMarca();
                        System.out.println("1.Listar bolsos por precio ascendente");
                        System.out.println("2.Listar bolsos por cantidad y precio ascendente");
                        System.out.println("3.Descripcion de bolso");
                        System.out.println("4.Comprar bolso y generar factura");
                        System.out.println("5.Salir");
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestionBolso.listarBolsoAsc();
                                break;
                            case 2:
                                gestionBolso.listarBolsoCantPrecio();
                            case 3:
                                gestionBolso.consultarBolso();
                                break;
                            case 4:
                                System.out.println("Escriba el id del bolso: ");
                                id = lector.nextInt();
                                posicion = gestionBolso.posBolso(id);
                                if (gestionBolso.comprarBolso(posicion)) {
                                    int precioTot = (int) (gestionBolso.bolsos.get(posicion).precio * gestionUsuario.clientes.get(posRegistrado).descuentoCliente());
                                    gestionFactura.crearFactura(precioTot, gestionUsuario.clientes.get(posRegistrado).nif, id);
                                }
                                break;
                            default:
                                System.out.println("ERROR. Introduzca opción de nuevo");
                        }
                    } while (opcion2 != 5);
                }
            } else {
                System.out.println("Hasta pronto");
            }
        } while (opcion != 3);
    }

}
