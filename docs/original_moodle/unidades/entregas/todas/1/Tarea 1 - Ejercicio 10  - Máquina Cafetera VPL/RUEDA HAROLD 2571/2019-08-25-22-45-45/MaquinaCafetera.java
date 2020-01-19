/**
 * Complete
 * @author (Harold Rueda Antolinez)
 * @version 0.1
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
        cafe=0;
        azucar=0;
        vasos=0;
        precioBaseCafe=0;
        egresos=0;
        ingresos=0;
        gananciasBrutas=0;
        impuestos=0;
        gananciasNetas=0;
    }

    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
        this.vasos=cantidadInicialVasos;
        this.cafe=cantidadInicialCafe;
        this.azucar=cantidadInicialAzucar;
    }

    //complete metodos GET / SET

    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        int precio=0;
        switch(tipoCafe){
            case 1: precio=(precioBaseCafe/1000)*55; break;
            case 2: precio=(precioBaseCafe/1000)*55*2; break;
            case 3: precio=(precioBaseCafe/1000)*55*3; break;
        }
        switch(cantidadAzucar){
            case 1: break;
            case 2: precio+=(precio*5)/100; break;
            case 3: precio+=(precio*10)/100; break;
        }        
        precio+=(precio*15)/100;
        return precio;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
        boolean recargar=false;
        if(costoCompraCafe<=gananciasNetas){
            recargar=true;
            this.cafe+=cantidadCafe;
            impuestos=(ingresos*16)/100;
            egresos+=costoCompraCafe;
            gananciasBrutas=ingresos-egresos;
            gananciasNetas=gananciasBrutas-impuestos;
        }
        return recargar;//complete
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
        boolean recargar=false;
        if(costoCompraAzucar<=gananciasNetas){
            recargar=true;
            this.azucar+=cantidadAzucar;
            impuestos=(ingresos*16)/100;
            egresos+=costoCompraAzucar;
            gananciasBrutas=ingresos-egresos;
            gananciasNetas=gananciasBrutas-impuestos;
        }
        return recargar;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
        boolean recargar=false;
        if(costoCompraVasos<=gananciasNetas){
            recargar=true;
            this.vasos+=cantidadVasos; 
            impuestos=(ingresos*16)/100;
            egresos+=costoCompraVasos;
            gananciasBrutas=ingresos-egresos;
            gananciasNetas=gananciasBrutas-impuestos;
        }
        return recargar;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
        boolean preparar=false;
        int cantCafe=0,cantAzucar=0;
        switch(tipoCafe){
            case 1: cantCafe=55; break;
            case 2: cantCafe=55*2; break;
            case 3: cantCafe=55*3; break;
        }
        switch(cantidadAzucar){
            case 1: break;
            case 2: cantAzucar=5; break;
            case 3: cantAzucar=10; break;
        }
        if(cafe>=cantCafe&&azucar>=cantAzucar&&vasos>0){
            cafe-=cantCafe;
            azucar-=cantAzucar;
            vasos-=1;
            preparar=true;
        }
        return preparar;
    }

    public void registrarFactura(int valorFactura) {
        ingresos+=valorFactura;
        gananciasBrutas=ingresos-egresos;
        impuestos=(valorFactura*16)/100;
        gananciasNetas=gananciasBrutas-impuestos;
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
}