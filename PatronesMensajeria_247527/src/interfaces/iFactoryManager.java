/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Estandar;
import dominio.Express;
import dominio.Paquete;
import dominio.Transporte;

/**
 *
 * @author jesus
 */
public interface iFactoryManager {

    public Paquete crearSobre();

    public Paquete crearCajaChica();

    public Paquete crearCajaMediana();

    public Paquete crearCajaGrande();

    public Estandar getEstandar();

    public Express servicioExpress();

    public Transporte crearDron();

    public Transporte crearBicicleta();

    public Transporte crearMotocicleta();

    public Transporte crearCarro();
}
