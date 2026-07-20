
package Model;


public class Empleado extends Persona{
   

    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, Rut rut, Direccion direccion,
            String telefono, String cargo) {

        super(nombre, rut, direccion, telefono);

        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void registrar() {

        System.out.println("Empleado registrado.");

    }

    @Override
    public String toString() {

        return super.toString()
                + "\nCargo: " + cargo;

    }
}
