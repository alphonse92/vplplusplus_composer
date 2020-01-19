public class Hora {
    protected int segundos;
    protected int minutos;
    protected int horas;

    /**
     * Constructor por defecto con la media noche
     */
    public Hora() {
        //COMPLETE
        horas=0;
        minutos=0;
        segundos=0;
    }

    public Hora(int horas, int minutos, int segundos) {
       //COMPLETE
       this.horas=horas;
       this.minutos=minutos;
       this.segundos=segundos;
    }

    public boolean esHoraValida() {
        //COMPLETE
        return (this.horas>=0&&this.horas<=23)&&(this.minutos>=0&&this.minutos<=59)&&
               (this.segundos>=0&&this.segundos<=59);
    }

    /**
     * *
     * Resta this con la hora recibida y regresa la diferencia en horas.
     */
    public double restar(Hora otra) {
      //COMPLETE
      double resta = Math.abs((this.horas*3600 + this.minutos*60 + this.segundos) - (otra.horas*3600 + otra.minutos*60 + otra.segundos));
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
      long resta = (this.horas*3600 + this.minutos*60 + this.segundos) - (other.horas*3600 + other.minutos*60 + other.segundos);
      return resta;
    }

    /**
     * Averigua si this es igual a other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other) {
       //COMPLETE
       return restarEnSegundos(other)==0;
    }

    /**
     * Averigua si this es menor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other) {
        //COMPLETE
        return restarEnSegundos(other)<0;
    }

    /**
     * Averigua si this es mayor que other.
     *
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other) {
        //COMPLETE
        return restarEnSegundos(other)>0;
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
