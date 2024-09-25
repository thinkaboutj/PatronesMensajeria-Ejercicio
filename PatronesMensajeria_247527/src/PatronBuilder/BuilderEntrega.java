package PatronBuilder;

import dominio.Entrega;
import dominio.Paquete;
import dominio.Servicio;
import dominio.Transporte;
import interfaces.iBuilderEntrega;

/**
 * Clase BuilderEntrega
 *
 * Implementa el patrón Builder para construir objetos de tipo Entrega de forma
 * incremental. Permite establecer paso a paso los atributos de una entrega,
 * como el servicio, el transporte, el tipo de paquete, el costo, la distancia y
 * el tiempo estimado.
 *
 * @author jesus 
 *
 */
public class BuilderEntrega implements iBuilderEntrega {

    /**
     * El objeto Entrega que se está construyendo.
     */
    private Entrega entrega;

    /**
     * Constructor vacío que inicializa el atributo entrega a un nuevo objeto
     * Entrega.
     */
    public BuilderEntrega() {
        this.entrega = new Entrega();
    }

    /**
     * Constructor que toma un objeto Entrega existente y lo asigna al atributo
     * entrega. Esto permite construir una entrega a partir de otra ya
     * existente, modificando sus atributos.
     *
     * @param entrega El objeto Entrega a partir del cual se construirá la nueva
     * entrega.
     */
    public BuilderEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    // Métodos de construcción de la entrega:
    @Override
    public void builderServicio(Servicio service) {
        entrega.setServicio(service);
    }

    @Override
    public void builderTransporte(Transporte transport) {
        entrega.setTransporte(transport);
    }

    @Override
    public void builderPaquete(Paquete packageType) {
        entrega.setTipoPaquete(packageType);
    }

    @Override
    public void addCosto(double costo) {
        entrega.setCostoFinal(entrega.getCostoFinal() + costo);
    }

    @Override
    public Entrega getProducto() {
        return entrega;
    }

    @Override
    public void builderDistancia(double distancia) {
        entrega.setDistancia(distancia);
    }

    @Override
    public void builderTiempoEstimado(double TiempoEstimado) {
        entrega.setTiempoLlegada(TiempoEstimado);
    }

    /**
     * Crea un nuevo objeto Entrega y lo asigna al atributo entrega, reiniciando
     * el proceso de construcción.
     */
    @Override
    public void restaurar() {
        this.entrega = new Entrega();
    }
}
