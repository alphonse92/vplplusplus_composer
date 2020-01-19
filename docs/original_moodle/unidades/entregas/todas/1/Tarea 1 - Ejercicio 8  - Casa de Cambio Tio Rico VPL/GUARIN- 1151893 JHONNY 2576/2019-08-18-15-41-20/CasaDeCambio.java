/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Jhonny Guarín)
 * @version 9889.09 :(
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
    
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los precios de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        return this.precioDeVenta - this.precioDeCompra;
    }
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) {
        boolean precioValido = false;
        precioValido = precioDeVenta > 0.0 && precioDeCompra > 0.0 && precioDeVenta > precioDeCompra ;
        if (precioValido){
            this.precioDeCompra = precioDeCompra;
            this.precioDeVenta = precioDeVenta;
        }
        return precioValido;
    }//fin cambiarPrecioDelBolivar
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar = this.pesosEnCaja >= cantidad * this.precioDeCompra;
        if (puedeComprar){
            this.bolivaresComprados += cantidad;
            this.bolivaresEnCaja+= cantidad;
            this.pesosEnCaja -= cantidad * this.precioDeCompra;
        }
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        boolean puedeVender = false;
        puedeVender = this.bolivaresEnCaja >= cantidad;
        if (puedeVender){
            this.bolivaresEnCaja -= cantidad;
            this.bolivaresVendidos += cantidad;
            this.pesosEnCaja += cantidad * this.precioDeVenta;
        }
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return bolivaresVendidos * precioDeVenta * 0.16f;
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        return pesosEnCaja - getImpuestos();
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        if (cantidad>0) pesosEnCaja += cantidad;
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        if (cantidad>0) bolivaresEnCaja +=cantidad;
    }

}//End class


