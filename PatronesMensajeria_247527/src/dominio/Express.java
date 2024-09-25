package dominio;

/**
 * La clase Express representa un tipo específico de servicio que hereda de la
 * clase Servicio. Extiende la funcionalidad de un servicio común y establece un
 * valor predeterminado para el tiempo de entrega.
 *
 * @author jesus
 *
 */
public class Express extends Servicio {

    /**
     * Constructor predeterminado de la clase Express. Establece un valor
     * predeterminado para el tiempo de entrega utilizando el constructor de la
     * clase padre Servicio.
     */
    public Express() {
        super(50.0);
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Express.
     *
     * @return Una cadena que representa el objeto Express.
     */
    @Override
    public String toString() {
        return "Express";
    }
}
