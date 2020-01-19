
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
       vehiculosParqueados = new Vehiculo[30];
       historialVehiculos = new ArrayList<Vehiculo>();       
    }

    public Parqueadero(int capacidad) {
     //COMPLETE
     vehiculosParqueados = new Vehiculo[capacidad];
     historialVehiculos = new ArrayList<Vehiculo>();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        //COMPLETE
        boolean ingreso = false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if(posicion == -1){
            for(int i=0; !ingreso && i < vehiculosParqueados.length; i++){
                if(vehiculosParqueados[i] == null){
                    vehiculosParqueados[i] = vehiculo;
                    ingreso = true;
                }
            }
        }
        return ingreso;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      //COMPLETE
      Vehiculo vehiculo = null;
      int posicion = buscarVehiculo(placa);
      if(posicion != -1){
          vehiculo = vehiculosParqueados[posicion];
          vehiculosParqueados[posicion] = null;
          vehiculo.registrarSalida(hora, minuto, segundo);
          historialVehiculos.add(vehiculo);
        }
        return vehiculo;
    }

    public int buscarVehiculo(String placa) {
       //COMPLETE
       int esta = -1;
       for(int i=0; esta == -1 && i<vehiculosParqueados.length; i++)
           if(vehiculosParqueados[i] != null && vehiculosParqueados[i].getPlaca().equals(placa))
                esta = i;
       return esta;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
        double valorBrutoServicio = 0;                       
        for(int i = 0; i< historialVehiculos.size(); i++)
            valorBrutoServicio += historialVehiculos.get(i).getValorTotalServicio() / 1.19;
        return valorBrutoServicio;
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
