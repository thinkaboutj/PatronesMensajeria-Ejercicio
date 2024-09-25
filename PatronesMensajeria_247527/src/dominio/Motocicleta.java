package dominio;

/**
 * La clase Motocicleta representa un tipo específico de transporte que hereda
 * de la clase Transporte. Extiende la funcionalidad de un transporte común y
 * establece valores predeterminados para la capacidad de pasajeros y la
 * capacidad de carga
 *
 * @author jesus .
 */
public class Motocicleta extends Transporte {

    /**
     * Constructor predeterminado de la clase Motocicleta. Establece valores
     * predeterminados para la capacidad de pasajeros y la capacidad de carga
     * utilizando el constructor de la clase padre Transporte.
     */
    public Motocicleta() {
        super(45, 15); // Capacidad de pasajeros y carga predeterminada
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Motocicleta.
     *
     * @return Una cadena que representa el objeto Motocicleta.
     */
    @Override
    public String toString() {
        return "Motocicleta";
    }
}
