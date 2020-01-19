/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Felipe Alferez Villamizar)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class CasaDeCambio {

    float precioDeCompra;
    float precioDeVenta;
    int bolivaresComprados;
    int bolivaresVendidos;
    float bolivaresEnCaja;
    float pesosEnCaja;

    //No requiere propiedades diferentes a las anteriores... No declare propiedades adicionales...

    /**
     * Default constructor
     */
    public CasaDeCambio() {
    }

    //COMPLETE GET 
    public float getPrecioDeCompra(){
        return precioDeCompra;
    }

    public float getPrecioDeVenta(){
        return precioDeVenta;
    }

    public int getBolivaresComprados(){
        return bolivaresComprados;
    }

    public int getBolivaresVendidos(){
        return bolivaresVendidos;
    }

    public float getBolivaresEnCaja(){
        return bolivaresEnCaja;
    }

    public float getPesosEnCaja(){
        return pesosEnCaja;
    }
    //No tiene sentido tener SET... piense, pregunte...

    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los previos de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        return precioDeVenta-precioDeCompra;//COMPLETE
    }

    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) {
        boolean precioValido;//COMPLETE
        this.precioDeCompra=precioDeCompra;
        this.precioDeVenta=precioDeVenta;
        if(precioDeCompra>0 && precioDeCompra<precioDeVenta){
            precioValido=true;
        }
        else{
            precioValido=false;
        }
        //COMPLETE
        return precioValido;
    }//fin cambiarPrecioDelBolivar

    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar;//COMPLETE
        bolivaresComprados+=cantidad;        
        pesosEnCaja -= cantidad*getPrecioDeCompra();
        if(pesosEnCaja > 0){
            puedeComprar=true;
            bolivaresEnCaja+=bolivaresComprados;
        }
        else{
            puedeComprar=false;
        }
        //COMPLETE
        return puedeComprar;
    }//fin comprarBolivares

    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        boolean puedeVender;//COMPLETE
        bolivaresVendidos+=cantidad;
        pesosEnCaja += cantidad*getPrecioDeVenta();
        if(bolivaresEnCaja>=bolivaresVendidos){
            puedeVender=true;
            bolivaresEnCaja-=bolivaresVendidos;
        }
        else{
            puedeVender=false;
        }
        //COMPLETE
        return puedeVender;
    }//fin venderBolivares

    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return (bolivaresVendidos*precioDeVenta*16)/100;//COMPLETE
    }//fin getImpuestos

    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        return pesosEnCaja-getImpuestos();
    }//fin getGanancias

    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        //COMPLETE
        if(cantidad>0){
            pesosEnCaja+=cantidad;
        }
    }//fin inyectarPesos

    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        //COMPLETE
        if(cantidad>0){
            bolivaresEnCaja+=cantidad;
        }
    }

}//End class---------------------************************


//Codigo Harder tio rico.

/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class CasaDeCambio {

    float precioDeCompra;
    float precioDeVenta;
    int bolivaresComprados;
    int bolivaresVendidos;
    float bolivaresEnCaja;
    float pesosEnCaja;
    
    //No requiere propiedades diferentes a las anteriores... No declare propiedades adicionales...

    /**
     * Default constructor
     */
    public CasaDeCambio() {
    }
    
    //COMPLETE GET 
    //No tiene sentido tener SET... piense, pregunte...
    
    
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los previos de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        return 0;//COMPLETE
    }
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) {
        boolean precioValido = false;//COMPLETE
        //COMPLETE
        return precioValido;
    }//fin cambiarPrecioDelBolivar 
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar = false;//COMPLETE
        //COMPLETE
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        boolean puedeVender = false;//COMPLETE
        //COMPLETE
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return 0;//COMPLETE
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        return 0;//COMPLETE
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        //COMPLETE
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        //COMPLETE
    }

}//End class*/




