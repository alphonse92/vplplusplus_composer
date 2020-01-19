
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
        vehiculosParqueados = new Vehiculo[30];
        historialVehiculos = new ArrayList<Vehiculo>();
    }

    public Parqueadero(int capacidad) {
        vehiculosParqueados = new Vehiculo[capacidad];
        historialVehiculos = new ArrayList<Vehiculo>();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean ingreso=false;
        int pla = buscarVehiculo(vehiculo.getPlaca());        
        for(int i=0;i<vehiculosParqueados.length&&!ingreso;i++){

            if(vehiculosParqueados[i]==null&&pla==-1){
                vehiculosParqueados[i]=vehiculo;
                ingreso=true;
            }

        }
        return ingreso;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        int pos=buscarVehiculo(placa);
        Vehiculo tmp=null;
        if(pos!=-1){
            tmp = vehiculosParqueados[pos];
            tmp.registrarSalida(hora,minuto,segundo);
            historialVehiculos.add(vehiculosParqueados[pos]);
            vehiculosParqueados[pos]=null;
        }
        return tmp;
    }

    public int buscarVehiculo(String placa) {
        int pos=-1;
        for(int c = 0; c<vehiculosParqueados.length&&pos==-1;c++){
            if(vehiculosParqueados[c]!=null){
                if(vehiculosParqueados[c].getPlaca().equals(placa)){
                    pos=c;
                }
            }
        }
        return pos;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double valorBruto=0;
        String tipos[] = {
            "CarroGrande", "CarroPequeno", "Moto", "Bicicleta"
        };
        if(tipoVehiculo>=1&&tipoVehiculo<=4){
            for(int i=0;i<historialVehiculos.size();i++){
                Vehiculo tmp = historialVehiculos.get(i);
                if(tmp.getClass().getName().equals(tipos[tipoVehiculo-1])){
                    valorBruto+=tmp.getValorTotalServicio()-(tmp.getTiempoServicio()*tmp.getTarifa())*0.19;
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
