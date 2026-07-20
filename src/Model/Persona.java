
package Model;

import interfaces.Registrable;

public abstract class Persona implements Registrable{
     private String nombre;
    private Rut rut;
    private Direccion direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, Rut rut, Direccion direccion, String telefono) {

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void registrar() {

        System.out.println("Persona registrada.");

    }

    @Override
    public void mostrarDatos() {

        System.out.println(this);

    }

    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nRut: " + rut
                + "\nDirección: " + direccion
                + "\nTeléfono: " + telefono;

    }
}
