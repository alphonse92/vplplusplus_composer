
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
