package dominio;

/**
 * La clase Sobre representa un tipo específico de paquete que hereda de la
 * clase Paquete. Extiende la funcionalidad de un paquete común y establece un
 * costo adicional predeterminado.
 *
 * @author jesus
 *
 */
public class Sobre extends Paquete {

    /**
     * Constructor predeterminado de la clase Sobre. Establece un costo
     * adicional predeterminado utilizando el constructor de la clase padre
     * Paquete.
     */
    public Sobre() {
        super(5.0); // Costo adicional predeterminado de 5.0 unidades
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Sobre.
     *
     * @return Una cadena que representa el objeto Sobre.
     */
    @Override
    public String toString() {
        return "Sobre";
    }
}
