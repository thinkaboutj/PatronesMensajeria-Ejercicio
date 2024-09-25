package PatronFactory;

import dominio.Carro;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 * Esta clase implementa la interfaz `iFactoryTransporte` para crear objetos de
 * tipo `Carro`.
 *
 * @author jesus
 */
public class FactoryCarro implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto de tipo `Carro`.
     *
     * @return Un nuevo objeto `Carro`.
     */
    @Override
    public Transporte crearTransporte() {
        return new Carro();
    }
}
