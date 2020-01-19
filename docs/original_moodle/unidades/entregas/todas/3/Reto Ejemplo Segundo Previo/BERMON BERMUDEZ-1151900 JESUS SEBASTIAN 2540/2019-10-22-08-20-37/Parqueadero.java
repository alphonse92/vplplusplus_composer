
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       this(30);
    }

    public Parqueadero(int capacidad) {        
        this.vehiculosParqueados=new Vehiculo [capacidad];
        this.historialVehiculos=new ArrayList<Vehiculo>();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        return true;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      return null;
    }

    public int buscarVehiculo(String placa) {
        int vehiculo=0;
        
       return vehiculo;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double totalValorBruto=0;
        Class clase=null;
        switch(tipoVehiculo){
            case 1: clase = CarroGrande.class; break;
            case 2: clase = CarroPequeno.class; break;
            case 3: clase = Moto.class; break;
            case 4: clase = Bicicleta.class; break;
            default: ;
        }
        for(Vehiculo v : historialVehiculos){
            if(v.getClass().equals(clase)) totalValorBruto+=v.getValorTotalServicio();
        }
        return totalValorBruto;
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
