/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Harold Rueda Antolinez)
 * @version 0.1
 * History: Abril 2008 / Agosto 2019
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

    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los precios de compra y venta...
     */
    public float getGananciaEnUnBolivar() {        
        return this.precioDeVenta-this.precioDeCompra;
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
        if(precioDeCompra>0&&precioDeVenta>0&&precioDeVenta>precioDeCompra){
            precioValido=true;
            this.precioDeCompra=precioDeCompra;
            this.precioDeVenta=precioDeVenta;
        }
        return precioValido;
    }//fin cambiarPrecioDelBolivar

    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar = false;
        if(cantidad*precioDeCompra<pesosEnCaja){
            puedeComprar=true;
            bolivaresEnCaja+=cantidad;
            pesosEnCaja-=cantidad*precioDeCompra;
            bolivaresComprados+=cantidad;
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
        if(cantidad<bolivaresEnCaja){
            puedeVender=true;
            bolivaresEnCaja-=cantidad;
            pesosEnCaja+=cantidad*precioDeVenta;
            bolivaresVendidos+=cantidad;
        }
        return puedeVender;
    }//fin venderBolivares

    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        return ((bolivaresVendidos*precioDeVenta)*16)/100;//COMPLETE
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
        if(cantidad>0)  this.pesosEnCaja+=cantidad;
    }//fin inyectarPesos

    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        if(cantidad>0) this.bolivaresEnCaja+=cantidad;
    }

    /**Getter method pesosEnCaja*/
    public float getPesosEnCaja(){
        return this.pesosEnCaja;
    }//end method getPesosEnCaja

    /**Getter method bolivaresComprados*/
    public int getBolivaresComprados(){
        return this.bolivaresComprados;
    }//end method getBolivaresComprados

    /**Getter method bolivaresVendidos*/
    public int getBolivaresVendidos(){
        return this.bolivaresVendidos;
    }//end method getBolivaresVendidos

    /**Getter method bolivaresEnCaja*/
    public float getBolivaresEnCaja(){
        return this.bolivaresEnCaja;
    }//end method getBolivaresEnCaja

    /**Getter method precioDeCompra*/
    public float getPrecioDeCompra(){
        return this.precioDeCompra;
    }

    //Start GetterSetterExtension Code
    /**Getter method precioDeVenta*/
    public float getPrecioDeVenta(){
        return this.precioDeVenta;
    }//end method getPrecioDeVenta

    //End GetterSetterExtension Code
}//End class !
