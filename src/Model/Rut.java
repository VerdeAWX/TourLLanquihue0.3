
package Model;

import excepciones.RutInvalidoException;

public class Rut {

    private String numero;

    public Rut(String numero) throws RutInvalidoException {

        validar(numero);

        this.numero = numero;

    }

    public Rut() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws RutInvalidoException {

        validar(numero);

        this.numero = numero;
    }

    private void validar(String rut) throws RutInvalidoException {

        if (rut == null || rut.isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        if (rut.length() < 9) {
            throw new RutInvalidoException("Formato de RUT incorrecto.");
        }

    }

    @Override
    public String toString() {
        return numero;
    }
}
