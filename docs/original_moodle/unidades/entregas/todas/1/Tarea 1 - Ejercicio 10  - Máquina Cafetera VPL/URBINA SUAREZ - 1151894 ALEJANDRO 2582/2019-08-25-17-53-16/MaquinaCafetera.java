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
        cafe = pCafe;
    }
    public void setAzucar(int pAzucar){
        azucar = pAzucar;
    }
    public void setVasos(int pVasos){
        vasos = pVasos;
    }
    public void setPrecioBaseCafe(int pPrecioBaseCafe){
        precioBaseCafe = pPrecioBaseCafe;
    }
    public void setEgresos(int pEgresos){
        egresos = pEgresos;
    }
    public void setIngresos(int pIngresos){
        ingresos = pIngresos;
    }
    public void setGananciasBrutas(int pGananciasBrutas){
        gananciasBrutas = pGananciasBrutas;
    }
    public void setImpuestos(int pImpuestos){
        impuestos = pImpuestos;
    }
    public void setGananciasNetas(int pGananciasNetas){
        gananciasNetas = pGananciasNetas;
    }
    //complete metodos GET / SET
     
    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        int precioParcial = (precioBaseCafe * 55 * tipoCafe)/ 1000;
        precioParcial += (precioParcial * 5* (cantidadAzucar-1)) / 100;
        int precioFinal = precioParcial + (precioParcial *15 / 100);
        return precioFinal;
     //complete
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        boolean siRecarga = false;
        if (cantidadCafe > 0 && gananciasNetas >= costoCompraCafe){
            siRecarga = true;
            cafe += cantidadCafe;
            egresos += costoCompraCafe;
            registrarFactura(0);
        }
        return siRecarga;
      //complete
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        boolean siRecarga = false;
        if (gananciasNetas >= costoCompraAzucar){
            siRecarga = true;
            azucar += cantidadAzucar;
            egresos += costoCompraAzucar;
        }
        return siRecarga;
      //complete
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        boolean siRecarga = false;
        if (gananciasNetas >= costoCompraVasos){
            siRecarga = true;
            vasos += cantidadVasos;
            egresos += costoCompraVasos;
        }
        return siRecarga;
      //complete
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean siHayInsumos = false;
        if (cafe >= tipoCafe*55 && azucar >= (5*(cantidadAzucar-1)) && vasos > 0){
            siHayInsumos = true;
            cafe -= tipoCafe*55;
            azucar -= 5*(cantidadAzucar-1);
            --vasos;
        }
        return siHayInsumos;
      //complete
    }

    public void registrarFactura(int valorFactura) {
        gananciasBrutas += valorFactura - egresos;
        ingresos += valorFactura;
        impuestos += valorFactura * 16 / 100;
        gananciasNetas += valorFactura - impuestos;
     //complete
    }

}
