
import java.util.ArrayList;

public class Parqueadero {

    private Vehiculo[] vehiculosParqueados;
    private ArrayList<Vehiculo> historialVehiculos;
    protected int contador;

    public Parqueadero() {
       this(30);
    }

    public Parqueadero(int capacidad) {
      this.vehiculosParqueados=new Vehiculo [capacidad];
     this.historialVehiculos=new ArrayList<Vehiculo>();
     
     }
    
    /*
     *  El Parqueadero tiene una norma especial. Cada Vehículo que ingrese debe parquear en el primer lugar libre que exista, 
     *  según el orden marcado de 1 a N. El diagrama UML permite apreciar ésta condición. 
     *   El parqueadero tiene un tamaño máximo N. La GUI por defecto asume un tamaño de 30, pero el programa debe permitir cualquier
     *   tamaño. El parqueadero debe usar array simples [ ] para almacenar los carros parqueados. 
     */
    public boolean ingresarVehiculo(Vehiculo vehiculo) {
      return false;
    }

    public Vehiculo retirarVehiculo(String placa, int hora, int minuto, int segundo) {
      //COMPLETE
      
      return null;
    }

    public int buscarVehiculo(String placa) {
  
     int posicion = -1;
     for(int i = 0; i < this.vehiculosParqueados.length; i++){
      if(this.vehiculosParqueados[i].getPlaca().equals(placa)){
    posicion = i;
    break;
    }
    }
    return posicion;
    }

    public double getValorBrutoServicio(int tipoVehiculo){
        double totalValorBruto=0;
        Class clase=null;
        switch(tipoVehiculo){
            case 1: clase = CarroGrande.class; break;
            case 2: clase = CarroPequeno.class; break;
            case 3: clase = Moto.class; break;
            case 4: clase = Bicicleta.class; break;
            default: ;
        }
        for(Vehiculo v : historialVehiculos){
            if(v.getClass().equals(clase)) totalValorBruto+=v.getValorTotalServicio();
        }
        return totalValorBruto;
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
