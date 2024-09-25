package interfaces;

import dominio.Entrega;
import dominio.Transporte;

/**
 * * La interfaz iManagerEntrega define métodos para gestionar el proceso de
 * entrega. Permite crear una entrega, obtener y establecer el servicio, el
 * transporte, el paquete y la distancia, calcular el costo y el tiempo estimado
 * de la entrega.
 *
 * @author jesus
 */
public interface iManagerEntrega {

    /**
     * Método para crear una entrega con el servicio, la distancia y el tipo de
     * paquete especificados.
     *
     * @param servicio El servicio de entrega.
     * @param distancia La distancia de la entrega.
     * @param tipoPaquete El tipo de paquete a entregar.
     * @return La entrega creada.
     */
    public Entrega crearEntrega(String servicio, double distancia, String tipoPaquete);

    /**
     * Método para obtener la distancia.
     *
     * @param distancia La distancia a obtener.
     * @return La distancia especificada.
     */
    public double getDistancia(double distancia);

    /**
     * Método para establecer el servicio de entrega.
     *
     * @param servicio El servicio de entrega a establecer.
     */
    public void setServicio(String servicio);

    /**
     * Método para establecer el transporte de entrega.
     *
     * @param servicio El servicio de entrega.
     * @param distancia La distancia de la entrega.
     * @param tipoPaquete El tipo de paquete a entregar.
     */
    public void setTransporte(String servicio, double distancia, String tipoPaquete);

    /**
     * Método para establecer el paquete de entrega.
     *
     * @param tipoPaquete El tipo de paquete a establecer.
     */
    public void setPaquete(String tipoPaquete);

    /**
     * Método para establecer la distancia de entrega.
     *
     * @param distancia La distancia de entrega a establecer.
     */
    public void setDistancia(double distancia);

    /**
     * Método para obtener el costo de la entrega.
     *
     * @param entrega La entrega de la cual se desea calcular el costo.
     * @return El costo de la entrega.
     */
    public double getCosto(Entrega entrega);

    /**
     * Método para obtener el tiempo estimado de entrega.
     *
     * @param distancia La distancia de la entrega.
     * @param transport El transporte utilizado en la entrega.
     * @return El tiempo estimado de entrega.
     */
    public double getTiempoEstimado(double distancia, Transporte transport);
}
