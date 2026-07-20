
package app;

import data.GestorClientes;
import data.GestorReservas;
import data.GestorTours;
import excepciones.RutInvalidoException;
import interfaces.Registrable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Cliente;
import Model.Direccion;
import Model.Empleado;
import Model.Proveedor;
import Model.Reserva;
import Model.Rut;
import Model.Tour;

import utils.LectorArchivo;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        GestorClientes gestorClientes =
                new GestorClientes();


        GestorTours gestorTours =
                new GestorTours();


        GestorReservas gestorReservas =
                new GestorReservas();



        // Lista polimórfica

        List<Registrable> personas =
                new ArrayList<>();



        int opcion;



        do {



            System.out.println("\n==============================");
            System.out.println("       LLANQUIHUE TOUR");
            System.out.println("==============================");

            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Buscar cliente por RUT");

            System.out.println("4. Registrar tour");
            System.out.println("5. Mostrar tours");

            System.out.println("6. Crear reserva");
            System.out.println("7. Mostrar reservas");

            System.out.println("8. Cargar clientes TXT");
            System.out.println("9. Cargar tours TXT");

            System.out.println("10. Mostrar polimorfismo");

            System.out.println("11. Cancelar última reserva");

            System.out.println("12. Salir");


            System.out.print("Seleccione opción: ");


            opcion = sc.nextInt();
            sc.nextLine();




            switch(opcion){



                //=================================
                // REGISTRAR CLIENTE
                //=================================

                case 1:


                    try{


                        System.out.print(
                                "Nombre cliente: "
                        );

                        String nombre =
                                sc.nextLine();



                        System.out.print(
                                "RUT: "
                        );

                        String rutTexto =
                                sc.nextLine();



                        System.out.print(
                                "Teléfono: "
                        );

                        String telefono =
                                sc.nextLine();



                        System.out.print(
                                "Correo: "
                        );

                        String correo =
                                sc.nextLine();




                        Direccion direccion =
                                new Direccion(
                                        "Sin dirección",
                                        "Llanquihue",
                                        "Los Lagos"
                                );



                        Rut rut =
                                new Rut(rutTexto);




                        Cliente cliente =
                                new Cliente(
                                        nombre,
                                        rut,
                                        direccion,
                                        telefono,
                                        correo
                                );



                        gestorClientes
                                .agregarCliente(cliente);



                        personas.add(cliente);



                        System.out.println(
                                "Cliente registrado."
                        );



                    }catch(RutInvalidoException e){


                        System.out.println(
                                e.getMessage()
                        );


                    }



                    break;





                //=================================
                // MOSTRAR CLIENTES
                //=================================

                case 2:


                    gestorClientes
                            .mostrarClientes();


                    break;






                //=================================
                // BUSCAR CLIENTE
                //=================================

                case 3:


                    System.out.print(
                            "Ingrese RUT: "
                    );


                    String rutBuscar =
                            sc.nextLine();




                    Cliente clienteEncontrado =
                            gestorClientes
                                    .buscarPorRut(rutBuscar);




                    if(clienteEncontrado != null){


                        clienteEncontrado
                                .mostrarDatos();



                    }else{


                        System.out.println(
                                "Cliente no encontrado."
                        );


                    }



                    break;







                //=================================
                // REGISTRAR TOUR
                //=================================

                case 4:



                    System.out.print(
                            "Código tour: "
                    );

                    int codigo =
                            sc.nextInt();

                    sc.nextLine();



                    System.out.print(
                            "Nombre tour: "
                    );

                    String nombreTour =
                            sc.nextLine();




                    System.out.print(
                            "Destino: "
                    );

                    String destino =
                            sc.nextLine();




                    System.out.print(
                            "Precio: "
                    );

                    double precio =
                            sc.nextDouble();




                    System.out.print(
                            "Cupos: "
                    );

                    int cupos =
                            sc.nextInt();




                    Tour tour =
                            new Tour(
                                    codigo,
                                    nombreTour,
                                    destino,
                                    precio,
                                    cupos
                            );



                    gestorTours
                            .agregarTour(tour);



                    System.out.println(
                            "Tour registrado."
                    );



                    break;








                //=================================
                // MOSTRAR TOURS
                //=================================

                case 5:


                    gestorTours
                            .mostrarTours();


                    break;







                //=================================
                // CREAR RESERVA
                //=================================

                case 6:



                    System.out.print(
                            "RUT cliente: "
                    );


                    String rutCliente =
                            sc.nextLine();




                    Cliente cliente =
                            gestorClientes
                                    .buscarPorRut(rutCliente);




                    if(cliente == null){


                        System.out.println(
                                "Cliente no existe."
                        );


                        break;

                    }





                    System.out.print(
                            "Código tour: "
                    );


                    int codigoTour =
                            sc.nextInt();




                    Tour tourReserva =
                            gestorTours
                                    .buscarCodigo(codigoTour);




                    if(tourReserva == null){


                        System.out.println(
                                "Tour no existe."
                        );


                        break;


                    }





                    System.out.print(
                            "Cantidad personas: "
                    );


                    int cantidad =
                            sc.nextInt();




                    Reserva reserva =
                            new Reserva(
                                    1,
                                    cliente,
                                    tourReserva,
                                    cantidad
                            );




                    gestorReservas
                            .agregarReserva(reserva);




                    System.out.println(
                            "Reserva creada."
                    );



                    break;








                //=================================
                // MOSTRAR RESERVAS
                //=================================

                case 7:


                    gestorReservas
                            .mostrarReservas();


                    break;







                //=================================
                // CARGAR CLIENTES
                //=================================

                case 8:


                    LectorArchivo
                            .leerArchivo(
                                    "clientes.txt",
                                    gestorClientes
                            );


                    break;








                //=================================
                // CARGAR TOURS
                //=================================

                case 9:


                    LectorArchivo
                            .cargarTours(
                                    "tours.txt",
                                    gestorTours
                            );


                    break;








                //=================================
                // POLIMORFISMO
                //=================================

                case 10:



                    for(Registrable persona : personas){



                        persona
                                .mostrarDatos();



                        if(persona instanceof Cliente){


                            System.out.println(
                                    "Tipo: Cliente"
                            );



                        }else if(persona instanceof Empleado){



                            System.out.println(
                                    "Tipo: Empleado"
                            );



                        }else if(persona instanceof Proveedor){



                            System.out.println(
                                    "Tipo: Proveedor"
                            );


                        }



                        System.out.println(
                                "----------------"
                        );


                    }



                    break;









                //=================================
                // CANCELAR RESERVA
                //=================================

                case 11:


                    gestorReservas
                            .cancelarUltimaReserva();


                    break;







                case 12:


                    System.out.println(
                            "Gracias por usar Llanquihue Tour."
                    );


                    break;







                default:


                    System.out.println(
                            "Opción inválida."
                    );



            }





        }while(opcion != 12);




        sc.close();


    }


}
