/**
 * Clase Moto - Examen Final POO I 2017-I.
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Moto  extends Vehiculo{
    
    public Moto(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        //COMPLETE
        super(placa, cedulaPropietario, hora, minuto, segundo);
        super.setTarifa(TARIFA_MOTO);
    }
    
   
}
