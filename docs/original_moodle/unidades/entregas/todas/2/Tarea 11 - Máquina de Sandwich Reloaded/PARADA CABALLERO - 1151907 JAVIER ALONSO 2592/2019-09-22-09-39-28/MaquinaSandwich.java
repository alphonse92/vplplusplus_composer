
/**
 *
 * @author (Escriba nombres y codigos)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
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
        cantidadQueso=3000;
        cantidadMortadela=1000;
        cantidadJamon=1000;
        cantidadPanBlanco=100;
        cantidadPanIntegral=100;
        precioCompraQueso=0;
        precioCompraMortadela=0;
        precioCompraJamon=0;
        precioCompraPanBlanco=0;
        precioCompraPanIntegral=0;
        ingresosPorVentas=0;
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
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        if(tipoPan==1){
            if(tipoSandwich==1) return 1000;
            if(tipoSandwich==2) return 1100;
            if(tipoSandwich==3) return 2000;
            if(tipoSandwich==4) return 2200;
            if(tipoSandwich==5) return 3000;
            else return 3300;        
        }
        else{
            if(tipoSandwich==1) return 1100;
            if(tipoSandwich==2) return 1200;
            if(tipoSandwich==3) return 2200;
            if(tipoSandwich==4) return 2400;
            if(tipoSandwich==5) return 3300;
            else return 3600;  
        }
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        return calcularCostoFabricacion(tipoSandwich,tipoPan)+ calcularCostoFabricacion(tipoSandwich,tipoPan) *35/100 ;
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        if(tipoSandwich==1 && this.cantidadQueso>15 && this.cantidadMortadela>10 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 15;
            this.cantidadMortadela -= 10;
            if(tipoPan==1){
                this.cantidadPanBlanco--;               
            }
            else this.cantidadPanIntegral--;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich==2 && this.cantidadQueso>15 && this.cantidadJamon>10 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 15;
            this.cantidadJamon -= 10;
            if(tipoPan==1){
                this.cantidadPanBlanco--;               
            }
            else this.cantidadPanIntegral--;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich==3 && this.cantidadQueso>30 && this.cantidadMortadela>20 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 30;
            this.cantidadMortadela -= 20;
            if(tipoPan==1){
                this.cantidadPanBlanco-=2;               
            }
            else this.cantidadPanIntegral-=2;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich==4 && this.cantidadQueso>30 && this.cantidadJamon>20 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 30;
            this.cantidadJamon -= 20;
            if(tipoPan==1){
                this.cantidadPanBlanco-=2;               
            }
            else this.cantidadPanIntegral-=2;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich==5 && this.cantidadQueso>45 && this.cantidadMortadela>30 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 45;
            this.cantidadMortadela -= 30;
            if(tipoPan==1){
                this.cantidadPanBlanco-=3;               
            }
            else this.cantidadPanIntegral-=3;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich==6 && this.cantidadQueso>30 && this.cantidadJamon>30 && this.cantidadPanBlanco>0 && this.cantidadPanIntegral>0){
            this.cantidadQueso -= 45;
            this.cantidadJamon -= 30;
            if(tipoPan==1){
                this.cantidadPanBlanco-=3;               
            }
            else this.cantidadPanIntegral-=3;
            this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich,tipoPan);
        }
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        return this.ingresosPorVentas*19/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        return this.ingresosPorVentas*5/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        return this.ingresosPorVentas*1/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        return this.ingresosPorVentas*10/100;
    }

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
