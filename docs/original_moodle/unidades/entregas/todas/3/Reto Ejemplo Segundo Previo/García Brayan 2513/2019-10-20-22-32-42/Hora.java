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
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public boolean esHoraValida() {
        boolean horaValida = ((this.segundos<60&&this.segundos>=0)&&(this.minutos>=0&&this.minutos<60)&&(this.horas<24&&this.horas>=0));
        return horaValida;
    }
   /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
        double restar= (this.restarEnSegundos(otra)/3600D);
        return restar;
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
        Hora m = new Hora(horas, minutos, segundos);
        long restarEnSegundos = (((3600)*(m.horas-other.horas))+((60)*(m.minutos-other.minutos))+(m.segundos-other.segundos));
        return restarEnSegundos;
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
        boolean esIgual = this.horas == other.horas && this.minutos == other.minutos && this.segundos == other.segundos;
        return esIgual;
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        boolean esMenor = this.horas< other.horas ||
            this.horas == other.horas && this.minutos< other.minutos ||
            this.horas == other.horas &&this.minutos == other.minutos &&
            this.segundos<other.segundos;
        return esMenor;  
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        boolean esMayor= !this.esIgual(other)&&!this.esMenor(other);
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

