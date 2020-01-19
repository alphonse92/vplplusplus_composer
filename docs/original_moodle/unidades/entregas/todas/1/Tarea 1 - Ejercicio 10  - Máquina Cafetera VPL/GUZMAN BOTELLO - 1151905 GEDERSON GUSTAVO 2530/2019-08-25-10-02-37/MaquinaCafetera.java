/**
 * Complete
 * @author (Milton Jes�s Vera Contreras - miltonjeussvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaCafetera { 

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    /*No requiere propiedades adicionales, pero es libre de usarlas*/

    
    MaquinaCafetera(){
cafe = 0;
azucar = 0;
vasos = 0;
precioBaseCafe = 0;
egresos = 0;
ingresos = 0;
gananciasBrutas = 0;
impuestos = 0;
gananciasNetas = 0;
     //complete
    }
    
    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        cafe = cantidadInicialCafe;
        azucar = cantidadInicialAzucar;
        vasos = cantidadInicialVasos;
     //complete
    }
    int getPrecioBaseCafe(){
        return precioBaseCafe;
    }
    int setPrecioBaseCafe(int precio){
        if (precio > 0) precioBaseCafe = precio;
        return precioBaseCafe;
    }
    //complete metodos GET / SET
     
    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
     //complete
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
      //complete
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
      //complete
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
      //complete
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
      //complete
    }

    public void registrarFactura(int valorFactura) {
     //complete
    }

}
