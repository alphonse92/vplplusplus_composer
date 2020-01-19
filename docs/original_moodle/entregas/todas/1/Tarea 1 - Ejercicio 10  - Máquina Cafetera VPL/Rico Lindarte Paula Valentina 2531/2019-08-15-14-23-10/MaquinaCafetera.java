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
        this.cafe = cantidadInicialCafe;
        this.azucar = cantidadInicialAzucar;
        this.vasos = cantidadInicialVasos;
    }

    //complete metodos GET / SET
    public void setPrecioBaseCafe (int precioBaseCafe)
    {
        this.precioBaseCafe = precioBaseCafe;
    }

    public int getPrecioBaseCafe ()
    {
        return this.precioBaseCafe;
    }

    public void setganaciasNetas (int ganaciasNetas)
    {
        this.gananciasNetas = gananciasNetas;
    }

    public int getGananciasNetas ()
    {
        return gananciasBrutas;
    }

    public void setganaciasBrutas (int ganaciasBrutas)
    {
        this.gananciasBrutas = gananciasBrutas;
    }

    public int getGananciasBrutas ()
    {
        return this.gananciasBrutas;
    }

    public void setCafe (int cafe)
    {
        this.cafe = cafe;
    }

    public int getCafe ()
    {
        return this.cafe;
    }

    public void setAzucar (int azucar)
    {
        this.azucar = azucar;
    }

    public int getAzucar ()
    {
        return this.azucar;
    }

    public void setVasos (int vasos)
    {
        this.vasos = vasos;
    }

    public int getVasos ()
    {
        return this.vasos;
    }

    public void setImpuestos (int impuestos)
    {
        this.impuestos = impuestos;
    }

    public int getImpuestos ()
    {
        return this.impuestos;
    }

    public void setIngresos (int ingresos)
    {
        this.ingresos = ingresos;
    }

    public int getIngresos()
    {
        return this.ingresos;
    }

    public void setEgresos (int egresos)
    {
        this.egresos = egresos;
    }

    public int getEgresos ()
    {
        return this.egresos;
    }

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        int gramos = 0;        
        if(tipoCafe == 1)
            gramos = 55;
        else{
            if(tipoCafe == 2)
                gramos = 110;
            else gramos = 165;
        }
        int precio = ((getPrecioBaseCafe() / 1000) * gramos);
        int subtotal = precio + (precio * cantidadAzucar / 100);
        return subtotal + (subtotal * 15 / 100);
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        if(getGananciasNetas() >= costoCompraCafe){
            this.cafe += cantidadCafe;
            this.gananciasNetas -= costoCompraCafe;
            this.egresos += costoCompraCafe;
            this.gananciasBrutas -= costoCompraCafe;
            return true;
        }
        else return false;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        if(getGananciasNetas() >= costoCompraAzucar){
            this.azucar += cantidadAzucar;
            this.gananciasNetas -= costoCompraAzucar;
            this.egresos += costoCompraAzucar;
            this.gananciasBrutas -= costoCompraAzucar;
            return true;
        }
        else return false;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        if(getGananciasNetas() >= costoCompraVasos){
            this.vasos += cantidadVasos;
            this.gananciasNetas -= costoCompraVasos;
            this.egresos += costoCompraVasos;
            this.gananciasBrutas -= costoCompraVasos;
            return true;
        }
        else return false;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        int gramos = 0;        
        if(tipoCafe == 1)
            gramos = 55;
        else{
            if(tipoCafe == 2)
                gramos = 110;
            else gramos = 165;
        }

        if(getCafe() >= gramos && getAzucar() >= cantidadAzucar && getVasos() >= 1){
            this.cafe -= gramos;
            this.azucar -= cantidadAzucar;
            this.vasos--;
            return true;
        }
        else return false;
    }

    public void registrarFactura(int valorFactura) {
        this.ingresos += valorFactura;
        this.gananciasBrutas += valorFactura;
        this.impuestos = getIngresos() * 16 / 100; 
        this.gananciasNetas = getIngresos() - getImpuestos() - getEgresos();        
    }
}
