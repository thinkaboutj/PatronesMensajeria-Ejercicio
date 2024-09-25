package dominio;

/**
 * La clase Entrega representa un objeto que contiene información sobre un
 * servicio de entrega, incluido el tipo de servicio, el transporte utilizado,
 * el tipo de paquete, la distancia a recorrer, el costo final y el tiempo
 * estimado de llegada.
 *
 * @author jesus
 *
 */
public class Entrega {

    private Servicio servicio;
    private Transporte transporte;
    private Paquete tipoPaquete;
    private double distancia;
    private double costoFinal;
    private double tiempoLlegada;

    /**
     * Constructor de la clase Entrega que inicializa los atributos con valores
     * proporcionados.
     *
     * @param servicio El tipo de servicio de entrega.
     * @param transporte El medio de transporte utilizado.
     * @param tipoPaquete El tipo de paquete a entregar.
     * @param distancia La distancia a recorrer en la entrega.
     */
    public Entrega(Servicio servicio, Transporte transporte, Paquete tipoPaquete, double distancia) {
        this.servicio = servicio;
        this.transporte = transporte;
        this.tipoPaquete = tipoPaquete;
        this.distancia = distancia;
        costoFinal = 0;
    }

    /**
     * Constructor predeterminado de la clase Entrega.
     */
    public Entrega() {

    }

    // Métodos de acceso (getters y setters) para los atributos de la clase
    /**
     * Método getter para obtener el tiempo estimado de llegada.
     *
     * @return El tiempo estimado de llegada.
     */
    public double getTiempoLlegada() {
        return tiempoLlegada;
    }

    /**
     * Método setter para establecer el tiempo estimado de llegada.
     *
     * @param tiempoLlegada El tiempo estimado de llegada.
     */
    public void setTiempoLlegada(double tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    /**
     * Método getter para obtener el tipo de servicio de entrega.
     *
     * @return El tipo de servicio de entrega.
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Método setter para establecer el tipo de servicio de entrega.
     *
     * @param servicio El tipo de servicio de entrega.
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Método getter para obtener el medio de transporte utilizado.
     *
     * @return El medio de transporte utilizado.
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Método setter para establecer el medio de transporte utilizado.
     *
     * @param transporte El medio de transporte utilizado.
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * Método getter para obtener el tipo de paquete a entregar.
     *
     * @return El tipo de paquete a entregar.
     */
    public Paquete getTipoPaquete() {
        return tipoPaquete;
    }

    /**
     * Método setter para establecer el tipo de paquete a entregar.
     *
     * @param tipoPaquete El tipo de paquete a entregar.
     */
    public void setTipoPaquete(Paquete tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    /**
     * Método getter para obtener la distancia a recorrer en la entrega.
     *
     * @return La distancia a recorrer en la entrega.
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Método setter para establecer la distancia a recorrer en la entrega.
     *
     * @param distancia La distancia a recorrer en la entrega.
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Método getter para obtener el costo final de la entrega.
     *
     * @return El costo final de la entrega.
     */
    public double getCostoFinal() {
        return costoFinal;
    }

    /**
     * Método setter para establecer el costo final de la entrega.
     *
     * @param costoFinal El costo final de la entrega.
     */
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Entrega.
     *
     * @return Una cadena que representa el objeto Entrega.
     */
    @Override
    public String toString() {
        return "Entrega{" + "servicio=" + servicio + ", transporte=" + transporte + ", tipoPaquete=" + tipoPaquete + ", distancia=" + distancia + ", costoFinal=" + costoFinal + ", tiempoLlegada=" + tiempoLlegada + '}';
    }
}
