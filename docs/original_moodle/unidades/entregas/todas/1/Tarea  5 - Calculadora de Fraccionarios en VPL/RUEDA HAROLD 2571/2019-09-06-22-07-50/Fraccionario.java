
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
        int num,dem;
        if(denominador==otro.denominador){
            num=numerador+otro.numerador;
            dem=denominador;
        }
        else{
            num=numerador*otro.denominador+denominador*otro.numerador;
            dem=denominador*otro.denominador;
        }
        Fraccionario tres = new Fraccionario(num,dem);        
        return tres;
    }//fin sumar

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        int num,dem;
        if(denominador==otro.denominador){
            num=numerador-otro.numerador;
            dem=denominador;
        }
        else{
            num=numerador*otro.denominador-denominador*otro.numerador;
            dem=denominador*otro.denominador;
        }
        Fraccionario tres = new Fraccionario(num,dem);        
        return tres;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        Fraccionario tres = new Fraccionario(numerador*otro.numerador,denominador*otro.denominador);
        return tres;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        Fraccionario tres = new Fraccionario(numerador*otro.denominador,denominador*otro.numerador);
        return tres;
    }//fin dividir 

    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        int mcd=0;
        int u=Math.abs(numerador);
        int v=Math.abs(denominador);
        if(v==0){
            mcd=u;
        }
        else{    
            int r;
            while(v!=0){
                r=u%v;
                u=v;
                v=r;
            }
            mcd=u;
        }
        int dividir=u;
        numerador=numerador/dividir;
        denominador=denominador/dividir;
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

