
package dominio;

/**
 * Esta clase concreta representa una caja grande, que hereda las características de la clase abstracta Caja.
 * Las cajas grandes tienen un costo base de 50 unidades 
 * para determinar el costo final en base a su tamaño.
 * 
 * @author jesus
 */
public class CajaGrande extends Caja {

  /**
   * Constructor de la clase CajaGrande. No se requiere ningún parámetro ya que el costo base de una caja grande es fijo (50 unidades).
   */
  public CajaGrande() {
    super(50);
  }

  /**
   * Redefine el método toString() heredado de la clase Caja para devolver una cadena que indica que es una caja grande.
   * 
   * @return Un string que indica que es una caja grande.
   */
  @Override
  public String toString() {
    return "Caja Grande";
  }
}
