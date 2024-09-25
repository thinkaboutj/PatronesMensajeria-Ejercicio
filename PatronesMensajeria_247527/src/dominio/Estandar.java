/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 * La clase Estandar representa un tipo específico de servicio que hereda de la
 * clase Servicio. Extiende la funcionalidad de un servicio común y establece un
 * valor predeterminado para el tiempo de entrega.
 *
 * @author jesus
 *
 */
public class Estandar extends Servicio {

    /**
     * Constructor predeterminado de la clase Estandar. Establece un valor
     * predeterminado para el tiempo de entrega utilizando el constructor de la
     * clase padre Servicio.
     */
    public Estandar() {
        super(30); // Tiempo de entrega predeterminado de 30 unidades
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto
     * Estandar.
     *
     * @return Una cadena que representa el objeto Estandar.
     */
    @Override
    public String toString() {
        return "Estandar";
    }
}
