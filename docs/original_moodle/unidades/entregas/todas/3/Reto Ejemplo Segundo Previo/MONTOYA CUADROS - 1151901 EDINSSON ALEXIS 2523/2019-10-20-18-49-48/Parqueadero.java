import java.util.ArrayList;

/**
 * Codigo: 1151901
 * Nombre: Edinsson Montoya
 * Correo: edinssonalexismcua@ufps.edu.co
 */

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
        vehiculosParqueados = new Vehiculo[30];
        historialVehiculos = new ArrayList<Vehiculo>();
        //COMPLETE
    }

    public Parqueadero(int capacidad) {
        vehiculosParqueados = new Vehiculo[capacidad];
        historialVehiculos = new ArrayList<Vehiculo>();
        //COMPLETE
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        return false;//COMPLETE
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      return vehiculosParqueados[1];//COMPLETE
    }

    public int buscarVehiculo(String placa) {
       return 0;//COMPLETE
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        return 0;//COMPLETE
    }

    /**
     * @return the vehiculos
     */
    public Vehiculo[] getVehiculos() {
        return vehiculosParqueados;
    }

    /**
     * @return the historialVehiculos
     */
    public ArrayList<Vehiculo> getHistorialVehiculos() {
        return historialVehiculos;
    }
}
