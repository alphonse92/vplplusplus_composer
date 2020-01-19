
/**
 * Una clase sencilla para realizar calculos con fracciones.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Fraccionario {

    /**
     * Numerador
     */
    private int numerador;

    /**
     * Denominador
     */
    private int denominador;

    /**
     * Constructor default
     */
    public Fraccionario() {
        this.numerador = 0;
        this.denominador = 1;
    }//fin constructor default

    /**
     * Constructor 
     * @param numerador valor inicial de numerador
     * @param denominador valor inicial de denominador
     */
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }//fin constructor parametrizado

    /**
     * Realiza la operacion suma = this + otro y retorna suma
     *
     * @param otro Un Fraccionario como sumando
     * @return this + otro
     */
    public Fraccionario sumar(Fraccionario otro) {
        int numerador1, denominador1;
        if(denominador==otro.denominador){
            numerador1 = numerador + otro.denominador;
            denominador1 = denominador;
        }
        else{
            numerador1 = numerador * otro.denominador + denominador * otro.numerador;
            denominador1 = denominador * otro.denominador;
        }
        Fraccionario f3 = new Fraccionario(numerador1, denominador1);
        return f3;
    }//fin sumar

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        int numerador1, denominador1;
        if(denominador==otro.denominador){
            numerador1 = numerador - otro.denominador;
            denominador1 = denominador;
        }
        else{
            numerador1 = numerador * otro.denominador - denominador * otro.numerador;
            denominador1 = denominador * otro.denominador;
        }
        Fraccionario f3 = new Fraccionario(numerador1, denominador1);
        return f3;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        int numerador1, denominador1;
        numerador1 = numerador * otro.numerador;
        denominador1 = denominador * otro.denominador;

        Fraccionario f3 = new Fraccionario(numerador1, denominador1);
        return f3;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        int numerador1, denominador1;
        numerador1 = numerador * otro.denominador;
        denominador1 = denominador * otro.numerador;

        Fraccionario f3 = new Fraccionario(numerador1, denominador1);
        return f3;
    }//fin dividir 

    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        
    }
    
    private int mcd(){
     int u=Math.abs(numerador);
     int v=Math.abs(denominador);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
}
    //Start GetterSetterExtension Code
    /**Getter method numerador*/
    public int getNumerador(){
        return this.numerador;
    }//end method getNumerador

    /**Setter method numerador*/
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }//end method setNumerador

    /**Getter method denominador*/
    public int getDenominador(){
        return this.denominador;
    }//end method getDenominador

    /**Setter method denominador*/
    public void setDenominador(int denominador){
        this.denominador = denominador;
    }//end method setDenominador
    
    //End GetterSetterExtension Code
}//End class !

