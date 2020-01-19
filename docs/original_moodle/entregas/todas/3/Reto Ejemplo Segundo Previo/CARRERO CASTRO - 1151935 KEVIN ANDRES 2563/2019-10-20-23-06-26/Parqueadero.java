

import java.util.ArrayList;

/**
    Kevin Andres Carrero Castro [1151935] - kevinandresccas@ufps.edu.co
*/

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       
    }

    public Parqueadero(int capacidad) {
        this.vehiculosParqueados = new Vehiculo[capacidad];
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean ingresar = false;
        int contador = 0;
        Vehiculo vehiculo1 = vehiculo;
        if(contador < this.vehiculosParqueados.length){
           this.vehiculosParqueados[contador++] = vehiculo1;
           ingresar = true;
        }
        return ingresar;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        int aux = buscarVehiculo(placa);
        Vehiculo vehiculo = null;
        if(aux != -1 && vehiculosParqueados[aux].getHoraIngreso().esMenor(vehiculosParqueados[aux].getHoraSalida())){
           vehiculo = vehiculosParqueados[aux];
           vehiculosParqueados[aux] = null;
           vehiculo.registrarSalida(hora, minuto, segundo);
           getHistorialVehiculos().add(vehiculo);
        }
        return vehiculo;
    }

    public int buscarVehiculo(String placa) {
       int aux = -1;
        for(int i = 0 ; i < this.vehiculosParqueados.length && aux == -1 && vehiculosParqueados[i] != null ; i++){
            if(vehiculosParqueados[i].getPlaca().equals(placa))aux = 1;
        }
        return aux;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
        return 0 ;
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
