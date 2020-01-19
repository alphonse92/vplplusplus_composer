/**
 * Clase Bicicleta - Examen Final POO I 2017-I.
 *
 * @author (Daniela Juliana Sanchez Bayona - danielajulianasbay@ufps.edu.co)
 
 */
public class Bicicleta extends Vehiculo{
    
    public Bicicleta(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
       //COMPLETE
       super(placa, cedulaPropietario, hora, minuto, segundo);
       setTarifa(TARIFA_BICICLETA);
    }
    
   
}
