package newpackage;

import PatronFactory.FactoryBicicleta;
import PatronFactory.FactoryCajaChica;
import PatronFactory.FactoryCajaGrande;
import PatronFactory.FactoryCajaMediana;
import PatronFactory.FactoryCarro;
import PatronFactory.FactoryDron;
import PatronFactory.FactoryMotocicleta;
import PatronFactory.FactorySobre;
import dominio.Estandar;
import dominio.Express;
import dominio.Paquete;
import dominio.Transporte;
import interfaces.iFactoryManager;

/**
 * La clase ManagerFactory implementa la interfaz iFactoryManager y se
 * utiliza para crear diferentes tipos de objetos como paquetes, servicios y
 * transportes.
 *
 *
 * @author jesus
 */
public class ManagerFactory implements iFactoryManager {

    private FactorySobre crearSobre;
    private FactoryCajaChica crearCajaChica;
    private FactoryCajaMediana crearCajaMediana;
    private FactoryCajaGrande crearCajaGrande;
    private Estandar servicioEstandar;
    private Express servicioExpress;
    private FactoryDron crearDron;
    private FactoryBicicleta crearBicicleta;
    private FactoryMotocicleta crearMotocicleta;
    private FactoryCarro crearCarro;

    /**
     * Constructor de la clase ManagerFactory. Inicializa las diferentes
     * fábricas y servicios.
     */
    public ManagerFactory() {
        this.crearSobre = new FactorySobre();
        this.crearCajaChica = new FactoryCajaChica();
        this.crearCajaMediana = new FactoryCajaMediana();
        this.crearCajaGrande = new FactoryCajaGrande();
        this.servicioEstandar = new Estandar();
        this.servicioExpress = new Express();
        this.crearDron = new FactoryDron();
        this.crearBicicleta = new FactoryBicicleta();
        this.crearMotocicleta = new FactoryMotocicleta();
        this.crearCarro = new FactoryCarro();
    }

    /**
     * Método para crear un paquete tipo Sobre.
     *
     * @return El paquete tipo Sobre creado.
     */
    @Override
    public Paquete crearSobre() {
        return crearSobre.crearPaquete();
    }

    /**
     * Método para crear un paquete tipo Caja Chica.
     *
     * @return El paquete tipo Caja Chica creado.
     */
    @Override
    public Paquete crearCajaChica() {
        return crearCajaChica.crearPaquete();
    }

    /**
     * Método para crear un paquete tipo Caja Mediana.
     *
     * @return El paquete tipo Caja Mediana creado.
     */
    @Override
    public Paquete crearCajaMediana() {
        return crearCajaMediana.crearPaquete();
    }

    /**
     * Método para crear un paquete tipo Caja Grande.
     *
     * @return El paquete tipo Caja Grande creado.
     */
    @Override
    public Paquete crearCajaGrande() {
        return crearCajaGrande.crearPaquete();
    }

    /**
     * Método para obtener el servicio estándar.
     *
     * @return El servicio estándar.
     */
    @Override
    public Estandar getEstandar() {
        return servicioEstandar;
    }

    /**
     * Método para obtener el servicio express.
     *
     * @return El servicio express.
     */
    @Override
    public Express servicioExpress() {
        return servicioExpress;
    }

    /**
     * Método para crear un transporte tipo Dron.
     *
     * @return El transporte tipo Dron creado.
     */
    @Override
    public Transporte crearDron() {
        return crearDron.crearTransporte();
    }

    /**
     * Método para crear un transporte tipo Bicicleta.
     *
     * @return El transporte tipo Bicicleta creado.
     */
    @Override
    public Transporte crearBicicleta() {
        return crearBicicleta.crearTransporte();
    }

    /**
     * Método para crear un transporte tipo Motocicleta.
     *
     * @return El transporte tipo Motocicleta creado.
     */
    @Override
    public Transporte crearMotocicleta() {
        return crearMotocicleta.crearTransporte();
    }

    /**
     * Método para crear un transporte tipo Carro.
     *
     * @return El transporte tipo Carro creado.
     */
    @Override
    public Transporte crearCarro() {
        return crearCarro.crearTransporte();
    }
}
