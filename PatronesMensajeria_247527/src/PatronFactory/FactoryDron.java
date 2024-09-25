
package PatronFactory;

import dominio.Dron;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 *Esta clase implementa la interfaz `iFactoryTransporte` para crear objetos de tipo `Dron`.

 * @author jesus
 *  */
public class FactoryDron implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto de tipo `Dron`.
     *
     * @return Un nuevo objeto `Dron`.
     */
    @Override
    public Transporte crearTransporte() {
        return new Dron();
    }
}
