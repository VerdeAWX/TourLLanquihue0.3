
package Model;


public class Proveedor extends Persona {
   private String empresa;

    public Proveedor() {
    }

    public Proveedor(String nombre, Rut rut, Direccion direccion,
            String telefono, String empresa) {

        super(nombre, rut, direccion, telefono);

        this.empresa = empresa;

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void registrar() {

        System.out.println("Proveedor registrado.");

    }

    @Override
    public String toString() {

        return super.toString()
                + "\nEmpresa: " + empresa;

    }
}
