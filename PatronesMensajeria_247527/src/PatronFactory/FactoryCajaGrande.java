
package PatronFactory;

import dominio.CajaGrande;
import dominio.Paquete;
import interfaces.iFactoryPaquete;

/**
 *
 * @author jesus
 * 
 */
public class FactoryCajaGrande implements iFactoryPaquete{

    /**
     * Crea un nuevo objeto CajaChica.
     * @return un Objeto CajaChica.
     */
    @Override
    public Paquete crearPaquete() {
        return new CajaGrande();
    }
    
}
