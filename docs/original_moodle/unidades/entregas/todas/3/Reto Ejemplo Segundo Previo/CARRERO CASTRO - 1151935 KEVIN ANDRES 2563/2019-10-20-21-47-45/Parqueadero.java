

import java.util.ArrayList;

/**
    Kevin Andres Carrero Castro [1151935] - kevinandresccas@ufps.edu.co
*/

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
       //COMPLETE
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
        Vehiculo retirarVehiculo = new Vehiculo(placa, 0, hora, minuto, segundo);
        if(temp != null){
           for(int i = numero - 1 ; i<contadorMaterias-1 ; i++)
               materias[i] = materias[i+1];      
            
        materias[contadorMaterias-1] = null;
        contadorMaterias--;   
        }
        return temp;
    }

    public int buscarVehiculo(String placa) {
       if(this.placa > 0 && numero <= this.alumnos.length)
         return this.alumnos[numero-1];
      else
         return null;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        //COMPLETE
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
