
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
    }

    public Parqueadero(int capacidad) {
     //COMPLETE
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        //COMPLETE
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      //COMPLETE
    }

    public int buscarVehiculo(String placa) {
       //COMPLETE
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
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
