package PatronFactory;

import dominio.Bicicleta;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 * Clase FactoryBicicleta
 *
 * Implementa el patrón Factory para crear objetos de tipo Bicicleta. Forma
 * parte del patrón Factory Method, que permite crear diferentes tipos de
 * transportes sin exponer la lógica de creación a los clientes.
 *
 * @author jesus
 *
 */
public class FactoryBicicleta implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto Bicicleta.
     *
     * @return Un objeto Bicicleta.
     */
    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
}
