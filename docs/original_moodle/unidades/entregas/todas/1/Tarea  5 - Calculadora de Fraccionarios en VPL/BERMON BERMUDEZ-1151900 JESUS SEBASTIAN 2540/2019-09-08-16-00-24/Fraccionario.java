 

/**
 * Una clase sencilla para realizar calculos con fracciones.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Fraccionario{

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
        Fraccionario f3=new Fraccionario((numerador*otro.denominador)+(denominador*otro.numerador),(otro.denominador*denominador));        
        return f3;
    }//fin sumar

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        Fraccionario f3=new Fraccionario((numerador*otro.denominador)-(denominador*otro.numerador),(otro.denominador*denominador));        
        return f3;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        Fraccionario f3=new Fraccionario(otro.numerador * numerador , otro.denominador * denominador );
        return f3;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        Fraccionario f3=new Fraccionario(numerador * otro.denominador , denominador * otro.numerador );
        return f3;
    }//fin dividir 
    
    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        
        System.out.println("Simplificando...");
        int cont = 2;
        while (cont <= Math.abs(numerador) && cont <= Math.abs(denominador)) {
            if (numerador % cont == 0 && denominador % cont == 0) {
                numerador = numerador / cont;
                denominador = denominador / cont;
                
            }
            else
                cont++;
        }            
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

