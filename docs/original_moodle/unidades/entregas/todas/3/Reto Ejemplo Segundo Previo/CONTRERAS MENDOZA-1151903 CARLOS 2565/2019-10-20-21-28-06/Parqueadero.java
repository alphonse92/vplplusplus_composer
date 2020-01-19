
import java.util.ArrayList;
import java.util.Iterator;

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
        boolean ingresar=false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if(posicion != -1) 
        throw new RuntimeException("Vehiculo ya existe");
        posicion = -1;
        for(int i = 0; i < vehiculosParqueados.length && posicion == -1; i++)
            if(vehiculosParqueados[i] == null)
            {
                vehiculosParqueados[i] = vehiculo;
                posicion = i;
        ingresar=true;
        }
         if(posicion == -1)
            throw new RuntimeException("No hay cupo");
        return ingresar;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
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
            throw new RuntimeException((new StringBuilder()).append("No existe el vehiculo de placas ").append(placa).toString());
        }
        return vehiculo;

    }

    public int buscarVehiculo(String placa) {
        int posicion = -1;
        for(int i = 0; i < vehiculosParqueados.length && posicion == -1; i++)
            if(vehiculosParqueados[i] != null && placa.equals(vehiculosParqueados[i].getPlaca()))
                posicion = i;

        return posicion;

    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double valorBruto = 0.0D;
        String tipos[] = {
            "CarroGrande", "CarroPequeno", "Moto", "Bicicleta"
        };
        if(tipoVehiculo >= 1 && tipoVehiculo <= 4)
        {
            Iterator iterator = getHistorialVehiculos().iterator();
            do
            {
                if(!iterator.hasNext())
                    break;
                Vehiculo v = (Vehiculo)iterator.next();
                if(v.getClass().getName().equals(tipos[tipoVehiculo - 1]))
                    valorBruto += v.getValorTotalServicio() / 1.1899999999999999D;
            } while(true);
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
