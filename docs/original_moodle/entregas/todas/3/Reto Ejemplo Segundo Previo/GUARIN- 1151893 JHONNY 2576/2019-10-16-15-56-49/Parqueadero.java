
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
        this(30);
    }

    public Parqueadero(int capacidad) {
        vehiculosParqueados = new Vehiculo[capacidad];
        historialVehiculos = new ArrayList();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean ingresar = false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if (posicion != -1) {
            throw new RuntimeException("ERROR: El vehiculo ya existe");
        }
        else{
            for (int i=0; i < this.vehiculosParqueados.length && posicion == -1; i++) {
                if(vehiculosParqueados[i] == null){
                    vehiculosParqueados[i] = vehiculo;
                    posicion = i;
                    ingresar = true;
                }
            }
        }
        return ingresar;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        
        return null;
    }

    public int buscarVehiculo(String placa) {
        int index = -1;
        for (int i=0; i < this.vehiculosParqueados.length && index == -1; i++) {
            if (this.vehiculosParqueados[i] != null && placa.equals(this.vehiculosParqueados[i].getPlaca())) {
                index = i;
            }
        } 
        return index;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        
        return 0.0d;
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
