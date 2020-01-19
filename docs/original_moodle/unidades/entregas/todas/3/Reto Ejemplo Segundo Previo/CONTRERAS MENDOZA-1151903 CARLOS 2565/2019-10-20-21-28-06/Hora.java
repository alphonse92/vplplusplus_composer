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
        this(23, 0, 0);

    }


    public Hora(int horas, int minutos, int segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;

    }

    public boolean esHoraValida() {
         return segundos >= 0 && segundos <= 59 && minutos >= 0 && minutos <= 59 && horas >= 0 && horas <= 23;

    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
      return (double)restarEnSegundos(otra) / 60D / 60D;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
         long diferencia = 0L;
        long h = 0L;
        long m = 0L;
        long s = 0L;
        if(esMenor(other))
            diferencia = other.restarEnSegundos(this) * -1L;
        else
        if(!esIgual(other))
        {
            h = horas - other.horas - 1;
            m = (60 - other.minutos - 1) + minutos;
            s = (60 - other.segundos) + segundos;
            diferencia = h * 60L * 60L + m * 60L + s;
        }
        return diferencia;

    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
       return horas == other.horas && minutos == other.minutos && segundos == other.segundos;

    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
                boolean esMenor = false;
        if(!esIgual(other))
            if(horas == other.horas)
            {
                if(minutos == other.minutos)
                    esMenor = segundos < other.segundos;
                else
                    esMenor = minutos < other.minutos;
            } else
            {
                esMenor = horas < other.horas;
            }
        return esMenor;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        return !esIgual(other) && !esMenor(other);
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
