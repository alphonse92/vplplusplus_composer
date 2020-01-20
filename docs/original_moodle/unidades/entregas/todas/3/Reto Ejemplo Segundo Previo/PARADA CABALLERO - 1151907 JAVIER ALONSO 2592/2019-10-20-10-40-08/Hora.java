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
        if (!esHoraValida()) {
            throw new RuntimeException("Hora no valida (rango horas [1,23], rango minutos y segundos [0,59]");
        }
    }

    public boolean esHoraValida() {
        return (this.segundos >= 0 && this.segundos <= 59 && this.minutos >= 0 && this.minutos <= 59 && this.horas >= 0 && this.horas <= 23); }       

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
        return restarEnSegundos(otra) / 60.0D / 60.0D;
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
        long h = 0L, m = 0L, s = 0L;
        if (esMenor(other)) {
            diferencia = other.restarEnSegundos(this) * -1L;
        } else if (!esIgual(other)) {
            h = (this.horas - other.horas - 1);
            m = (60 - other.minutos - 1 + this.minutos);
            s = (60 - other.segundos + this.segundos);
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
        return (this.horas == other.horas && this.minutos == other.minutos && this.segundos == other.segundos); 
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        boolean esMenor = false;
        if (!esIgual(other)) {
            if (this.horas == other.horas) {
                if (this.minutos == other.minutos) {
                    esMenor = (this.segundos < other.segundos);
                } else {
                    esMenor = (this.minutos < other.minutos);
                } 
            } else {
                esMenor = (this.horas < other.horas);
            } 
        }
        return esMenor;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        return (!esIgual(other) && !esMenor(other));
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