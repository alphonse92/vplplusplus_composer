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
    public Fraccionario sumar(Fraccionario otro ) {
        int numerador = 0, denominador = 0;
        if(otro.denominador != this.denominador){
            numerador = this.numerador * otro.denominador + this.denominador * otro.numerador;
            denominador = this.denominador * otro.denominador;
        }
        else numerador = this.numerador + otro.numerador;
        Fraccionario resultado = new Fraccionario(numerador, denominador);
        return resultado;
    }//fin sumar

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        int numerador = 0, denominador = 0;
        if(otro.denominador != this.denominador){
            numerador = this.numerador * otro.denominador - this.denominador * otro.numerador;
            denominador = this.denominador * otro.denominador;
        }
        else numerador = this.numerador - otro.numerador;
        Fraccionario resultado = new Fraccionario(numerador, denominador);
        return resultado;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        int numerador = this.numerador * otro.numerador;
        int denominador = this.denominador * otro.denominador;
        Fraccionario resultado = new Fraccionario (numerador, denominador);
        return resultado;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        int numerador = this.numerador * otro.denominador;
        int denominador = this.denominador * otro.numerador;
        Fraccionario resultado = new Fraccionario(numerador, denominador);
        return resultado;
    }//fin dividir 
    
    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        int mcd = calcularMcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }
    
    public int calcularMcd(int _numerador, int _denominador){
        int numerador = Math.abs(_numerador);
        int denominador = Math.abs(_denominador);
        int resto;
        while (denominador != 0) {
            resto = numerador % denominador;
            numerador = denominador;
            denominador = resto;
        }
        return numerador;
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