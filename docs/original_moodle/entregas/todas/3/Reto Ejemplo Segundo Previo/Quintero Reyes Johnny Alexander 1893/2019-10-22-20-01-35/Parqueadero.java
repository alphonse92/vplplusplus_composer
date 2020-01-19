
import java.util.ArrayList;

public  class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
       vehiculosParqueados = new Vehiculo[30];
       historialVehiculos = new ArrayList<>();
       
    }

    public Parqueadero(int capacidad) {
     //COMPLETE
     vehiculosParqueados = new Vehiculo[capacidad];
     historialVehiculos = new ArrayList<Vehiculo>();
    }
    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        //COMPLETE
        boolean ingreso=false;
        int placa = buscarVehiculo(vehiculo.getPlaca());
        for(int i=0;i<vehiculosParqueados.length&&!ingreso;i++){
            if(vehiculosParqueados[i]==null&&placa==-1){
                vehiculosParqueados[i]=vehiculo;
                ingreso=true;
            }

        }
        return ingreso;
    }

    public  Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
       int posicion=buscarVehiculo(placa);
        Vehiculo tmp=null;
        if(posicion!=-1){
            tmp = vehiculosParqueados[posicion];
            tmp.registrarSalida(hora,minuto,segundo);
            historialVehiculos.add(vehiculosParqueados[posicion]);
            vehiculosParqueados[posicion]=null;
        }
        return tmp;
    }

    public int buscarVehiculo(String placa) {
       int posicionBuscar=-1;
        for(int i = 0; i<vehiculosParqueados.length&&posicionBuscar==-1;i++){
            if(vehiculosParqueados[i]!=null){
                if(vehiculosParqueados[i].getPlaca().equals(placa)){
                    posicionBuscar=i;
                }
            }
        }
        return posicionBuscar;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
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
