
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
      this(30);
    }

    public Parqueadero(int capacidad) {
     //COMPLETE
     vehiculosParqueados = new Vehiculo[capacidad];
     historialVehiculos = new ArrayList();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        //COMPLETE
        boolean ingreso = false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if (posicion != -1) throw new RuntimeException("Vehiculo existente");
        posicion = -1;
        for(int i = 0; i < vehiculosParqueados.length && posicion == -1; i++)
            if(vehiculosParqueados[i] == null)
            {
                vehiculosParqueados[i] = vehiculo;
                posicion = i;
                ingreso=true;
            }
         if(posicion == -1)
            throw new RuntimeException("No hay cupo");
        return ingreso;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      //COMPLETE
      int posicion = buscarVehiculo(placa);
      Vehiculo vehiculo = null;
      if(posicion != -1)
      {
            vehiculo = vehiculosParqueados[posicion];
            vehiculo.registrarSalida(hora, minuto, segundo);
            getHistorialVehiculos().add(vehiculo);
            vehiculosParqueados[posicion] = null;
        } else
        {
            throw new RuntimeException("No existe el vehiculo");
        }
      return vehiculo;
    }

    public int buscarVehiculo(String placa) {
       //COMPLETE
       int posicion = -1;
        for(int i = 0; i < vehiculosParqueados.length && posicion == -1; i++)
            if(vehiculosParqueados[i] != null && placa.equals(vehiculosParqueados[i].getPlaca())){
                posicion = i;
            }

        return posicion;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
        double valorBruto = 0.0D;
        String tipos[] = {
            "CarroGrande", "CarroPequeno", "Moto", "Bicicleta"
        };
        if(tipoVehiculo >= 1 && tipoVehiculo <= 4){
            for(int i=0; i<historialVehiculos.size();i++){
                Vehiculo tmp = historialVehiculos.get(i);
                if(tmp.getClass().getName().equals(tipos[tipoVehiculo-1])){
                    valorBruto+=tmp.getValorTotalServicio()-(tmp.getValorTotalServicio())*0.19;
                }
            }
        }
        return valorBruto;
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
