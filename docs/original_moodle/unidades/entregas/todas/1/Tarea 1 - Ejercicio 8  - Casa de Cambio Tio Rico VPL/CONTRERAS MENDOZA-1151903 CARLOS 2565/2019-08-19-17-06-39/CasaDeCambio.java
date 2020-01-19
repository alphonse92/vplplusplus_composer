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
    
    public CasaDeCambio(float precioDeCompra,float precioDeVenta,float bolivaresEnCaja,float pesosEnCaja,int bolivaresComprados,int bolivaresVendidos) 
    {
    this.precioDeCompra = precioDeCompra;
    this.precioDeVenta = precioDeVenta;
    this.bolivaresComprados = bolivaresComprados;
    this.bolivaresVendidos = bolivaresVendidos;
    this.bolivaresEnCaja = bolivaresEnCaja;
    this.pesosEnCaja = pesosEnCaja;    
    }
    
    //COMPLETE GET 
    public float getPesosEnCaja() {   
        return pesosEnCaja;
    }//fin getPesosEnCaja
    
    public int getBolivaresComprados() {   
        return bolivaresComprados;
    }//fin getBolivaresComprados
    
    public int getBolivaresVendidos() {   
        return bolivaresVendidos;
    }//fin getBolivaresVendidos
    
    public float getBolivaresEnCaja() {   
        return this.bolivaresEnCaja;
    }//fin getBolivaresEnCaja
    
    public float getPrecioDeCompra() {   
        return precioDeCompra;
    }//fin getPrecioDeCompra
    
    public float getPrecioDeVenta() {   
        return precioDeVenta;
    }//fin getPrecioDeVenta
    
    //No tiene sentido tener SET... piense, pregunte...
    
    
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los previos de compra y venta...
     */
    public float getGananciaEnUnBolivar() {
        float gananciaEnUnBolivar = (precioDeVenta-precioDeCompra);
        return gananciaEnUnBolivar;//COMPLETE
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
        if(precioDeCompra>0 && precioDeVenta>precioDeCompra){precioValido = true;}
        return precioValido;
    }//fin cambiarPrecioDelBolivar
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) {
        boolean puedeComprar = false;
        if (pesosEnCaja>0 && pesosEnCaja>=precioDeCompra*cantidad){puedeComprar = true;}
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) {
        boolean puedeVender = false;
        if (cantidad>0 && bolivaresEnCaja>0 && bolivaresEnCaja>=precioDeVenta*cantidad){puedeVender = true;}
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() {
        float impuestos=(((bolivaresVendidos*16)/100)*precioDeVenta);
        return impuestos;
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() {
        float ganancias=(pesosEnCaja-getImpuestos());
        return ganancias;
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) {
        if(cantidad>0){
        pesosEnCaja = pesosEnCaja+cantidad;}
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) {
        if(cantidad>0){
        bolivaresEnCaja = bolivaresEnCaja+cantidad;}
    }

}//End class


