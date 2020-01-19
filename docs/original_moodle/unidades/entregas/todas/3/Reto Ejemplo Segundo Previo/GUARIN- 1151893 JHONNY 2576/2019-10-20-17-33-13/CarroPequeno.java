/**
 * Clase CarroPequeno - Ejemplo de segundo parcial :D.
 *
 * @author (Jhonny Esneider Guarín Chavez - jhonnyesneidergcha@ufps.edu.co)
 * @version 0.003 :D
 */
public class CarroPequeno  extends Vehiculo{
    public CarroPequeno(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
       super(placa, cedulaPropietario, hora, minuto,segundo);
       setTarifa(TARIFA_CARRO_PEQUENO);
    }
}
