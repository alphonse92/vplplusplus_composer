
import java.util.ArrayList;
public class Parqueadero {

    private Vehiculo vehiculosParqueados[];
    private ArrayList<Vehiculo> historialVehiculos;
    int cont=0;
    public Parqueadero() {
        //COMPLETE
    }

    public Parqueadero(int capacidad) {
        //COMPLETE
        capacidad=Integer.MAX_VALUE;
        vehiculosParqueados = new Vehiculo[capacidad];
        historialVehiculos = new ArrayList<Vehiculo>();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo){
        //COMPLETE
        boolean ingreso=false;
        for(int i=0; i<vehiculosParqueados.length; i++){
        if(vehiculosParqueados[i].getPlaca()==vehiculo.getPlaca())
            ingreso=false;
        else
            if(vehiculosParqueados[i]==null){
                vehiculosParqueados[i]=vehiculo;
                ingreso=true;
            }
    }
        /*Vehiculo tmp[] = null;
        if(cont==vehiculosParqueados.length){
            tmp = new Vehiculo[vehiculosParqueados.length + vehiculosParqueados.length/2];
            for(int i=0; i<cont; i++){
                tmp[i]=vehiculosParqueados[i];
            }
            vehiculosParqueados=tmp;
        }
        
            for(int i=0; i<vehiculosParqueados.length; i++){
            if(vehiculosParqueados[i].getPlaca()==(vehiculo.getPlaca())){
                ingreso=false;
                //break;
            }
            else{
                vehiculosParqueados[i]=vehiculo; 
                ingreso=true;
                cont++;
            }
        }*/
        return ingreso;
    }
    



public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
//COMPLETE
return null;
}

public int buscarVehiculo(String placa){
//COMPLETE
int pos=-1;
for(int i=0; i<vehiculosParqueados. length && pos==-1 && vehiculosParqueados[i]!=null; i++){
    if(vehiculosParqueados[i].getPlaca().equals(placa))pos=i;
}
return pos;
}

public double getValorBrutoServicio(int tipoVehiculo){
//COMPLETE
return 0.0;
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
