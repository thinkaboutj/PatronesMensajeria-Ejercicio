package dominio;

/**
 * La clase Dron representa un tipo específico de transporte que hereda de la
 * clase Transporte. Extiende la funcionalidad de un transporte común y
 * establece valores predeterminados para la capacidad de pasajeros y la
 * capacidad de carga.
 *
 * @author jesus
 *
 */
public class Dron extends Transporte {

    /**
     * Constructor predeterminado de la clase Dron. Establece valores
     * predeterminados para la capacidad de pasajeros y la capacidad de carga
     * utilizando el constructor de la clase padre Transporte.
     */
    public Dron() {
        super(60, 20); // Capacidad de pasajeros y carga predeterminada
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Dron.
     *
     * @return Una cadena que representa el objeto Dron.
     */
    @Override
    public String toString() {
        return "Dron";
    }
}
