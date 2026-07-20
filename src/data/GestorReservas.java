
package data;

import java.util.Stack;
import Model.Reserva;

public class GestorReservas {


    private Stack<Reserva> reservas;



    public GestorReservas(){

        reservas = new Stack<>();

    }




    public void agregarReserva(Reserva reserva){

        reservas.push(reserva);

    }





    public void mostrarReservas(){


        if(reservas.isEmpty()){


            System.out.println(
                    "No existen reservas."
            );


            return;

        }




        for(Reserva r : reservas){


            System.out.println("----------------");

            System.out.println(r);


        }


    }





    public Reserva ultimaReserva(){


        if(reservas.empty()){

            return null;

        }


        return reservas.peek();


    }





    public void cancelarUltimaReserva(){


        if(!reservas.empty()){


            reservas.pop();


            System.out.println(
                    "Última reserva eliminada."
            );


        }else{


            System.out.println(
                    "No existen reservas."
            );


        }


    }




    public Stack<Reserva> getReservas(){

        return reservas;

    }


}
