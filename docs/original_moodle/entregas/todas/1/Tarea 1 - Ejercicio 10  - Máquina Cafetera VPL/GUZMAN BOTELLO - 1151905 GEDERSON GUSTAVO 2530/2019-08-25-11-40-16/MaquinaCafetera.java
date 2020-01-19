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
        precioBaseCafe = precio;
        return precioBaseCafe;
    }
    int getCafe(){
        return cafe;
    }
    int getAzucar(){
        return azucar;
    }
    int getVasos(){
        return vasos;
    }
    int getEgresos(){
        return egresos;
    }
    int getIngresos(){
        return ingresos;
    }
    int setIngresos(int ingresos){
        this.ingresos = ingresos;
        return this.ingresos;
    }
    int getGananciasBrutas(){
        return ingresos - egresos;
    }
    int getImpuestos(){
        return ingresos * 16 / 100;
    }
    int getGananciasNetas(){
        return gananciasBrutas-impuestos;
    }
    int setGananciasNetas(int ganancias){
        gananciasNetas = ganancias;
        return gananciasNetas;
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
        if (gananciasNetas >= costoCompraCafe){
            siRecarga = true;
            cafe += cantidadCafe;
            egresos += costoCompraCafe;
            gananciasNetas -= costoCompraCafe;
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
            gananciasNetas -= costoCompraAzucar;
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
            gananciasNetas -= costoCompraVasos;
        }
        return siRecarga;
      //complete
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean siHayInsumos = false;
        if (cafe >= tipoCafe*55 && azucar >= (5*(cantidadAzucar-1)) && vasos > 0){
            siHayInsumos = true;
            cafe -= tipoCafe*55;
            azucar -= 5*(azucar-1);
            --vasos;
        }
        return siHayInsumos;
      //complete
    }

    public void registrarFactura(int valorFactura) {
        ingresos += valorFactura;
     //complete
    }

}
