
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
       historialVehiculos = new ArrayList<>();
       vehiculosParqueados = new Vehiculo[30];
    }

    public Parqueadero(int capacidad) {
     //COMPLETE
     vehiculosParqueados = new Vehiculo[capacidad];
    }
    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        //COMPLETE
        boolean ingreso=false;
        for(int i=0;i<vehiculosParqueados.length;i++){
         if(vehiculosParqueados[i]!=null ){
             vehiculosParqueados[i]=vehiculo;
             ingreso=true;
            }
        }
        return ingreso;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      //COMPLETE
      
      
      return null;
    }

    public int buscarVehiculo(String placa) {
       //COMPLETE
       return 0;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
        return 0;
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
