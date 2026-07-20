
package Model;


public class Cliente extends Persona {
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombre, Rut rut, Direccion direccion,
            String telefono, String correo) {

        super(nombre, rut, direccion, telefono);

        this.correo = correo;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void registrar() {

        System.out.println("Cliente registrado correctamente.");

    }

    @Override
    public void mostrarDatos() {

        System.out.println(super.toString());
        System.out.println("Correo: " + correo);

    }

    @Override
    public String toString() {

        return super.toString()
                + "\nCorreo: " + correo;

    }
}
