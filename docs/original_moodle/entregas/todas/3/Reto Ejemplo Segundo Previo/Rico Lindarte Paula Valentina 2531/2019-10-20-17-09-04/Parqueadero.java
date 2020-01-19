import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
        this(30);
    }

    public Parqueadero(int capacidad) {
        vehiculosParqueados = new Vehiculo [capacidad];
        historialVehiculos = new ArrayList();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean agregado = false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if (posicion == -1) {
            for (int i = 0; i < this.vehiculosParqueados.length && !agregado; i++) {
                if (this.vehiculosParqueados[i] == null) {
                    this.vehiculosParqueados[i] = vehiculo;
                    agregado = true;
                }
            } 
        }
        return agregado;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        int posicion = buscarVehiculo(placa);
        Vehiculo eliminado = null;
        if(posicion != -1){
            eliminado = this.vehiculosParqueados[posicion];
            eliminado.registrarSalida(hora, minuto, segundo);
            getHistorialVehiculos().add(eliminado);        
            this.vehiculosParqueados[posicion] = null;
        }
        return eliminado;
    }

    public int buscarVehiculo(String placa) {
        int posicion = -1;
        for (int i = 0; i < this.vehiculosParqueados.length && posicion == -1; i++){
            if (this.vehiculosParqueados[i] != null && placa.equals(this.vehiculosParqueados[i].getPlaca())){
                posicion = i;
            }
        } 
        return posicion;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        int tarifa;
        double valorServicio = 0;
        switch(tipoVehiculo){
            case 1:
            tarifa = 10000; break;
            case 2:
            tarifa = 5000; break;
            case 3:
            tarifa = 2000; break;
            default:
            tarifa = 1000;
        }

        for(int i = 0; i<historialVehiculos.size(); i++){
            if(historialVehiculos.get(i).getTarifa() == tarifa) valorServicio += historialVehiculos.get(i).getValorTotalServicio()/1.19;
        }
        return valorServicio;
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