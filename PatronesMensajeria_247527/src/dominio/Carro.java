package dominio;

/**
 * La clase Carro representa un tipo específico de transporte que hereda de la
 * clase Transporte. Extiende la funcionalidad de un transporte común y
 * establece valores predeterminados para la capacidad de pasajeros y la
 * capacidad de carga.
 *
 * @author jesus
 *
 */
public class Carro extends Transporte {

    /**
     * Constructor predeterminado de la clase Carro. Establece valores
     * predeterminados para la capacidad de pasajeros y la capacidad de carga
     * utilizando el constructor de la clase padre Transporte.
     */
    public Carro() {
        super(40, 30); // Capacidad de pasajeros y carga predeterminada
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Carro.
     *
     * @return Una cadena que representa el objeto Carro.
     */
    @Override
    public String toString() {
        return "Carro";
    }
}
