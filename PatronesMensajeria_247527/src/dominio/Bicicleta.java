
package dominio;

/**
 * Esta clase representa una bicicleta, heredando las características de la clase Transporte.
 * 
 * @author jesus
 */
public class Bicicleta extends Transporte {

  /**
   * Constructor sin parámetros. Inicializa la velocidad máxima a 20 km/h y la capacidad de pasajeros a 1 (el ciclista).
   */
  public Bicicleta() {
    super(20, 1);
  }

  /**
   * Redefine el método toString() heredado de la clase Transporte para devolver una cadena que indica que es una bicicleta.
   * 
   * @return Un string que indica que es una bicicleta.
   */
  @Override
  public String toString() {
    return "Bicicleta";
  }
}
