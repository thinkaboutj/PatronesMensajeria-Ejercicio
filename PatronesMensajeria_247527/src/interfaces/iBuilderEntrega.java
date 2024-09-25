package interfaces;

import dominio.Entrega;
import dominio.Paquete;
import dominio.Servicio;
import dominio.Transporte;

/**
 * La interfaz iBuilderEntrega define métodos para construir un objeto Entrega.
 * Estos métodos permiten establecer diferentes aspectos de una entrega, como el
 * servicio, el medio de transporte, el tipo de paquete, el costo adicional, la
 * distancia, el tiempo estimado, etc.
 *
 * @author jesus
 */
public interface iBuilderEntrega {

    /**
     * Método para establecer el servicio de entrega.
     *
     * @param service El servicio de entrega.
     */
    public void builderServicio(Servicio service);

    /**
     * Método para establecer el medio de transporte utilizado en la entrega.
     *
     * @param transport El medio de transporte.
     */
    public void builderTransporte(Transporte transport);

    /**
     * Método para establecer el tipo de paquete a entregar.
     *
     * @param packageType El tipo de paquete.
     */
    public void builderPaquete(Paquete packageType);

    /**
     * Método para agregar un costo adicional a la entrega.
     *
     * @param costo El costo adicional a agregar.
     */
    public void addCosto(double costo);

    /**
     * Método para obtener el producto (objeto Entrega) construido.
     *
     * @return El objeto Entrega construido.
     */
    public Entrega getProducto();

    /**
     * Método para establecer la distancia de la entrega.
     *
     * @param distancia La distancia de la entrega.
     */
    public void builderDistancia(double distancia);

    /**
     * Método para establecer el tiempo estimado de la entrega.
     *
     * @param TiempoEstimado El tiempo estimado de la entrega.
     */
    public void builderTiempoEstimado(double TiempoEstimado);

    /**
     * Método para restaurar el estado del constructor de entrega. Esto puede
     * ser útil para reiniciar la construcción de una entrega desde cero.
     */
    public void restaurar();
}
