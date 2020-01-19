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
     //complete
    }
    
    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
     //complete
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
