
package dominio;

/**
 * Esta clase abstracta representa una caja, que hereda las características de la clase Paquete.
 * Las cajas tienen un costo base, pero el cálculo del costo final puede variar según el tamaño de la caja (se deja sin implementar en esta clase abstracta).
 * 
 * @author jesus
 */
public abstract class Caja extends Paquete {

  /**
   * Constructor de la clase Caja. Recibe el costo base del paquete (caja).
   * 
   * @param costo El costo base del paquete (caja).
   */
  public Caja(double costo) {
    super(costo);
  }
}
