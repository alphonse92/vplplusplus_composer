
/**
 *
 * @author (Harold Rueda)
 * @version 0.1
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich {

    static final int CANTIDAD_BASE_QUESO = 15;
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 10;
    static final int CANTIDAD_BASE_PAN = 1;

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
        this.cantidadQueso=3000;
        this.cantidadMortadela=1000;
        this.cantidadJamon=1000;
        this.cantidadPanBlanco=100;
        this.cantidadPanIntegral=100;
    }

    /**
     * Constructor que se encarga de inicializar la máquina con los precios de compra de los ingredientes
     */
    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
        this();
        this.precioCompraQueso=precioCompraQueso;
        this.precioCompraMortadela=precioCompraMortadela;
        this.precioCompraJamon=precioCompraJamon;
        this.precioCompraPanBlanco=precioCompraPanBlanco;
        this.precioCompraPanIntegral=precioCompraPanIntegral;
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        int costo=0;
        if(tipoPan==1){
            switch(tipoSandwich){
                case 1: costo=precioCompraQueso*CANTIDAD_BASE_QUESO+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON+precioCompraPanBlanco*CANTIDAD_BASE_PAN; break;
                case 2: costo=precioCompraQueso*CANTIDAD_BASE_QUESO+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON+precioCompraPanBlanco*CANTIDAD_BASE_PAN; break;
                case 3: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*2+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON*2+precioCompraPanBlanco*CANTIDAD_BASE_PAN*2; break;
                case 4: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*2+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON*2+precioCompraPanBlanco*CANTIDAD_BASE_PAN*2; break;
                case 5: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*3+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON*3+precioCompraPanBlanco*CANTIDAD_BASE_PAN*3; break;
                case 6: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*3+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON*3+precioCompraPanBlanco*CANTIDAD_BASE_PAN*3; break;
            }
        }

        if(tipoPan==2){
            switch(tipoSandwich){
                case 1: costo=precioCompraQueso*CANTIDAD_BASE_QUESO+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON+precioCompraPanIntegral*CANTIDAD_BASE_PAN; break;
                case 2: costo=precioCompraQueso*CANTIDAD_BASE_QUESO+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON+precioCompraPanIntegral*CANTIDAD_BASE_PAN; break;
                case 3: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*2+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON*2+precioCompraPanIntegral*CANTIDAD_BASE_PAN*2; break;
                case 4: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*2+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON*2+precioCompraPanIntegral*CANTIDAD_BASE_PAN*2; break;
                case 5: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*3+precioCompraMortadela*CANTIDAD_BASE_MORTADELA_JAMON*3+precioCompraPanIntegral*CANTIDAD_BASE_PAN*3; break;
                case 6: costo=precioCompraQueso*CANTIDAD_BASE_QUESO*3+precioCompraJamon*CANTIDAD_BASE_MORTADELA_JAMON*3+precioCompraPanIntegral*CANTIDAD_BASE_PAN*3; break;
            }
        }
        return costo;
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        return calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100 + calcularCostoFabricacion(tipoSandwich, tipoPan);
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        if(tipoPan==1){
            if(tipoSandwich==1||tipoSandwich==2){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO && cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON && cantidadPanBlanco>=CANTIDAD_BASE_PAN&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON){
                    cantidadQueso-=CANTIDAD_BASE_QUESO;
                    cantidadPanBlanco-=CANTIDAD_BASE_PAN;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 1: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON; break;
                        case 2: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
            if(tipoSandwich==3||tipoSandwich==4){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO*2&&cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON*2&&cantidadPanBlanco>=CANTIDAD_BASE_PAN*2&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON*2){
                    cantidadQueso-=CANTIDAD_BASE_QUESO*2;
                    cantidadPanBlanco-=CANTIDAD_BASE_PAN*2;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 3: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON*2; break;
                        case 4: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON*2;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==5||tipoSandwich==6){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO*3&&cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON*3&&cantidadPanBlanco>=CANTIDAD_BASE_PAN*3&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON*3){
                    cantidadQueso-=CANTIDAD_BASE_QUESO*3;
                    cantidadPanBlanco-=CANTIDAD_BASE_PAN*3;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 5: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON*3; break;
                        case 6: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON*3;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
        }
        if(tipoPan==2){
            if(tipoSandwich==1||tipoSandwich==2){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO && cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON && cantidadPanBlanco>=CANTIDAD_BASE_PAN&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON){
                    cantidadQueso-=CANTIDAD_BASE_QUESO;
                    cantidadPanIntegral-=CANTIDAD_BASE_PAN;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 1: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON; break;
                        case 2: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
            if(tipoSandwich==3||tipoSandwich==4){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO*2&&cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON*2&&cantidadPanBlanco>=CANTIDAD_BASE_PAN*2&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON*2){
                    cantidadQueso-=CANTIDAD_BASE_QUESO*2;
                    cantidadPanIntegral-=CANTIDAD_BASE_PAN*2;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 3: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON*2; break;
                        case 4: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON*2;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==5||tipoSandwich==6){
                if(cantidadQueso>=CANTIDAD_BASE_QUESO*3&&cantidadJamon>=CANTIDAD_BASE_MORTADELA_JAMON*3&&cantidadPanBlanco>=CANTIDAD_BASE_PAN*3&&cantidadMortadela>=CANTIDAD_BASE_MORTADELA_JAMON*3){
                    cantidadQueso-=CANTIDAD_BASE_QUESO*3;
                    cantidadPanIntegral-=CANTIDAD_BASE_PAN*3;
                    ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
                    switch(tipoSandwich){
                        case 5: cantidadMortadela-=CANTIDAD_BASE_MORTADELA_JAMON*3; break;
                        case 6: cantidadJamon-=CANTIDAD_BASE_MORTADELA_JAMON*3;  break;
                    }
                }
                else throw new RuntimeException("Los ingredientes no son suficientes");
            }
        }
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        return ingresosPorVentas*19/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        return ingresosPorVentas*5/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        return ingresosPorVentas/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        return ingresosPorVentas*10/100;
    }

    //Start GetterSetterExtension Code
    /**Getter method CANTIDAD_BASE_QUESO*/
    public int getCANTIDAD_BASE_QUESO(){
        return this.CANTIDAD_BASE_QUESO;
    }//end method getCANTIDAD_BASE_QUESO

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
