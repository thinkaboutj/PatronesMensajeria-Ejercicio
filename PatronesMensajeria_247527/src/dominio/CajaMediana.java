/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 * Esta clase concreta representa una caja mediana, que hereda las
 * características de la clase abstracta Caja. Las cajas grandes tienen un costo
 * base de 20 unidades para determinar el costo final en base a su tamaño.
 *
 * @author jesus
 */
public class CajaMediana extends Caja {

    public CajaMediana() {
        super(20);
    }

    @Override
    public String toString() {
        return "Caja Mediana";
    }
}
