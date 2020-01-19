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
        cafe = cantidadInicialCafe;
        azucar = cantidadInicialAzucar;
        vasos = cantidadInicialVasos;
     //complete
    }
    
    public int getCafe(){
        return cafe;
    }
    public int getAzucar(){
        return azucar;
    }
    public int getVasos(){
        return vasos;
    }
    public int getPrecioBaseCafe(){
        return precioBaseCafe;
    }
    public int getEgresos(){
        return egresos;
    }
    public int getIngresos(){
        return ingresos;
    }
    public int getGananciasBrutas(){
        return gananciasBrutas;
    }
    public int getImpuestos(){
        return impuestos;
    }
    public int getGananciasNetas(){
        return gananciasNetas;
    }
    
    public void setCafe(int pCafe){
        return cafe = pCafe;
    }
    public void setAzucar(int pAzucar){
        return azucar = pAzucar;
    }
    public void setVasos(int pVasos){
        return vasos = pVasos;
    }
    public void setPrecioBaseCafe(int pPrecioBaseCafe){
        return precioBaseCafe = pPrecioBaseCafe;
    }
    public void setEgresos(int pEgresos){
        return egresos = pEgresos;
    }
    public void setIngresos(int pIngresos){
        return ingresos = pIngresos;
    }
    public void setGananciasBrutas(int pGananciasBrutas){
        return gananciasBrutas = pGananciasBrutas;
    }
    public void setImpuestos(int pImpuestos){
        return impuestos = pImpuestos;
    }
    public void setGananciasNetas(int pGananciasNetas){
        return gananciasNetas = pGananciasNetas;
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
