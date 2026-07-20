
package data;

import java.util.ArrayList;
import java.util.HashMap;
import Model.Cliente;

public class GestorClientes {
    private ArrayList<Cliente> clientes;
    private HashMap<String, Cliente> mapaClientes;

    public GestorClientes() {

        clientes = new ArrayList<>();
        mapaClientes = new HashMap<>();

    }

    public void agregarCliente(Cliente cliente) {

        clientes.add(cliente);
        mapaClientes.put(cliente.getRut().getNumero(), cliente);

    }

    public void mostrarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("No existen clientes.");
            return;
        }

        for (Cliente c : clientes) {

            System.out.println("----------------------");
            c.mostrarDatos();

        }

    }

    public Cliente buscarPorRut(String rut) {

        return mapaClientes.get(rut);

    }

    public ArrayList<Cliente> getClientes() {

        return clientes;

    }
}
