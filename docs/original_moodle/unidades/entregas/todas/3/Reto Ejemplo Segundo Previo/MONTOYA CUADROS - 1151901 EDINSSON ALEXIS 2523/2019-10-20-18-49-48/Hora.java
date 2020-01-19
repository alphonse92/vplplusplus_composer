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
    public Hora() {//COMPLETE
    }

    public Hora(int horas, int minutos, int segundos) {
       this.horas = horas;
       this.minutos = minutos;
       this.segundos = segundos;
       //COMPLETE
    }

    public boolean esHoraValida() {
        boolean hora = horas>=0 && horas<24;
        boolean minuto = minutos>=0 && minutos>60;
        boolean segundo = segundos>=0 && segundos<60;
        return hora && minuto && segundo;//COMPLETE
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
        double horaThis = (this.horas*3600)+(this.minutos*60)+(this.segundos);
        double horaOther = (otra.horas*3600)+(otra.minutos*60)+(otra.segundos); 
        return (horaThis-horaOther)/3600;//COMPLETE
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en segundos. Si
     * this > other regresa un valor positivo. Si this < other regresa un valor
     * negativo. Si this == other regresa un valor cero. @param other Otro
     * objeto tipo Hora, diferente de null.
     */
    public long restarEnSegundos(Hora other) {
        long horaThis = (this.horas*3600)+(this.minutos*60)+(this.segundos);
        long horaOther = (other.horas*3600)+(other.minutos*60)+(other.segundos); 
        return horaThis-horaOther;//COMPLETE
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
        return restarEnSegundos(other)==0;//COMPLETE
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        return restarEnSegundos(other)<0;//COMPLETE
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        return restarEnSegundos(other)>0;//COMPLETE
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
