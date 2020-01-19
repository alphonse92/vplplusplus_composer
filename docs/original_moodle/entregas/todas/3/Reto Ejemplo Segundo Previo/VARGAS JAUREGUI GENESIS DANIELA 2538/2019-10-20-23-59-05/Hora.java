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
        this(23,59,59);
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public boolean esHoraValida() {
        boolean valida = false;
        if( this.horas >= 0 && this.horas <= 23 && this.minutos >= 0 && this.minutos <=59 && this.segundos>= 0 && this.segundos <= 59)
            valida = true;
        return valida;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
        double resta = 0;
        resta = restarEnSegundos(otra)/3600d;
        return resta;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
        long restarS = 0;
        restarS = (this.horas * 3600 - other.horas * 3600 ) + (this.minutos * 60 - other.minutos * 60) +
        (this.segundos - other.segundos);
        return restarS;
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
        boolean igual = false;
        igual = this.horas == other.horas && this.minutos == other.horas && this.segundos == other.segundos;
        return igual;
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        boolean menor = false;
        if ( (this.horas < other.horas) || (this.horas == other.horas && this.minutos < other.minutos) || 
        (this.horas == horas && this.minutos == other.minutos && this.segundos < other.segundos) )  menor = true;
        else menor = false;
        return menor;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        boolean mayor = false;
        if((this.horas > other.horas) || (this.horas == other.horas && this.minutos > other.minutos) || 
        (this.horas == horas && this.minutos == other.minutos && this.segundos > other.segundos))  mayor = true;
        else mayor = false;
        return mayor;
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
