package dominio;

/**
 * La clase Paquete es una clase abstracta que representa un paquete a entregar.
 * Contiene un atributo para el costo adicional del paquete.
 *
 * @author jesus
 *
 */
public abstract class Paquete {

    private double costo; // Costo adicional del paquete

    /**
     * Constructor de la clase Paquete que inicializa el costo adicional del
     * paquete.
     *
     * @param costo El costo adicional del paquete.
     */
    public Paquete(double costo) {
        this.costo = costo;
    }

    /**
     * Método getter para obtener el costo adicional del paquete.
     *
     * @return El costo adicional del paquete.
     */
    public double getCostoAdicional() {
        return costo;
    }

    /**
     * Método setter para establecer el costo adicional del paquete.
     *
     * @param costoAdicional El costo adicional del paquete.
     */
    public void setCostoAdicional(double costoAdicional) {
        this.costo = costoAdicional;
    }
}
