
package data;

import java.util.ArrayList;
import Model.Tour;

public class GestorTours {
     private ArrayList<Tour> tours;



    public GestorTours(){

        tours = new ArrayList<>();

    }



    public void agregarTour(Tour tour){

        tours.add(tour);

    }



    public void mostrarTours(){


        if(tours.isEmpty()){

            System.out.println(
                    "No existen tours registrados."
            );

            return;

        }



        for(Tour t : tours){


            System.out.println("----------------");

            System.out.println(t);


        }


    }




    public Tour buscarCodigo(int codigo){


        for(Tour t : tours){


            if(t.getCodigo() == codigo){

                return t;

            }

        }


        return null;

    }





    public ArrayList<Tour> getTours(){

        return tours;

    }


}