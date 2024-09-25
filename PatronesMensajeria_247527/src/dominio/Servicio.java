package dominio;

/**
 * La clase Servicio es una clase abstracta que representa un tipo de servicio
 * de entrega. Contiene un atributo para el costo del servicio.
 *
 * @author jesus
 *
 */
public abstract class Servicio {

    private double costo; // Costo del servicio

    /**
     * Constructor de la clase Servicio que inicializa el costo del servicio.
     *
     * @param costo El costo del servicio.
     */
    public Servicio(double costo) {
        this.costo = costo;
    }

    /**
     * Método getter para obtener el costo del servicio.
     *
     * @return El costo del servicio.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Método setter para establecer el costo del servicio.
     *
     * @param costo El costo del servicio.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
