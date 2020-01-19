/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class CasaDeCambio 
{
    protected float precioDeCompra;
    protected float precioDeVenta;
    protected int bolivaresComprados;
    protected int bolivaresVendidos;
    protected float bolivaresEnCaja;
    protected float pesosEnCaja;
    
    //No requiere propiedades diferentes a las anteriores... No declare propiedades adicionales...

    /**
     * Default constructor
     */
    public CasaDeCambio() 
    {
    }
    //COMPLETE GET 
    public float getPesosEnCaja()
    {
        return this.pesosEnCaja;
    }
    
    public int getBolivaresComprados()
    {
        return this.bolivaresComprados;
    }
    
    public int getBolivaresVendidos()
    {
        return this.bolivaresVendidos;
    }
    
    public float getBolivaresEnCaja()
    {
        return this.bolivaresEnCaja;
    }
    
    public float getPrecioDeCompra()
    {
        return this.precioDeCompra;
    }
    
    public float getPrecioDeVenta()
    {
        return this.precioDeVenta;
    }
    //No tiene sentido tener SET... piense, pregunte...
    /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los precios de compra y venta...
     */
    public float getGananciaEnUnBolivar() 
    {
        float GananciaEnUnBolivar=(precioDeVenta-precioDeCompra);
        return GananciaEnUnBolivar;//COMPLETE
    }
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) 
    {
        boolean precioValido = precioDeCompra>0 && precioDeVenta>0 && precioDeCompra<precioDeVenta;//COMPLETE
        if(precioValido)
        {
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
    public boolean comprarBolivares(int cantidad) 
    {
        boolean puedeComprar = pesosEnCaja>0 && pesosEnCaja>=(cantidad*precioDeCompra);//COMPLETE
        //COMPLETE
        if(puedeComprar)
        {
            this.bolivaresComprados+=cantidad;
            this.bolivaresEnCaja+=cantidad;
            this.pesosEnCaja-=(cantidad*precioDeCompra);
        }
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * Registra la venta de bolivares
     * @param cantidad
     * @return true si pudo vender
     */
    public boolean venderBolivares(int cantidad) 
    {
        boolean puedeVender = bolivaresEnCaja>0 && bolivaresEnCaja>=cantidad;//COMPLETE
        //COMPLETE
        if(puedeVender)
        {
            this.bolivaresVendidos+=cantidad;
            this.bolivaresEnCaja-=cantidad;
            this.pesosEnCaja+=(cantidad*precioDeVenta);
        }
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() 
    {
        return (this.bolivaresVendidos*0.16f)*this.precioDeVenta;//COMPLETE
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    
    public float getGanancias() 
    {
        return (this.precioDeVenta*this.bolivaresVendidos)-this.getImpuestos();
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    
    public void inyectarPesos(int cantidad)
    {
        if(cantidad>0)
        {
            this.pesosEnCaja+=cantidad;
        }
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) 
    {
        if(cantidad>0)
        {
            this.bolivaresEnCaja+=cantidad;
        }
    }
}//End class


