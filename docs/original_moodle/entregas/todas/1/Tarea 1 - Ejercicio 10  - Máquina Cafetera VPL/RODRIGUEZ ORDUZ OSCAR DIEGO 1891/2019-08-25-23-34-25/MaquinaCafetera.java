
/**
 * Complete
 * @author (Oscar Diego Rodriguez Orduz - OscarDiegoRo@ufps.edu.co) 
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
        this.cafe = 0;
        this.azucar = 0;
        this.vasos = 0;
        this.precioBaseCafe = 0;
        this.egresos = 0;
        this.ingresos = 0;
        this.gananciasBrutas = 0;
        this.impuestos = 0;
        this.gananciasNetas =0;

    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        this.cafe = cantidadInicialCafe;
        this.azucar = cantidadInicialAzucar;
        this.vasos = cantidadInicialVasos;
    }

    public int getCafe(){
        return this.cafe;
    }

    public int getAzucar(){
        return this.azucar;
    }

    public int getVasos(){
        return this.vasos;
    }

    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }

    public int getEgresos(){
        return this.egresos;
    }

    public int getIngresos(){
        return this.ingresos;
    }

    public int getGananciasBrutas(){
        return this.ingresos;
    }

    public int getImpuestos(){
        return this.impuestos;
    }

    public int getGananciasNetas(){
        return this.gananciasNetas;
    }

    public void setPrecioBaseCafe(int precio){
        this.precioBaseCafe = precio;
    }

    public void setIngresos(int precio){
        this.ingresos = precio;
    }

    public void setGananciasNetas(int precio){
        this.gananciasNetas = precio;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        int precio = 0 ;
        int cafe = 0;
        int azucar = 0;
        int algo = 0;
        int noSeComoLlamarEstaVariable = this.precioBaseCafe / 1000;
        if (tipoCafe == 1){
            cafe = 55;
        }else {
            if(tipoCafe == 2){
                cafe = 55 * 2;
            }else {
                if(tipoCafe == 3){
                    cafe = 55 * 3;
                }
            }
        }

        if ( cantidadAzucar == 2 ){
            azucar = ((noSeComoLlamarEstaVariable * cafe) * 5)/100;
        }else {
            if( cantidadAzucar == 3 ){
                azucar = ((noSeComoLlamarEstaVariable * cafe) * 10)/100;
            }
        }
        algo = ((cafe * noSeComoLlamarEstaVariable + azucar)*15)/100;
        precio = algo + ( cafe * noSeComoLlamarEstaVariable + azucar); 
        return precio;

    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean preparar = false;
        int cafe;
        int azucar = 0;

        if(tipoCafe == 1){
            cafe = 55;
        }else {
            if(tipoCafe == 2){
                cafe = 55*2;
            }else cafe = 55*3;

        }   

        if(cantidadAzucar == 2){
            azucar = 5;
        }else {
            if(cantidadAzucar == 3){
                azucar = 10;
            }

        }

        if ( this.cafe >= cafe && this.azucar >= azucar && this.vasos>0) {
            this.cafe -= cafe;
            this.azucar -= azucar;
            this.vasos --;
            preparar = true;
        }
        calcularPrecio(tipoCafe,cantidadAzucar);
        return preparar;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        boolean recargar = false;

        if( cantidadCafe > 0 && costoCompraCafe > 0 && this.gananciasNetas >= (costoCompraCafe*cantidadCafe)){

            this.cafe += cantidadCafe;
            this.egresos += costoCompraCafe;
            this.impuestos = (this.ingresos*16)/100;
            this.ingresos -= costoCompraCafe;
            this.gananciasNetas = this.ingresos - this.impuestos;

            recargar = true;
        }

        return recargar;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        boolean recargar = false;

        if(cantidadAzucar > 0 && costoCompraAzucar>0 && this.gananciasNetas >= costoCompraAzucar ){

            this.azucar += cantidadAzucar;
            this.egresos += costoCompraAzucar;
            this.impuestos = (this.ingresos*16)/100;
            this.ingresos -= costoCompraAzucar;
            this.gananciasNetas = this.ingresos - this.impuestos;

            recargar = true;
        }

        return recargar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        boolean recargar = false;

        if(cantidadVasos > 0 && costoCompraVasos>0 && this.gananciasNetas >= costoCompraVasos){

            this.vasos += cantidadVasos;
            this.egresos += costoCompraVasos;
            this.impuestos = (this.ingresos*16)/100;
            this.ingresos -= costoCompraVasos;
            this.gananciasNetas = this.ingresos - this.impuestos;
recargar = true;
        }

        return recargar;

    }

    public void registrarFactura(int valorFactura) {
        this.ingresos += valorFactura;
        this.gananciasBrutas = this.ingresos - this.egresos;
        this.impuestos = (this.ingresos*16)/100;
        this.gananciasNetas = this.gananciasBrutas - this.impuestos ;
    }

