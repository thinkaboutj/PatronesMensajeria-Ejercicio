/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import dominio.Entrega;
import interfaces.iPatronIterador;
import java.util.ArrayList;
import java.util.List;

/**
 *La clase IteradorEntrega implementa la interfaz iPatronIterador
 * para iterar sobre una secuencia de elementos relacionados con una entrega.
 * 
 * @author jesus 
 * 
 */
public class IteradorEntrega implements iPatronIterador {

    private List<Double> coleccion; // Colección de elementos
    private int index; // Índice actual en la colección

    /**
     * Constructor de la clase IteradorEntrega. Inicializa la colección con los
     * elementos asociados a una entrega y el índice a cero.
     *
     * @param entrega La entrega de la cual se extraen los elementos para la
     * iteración.
     */
    public IteradorEntrega(Entrega entrega) {
        coleccion = new ArrayList<>();
        coleccion.add(entrega.getTipoPaquete().getCostoAdicional());
        coleccion.add(entrega.getTransporte().getCosto());
        coleccion.add(entrega.getServicio().getCosto());
        index = 0;
    }

    /**
     * Método para obtener el siguiente elemento en la secuencia.
     *
     * @return El siguiente elemento en la secuencia.
     */
    @Override
    public double getNext() {
        double d = coleccion.get(index);
        index++;
        return d;
    }

    /**
     * Método para verificar si hay más elementos en la secuencia.
     *
     * @return true si hay más elementos en la secuencia, false de lo contrario.
     */
    @Override
    public boolean hasNext() {
        return coleccion.size() > index;
    }
}
