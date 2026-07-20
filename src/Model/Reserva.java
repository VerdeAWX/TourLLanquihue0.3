
package Model;


public class Reserva {
     int id;
     Cliente cliente;
     Tour tour;
     int cantidadPersonas;

    public Reserva(int id, Cliente cliente, Tour tour, int cantidadPersonas) {

        this.id = id;
        this.cliente = cliente;
        this.tour = tour;
        this.cantidadPersonas = cantidadPersonas;

    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tour getTour() {
        return tour;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    @Override
    public String toString() {

        return "Reserva Nº " + id
                + "\nCliente: " + cliente.getNombre()
                + "\nTour: " + tour.getNombre()
                + "\nCantidad Personas: " + cantidadPersonas;

    }
}
