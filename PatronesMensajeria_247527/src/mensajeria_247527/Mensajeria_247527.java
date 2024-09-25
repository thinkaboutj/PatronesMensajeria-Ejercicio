/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajeria_247527;

import java.util.Scanner;
import iterator.ManagerEntrega;

/**
 *
 * @author jesus
 */
public class Mensajeria_247527 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        ManagerEntrega managerEntrega = new ManagerEntrega();
        String tipoPaquete, servicio;
        double distancia;
        System.out.println("Mensajeria Express (╹ڡ╹ )");
        System.out.println("Elija el tipo de paquete: (Sobre, CajaChica, CajaMediana, CajaGrande)");
        tipoPaquete = tec.nextLine();
        System.out.println("Elija el tipo de envio: (estandar, express)");
        servicio = tec.nextLine();
        System.out.println("ingresa la distancia: ");
        distancia = tec.nextDouble();

        System.out.println("\n\n" + managerEntrega.crearEntrega(servicio, distancia, tipoPaquete) + "\n\n");
    }

}
