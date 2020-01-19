/**
 * Clase CarroGrande - Examen Final POO I 2017-I.
 *
 * @author (Daniela Juliana Sanchez Bayona - danielajulianasbay@ufps.edu.co)
 */
public class CarroGrande  extends Vehiculo{
    
    public CarroGrande(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        //COMPLETE
       super(placa, cedulaPropietario, hora, minuto, segundo);
       setTarifa(TARIFA_CARRO_GRANDE);
    }
    
    
    
}
