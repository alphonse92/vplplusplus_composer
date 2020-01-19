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
        int numerador;
        int denominador;
        if( this.denominador == otro.denominador){
            numerador = this.numerador + otro.numerador;
            denominador = this.denominador;
        }
        else{
            numerador = (this.numerador * otro.denominador + otro.numerador * this.denominador); 
            denominador = this.denominador * otro.denominador;
        }//fin sumar
        Fraccionario fraccionario3 = new Fraccionario ( numerador, denominador);
        return fraccionario3;
    }

    /**
     * Realiza la operacion resta = this - otro y retorna suma
     *
     * @param otro Un Fraccionario como sustraendo
     * @return this - otro
     */
    public Fraccionario restar(Fraccionario otro) {
        int numerador;
        int denominador;
        if( this.denominador == otro.denominador){
            numerador = this.numerador - otro.numerador;
            denominador = this.denominador;
        }
        else{
            numerador = (this.numerador * otro.denominador - otro.numerador * this.denominador); 
            denominador = this.denominador * otro.denominador;
        }//fin sumar
        Fraccionario fraccionario3 = new Fraccionario ( numerador, denominador);
        return fraccionario3;
    }//fin restar

    /**
     * Realiza la operacion producto = this * otro y retorna producto
     *
     * @param otro Un Fraccionario como factor
     * @return this * otro
     */
    public Fraccionario multiplicar(Fraccionario otro) {
        int numerador;
        int denominador;
        numerador = this.numerador * otro.numerador;
        denominador = this.denominador * otro.denominador;
        Fraccionario fraccionario3 = new Fraccionario (numerador, denominador);
        return fraccionario3;
    }//fin multiplicar

    /**
     * Realiza la operacion cociente = this / otro y retorna cociente
     *
     * @param otro Un Fraccionario como divisor
     * @return this / otro
     */
    public Fraccionario dividir(Fraccionario otro) {
        int numerador;
        int denominador;
        numerador =  this.numerador * otro.denominador;
        denominador = otro.numerador * this.denominador;
        Fraccionario fraccionario3 = new Fraccionario (numerador, denominador);
        return fraccionario3;
    }//fin dividir 

    /**
     * Simplifica el fraccionario
     */
    private int MCD(){
        int maximo, minimo, resto;
        maximo = Math.max (numerador, denominador);
        minimo = Math.min (numerador, denominador);
        while ( minimo != 0){
            resto = maximo % minimo;
            maximo = minimo;
            minimo = resto;
        }
        return maximo;
    }

    /**
     * Simplifica el fraccionario
     */
    public void simplificar(){
        int x = MCD ();
        numerador /= x;
        denominador /= x;       
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