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

    public void setGananciasNetas (int ganaciasNetas)
    {
        this.gananciasNetas = gananciasNetas;
    }

    public int getGananciasNetas ()
    {
        return this.gananciasNetas;
    }

    public void setGanaciasBrutas (int ganaciasBrutas)
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
        int gramos = 0, azucar = 0;  
        if(cantidadAzucar == 2)
            azucar = 5;
        else{
            if(cantidadAzucar == 3)
                azucar = 10;
        }
        if(tipoCafe == 1)
            gramos = 55;
        else{
            if(tipoCafe == 2)
                gramos = 110;
            else gramos = 165;
        }
        int precio = ((getPrecioBaseCafe() / 1000) * gramos);
        precio += (precio * azucar / 100);
        return precio + (precio * 15 / 100);
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        if (costoCompraCafe <= getGananciasNetas() && costoCompraCafe >= 0){
            this.cafe += cantidadCafe;
            this.egresos += costoCompraCafe;
            registrarFactura(0);
            return true;
        }
        else return false;
        
        /*else
        {
            if(costoCompraCafe >= 0) return true;
            else return false;
        }*/
    }
        
    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        if(getGananciasNetas() - costoCompraAzucar >= 0){
            this.azucar += cantidadAzucar;
            this.egresos += costoCompraAzucar;
            registrarFactura(0);
            return true;
        }
        else return false;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        if(getGananciasBrutas() - getImpuestos() - costoCompraVasos >= 0){
            this.vasos += cantidadVasos;
            this.egresos += costoCompraVasos;
            registrarFactura(0);
            return true;
        }
        else return false;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        int gramos = 0, azucar = 0;  
        if(cantidadAzucar == 2)
            azucar = 5;
        else{
            if(cantidadAzucar == 3)
                azucar = 10;
        }
        if(tipoCafe == 1)
            gramos = 55;
        else{
            if(tipoCafe == 2)
                gramos = 110;
            else gramos = 165;
        }

        if(getCafe() >= gramos && getAzucar() >= azucar && getVasos() >= 1){
            this.cafe -= gramos;
            this.azucar -= azucar;
            this.vasos--;
            return true;
        }
        else return false;
    }

    public void registrarFactura(int valorFactura) {
        this.ingresos += valorFactura;
        this.gananciasBrutas = getIngresos() - getEgresos();
        this.impuestos = getIngresos() * 16 / 100; 
        this.gananciasNetas = getGananciasBrutas() - getImpuestos();        
    }
}