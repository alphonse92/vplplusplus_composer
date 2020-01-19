import java.util.ArrayList;

/**
 * Clase Parqueadero - Ejemplo de segundo parcial :D.
 *
 * @author (Jhonny Esneider Guarín Chavez - jhonnyesneidergcha@ufps.edu.co)
 * @version 0.003 :D
 */
public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;
    
    /**
     * Constructor que se encarga de inicializar el parquadero con el tamaño por defecto (30).
     */
    public Parqueadero() {
        this(30);
    }
    
    /**
     * Constructor que recibe la capacidad del parqueadero 
     * y se encarga de inicializar el parquadero con la capacidad recibida.
     */
    public Parqueadero(int capacidad) {
        vehiculosParqueados = new Vehiculo[capacidad];
        historialVehiculos = new ArrayList();
    }

    /**
     * Metodo que recibe un vehiculo y se encarga de comprobar el ingreso del vehiculo en el paqueadero.
     */
    public boolean ingresarVehiculo(Vehiculo vehiculo) {
        boolean ingresar = false;
        int posicion = buscarVehiculo(vehiculo.getPlaca());
        if (posicion == -1) {
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

    /**
     * Metodo que recibe la placa de un vehiculo y la hora de salida del vehiculo.
     * El metodo se escarga de buscar y de hacer el registro de salida del vehiculo, dejado la posicion
     * del vehiculo vacia y haciendo registro de la salida en el historialVehiculos.
     */
    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
        Vehiculo vehiculo = null;
        int posicion = buscarVehiculo(placa);
        if(posicion != -1){
            vehiculo = vehiculosParqueados[posicion];
            this.vehiculosParqueados[posicion] = null;
            vehiculo.registrarSalida(hora, minuto, segundo);
            getHistorialVehiculos().add(vehiculo);
        }
        return vehiculo;
    }

    /**
     * 
     * Recibe la placa del vehiculo como parametro y la busca dentro del vector de vehiculosParqueados.
     * Retorna la posicion del vehiculo encontrado y -1 en caso de que no lo encuentre.
     * 
     */
    public int buscarVehiculo(String placa){
        int index = -1;
        for (int i=0; i < this.vehiculosParqueados.length && index == -1; i++) {
            if (this.vehiculosParqueados[i] != null && placa.equals(this.vehiculosParqueados[i].getPlaca())) {
                index = i;
            }
        } 
        return index;
    }

    /**
     *
     *Regresa el valor total de las ganancias brutas, sin el impuesto del IVA(19%)
     *El parametro int tipoVehiculo no es necesario.
     *
     */
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
