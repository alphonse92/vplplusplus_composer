
/**
    Kevin Andres Carrero Castro [1151935] - kevinandresccas@ufps.edu.co
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
        horas = 0;
        minutos = 0;
        segundos = 0;
    }


    public Hora(int horas, int minutos, int segundos) {
       this.horas = horas;
       this.minutos = minutos;
       this.segundos = segundos;
    }

    public boolean esHoraValida() {
        boolean aux = false;
        if((horas > 0 && horas < 13)&&(minutos > 0 && minutos < 60)&&(segundos > 0 && segundos < 60))
            aux = true;
        return aux;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
      Hora resta;
      resta = new Hora();
      double aux = 0;
      resta.horas = this.horas - otra.horas;
      resta.minutos = this.minutos - otra.minutos;
      resta.segundos = this.segundos - otra.segundos;
      aux = (resta.horas)+(resta.minutos/60)+(resta.segundos/3600);
      return aux;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
      Hora resta;
      resta = new Hora();
      int aux = 0;
      resta.horas = this.horas - other.horas;
      resta.minutos = this.minutos - other.minutos;
      resta.segundos = this.segundos - other.segundos;
      aux = (resta.horas*3600)+(resta.minutos*60)+(resta.segundos);
      return aux;
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
       return restar(other) == 0;
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        return restar(other) < 0;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        return restar(other) > 0;
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
