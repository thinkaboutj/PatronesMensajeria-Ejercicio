package PatronFactory;

import dominio.CajaMediana;
import dominio.Paquete;
import interfaces.iFactoryPaquete;

/**
 *
 * @author jesus
 */
public class FactoryCajaMediana implements iFactoryPaquete {

    /**
     * Crea un nuevo objeto CajaMediana.
     *
     * @return un Objeto CajaMediana.
     */
    @Override
    public Paquete crearPaquete() {
        return new CajaMediana();
    }

}
