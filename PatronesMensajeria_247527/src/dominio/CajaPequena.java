
package dominio;

/**
 * Esta clase concreta representa una caja chica, que hereda las características de la clase abstracta Caja.
 * Las cajas chicas tienen un costo base de 10 unidades 
 * 
 * @author jesus
 */
public class CajaPequena extends Caja {

  /**
   * Constructor de la clase CajaChica. No se requiere ningún parámetro ya que el costo base de una caja chica es fijo (10 unidades).
   */
  public CajaPequena() {
    super(10);
  }

  /**
   * Redefine el método toString() heredado de la clase Caja para devolver una cadena que indica que es una caja chica.
   * 
   * @return Un string que indica que es una caja chica.
   */
  @Override
  public String toString() {
    return "Caja Chica";
  }
}

