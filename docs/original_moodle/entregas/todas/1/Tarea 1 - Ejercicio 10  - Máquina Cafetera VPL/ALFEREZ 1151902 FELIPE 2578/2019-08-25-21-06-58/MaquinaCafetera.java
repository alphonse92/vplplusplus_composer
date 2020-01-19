/**
 * Complete
 * @author (Milton Jesús Vera Contreras - miltonjeussvc@ufps.edu.co) 
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

    public MaquinaCafetera(){
        //complete
    }

    public MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        //complete
        this.cafe = cantidadInicialCafe/* = 1000*/;
        this.azucar = cantidadInicialAzucar/* = 1000*/;
        this.vasos= cantidadInicialVasos /*50*/;
    }

    //complete metodos GET / SET
    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getPrecioBaseCafe() {
        return precioBaseCafe;
        //calcularPrecio(0,0);
    }

    public void setPrecioBaseCafe(int precioBaseCafe) {
        this.precioBaseCafe = precioBaseCafe=7000;
        calcularPrecio(0,0);
    }

    public int getEgresos() {
        return egresos;
    }

    public void setEgresos(int egresos) {
        this.egresos = egresos;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getGananciasBrutas() {
        return gananciasBrutas;
    }

    public void setGananciasBrutas(int gananciasBrutas) {
        this.gananciasBrutas = gananciasBrutas;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int getGananciasNetas() {
        return gananciasNetas;
    }

    public void setGananciasNetas(int gananciasNetas) {
        this.gananciasNetas = gananciasNetas;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        //complete
        int precio=0;
        int tmpCafe=0;
        int tmpAzucar=0;
        int sobreCargo=0;
        if(tipoCafe==1){
            tmpCafe=55;
        }
        if(tipoCafe==2){
            tmpCafe=110;
        }
        if(tipoCafe==3){
            tmpCafe=165;
        }
        if(cantidadAzucar==1){
            tmpAzucar=0;
            sobreCargo=0;
        }
        if(cantidadAzucar==2){
            tmpAzucar=5;
            sobreCargo = tmpAzucar/100;
        }
        if(cantidadAzucar==3){
            tmpAzucar=10;
            sobreCargo = tmpAzucar/100;
        }
        precio = precioBaseCafe/1000 * tmpCafe + sobreCargo;
        int ganancias = (precio*15)/100;
        int total = precio+ganancias;
        ingresos += total;
        return total;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        //complete
        boolean recargar;
        if(gananciasNetas>costoCompraCafe){
            this.cafe += cantidadCafe;
            egresos += costoCompraCafe;
            recargar= true;
        }
        else{
            recargar=false;
        }
        return recargar;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        //complete
        boolean recargar;
        if(gananciasNetas>costoCompraAzucar){
            this.azucar += cantidadAzucar;
            egresos += costoCompraAzucar;
            recargar=true;
        }
        else{
            recargar=false;
        }
        return recargar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        //complete
        boolean recargar;
        if(gananciasNetas>costoCompraVasos){
            this.vasos +=cantidadVasos;
            egresos += costoCompraVasos;
            recargar=true;
        }
        else{
            recargar=false;
        }
        //*=costoCompraVasos;
        return recargar;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        //complete
        boolean preparar;
        int tmpCafe=0; 
        int tmpAzucar=0;
        if(tipoCafe==1){
            tmpCafe=55;
        }
        if(tipoCafe==2){
            tmpCafe=110;
        }
        if(tipoCafe==3){
            tmpCafe=165;
        }
        if(cantidadAzucar==1){
            tmpAzucar=0;
        }
        if(cantidadAzucar==2){
            tmpAzucar=5;
        }
        if(cantidadAzucar==3){
            tmpAzucar=10;
        }
        if(cafe>0 && vasos>0 && azucar>0){
            preparar=true;
            this.cafe -= tmpCafe;
            this.azucar -= tmpAzucar;
            this.vasos--;
        }
        else{
            preparar=false;
        }
        return preparar;
    }

    public void registrarFactura(int valorFactura) {
        //complete
        gananciasBrutas =  ingresos-egresos;
        impuestos = ingresos*19/100;
        gananciasNetas = gananciasBrutas - impuestos;
        //Aqui calculo ganancias netas y brutas
    }

}
