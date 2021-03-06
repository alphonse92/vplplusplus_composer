
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;

    public Parqueadero() {
        this.vehiculosParqueados=new Vehiculo[30];
        historialVehiculos=new ArrayList<>();
    }

    public Parqueadero(int capacidad) {
        this.vehiculosParqueados = new Vehiculo[capacidad];
        this.historialVehiculos = new ArrayList();
    }

    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean parquear=false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if(posicion==-1) 
        {
            for (int i= 0; i < (this.vehiculosParqueados.length) && (posicion == -1); i++) 
            {
                if (this.vehiculosParqueados[i] == null)
                {
                    this.vehiculosParqueados[i] = vehiculo;
                    posicion = i;
                    parquear = true;
                }
            }
        }
        return parquear;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        int posicion = buscarVehiculo(placa);
        Vehiculo vehiculo = null;
        if (posicion != -1)
        {
            vehiculo = this.vehiculosParqueados[posicion];
            vehiculo.registrarSalida(hora, minuto, segundo);
            this.historialVehiculos.add(vehiculo);
            this.vehiculosParqueados[posicion] = null;
        }

        return vehiculo;
    }

    public int buscarVehiculo(String placa) {
        int posicion = -1;
        for (int i = 0 ;(i<this.vehiculosParqueados.length) && (posicion == -1); i++) 
        {
            if ((this.vehiculosParqueados[i] != null) && (placa.equals(this.vehiculosParqueados[i].getPlaca()))) 
            {
                posicion = i;
            }
        }
        return posicion;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double valorBruto = 0.0D;
        String[] tipos = { "CarroGrande", "CarroPequeno", "Moto", "Bicicleta" };
        if ((tipoVehiculo > 0) && (tipoVehiculo < 5)) 
        {
            for (Vehiculo v : getHistorialVehiculos()) 
            {
                if (v.getClass().getName().equals(tipos[(tipoVehiculo - 1)])) 
                {
                    valorBruto += v.getValorTotalServicio() / 1.19D;
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
