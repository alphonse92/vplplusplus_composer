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
        horas = 12;
        minutos = 0;
        segundos = 0;   
        ampm = AM;
        formato = HH12;
    }

    /**
     * Constructor 2 - por defecto con la media noche, segun el formato recibido como parámetro
     * @param formato el formato a usar HH12 o HH24.
     */
    public Hora(String formato) {  
        this.formato = formato;
        if (formato == HH24){ 
            horas = 0;
        }else {
            horas = 12;
            ampm = AM;
        }
        //COMPLETE
    }

    /**
     * Constructor 3 - con parametros 1. Asume por defecto formato HH24
     * @param horas el valor inicial de las horas.
     * @param minutos el valor inicial de los minutos.
     * @param segundos el valor inicial de los segundos.
     */
    public Hora(int horas, int minutos, int segundos)  {  
        this(horas,minutos,segundos,HH24,null);
        //COMPLETE
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
        this(horas,minutos,segundos,HH12,ampm);

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
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.formato = formato;
        if(this.formato == HH12)
            this.ampm = ampm;
        else 
            this.ampm = null;
        //COMPLETE
    }

    /**
     * Valida la hora integralmente. 
     * Es usada sólo por los constructores (deber&iacute;a ser private)
     * Se usa protected en lugar de private para las pruebas unitarias
     * @return false cuando los datos son incorrectos para formato, horas, minutos, segundos y ampm.
     */
    protected boolean esHoraValida(){
        boolean validarFormato = formato == HH12; 
        boolean horas24 = (horas < 24 && horas >= 0);
        boolean horas12 = (horas >= 1 && horas <= 12);
        boolean validarHH12 = (validarFormato) && (ampm == AM || ampm == PM);
        boolean validarSegundosYMinutos = (segundos >= 0 && segundos < 60) && (minutos >= 0 && minutos < 60);  
        boolean horaValida = (horas12) && (validarSegundosYMinutos && validarHH12) 
            || ((formato == HH24 && (horas24)) && validarSegundosYMinutos);
        return horaValida;       
        //COMPLETE
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH24 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH24
     */
    public Hora getHoraHH24(){
        Hora hr = new Hora(horas, minutos,segundos,formato,null);
        hr.setFormato(hr.HH24);
        return hr;//COMPLETE
    }

    /**
     * Regresa un nuevo objeto Hora en formato HH12 con los mismos datos de this
     * @return un nuevo objeto copia de this en formato HH12
     */
    public Hora getHoraHH12(){
        Hora hr = new Hora(horas,minutos,segundos,formato,ampm);
        hr.setFormato(hr.HH12);
        return hr;//COMPLETE
    }

    /***
     * Resta this con la hora recibida y regresa la diferencia en segundos.
     * Si this > other regresa un valor positivo con la cantidad de segundos entre this y other.
     * Si this < other regresa un valor negativo con la cantidad de segundos entre this y other.
     * Si this == other regresa un valor cero.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public int restar(Hora other){
        Hora hr = new Hora(horas, minutos, segundos, formato, ampm); 
        other.setFormato(other.HH24);
        hr.setFormato(hr.HH24);
        int restarHoras = hr.horas - other.horas;
        int restarMinutos = hr.minutos - other.minutos;
        int restarSegundos = hr.segundos - other.segundos;
        int restaTotal = restarSegundos + restarMinutos * 60 + restarHoras * 3600; 
        return restaTotal;
        //COMPLETE
    }

    /**
     * Averigua si this es igual a other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esIgual(Hora other){
        Hora hr = new Hora(horas, minutos, segundos, formato, ampm); 
        other.setFormato(other.HH24);
        hr.setFormato(hr.HH24);  
        return hr.horas == other.horas && hr.minutos == other.minutos && hr.segundos == other.segundos;//COMPLETE
    }

    /**
     * Averigua si this es menor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMenor(Hora other){
        return (!esMayor(other) && !esIgual(other));
        //COMPLETE
    }  

    /**
     * Averigua si this es mayor que other.
     * @param other Otro objeto tipo Hora, diferente de null.
     */
    public boolean esMayor(Hora other){
        boolean esMayor = false;
        Hora hr = new Hora(horas, minutos, segundos, formato, ampm); 
        other.setFormato(other.HH24);
        hr.setFormato(hr.HH24);   
        return hr.horas > other.horas || hr.horas == other.horas && hr.minutos == other.minutos && hr.segundos > other.segundos
        || hr.horas == other.horas && hr.minutos > other.minutos;
        //COMPLETE 
    }

    /** 
     * Regresa un String que representa esta Hora
     */
    public String toString(){
        String hora ="La hora es: ";
        hora += horas +":"+ minutos+":"+segundos;
        return hora;//COMPLETE
    }

    /**
     * Setter method formato
     * A diferencia de los otros GET/SET setFormato es muy importante y se sugiere
     * implementarlo...
     * Se encarga de convertir el formato HH12 a HH24 o HH24 a HH12
     * Ejemplos:
     * Si this es 00:05:06 y formato s eHH12 debe retornar 12:05:06 a.m. en formato HH12
     * Si this es 12:01:02 a.m. y formato es HH24 debe retornar 00:01:02 en formato HH24
     * @param formato P uede ser HH24 o HH12
     */
    public void setFormato(String formato){
        if(formato == HH24 && this.formato == HH12){
            if(horas == 12 && ampm == AM){
                horas = 0;
            }
            else if(horas >= 0 && horas <= 11 && ampm == AM){
                horas = horas;  
            } 
            else if(horas >= 0 && horas <= 11 && ampm == PM){
                horas = horas+12;
            }
            else if(horas == 12 && ampm == PM){
                horas = horas;
            }
            ampm = null;
        }
        else if(formato == HH12 && this.formato == HH24){
            if(horas == 0){
                horas=12;
                ampm=AM;
            }
            else if(horas >0 && horas < 12){
                horas = horas;
                ampm=AM;         
            }
            else if(horas == 12){
                horas = horas;
                ampm = PM;
            }
            else if(horas >= 13 && horas <= 24){ 
                horas=horas-12;
                ampm=PM;
            }           
        }   
        this.formato = formato;   
        /* if(formato==HH12 && this.formato==HH24){ //pasarlo a HH12
        if(horas==0){
        horas=12;
        ampm=Hora.AM;
        }
        else if(horas>=1&&horas<=11){
        ampm=Hora.AM;         
        }
        else if(horas==12){
        ampm=Hora.PM;
        }
        else if(horas>=13&&horas<=24){ 
        horas-=12; 
        ampm=Hora.PM;
        }           
        }
        else if(formato==HH24&&this.formato==HH12){ // pasarlo a HH24
        if(horas==12 && ampm==AM){
        horas-=12;
        }else if(horas>0 && horas< 12 && ampm == AM){
        horas=horas;  
        }else if(horas==12 && ampm==PM){
        horas=horas;
        }else if(horas > 0 && horas < 12 && ampm == PM){
        horas+=12;
        }
        ampm=null;
        }  
        this.formato=formato; 
         */
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
    }
    //end method getFormato
}
