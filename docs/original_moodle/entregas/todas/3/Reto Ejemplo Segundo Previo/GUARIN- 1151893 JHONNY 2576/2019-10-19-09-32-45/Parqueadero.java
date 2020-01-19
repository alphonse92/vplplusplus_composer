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
            throw new RuntimeException("ERROR: El vehiculo con placas: " + vehiculo.getPlaca() + ", ya existe");
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
        Vehiculo vehiculo = null;
        int posicion = buscarVehiculo(placa);
        if(posicion != -1){
            vehiculo = vehiculosParqueados[posicion];
            this.vehiculosParqueados[posicion] = null;
            vehiculo.registrarSalida(hora, minuto, segundo);
            getHistorialVehiculos().add(vehiculo);
        }
        else throw new RuntimeException("ERROR: El vehiculo con placas: " + placa + ", no existe.");
        return vehiculo;
    }

    public int buscarVehiculo(String placa){
        int index = -1;
        for (int i=0; i < this.vehiculosParqueados.length && index == -1; i++) {
            if (this.vehiculosParqueados[i] != null && placa.equals(this.vehiculosParqueados[i].getPlaca())) {
                index = i;
            }
        } 
        return index;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double valorBruto = 0.0d;
        for(int j= 0; j<getHistorialVehiculos().size(); j++){
            valorBruto += this.historialVehiculos.get(j).getValorTotalServicio() / 1.19d;
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
