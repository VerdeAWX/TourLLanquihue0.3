package utils;

import data.GestorClientes;
import data.GestorTours;
import excepciones.RutInvalidoException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Model.Cliente;
import Model.Direccion;
import Model.Rut;
import Model.Tour;

public class LectorArchivo {
    
      public static void leerArchivo(
            String archivo,
            GestorClientes gestor
    ){

        try{


            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo)
                    );


            String linea;


            while((linea = br.readLine()) != null){


                String datos[] = linea.split(";");


                String nombre = datos[0];

                String rutTexto = datos[1];

                String ciudad = datos[2];



                Rut rut =
                        new Rut(rutTexto);



                Direccion direccion =
                        new Direccion(
                                "No registrada",
                                ciudad,
                                "Los Lagos"
                        );



                Cliente cliente =
                        new Cliente(
                                nombre,
                                rut,
                                direccion,
                                "Sin telefono",
                                "Sin correo"
                        );



                gestor.agregarCliente(cliente);


            }


            br.close();


            System.out.println(
                    "Clientes cargados correctamente."
            );



        }catch(IOException | RutInvalidoException e){


            System.out.println(
                    "Error clientes: "
                    + e.getMessage()
            );

        }


    }




    // Carga tours desde archivo TXT

    public static void cargarTours(
            String archivo,
            GestorTours gestor
    ){


        try{


            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo)
                    );



            String linea;



            while((linea = br.readLine()) != null){



                String datos[] =
                        linea.split(";");



                int codigo =
                        Integer.parseInt(datos[0]);



                String nombre =
                        datos[1];



                String destino =
                        datos[2];



                double precio =
                        Double.parseDouble(datos[3]);



                int cupos =
                        Integer.parseInt(datos[4]);



                Tour tour =
                        new Tour(
                                codigo,
                                nombre,
                                destino,
                                precio,
                                cupos
                        );



                gestor.agregarTour(tour);


            }


            br.close();



            System.out.println(
                    "Tours cargados correctamente."
            );



        }catch(IOException e){


            System.out.println(
                    "Error tours: "
                    + e.getMessage()
            );


        }


    }


}


