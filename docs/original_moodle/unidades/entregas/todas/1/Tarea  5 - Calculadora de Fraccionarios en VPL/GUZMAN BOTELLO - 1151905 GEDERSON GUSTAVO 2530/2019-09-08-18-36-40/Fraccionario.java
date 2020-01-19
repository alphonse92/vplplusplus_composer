 

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
        Fraccionario respuesta = new Fraccionario();
        respuesta.numerador = this.numerador*otro.denominador + this.denominador*otro.numerador;
        respuesta.denominador = this.denominador * otro.denominador;
        return respuesta;
    }//fin sumar

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        Fraccionario respuesta = new Fraccionario();
        respuesta.numerador = this.numerador*otro.denominador - this.denominador*otro.numerador;
        respuesta.denominador = this.denominador * otro.denominador;
        return respuesta;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        Fraccionario respuesta = new Fraccionario();
        respuesta.numerador = this.numerador*otro.numerador;
        respuesta.denominador = this.denominador*otro.denominador;
        return respuesta;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        Fraccionario respuesta = new Fraccionario();
        respuesta.numerador = this.numerador*otro.denominador;
        respuesta.denominador = this.denominador*otro.numerador;
        return respuesta;
    }//fin dividir 
    
    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        int resto = 0;
        int min = Math.min(this.numerador, this.denominador);
        int max = Math.max(this.numerador, this.denominador);
        while (min != 0){
            resto = max % min;
            max = min;
            min = resto;
            }
    }
       //COMPLETE SIMPLIFICAR

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

