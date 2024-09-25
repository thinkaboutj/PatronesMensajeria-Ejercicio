package dominio;

/**
 * La clase Transporte es una clase abstracta que representa un medio de
 * transporte. Contiene atributos para la velocidad promedio y el costo del
 * transporte.
 *
 * @author jesus
 *
 */
public abstract class Transporte {

    private double velocidadPromedio;
    private double costo;

    /**
     * Constructor de la clase Transporte que inicializa la velocidad promedio y
     * el costo.
     *
     * @param velocidadPromedio La velocidad promedio del transporte.
     * @param costo El costo del transporte.
     */
    public Transporte(double velocidadPromedio, double costo) {
        this.velocidadPromedio = velocidadPromedio;
        this.costo = costo;
    }

    /**
     * Método getter para obtener la velocidad promedio del transporte.
     *
     * @return La velocidad promedio del transporte.
     */
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    /**
     * Método setter para establecer la velocidad promedio del transporte.
     *
     * @param velocidadPromedio La velocidad promedio del transporte.
     */
    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    /**
     * Método getter para obtener el costo del transporte.
     *
     * @return El costo del transporte.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Método setter para establecer el costo del transporte.
     *
     * @param costo El costo del transporte.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
