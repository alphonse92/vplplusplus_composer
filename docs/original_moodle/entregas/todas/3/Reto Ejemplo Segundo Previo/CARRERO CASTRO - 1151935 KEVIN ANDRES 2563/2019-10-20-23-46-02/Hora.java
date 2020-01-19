
/**

 * KEVIN ANDRES CARRERO CASTRO - 1151935 - kevinandresccas@ufps.edu.co
 */
public class Hora {

    /**
     * Indica la cantidad de segundos de la hora: entre 0 y 59
     */
    protected int segundos;

    /**
     * Indica la cantidad de minutos de la hora: entre 0 y 59
     */
    protected int minutos;

    /**
     * Indica la cantidad de horas de la hora: entre 1 y 12
     */
    protected int horas;

    /**
     * Constructor por defecto con la media noche
     */
    public Hora() {
        //COMPLETE
        horas = 0;
        minutos = 0;
        segundos = 0;
    }


    public Hora(int horas, int minutos, int segundos) {
       //COMPLETE
       this.horas = horas;
       this.minutos = minutos;
       this.segundos = segundos;
    }

    public boolean esHoraValida() {
        //COMPLETE
        boolean validez = horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59;
        return validez;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
      //COMPLETE
      double diferencia = restarEnSegundos(otra) / 3600d;
      return (diferencia < 0) ? diferencia * -1 : diferencia;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
        //COMPLETE
        long segundosThis = this.horas*3600 + this.minutos*60 + this.segundos;
        long segundosOther = other.horas*3600 + other.minutos*60 + other.segundos;
        return segundosThis - segundosOther;
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
       //COMPLETE
       boolean iguales = this.horas == other.horas && this.minutos == other.minutos && this.segundos == other.segundos;
       return iguales;
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        //COMPLETE
        long diferencia = this.restarEnSegundos(other);
        boolean esMenor = diferencia < 0;
        return esMenor;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        //COMPLETE
        long diferencia = this.restarEnSegundos(other);
        boolean esMayor = diferencia > 0;
        return esMayor;
    }

    /**
     * Metodo de acceso a la propiedad segundos
     */
    public int getSegundos() {
        return this.segundos;
    }//end method getSegundos

    /**
     * Metodo de modificación a la propiedad segundos
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }//end method setSegundos

    /**
     * Metodo de acceso a la propiedad minutos
     */
    public int getMinutos() {
        return this.minutos;
    }//end method getMinutos

    /**
     * Metodo de modificación a la propiedad minutos
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }//end method setMinutos

    /**
     * Metodo de acceso a la propiedad horas
     */
    public int getHoras() {
        return this.horas;
    }//end method getHoras

    /**
     * Metodo de modificación a la propiedad horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }//end method setHoras

}
