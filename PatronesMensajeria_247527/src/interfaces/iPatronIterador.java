package interfaces;

/**
 * La interfaz iPatronIterador define métodos para iterar sobre una secuencia de
 * elementos numéricos.
 *
 * @author jesus
 */
public interface iPatronIterador {

    /**
     * Método para obtener el siguiente elemento en la secuencia.
     *
     * @return El siguiente elemento en la secuencia.
     */
    public double getNext();

    /**
     * Método para verificar si hay más elementos en la secuencia.
     *
     * @return true si hay más elementos en la secuencia, false de lo contrario.
     */
    public boolean hasNext();
}
