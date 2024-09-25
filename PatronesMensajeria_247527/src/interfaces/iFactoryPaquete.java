/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Paquete;

/**
 * La interfaz iFactoryPaquete define un método para crear un objeto Paquete.
 *
 * @author jesus
 */
public interface iFactoryPaquete {

    /**
     * Método para crear un objeto Paquete.
     *
     * @return El objeto Paquete creado.
     */
    public Paquete crearPaquete();
}
