
package Model;


public class Tour {
    private int codigo;
    private String nombre;
    private String destino;
    private double precio;
    private int cupos;

    public Tour() {
    }

    public Tour(int codigo, String nombre, String destino, double precio, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.cupos = cupos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + "\nNombre: " + nombre
                + "\nDestino: " + destino
                + "\nPrecio: $" + precio
                + "\nCupos: " + cupos;
    }
}
