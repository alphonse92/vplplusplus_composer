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
    public float getPrecioDeCompra() {
        return precioDeCompra;//COMPLETE
    }
    
    public float getPrecioDeVenta() {
        return precioDeVenta;//COMPLETE
    }
    
    public int getBolivaresComprados() {
        return bolivaresComprados;//COMPLETE
    }
    
    public int getBolivaresVendidos() {
        return bolivaresVendidos;//COMPLETE
    }
    
    public float getBolivaresEnCaja() {
        return bolivaresEnCaja;//COMPLETE
    }
    
    public float getPesosEnCaja() {
        return pesosEnCaja;//COMPLETE
    }
    
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los previos de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        return precioDeVenta - precioDeCompra;//COMPLETE
    }
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float pPrecioDeCompra, float pPrecioDeVenta) {
        boolean precioValido = pPrecioDeCompra > 0 && pPrecioDeVenta > 0 && pPrecioDeVenta > pPrecioDeCompra ? true : false;//COMPLETE
        //COMPLETE
        if(precioValido){
            precioDeCompra = pPrecioDeCompra;
            precioDeVenta = pPrecioDeVenta;
        }
        return precioValido;
    }//fin cambiarPrecioDelBolivar 
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar = cantidad >= 0 && cantidad * precioDeCompra <= pesosEnCaja;//COMPLETE
        //COMPLETE
        if(puedeComprar){
            bolivaresComprados += cantidad;
            pesosEnCaja -= cantidad*precioDeCompra;
            bolivaresEnCaja += cantidad;
        }
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        boolean puedeVender = cantidad > 0 && bolivaresEnCaja >= cantidad;//COMPLETE
        //COMPLETE
        if(puedeVender){
            bolivaresEnCaja -= cantidad;
            pesosEnCaja += cantidad*precioDeVenta;
            bolivaresVendidos += cantidad;
        } 
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return bolivaresVendidos*precioDeVenta*16.0f/100.0f;//COMPLETE
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        return bolivaresVendidos*precioDeVenta-bolivaresComprados*precioDeCompra - getImpuestos();//COMPLETE
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        if(cantidad >= 0) pesosEnCaja += cantidad;
        //COMPLETE
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        if(cantidad >= 0) bolivaresEnCaja += cantidad;
        //COMPLETE
    }

}//End class


