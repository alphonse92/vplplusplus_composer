/**
 * Clase Bicicleta - Examen Final POO I 2017-I.
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @Desarrolador (Génesis Daniela Vargas Jáuregui - genesisdanielavjau@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Bicicleta extends Vehiculo{
    public Bicicleta(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        super(placa,cedulaPropietario, hora, minuto, segundo);
        setTarifa(TARIFA_BICICLETA);
    }
}
