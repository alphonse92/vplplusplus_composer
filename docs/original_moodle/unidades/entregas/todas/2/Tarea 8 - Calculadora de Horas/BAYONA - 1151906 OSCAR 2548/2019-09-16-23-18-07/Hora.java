/**
 * Clase Hora
 * 
 * @author (Milton Jesús Vera Contreras miltonjesusvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Hora
{
    /**Constante para el formato de 24 horas*/
    public static final String HH24 = "HH24";

    /**Constante para el formato de 12 horas con a.m. y p.m. */
    public static final String HH12 = "HH12";

    /**Indica el formato de hora HH12 o HH24*/
    protected String formato;

    /**Constante para la jornada entre la media noche y las 11 a.m. */
    public static final String AM = "a.m.";

    /**Constante para la jornada entre medio dia y las 11 p.m. */
    public static final String PM = "p.m.";

    /**Indica la jornada, su valor debe ser Hora.AM u Hora.PM*/
    protected String ampm;

    /**Indica la cantidad de horas de la hora: entre 1 y 12*/
    protected int horas;

    /**Indica la cantidad de minutos de la hora: entre 0 y 59*/
    protected int minutos;

    /**Indica la cantidad de segundos de la hora: entre 0 y 59*/
    protected int segundos;

    /**
     * Constructor 1 - por defecto con la media noche en formato HH12
     */
    public Hora() {
        //COMPLETE
        horas=12;
        minutos=0;
        segundos=0;
        formato = HH12;
        ampm = AM;
    }

    /**
     * Constructor 2 - por defecto con la media noche, segun el formato recibido como parámetro
     * @param formato el formato a usar HH12 o HH24.
     */
    public Hora(String formato) {
        //COMPLETE
        this.formato = formato;
        if (formato==HH12){
            horas=12; ampm = AM;}
        if (formato==HH24)
            horas=0;
        minutos=0;
        segundos=0;

    }

    /**
     * Constructor 3 - con parametros 1. Asume por defecto formato HH24
     * @param horas el valor inicial de las horas.
     * @param minutos el valor inicial de los minutos.
     * @param segundos el valor inicial de los segundos.
     */
    public Hora(int horas, int minutos, int segundos)  {
        //COMPLETE
        formato = HH24;
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    /**
     * Constructor 4 - con parametros. Asume por defecto HH12 y recibe la jornada AM/PM.
     * (es recomendable que los otros constructores siempre invoquen este constructor)
     * @param horas el valor inicial de las horas.
     * @param minutos el valor inicial de los minutos.
     * @param segundos el valor inicial de los segundos.
     * @param ampm Determina si la hora es AM o PM
     */
    public Hora(int horas, int minutos, int segundos, String ampm) {
        //COMPLETE
        this.formato = HH12;
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        if(ampm==AM || ampm==PM){
            this.ampm=ampm;}
    }

    /**
     * Constructor 5 - con parametros.
     * (es recomendable que los otros constructores siempre invoquen este constructor)
     * @param horas el valor inicial de las horas.
     * @param minutos el valor inicial de los minutos.
     * @param segundos el valor inicial de los segundos.
     * @param formato el formato a usar HH12 o HH24.
     * @param ampm aplica sólo cuando formato es HH12 para determinar si la hora es AM o PM.Si formato es HH24 se ignora.
     */
    public Hora(int horas, int minutos, int segundos, String formato, String ampm) {
        //COMPLETE
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.formato = formato;
        if(formato==HH12 && (ampm==AM || ampm==PM)){
            this.ampm=ampm;}
    }

    /**
     * Valida la hora integralmente. 
     * Es usada sólo por los constructores (deber&iacute;a ser private)
     * Se usa protected en lugar de private para las pruebas unitarias
     * @return false cuando los datos son incorrectos para formato, horas, minutos, segundos y ampm.
     */
    protected boolean esHoraValida(){
        boolean valida = false;
        if(formato==HH24 && horas>=0 && horas<=23 && minutos>=0 && minutos<=59 && segundos>=0 && segundos<=59) valida = true;
        if(formato==HH12 && horas>0 && horas<=12 && minutos>=0 && minutos<=59 && segundos>=0 && segundos<=59 &&(ampm==AM||ampm==PM)) valida = true;
        return valida;//COMPLETE
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH24 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH24
     */
    public Hora getHoraHH24(){
        Hora get24 = new Hora();
        if(this.formato==HH24){
            get24.formato = HH24;
            get24.horas=this.horas;
            get24.minutos=this.minutos;
            get24.segundos=this.segundos;
        }
        else{
        int a = 0;
        if(this.ampm == AM) a=0;
        if(this.ampm == PM) a=1;
        get24.formato = HH24;
        get24.horas = this.horas + 12*a;
        get24.minutos = this.minutos;
        get24.segundos = this.segundos;
        if (this.horas == 12) get24.horas-=12;
        }
        return get24;//COMPLETE
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH12 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH12
     */
    public Hora getHoraHH12(){
        Hora get12 = new Hora();
        if (this.formato== HH12){
            get12.formato = HH12;
            get12.horas=this.horas;
            get12.minutos=this.minutos;
            get12.segundos=this.segundos;
            if(this.ampm==AM || this.ampm==PM){
                get12.ampm=this.ampm;}
        }
        else{
            get12.horas = this.horas - 12;
            get12.formato = HH12;
            get12.minutos = this.minutos;
            get12.segundos = this.segundos;
            if (this.horas>=12) ampm=PM;
            else ampm=AM;
            if (this.horas <= 12) get12.horas+=12;
            if (get12.horas==0) get12.horas=12;
        }
        return get12;//COMPLETE//COMPLETE
    }

    /***
     * Resta this con la hora recibida y regresa la diferencia en segundos.
     * Si this > other regresa un valor positivo con la cantidad de segundos entre this y other.
     * Si this < other regresa un valor negativo con la cantidad de segundos entre this y other.
     * Si this == other regresa un valor cero.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public int restar(Hora other){
        return 0;//COMPLETE
    }

    /**
     * Averigua si this es igual a other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other){
        boolean comparar =false;
        
        return comparar;//COMPLETE
    }

    /**
     * Averigua si this es menor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other){
        return false;//COMPLETE
    }  

    /**
     * Averigua si this es mayor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other){
        return false;//COMPLETE
    }

    /**
     * Regresa un String que representa esta Hora
     */
    public String toString(){
        String str = "";
        return str;//COMPLETE
    }

    /**
     * Setter method formato
     * A diferencia de los otros GET/SET setFormato es muy importante y se sugiere
     * implementarlo...
     * Se encarga de convertir el formato HH12 a HH24 o HH24 a HH12
     * Ejemplos:
     * Si this es 00:05:06 y formato es HH12 debe retornar 12:05:06 a.m. en formato HH12
     * Si this es 12:01:02 a.m. y formato es HH24 debe retornar 00:01:02 en formato HH24
     * @param formato Puede ser HH24 o HH12
     */
    public void setFormato(String formato){
        //COMPLETE
    }//end method setFormato

    /**Metodo de acceso a la propiedad ampm*/
    public String getAmpm(){
        return this.ampm;
    }//end method getAmpm

    /**Metodo de modificación a la propiedad ampm*/
    public void setAmpm(String ampm){
        this.ampm = ampm;
    }//end method setAmpm

    /**Metodo de acceso a la propiedad segundos*/
    public int getSegundos(){
        return this.segundos;
    }//end method getSegundos

    /**Metodo de modificación a la propiedad segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }//end method setSegundos

    /**Metodo de acceso a la propiedad minutos*/
    public int getMinutos(){
        return this.minutos;
    }//end method getMinutos

    /**Metodo de modificación a la propiedad minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }//end method setMinutos

    /**Metodo de acceso a la propiedad horas*/
    public int getHoras(){
        return this.horas;
    }//end method getHoras

    /**Metodo de modificación a la propiedad horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }//end method setHoras

    /**Getter method formato*/
    public String getFormato(){
        return this.formato;
    }//end method getFormato

}