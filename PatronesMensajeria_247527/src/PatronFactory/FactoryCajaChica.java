package PatronFactory;

import dominio.CajaPequena;
import dominio.Paquete;
import interfaces.iFactoryPaquete;

/**
 * Clase FactoryCajaChica
 *
 * Implementa el patrón Factory para crear objetos de tipo CajaChica. Forma
 * parte del patrón Factory Method, que permite crear diferentes tipos de
 * paquetes sin exponer la lógica de creación a los clientes.
 *
 * @author jesus
 *
 */
public class FactoryCajaChica implements iFactoryPaquete {

    /**
     * Crea un nuevo objeto CajaChica.
     *
     * @return Un objeto CajaChica.
     */
    @Override
    public Paquete crearPaquete() {
        return new CajaPequena();
    }

}
