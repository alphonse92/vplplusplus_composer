/**
 * Una clase sencilla para realizar calculos con fracciones.
 * @author (Oscar Diego Rodriguez Orduz - OscarDiegoRo@ufps.edu.co)
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
        Fraccionario sumanum = new Fraccionario();

        sumanum.numerador = (this.numerador * otro.denominador) + (this.denominador * otro.numerador);
        sumanum.denominador = this.denominador * otro.denominador;

        return sumanum;
    }//fin sumar
    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        Fraccionario restar = new Fraccionario () ;

        restar.numerador = (this.numerador * otro.denominador) - (this.denominador * otro.numerador);
        restar.denominador = this.denominador * otro.denominador;

        return restar;

    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        Fraccionario multiplicacion = new Fraccionario () ;

        multiplicacion.numerador = (this.numerador * otro.numerador);
        multiplicacion.denominador = this.denominador * otro.denominador;

        return multiplicacion;

    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        Fraccionario division = new Fraccionario () ;

        division.numerador = this.numerador * otro.denominador;
        division.denominador = this.denominador * otro.numerador;

        return division;

    }//fin dividir 

    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        int a = mcd (this.numerador, this.denominador);
       
        
        this.numerador = this.numerador/a;
        this.denominador = this.denominador / a;
    
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
    static int mcd(int a, int b) {
        int aux;
        while (b != 0){
            a %= b;
            aux = b;
            b = a;
            a = aux;
        }
        return a;
    }
    //End GetterSetterExtension Code
}//End class !
