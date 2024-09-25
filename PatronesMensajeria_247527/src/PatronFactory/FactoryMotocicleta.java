package PatronFactory;

import dominio.Motocicleta;
import dominio.Transporte;
import interfaces.iFactoryTransporte;

/**
 * Esta clase implementa la interfaz `iFactoryTransporte` para crear objetos de
 * tipo `Motocicleta`.
 *
 * @author jesus
 *
 */
public class FactoryMotocicleta implements iFactoryTransporte {

    /**
     * Crea un nuevo objeto de tipo `Motocicleta`.
     *
     * @return Una nueva `Motocicleta`.
     */
    @Override
    public Transporte crearTransporte() {
        return new Motocicleta();
    }
}
