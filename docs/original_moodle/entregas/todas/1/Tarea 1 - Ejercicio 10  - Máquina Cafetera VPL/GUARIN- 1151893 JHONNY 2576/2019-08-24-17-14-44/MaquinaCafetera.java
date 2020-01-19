/**
 * Complete
 * @author (Jhonny Guarin- jhonnyesneidergcha@ufps.edu.co) 
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
        azucar= 0;
        vasos= 0;
        precioBaseCafe= 0;
        egresos= 0;
        ingresos= 0;
        gananciasBrutas= 0;
        impuestos= 0;
        gananciasNetas= 0;
    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        this.cafe = cantidadInicialCafe;
        this.azucar = cantidadInicialAzucar;
        this.vasos = cantidadInicialVasos;
    }

    public int getCafe(){
        return cafe;
    }

    public void setCafe (int cafe) {
        this.cafe = cafe;
    }

    public int getAzucar(){
        return azucar;
    }

    public void setAzucar (int azucar) {
        this.azucar = azucar;
    }

    public int getVasos(){
        return vasos;
    }

    public void setVasos (int Vasos) {
        this.vasos = vasos;
    }

    public int getPrecioBaseCafe(){
        return precioBaseCafe;
    }

    public void setPrecioBaseCafe (int precioBaseCafe) {
        this.precioBaseCafe = precioBaseCafe;
    }

    public int getEgresos(){
        return egresos; 
    }

    public void setEgresos (int egresos) {
        this.egresos = egresos;
    }

    public int getIngresos(){
        return ingresos;
    }

    public void setIngresos (int ingresos) {
        this.ingresos = ingresos;
    }

    public int getGananciasBrutas(){
        return gananciasBrutas;
    }

    public void setGananciasBrutas (int gananciasBrutas) {
        this.gananciasBrutas = gananciasBrutas;
    }

    public int getImpuestos(){
        return impuestos;
    }

    public void setImpuestos (int inpuestos) {
        this.impuestos = impuestos;
    }

    public int getGananciasNetas(){
        return gananciasNetas;
    }

    public void setGananciasNetas (int gananciasNetas) {
        this.gananciasNetas = gananciasNetas;
    }

    public int tipoCafe(int tipoCafe){
        int cafe=0;
        switch (tipoCafe){
            case 1:
            cafe=55;
            break;
            case 2:
            cafe=110;
            break;
            case 3:
            cafe =165;
            break;
        }
        return cafe;
    }

    public int cantidadAzucar(int cantidadAzucar){
        int azucar=0;
        switch (cantidadAzucar){
            case 1:
            azucar=0;
            break;
            case 2:
            azucar=5;
            break;
            case 3:
            azucar=10;
            break;
        }
        return azucar;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        int precio = 0;
        int cafe = tipoCafe(tipoCafe);
        int azucar = cantidadAzucar(cantidadAzucar);
        precio = precioBaseCafe/1000 * cafe;
        precio += (azucar*precio/100);
        precio += (precio*15/100);
        return precio;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        if(cantidadCafe>0 && gananciasNetas>=costoCompraCafe){
            this.cafe += cantidadCafe;
            this.egresos += costoCompraCafe;
            registrarFactura(0);
            return true;
        }
        else return false;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        if(cantidadAzucar>=0 && gananciasNetas>=costoCompraAzucar){
            this.azucar +=cantidadAzucar;
            this.egresos+= costoCompraAzucar;
            registrarFactura(0);
            return true;
        }
        else return false;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        if(cantidadVasos>=0 && gananciasNetas>=costoCompraVasos){
            this.vasos +=cantidadVasos;
            this.egresos+= costoCompraVasos;
            registrarFactura(0);
            return true;
        }
        else return false;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        int cafe = tipoCafe(tipoCafe);
        int azucar = cantidadAzucar(cantidadAzucar);
        if (this.cafe>=cafe && this.azucar>=azucar && this.vasos>0){
            this.cafe -= cafe;
            this.azucar -= azucar;
            this.vasos --;
            return true;
        }
        else return false;
    }

    public void registrarFactura(int valorFactura) {
        this.ingresos +=valorFactura;
        this.gananciasBrutas = ingresos - egresos;
        this.impuestos= ingresos *16/100;
        this.gananciasNetas =gananciasBrutas - impuestos;
    }

}
