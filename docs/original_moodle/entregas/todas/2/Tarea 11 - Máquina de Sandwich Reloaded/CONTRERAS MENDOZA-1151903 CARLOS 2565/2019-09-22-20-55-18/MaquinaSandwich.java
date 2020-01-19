/**
 *
 * @author (Carlos 1151903)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich {

    public static final/*COMPLETE*/ int CANTIDAD_BASE_QUESO = 15;
    public static final/*COMPLETE*/ int CANTIDAD_BASE_MORTADELA_JAMON = 10/*COMPLETE*/;
    public static/*COMPLETE*/ final int CANTIDAD_BASE_PAN = 1;

    int cantidadQueso;
    int cantidadMortadela;
    int cantidadJamon;
    int cantidadPanBlanco;
    int cantidadPanIntegral;

    int precioCompraQueso;
    int precioCompraMortadela;
    int precioCompraJamon;
    int precioCompraPanBlanco;
    int precioCompraPanIntegral;

    int ingresosPorVentas;

    /*Recuerde que no necesita declarar propiedades adicionales*/

    /**
     * Constructor que se encarga de inicializar la máquina con la cantidad de cada ingrediente
     */
    MaquinaSandwich() {
        cantidadQueso = 3000;
        cantidadMortadela = 1000;
        cantidadJamon = 1000;
        cantidadPanBlanco = 100;
        cantidadPanIntegral = 100;
        /*COMPLETE*/
    }

    /**
     * Constructor que se encarga de inicializar la máquina con los precios de compra de los ingredientes
     */
    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
        this();//No quite esta línea, llama al constructor anterior para reutilizar
        this.precioCompraQueso = precioCompraQueso;
        this.precioCompraMortadela = precioCompraMortadela;
        this.precioCompraJamon = precioCompraJamon;
        this.precioCompraPanBlanco = precioCompraPanBlanco;
        this.precioCompraPanIntegral = precioCompraPanIntegral;
        /*COMPLETE*/
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        int costo = 0;
        if(tipoSandwich == 1){
            if(tipoPan == 1){
                costo = (15*precioCompraQueso)+(10*precioCompraMortadela)+(precioCompraPanBlanco);
            }else costo = (15*precioCompraQueso)+(10*precioCompraMortadela)+(precioCompraPanIntegral);
        }
        if(tipoSandwich == 2){
            if(tipoPan == 1){
                costo = (15*precioCompraQueso)+(10*precioCompraJamon)+(precioCompraPanBlanco);
            }else costo = (15*precioCompraQueso)+(10*precioCompraJamon)+(precioCompraPanIntegral);
        }
        if(tipoSandwich == 3){
            if(tipoPan == 1){
                costo = (30*precioCompraQueso)+(20*precioCompraMortadela)+(2*precioCompraPanBlanco);
            }else costo = (30*precioCompraQueso)+(20*precioCompraMortadela)+(2*precioCompraPanIntegral);
        }
        if(tipoSandwich == 4){
            if(tipoPan == 1){
                costo = (30*precioCompraQueso)+(20*precioCompraJamon)+(2*precioCompraPanBlanco);
            }else costo = (30*precioCompraQueso)+(20*precioCompraJamon)+(2*precioCompraPanIntegral);
        }
        if(tipoSandwich == 5){
            if(tipoPan == 1){
                costo = (45*precioCompraQueso)+(30*precioCompraMortadela)+(3*precioCompraPanBlanco);
            }else costo = (45*precioCompraQueso)+(30*precioCompraMortadela)+(3*precioCompraPanIntegral);
        }
        if(tipoSandwich == 6){
            if(tipoPan == 1){
                costo = (45*precioCompraQueso)+(30*precioCompraJamon)+(3*precioCompraPanBlanco);
            }else costo = (45*precioCompraQueso)+(30*precioCompraJamon)+(3*precioCompraPanIntegral);
        }
        return costo;/*COMPLETE*/
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        int precioVenta = calcularCostoFabricacion(tipoSandwich, tipoPan)+(calcularCostoFabricacion(tipoSandwich, tipoPan)*35)/100;
        return precioVenta;/*COMPLETE*/
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        boolean registrar = false;
        int precio = calcularPrecioVenta(tipoSandwich, tipoPan);
        if(tipoSandwich == 1 && cantidadQueso >= 15 && cantidadMortadela >= 10){
            if(tipoPan == 1 && cantidadPanBlanco >= 1){
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanBlanco--;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 1){
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanIntegral--;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(tipoSandwich == 2 && cantidadQueso >= 15 && cantidadJamon >= 10){
            if(tipoPan == 1 && cantidadPanBlanco >= 1){
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanBlanco--;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 1){
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanIntegral--;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(tipoSandwich == 3 && cantidadQueso >= 30 && cantidadMortadela >= 20){
            if(tipoPan == 1 && cantidadPanBlanco >= 2){
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanBlanco-=2;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 2){
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanIntegral-=2;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(tipoSandwich == 4 && cantidadQueso >= 30 && cantidadJamon >= 20){
            if(tipoPan == 1 && cantidadPanBlanco >= 2){
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanBlanco-=2;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 2){
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanIntegral-=2;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(tipoSandwich == 5 && cantidadQueso >= 45 && cantidadMortadela >= 30){
            if(tipoPan == 1 && cantidadPanBlanco >= 3){
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanBlanco-=3;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 3){
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanIntegral-=3;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(tipoSandwich == 6 && cantidadQueso >= 45 && cantidadJamon >= 30){
            if(tipoPan == 1 && cantidadPanBlanco >= 3){
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanBlanco-=3;
                ingresosPorVentas+=precio;
                registrar = true;
            }
            if(tipoPan == 2 && cantidadPanIntegral >= 3){
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanIntegral-=3;
                ingresosPorVentas+=precio;
                registrar = true;
            }
        }
        if(registrar == false){
            throw new RuntimeException("Mensaje de Error");
        }/*COMPLETE*/
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        return (ingresosPorVentas*19)/100;/*COMPLETE*/
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        return (ingresosPorVentas*5)/100;/*COMPLETE*/
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        return ingresosPorVentas/100;/*COMPLETE*/
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        return (ingresosPorVentas*10)/100;/*COMPLETE*/
    }

    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/

    //Start GetterSetterExtension Code
    /**Getter method CANTIDAD_BASE_QUESO*/
    public int getCANTIDAD_BASE_QUESO(){
        return this.CANTIDAD_BASE_QUESO;
    }//end method getCANTIDAD_BASE_QUESO

    /**Getter method CANTIDAD_BASE_MORTADELA_JAMON*/
    public int getCANTIDAD_BASE_MORTADELA_JAMON(){
        return this.CANTIDAD_BASE_MORTADELA_JAMON;
    }//end method getCANTIDAD_BASE_MORTADELA_JAMON

    /**Getter method CANTIDAD_BASE_PAN*/
    public int getCANTIDAD_BASE_PAN(){
        return this.CANTIDAD_BASE_PAN;
    }//end method getCANTIDAD_BASE_PAN

    /**Getter method cantidadQueso*/
    public int getCantidadQueso(){
        return this.cantidadQueso;
    }//end method getCantidadQueso

    /**Setter method cantidadQueso*/
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    /**Getter method cantidadMortadela*/
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    /**Setter method cantidadMortadela*/
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    /**Getter method cantidadJamon*/
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon

    /**Setter method cantidadJamon*/
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    /**Getter method cantidadPanBlanco*/
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    /**Setter method cantidadPanBlanco*/
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco

    /**Getter method cantidadPanIntegral*/
    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral

    /**Setter method cantidadPanIntegral*/
    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    /**Getter method precioCompraQueso*/
    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

    /**Setter method precioCompraQueso*/
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    /**Getter method precioCompraMortadela*/
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    /**Setter method precioCompraMortadela*/
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    /**Getter method precioCompraJamon*/
    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    /**Setter method precioCompraJamon*/
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

    /**Getter method precioCompraPanBlanco*/
    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

    /**Setter method precioCompraPanBlanco*/
    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

    /**Getter method precioCompraPanIntegral*/
    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

    /**Setter method precioCompraPanIntegral*/
    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    /**Getter method ingresosPorVentas*/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /**Setter method ingresosPorVentas*/
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    //End GetterSetterExtension Code
    //!
}
