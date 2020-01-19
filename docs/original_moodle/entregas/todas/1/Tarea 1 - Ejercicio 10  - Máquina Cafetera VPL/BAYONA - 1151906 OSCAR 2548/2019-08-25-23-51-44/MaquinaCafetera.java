/**
 * :D
 * @author (Chozkar) 
 * @version 0.1 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
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
        cafe = cantidadInicialCafe;
        azucar = cantidadInicialAzucar;
        vasos = cantidadInicialVasos;
    }

    //complete metodos GET / SET

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {

        int precioBase = (precioBaseCafe/1000) * (tipoCafe*55);
        int recargaAzucar = (precioBase * ((cantidadAzucar-1)*5))/100;
        int subtotal = precioBase+recargaAzucar;
        int ganancia = (subtotal*15)/100;
        return subtotal + ganancia;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        boolean xd=false;
        if (gananciasNetas>=cantidadCafe*costoCompraCafe){
            xd=true;
            cafe+=cantidadCafe;
            egresos = costoCompraCafe;
            gananciasBrutas = ingresos-egresos;
            impuestos = ingresos*16/100;
            gananciasNetas = gananciasBrutas - impuestos;
        }
        return xd;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        boolean xd=false;
        if (gananciasNetas>=cantidadAzucar*costoCompraAzucar){
            xd=true;
            azucar+=cantidadAzucar;
            egresos = costoCompraAzucar;
            gananciasBrutas = ingresos-egresos;
            impuestos = ingresos*16/100;
            gananciasNetas = gananciasBrutas - impuestos;
        }
        return xd;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        boolean xd=false;
        if (gananciasNetas>=cantidadVasos*costoCompraVasos){
            xd=true;
            vasos+=cantidadVasos;
            egresos = costoCompraVasos;
            gananciasBrutas = ingresos-egresos;
            impuestos = ingresos*16/100;
            gananciasNetas = gananciasBrutas - impuestos;
        }
        return xd;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean xd=false;
        if((tipoCafe*55<=cafe)&&(((cantidadAzucar-1)*5)<=azucar)&&vasos>0){
            xd=true;
            cafe= cafe - tipoCafe*55;
            azucar= azucar - ((cantidadAzucar-1)*5);
            vasos--;
            ingresos= ingresos+ calcularPrecio(tipoCafe, cantidadAzucar);
        }
        return xd;
    }

    public void registrarFactura(int valorFactura) {
        //complete
        ingresos+=valorFactura;
        gananciasBrutas = ingresos-egresos;
        impuestos = ingresos*16/100;
        gananciasNetas = gananciasBrutas - impuestos;

    }

    //Start GetterSetterExtension Code
    /**Getter method cafe*/
    public int getCafe(){
        return this.cafe;
    }//end method getCafe

    /**Setter method cafe*/
    public void setCafe(int cafe){
        this.cafe = cafe;
    }//end method setCafe

    /**Getter method azucar*/
    public int getAzucar(){
        return this.azucar;
    }//end method getAzucar

    /**Setter method azucar*/
    public void setAzucar(int azucar){
        this.azucar = azucar;
    }//end method setAzucar

    /**Getter method vasos*/
    public int getVasos(){
        return this.vasos;
    }//end method getVasos

    /**Setter method vasos*/
    public void setVasos(int vasos){
        this.vasos = vasos;
    }//end method setVasos

    /**Getter method precioBaseCafe*/
    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }//end method getPrecioBaseCafe

    /**Setter method precioBaseCafe*/
    public void setPrecioBaseCafe(int precioBaseCafe){
        this.precioBaseCafe = precioBaseCafe;
    }//end method setPrecioBaseCafe

    /**Getter method egresos*/
    public int getEgresos(){
        return this.egresos;
    }//end method getEgresos

    /**Setter method egresos*/
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }//end method setEgresos

    /**Getter method ingresos*/
    public int getIngresos(){
        return this.ingresos;
    }//end method getIngresos

    /**Setter method ingresos*/
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }//end method setIngresos

    /**Getter method gananciasBrutas*/
    public int getGananciasBrutas(){
        return this.gananciasBrutas;
    }//end method getGananciasBrutas

    /**Setter method gananciasBrutas*/
    public void setGananciasBrutas(int gananciasBrutas){
        this.gananciasBrutas = gananciasBrutas;
    }//end method setGananciasBrutas

    /**Getter method impuestos*/
    public int getImpuestos(){
        return this.impuestos;
    }//end method getImpuestos

    /**Setter method impuestos*/
    public void setImpuestos(int impuestos){
        this.impuestos = impuestos;
    }//end method setImpuestos

    /**Getter method gananciasNetas*/
    public int getGananciasNetas(){
        return this.gananciasNetas;
    }//end method getGananciasNetas

    /**Setter method gananciasNetas*/
    public void setGananciasNetas(int gananciasNetas){
        this.gananciasNetas = gananciasNetas;
    }//end method setGananciasNetas

    //End GetterSetterExtension Code
}//End class !
 