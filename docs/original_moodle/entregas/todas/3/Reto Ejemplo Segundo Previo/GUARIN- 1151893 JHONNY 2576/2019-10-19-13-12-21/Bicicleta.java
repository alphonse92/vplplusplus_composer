/**
 * Clase Bicicleta - Ejemplo de segundo parcial :D.
 *
 * @author (Jhonny Esneider Guarín Chavez - jhonnyesneidergcha@ufps.edu.co)
 * @version 0.003 :D
 */
public class Bicicleta extends Vehiculo{
    public Bicicleta(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
       super(placa, cedulaPropietario, hora, minuto,segundo);
       super.setTarifa(TARIFA_BICICLETA);
    }
}
