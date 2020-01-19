/**
 * Clase Hora
 * 
 * @author (Harold Rueda) 
 * @version 16/09/19
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
        this.horas=12;
        this.minutos=0;
        this.segundos=0;
        this.ampm=AM;
        this.formato=HH12;
    }

    /**
     * Constructor 2 - por defecto con la media noche, segun el formato recibido como parámetro
     * @param formato el formato a usar HH12 o HH24.
     */
    public Hora(String formato) {
        if(formato==HH12){
            this.horas=12;
            this.minutos=00;
            this.segundos=00;
            this.ampm=AM;
            this.formato=formato;
        }
        if(formato==HH24){
            this.horas=00;
            this.minutos=00;
            this.segundos=00;
            this.formato=formato;
        }
    }

    /**
     * Constructor 3 - con parametros 1. Asume por defecto formato HH24
     * @param horas el valor inicial de las horas.
     * @param minutos el valor inicial de los minutos.
     * @param segundos el valor inicial de los segundos.
     */
    public Hora(int horas, int minutos, int segundos)  {
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.formato=HH24;
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
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.ampm=ampm;
        this.formato=HH12;
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
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        if(formato==HH12){
            this.ampm=ampm;
        }        
        this.formato=formato;
    }

    /**
     * Valida la hora integralmente. 
     * Es usada sólo por los constructores (debería ser private)
     * Se usa protected en lugar de private para las pruebas unitarias
     * @return false cuando los datos son incorrectos para formato, horas, minutos, segundos y ampm.
     */
    protected boolean esHoraValida(){
        boolean valido=false;
        if(this.formato==HH12){
            valido=(this.horas>0&&this.horas<=12)&&(this.minutos>=0&&this.minutos<=59)&&
            (this.segundos>=0&&this.segundos<=59)&&(this.ampm==AM||this.ampm==PM);
        }
        if(this.formato==HH24){
            valido=(this.horas>=0&&this.horas<=23)&&(this.minutos>=0&&this.minutos<=59)&&
            (this.segundos>=0&&this.segundos<=59);
        }        
        return valido;
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH24 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH24
     */
    public Hora getHoraHH24(){
        if(this.formato==HH12) setFormato(HH24);
        Hora nuevaHora = new Hora(this.horas,this.minutos,this.segundos,this.formato,this.ampm);
        return nuevaHora;
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH12 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH12
     */
    public Hora getHoraHH12(){
        if(this.formato==HH24) setFormato(HH12);
        Hora nuevaHora = new Hora(this.horas,this.minutos,this.segundos,this.formato,this.ampm);
        return nuevaHora;
    }

    /***
     * Resta this con la hora recibida y regresa la diferencia en segundos.
     * Si this > other regresa un valor positivo con la cantidad de segundos entre this y other.
     * Si this < other regresa un valor negativo con la cantidad de segundos entre this y other.
     * Si this == other regresa un valor cero.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public int restar(Hora other){
        setFormato(this.HH24);
        if(other.formato==HH12){
            other.formato=HH24;
            if(other.ampm==PM){
                if(other.horas!=12) other.horas+=12;
            }
            else{
                if(other.horas==12) other.horas=0;
            }
        }        
        return (this.horas*3600-other.horas*3600)+(this.minutos*60-other.minutos*60)+(this.segundos-other.segundos);
    }

    /**
     * Averigua si this es igual a other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other){
        return restar(other)==0;
    }

    /**
     * Averigua si this es menor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other){
        return restar(other)<0;
    }  

    /**
     * Averigua si this es mayor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other){
        return restar(other)>0; 
    }

    /**
     * Regresa un String que representa esta Hora
     */
    public String toString(){
        String str = "";
        if (this.horas<10){
            str = "0" + this.horas + ":0" + this.minutos + ":0" + this.segundos + " " + ampm;
        }
        else if (this.horas>10 && this.horas<=12){
            str =  this.horas + ":" + this.minutos + ":" + this.segundos + " " + ampm;
        }
        else if (this.horas>12){
            str =  this.horas + ":" + this.minutos + ": " + this.segundos; 
        }
        return str;
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
        if(!(formato==this.formato)){
            if(formato==HH24){
                this.formato=HH24;
                if(this.ampm==PM){
                    if(this.horas!=12) this.horas+=12;                     
                }
                else{
                    if(this.horas==12) this.horas=0;
                }
            }
            else if(formato==HH12){
                this.formato=HH12;
                if(this.horas>=12){
                    this.ampm=PM;
                    if(this.horas!=12) 
                        this.horas-=12;                        
                }
                else{
                    this.ampm=AM;
                    if(this.horas==0) this.horas=12;
                }
            }
        }          
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