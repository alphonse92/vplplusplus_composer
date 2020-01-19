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
    /**
     * Default constructor
     */
    public CasaDeCambio() {
    }
    
    //COMPLETE GET 
    //No tiene sentido tener SET... piense, pregunte...
    
    public float getPrecioDeCompra()
    {
        return this.precioDeCompra;
    }//fin getPrecioDeCompra
    
    public float getPrecioDeVenta()
    {
        return this.precioDeVenta;
    }//fin getPrecioDeVenta
    
    public float getBolivaresEnCaja()
    {
        return this.bolivaresEnCaja;
    }//fin getBolivaresEnCaja
    
    public float getPesosEnCaja()
    {
        return this.pesosEnCaja;
    }//fin getgetPesosEnCaja
    
    public int getBolivaresComprados()
    {
        return this.bolivaresComprados;
    }//fin getBolivaresComprados
    
    public int getBolivaresVendidos()
    {
        return this.bolivaresVendidos;
    }//fin getBolivaresVendidos
    
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los precios de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        return getPrecioDeVenta() - getPrecioDeCompra();
    }//fin getGanaciaEnUnBolivar
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) {
        if(precioDeCompra > 0 && precioDeVenta > 0 && precioDeVenta > precioDeCompra){
            this.precioDeCompra = precioDeCompra;
            this.precioDeVenta = precioDeVenta;
            return true;
        }
        else return false;
    }//fin cambiarPrecioDelBolivar
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        if(getPesosEnCaja() >= cantidad * getPrecioDeCompra()){
            this.bolivaresEnCaja += cantidad;
            this.pesosEnCaja -= cantidad * getPrecioDeCompra();
            this.bolivaresComprados += cantidad;
            return true;
        }
        else return false;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        if(cantidad <= getBolivaresEnCaja()){
            this.bolivaresVendidos += cantidad;
            this.bolivaresEnCaja -= cantidad;
            this.pesosEnCaja += cantidad * getPrecioDeVenta();
            return true;
        }
        else return false;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return (getBolivaresVendidos() * 0.16f) * getPrecioDeVenta();
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        return getPesosEnCaja() - getImpuestos();
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        if(cantidad >= 0)
            this.pesosEnCaja += cantidad;        
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        if(cantidad >= 0)
            this.bolivaresEnCaja += cantidad;
    }
}//End class